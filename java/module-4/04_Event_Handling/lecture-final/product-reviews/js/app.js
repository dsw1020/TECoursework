const name = 'Cigar Parties for Dummies';
let description = 'Host and plan the perfect cigar party for all of your squirrelly friends.';
let reviews = [
  {
    reviewer: 'Malcolm Gladwell',
    title: 'What a book!',
    review:
      "It certainly is a book. I mean, I can see that. Pages kept together with glue (I hope that's glue) and there's writing on it, in some language.",
    rating: 3
  }
];

/**
 * Add our product name to the page title
 * Get our page page title by the id and the query the .name selector
 * once you have the element you can add the product name to the span.
 */
function setPageTitle() {
  const pageTitle = document.getElementById('page-title');
  pageTitle.querySelector('.name').innerText = name;
}

/**
 * Add our product description to the page.
 */
function setPageDescription() {
  document.querySelector('.description').innerText = description;
}

/**
 * I will display all of the reviews in the reviews array
 */
function displayReviews() {
  if ('content' in document.createElement('template')) {  // if the content of the document has a template...
    reviews.forEach((review) => {   // Loop through the array of reviews
      displayReview(review);        //      call the displayReviews() with the current review from the array
    });
  } else {
    console.error('Your browser does not support templates');  // if there is no template in the html - we can't process
  }
}

/**
 *
 * @param {Object} review The review to display
 */
function displayReview(review) {     // Receive the current element in the array and add it's content to DOM
  const main = document.getElementById('main');     // Get a pointer(reference) to the div with id='main' 
  // Create a copy of the template and get a pointer(reference) to it 
  const tmpl = document.getElementById('review-template').content.cloneNode(true); 
  tmpl.querySelector('h4').innerText = review.reviewer;  // Find the h4 element in the template and set it's innerText
  tmpl.querySelector('h3').innerText = review.title;     // Find the h3 element in the template and set it's innerText
  tmpl.querySelector('p').innerText = review.review;     // Find the p element in the template and set it's innerText
 
  // there will always be 1 star because it is a part of the template
  // we start our loop at 1 instead of 0
  for (let i = 1; i < review.rating; ++i) {
    const img = tmpl.querySelector('img').cloneNode();  // Make a copy of the img element and get a pointer(reference) to it
    tmpl.querySelector('.rating').appendChild(img);     // Add the copy to the element with the class='rating' in the template
  }
  main.appendChild(tmpl);  // Add the new copy of the template to the div with id='main' 
}

// LECTURE STARTS HERE ---------------------------------------------------------------

document.addEventListener('DOMContentLoaded', () => {  // When the DOM is fully loaded.... do this
    setPageTitle();         // set the product reviews page title
    setPageDescription();   // set the product reviews page description
    displayReviews();       // display all of the product reviews on our page
  })

/**
 * Take an event on the description and swap out the description for a text box.
 *
 * @param {Event} event the event object
 */
// When the user clicks on the description show input box
const desc = document.querySelector('.description');  // Get a reference to the description in the html
desc.addEventListener('click', (event) => {           // Listen for a 'click' on the description
  toggleDescriptionEdit(event.target);                //    when it's triggered call toggleDescriptionEdit() with a reference to element that was clicked
})                                                    // target is the property in the event object with a reference to element that triggered event

const inputDesc = document.getElementById('inputDesc'); // get a reference to the input box with new description
inputDesc.addEventListener('keyup', (event) => {        // When the user releases a key they've pressed
if (event.key === 'Enter') {                     // if the key that was released is the Enter key (if they press enter)
     exitDescriptionEdit(event.target, true);    //     Call the exitDescriptionEdit() with the element that triggered event 
  }                                              //     and tell it to save
if (event.key === 'Escape') {                    // if the key that was released is the Escape key 
     exitDescriptionEdit(event.target, false);   //     Call the exitDescriptionEdit() with the element that triggered event
}                                                //     and tell it not to save
})



function toggleDescriptionEdit(desc) { // We are receiving the element clicked (description element)
  const textBox = desc.nextElementSibling;  // Get a reference to the element passed in's next sibling
  textBox.value = description;              // Set the element value to description
  // .classlist - all the classes for an element
  textBox.classList.remove('d-none');       // remove 'd-none' to the classes on the textBox ('d-none; - display:none)
  desc.classList.add('d-none');             // add 'd-none' to the classes on the desc element ('d-none; - display:none)
  textBox.focus();                          // Give the focus (put the cursor in) the textBox
}

/**
 * Take an event on the text box and set the description to the contents
 * of the text box and then hide the text box and show the description.
 *
 * @param {Event.target} event the element that triggered event
 * @param {Boolean} save should we save the description text
 */
function exitDescriptionEdit(textBox, save) {
  let desc = textBox.previousElementSibling;  // Get a reference to the element previous to the one that triggered event
  if (save) {                                 // if true was passed as the second argument
    desc.innerText = textBox.value;           // Set the description to the value in the text box
  }
  textBox.classList.add('d-none');            // Hide the text box
  desc.classList.remove('d-none');            // Show the description
}

/**
 * I will show / hide the add review form
 */
const btnToggleForm = document.getElementById('btnToggleForm') // Get a reference to the "Add Review" button
btnToggleForm.addEventListener('click', () => {  // if they click the "Add Review" button
  showHideForm();                                //      call this method
})

const btnSaveReview = document.getElementById('btnSaveReview') // get a reference to the "Save Review" button
btnSaveReview.addEventListener('click', (eventObject) => {     // if they click "Save Review"
  eventObject.preventDefault();                                // Stop the default form behavior from messing up what we do;
  saveReview();                                                // Call this method
})

function showHideForm() {
  const form = document.querySelector('form');
  const btn = document.getElementById('btnToggleForm');

  if (form.classList.contains('d-none')) {
    form.classList.remove('d-none');
    btn.innerText = 'Hide Form';
    document.getElementById('name').focus();
  } else {
    resetFormValues();
    form.classList.add('d-none');
    btn.innerText = 'Add Review';
  }
}

/**
 * I will reset all of the values in the form.
 */
function resetFormValues() {
  const form = document.querySelector('form');   // Get a reference to teh form element
  const inputs = form.querySelectorAll('input'); // Put references to all the input fields in an array
  inputs.forEach((input) => {  // loop through the input fields and sent to  empty string value
    input.value = '';
  });
  document.getElementById('rating').value = 1;
  document.getElementById('review').value = '';
}

/**
 * I will save the review that was added using the add review from
 */
function saveReview() {
// Get the data from the form into JavaScript variables

// Get a reference to each element in the form that contains data we want
const name       = document.getElementById('name');    // Get the value out of the element id='name'
const title      = document.getElementById('title');   // Get the value out of the element id='title'
const rating     = document.getElementById('rating');  // Get the value out of the element id='rating'
const reviewText = document.getElementById('review');  // Get the value out of the element id='review'

// Create a new object to hole the data so we can add the object to the array
const newReview = {
  reviewer: name.value,       // Define the reviewer property with the data in the name field on  the form
  title   : title.value,      // Define the title property with the data in the title field on the form
  review  : reviewText.value, // Define the review property with the data in the review field on the form
  rating  : rating.value      // Define the rating property with the data in the rating field on the form
  }

// Add the new object to the array
reviews.push(newReview);
displayReview(newReview);         // display all of the product reviews in the array on our page
showHideForm();                   // Hide the form
}
