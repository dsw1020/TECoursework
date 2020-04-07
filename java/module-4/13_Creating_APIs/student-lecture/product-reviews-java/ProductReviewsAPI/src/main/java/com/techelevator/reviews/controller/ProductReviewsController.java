package com.techelevator.reviews.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.reviews.dao.ProductReviewDao;
import com.techelevator.reviews.exception.ProductReviewNotFoundException;
import com.techelevator.reviews.model.ProductReview;

@RestController	        			// This file contains RESTful API controllers
@CrossOrigin						// Allow Cross-Origin Requests - requests from other servers
@RequestMapping("/api/reviews")		// Root Path for all APIs in this file
public class ProductReviewsController {
	
	/***********************************************************************************************
	 * API Paths handled by this controller:
	 * 
	 * GET - /api/reviews     - Returns a list of reviews
	 * 
	 * GET - /api/reviews/id - Returns a single review if id is valid
	 *                         Returns a ProductReviewNotFoundException 404 
	 *                         if id does not exist 
	 * 
	 * POST - /api/reviews - Creates a new review
	 *                       Returns a ProductReview` 201 when successful
	 * 
	 * PUT - /api/reviews/id - Updates a specific review
	 *                         Returns a ProductReview 200 when successful
	 *                         Returns a ProductReviewNotFoundException 404 if id does not exist 
	 *                        
	 * DELETE - /api/reviews/id - Deletes a specific review
	 *                            Returns a 200 when successful
	 *                            Returns a ProductReviewNotFoundException 404 if id does not exist
	 *                            
	 ***********************************************************************************************/

	/***********************************************************************
	 * Methods in ProductReviewDao used to access data for this API
	 * 
	 *        public List<ProductReview> list();
	 * 
	 *        public ProductReview create(ProductReview review);
	 * 
	 *        public ProductReview read(int id);
	 * 
	 *        public ProductReview update(ProductReview review);
	 * 
	 *        public void delete(int id);
	 **********************************************************************/
	
	/***********************************************************************
	 * Attributes of a ProductReview object:
	 * 
	 * int id;          - Automatically set when created
	 * String name; 
	 * String title; 
	 * String avatar;   - Default avatar available
	 * String review;
	 * 
	 ***********************************************************************/

ProductReviewDao theReviews;   // Instantiate the DAO we are using 

// Constructor for the class takes the DAO object as a parameter - @Autowired uses it 

public ProductReviewsController(ProductReviewDao productReviewDao)
	{
	this.theReviews = productReviewDao;
	}
	
/******************************************
* Code for API calls
*******************************************/

// @GetMapping is the same @RequestMapping(path="/" method=RequestMethod.GET)
	@GetMapping // Handle GET requests for the root - /api/reviews/
	public List<ProductReview> returnAllReviews() {
		return theReviews.list();
	}

	@GetMapping("/{id}") // Handle the root path with a path variable
	public ProductReview getAReviewById(@PathVariable int id) { // Retrieve the path variable as an parameter called
																// 'id'

		ProductReview aReview = theReviews.read(id);

		if (aReview != null) { // If a review was retrieved, return it
			return aReview;
		}

		else {
			throw new ProductReviewNotFoundException(id, "Product Review Not Found");
		}

	}
}

