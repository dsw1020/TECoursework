let reviews = [];  // Array to hold the data from the api

function loadReview() {
  console.log("Load Reviews...");
      fetch('http://5dd69774ce4c300014403ae7.mockapi.io/productdata')
     .then ((response) => {      // when fetch is done - send the data to a function
         return response.json()
        })  //     convert the api data to json and return it
     .then ((theData) => {       //        once data is converted to json
       reviews = theData;        //            assign it to our array
       displayReviews();
     })
     .catch((err) => {
       console.log(err);
      })
     }
     



const button = document.querySelector("button");
button.addEventListener('click', () => {
  button.disabled = true;
  loadReview();   // function to load the data into the reviews array
})


/**
 * This function when invoked will look at an array of reviews
 * and add it to the page by cloning the #review-template
 */
function displayReviews() {
    console.log("Display Reviews...");
  
    // first check to make sure the browser supports content templates
    if('content' in document.createElement('template')) {
      // query the document for .reviews and assign it to a variable called container
      const container = document.querySelector(".reviews");
      // loop over the reviews array
      reviews.forEach((review) => {
        // get the template; find all the elements and add the data from our review to each element
        const tmpl = document.getElementById('review-template').content.cloneNode(true);
        tmpl.querySelector('img').setAttribute("src",review.avatar);
        tmpl.querySelector('.username').innerText = review.username;
        tmpl.querySelector('h2').innerText = review.title;
        tmpl.querySelector('.published-date').innerText = review.publishedOn;
        tmpl.querySelector('.user-review').innerText = review.review;
        container.appendChild(tmpl);
      });
    } else {
      console.error('Your browser does not support templates');
    }
}