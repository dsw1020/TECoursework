const name = 'Cigar Parties for Dummies';
const description = 'Host and plan the perfect cigar party for all of your squirrelly friends.';
const reviews = [
  {
    reviewer: 'Malcolm Gladwell',
    title: 'What a book!',
    review:
      "It certainly is a book. I mean, I can see that. Pages kept together with glue (I hope that's glue) and there's writing on it, in some language.",
    rating: 3
  },
  {
    reviewer: 'Tim Ferriss',
    title: 'Had a cigar party started in less than 4 hours.',
    review:
      "It should have been called the four hour cigar party. That's amazing. I have a new idea for muse because of this.",
    rating: 4
  },
  {
    reviewer: 'Ramit Sethi',
    title: 'What every new entrepreneurs needs. A door stop.',
    review:
      "When I sell my courses, I'm always telling people that if a book costs less than $20, they should just buy it. If they only learn one thing from it, it was worth it. Wish I learned something from this book.",
    rating: 1
  },
  {
    reviewer: 'Gary Vaynerchuk',
    title: 'And I thought I could write',
    review:
      "There are a lot of good, solid tips in this book. I don't want to ruin it, but prelighting all the cigars is worth the price of admission alone.",
    rating: 3
  }
];

/**
 * Add our product name to the page title
 * Get our page page title by the id and the query the .name selector
 * once you have the element you can add the product name to the span.
 */
function setPageTitle() {
  const pageTitle = document.getElementById('page-title'); // get a pointer to element with the id 'page-title'
  pageTitle.querySelector('.name').innerText = name; // find the class='name' in pageTitle and set it to name variable
}

/**
 * Add our product description to the page.
 */
function setPageDescription() {
  document.querySelector('.description').innerText = description;
}

/**
 * I will display all of the reviews on the page.
 * I will loop over the array of reviews and use some helper functions
 * to create the elements needed for our markup and add them to the DOM
 */
function displayReviews() {
  const main = document.getElementById('main'); // get a pointer the main div
  reviews.forEach((aReview)=> {   // Loop through the array; current element will be in aReview
      const newElement = document.createElement('div');  // create a new <div> element
      newElement.setAttribute('class','review');         // add a class='review' to the div
      addReviewer(newElement,aReview.reviewer);          // Call the function to add Reviewer to the div
      addRating(newElement,aReview.rating);              // Call the function to add Rating to the div
      addTitle(newElement, aReview.title);               // Call the function to add Title to the div
      addReview(newElement, aReview.review);             // Call the function to add Review to the div
      main.insertAdjacentElement('beforeend', newElement); // add the newElement to end of main
  })
}

/**
 * I will creating a new h4 element with the name of the reviewer and append it to
 * the parent element that is passed to me.
 *
 * @param {HTMLElement} el: The element to append the reviewer to
 * @param {string} name The name of the reviewer
 */
function addReviewer(parent, name) {
  const theReviewer = document.createElement('h4');   // Create an h4 element
  theReviewer.innerText = name;                       // Set the text in the h4 to name from the array element
  parent.appendChild(theReviewer);                    // Add the new h4 to the element we were passed as parent

}

/**
 * I will add the rating div along with a star image for the number of ratings 1-5
 * @param {HTMLElement} parent
 * @param {Number} numberOfStars
 */
function addRating(parent, numberOfStars) {
  const theRating = document.createElement('div'); // Create a new div element
  theRating.setAttribute('class', 'rating');       // Add class='rating' to the new div
  for (let i=0; i< numberOfStars; i++) {           // Loop for the value in rating
     const aStar = document.createElement('img');  //      create a star image
     aStar.setAttribute('class', 'ratingStar');    //      add a class='ratingStar' to new star image
     aStar.src='img/star.png';                     //      assign the picture to the new star image
     theRating.appendChild(aStar);                 //      add the the star image to rating div
    }
  parent.appendChild(theRating);                   // Add the class='rating' div to the main div
}

/**
 * I will add an h3 element along with the review title
 * @param {HTMLElement} parent
 * @param {string} title
 */
function addTitle(parent, title) {
const theTitle = document.createElement('h3');  // create a new h3 element
theTitle.innerText = title;                     // Set the content of hew h3 element to title passed in
parent.appendChild(theTitle);                   // Add the new h3 to the element passed in as parent
}

/**
 * I will add the product review
 * @param {HTMLElement} parent
 * @param {string} review
 */
function addReview(parent, review) {
const theReview = document.createElement('p');  // create a new p element
theReview.innerHTML = review;                   // set the content of the new p element to data passed in
parent.appendChild(theReview);
}

// This is where teh functions defined above get called when the page is loaded

// set the product reviews page title
setPageTitle();
// set the product reviews page description
setPageDescription();
// display all of the product reviews on our page
displayReviews();
