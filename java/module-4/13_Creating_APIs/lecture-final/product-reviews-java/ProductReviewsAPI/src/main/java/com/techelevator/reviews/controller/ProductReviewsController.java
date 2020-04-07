package com.techelevator.reviews.controller;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.reviews.dao.ProductReviewDao;
import com.techelevator.reviews.exception.ProductReviewNotFoundException;
import com.techelevator.reviews.model.ProductReview;

@RestController                  // This file contains RESTful API controllers
@CrossOrigin                     // Allow Cross-Origin Requests - requests from other servers
@RequestMapping("/api/reviews")  // Root path for all APIs in this file

public class ProductReviewsController {
	
	/***********************************************************************************************
	 * API Paths handled by this controller:
	 * 
	 * GET - /api/reviews    - Returns a list of reviews
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
	 * int    id;       - Automatically set when created
	 * String name; 
	 * String title; 
	 * String avatar;   - Default avatar available
	 * String review;
	 * 
	 ***********************************************************************/

	ProductReviewDao theReviews;  // Instantiate the DAO we are using
	
	// Constructor for the class takes a DAO object as a parameter - @Autowired uses it
	
	public ProductReviewsController(ProductReviewDao productReviewDao) {
		this.theReviews = productReviewDao;
	}
	
	/**********************************
	 *  Code for API calls
	 **********************************/
//  @GetMapping is the same @RequestMapping(path="/" method=RequestMethod.GET)
	@GetMapping  // Handle GET requests for the root - /api/reviews/ 
	public List<ProductReview> returnAllReviews() {
		return theReviews.list();  // return the List of ProductReview objects the DOA retrieves
		}
	// api/reviews/2
	@GetMapping("/{id}")  // handle the root path with a path variable
	public ProductReview getAReviewById(@PathVariable int id) {  // Retrieve the path variable as an parameter called 'id'

		ProductReview aReview = theReviews.read(id);  // Ask the DAO to get the review with matching id
		
		if (aReview != null) {  // If a review was retrieved, return it
			return aReview;
		}
		else {  // if review not found, throw exceptions with the id requested and a messageß
			throw new ProductReviewNotFoundException(id, "Product Review Not Found");
		}
	
	}
	@PostMapping                        // handle POST for /api/reviews
	@ResponseStatus(HttpStatus.CREATED) // Return a 201 (Created) if successful
	public ProductReview addAReview(@RequestBody ProductReview aReview) { // The JSON in the request body will 
		                                                                  //    automagically be placed 
		                                                                  //    in a ProductReview object by @RequestBody
	return theReviews.create(aReview);   // Ask the DAO to add the ProductReview from parameter
	                                     //     The DAO methods is written to return the ProductReview it added
	                                     //     The object returned has the automatically generated id
	}
	@PutMapping("/{id}")  // handle a PUT for  the root path with a path variable  
	public ProductReview UpdateAReview(@RequestBody ProductReview aReview
			                          ,@PathVariable int id) {
	// We can only update something that is already stored
	//    Check to see if the data to be updated exists
	//    if it does, do the update
	//    if not, throw exception with the id requested and a message
		
	ProductReview anotherReview = theReviews.read(id);   // Try to find the review to be updated
	
	if (anotherReview != null) {             // If found...
		return theReviews.update(aReview);   //    update it and return it
	}
	else {                                   // If not found...
		throw new ProductReviewNotFoundException(id, "Product Review to be Updated Not Found");
	}
	}
	@DeleteMapping("/{id}")  // handle a Delete for  the root path with a path variable  
	public void DeleteAReview(@PathVariable int id) {
	// We can only delete something that is already stored
	//    Check to see if the data to be deleted exists
	//    if it does, do the delete
	//    if not, throw exception with the id requested and a message
		
	ProductReview anotherReview = theReviews.read(id);   // Try to find the review to be updated
	
	if (anotherReview != null) { // If found...
	    theReviews.delete(id);   //    delete it 
	}
	else {                                   // If not found...
		throw new ProductReviewNotFoundException(id, "Product Review to be Updated Not Found");
	}
	}
	
	
}

