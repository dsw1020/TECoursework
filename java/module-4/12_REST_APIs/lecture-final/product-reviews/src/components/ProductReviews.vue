<template>
  <div class="product-reviews">
    <div class="header">
      <h2>Reviews <span>({{reviews.length}})</span></h2>
      <a href="#" class="add-review" v-on:click="addReview()">
        <i class="far fa-address-card"></i> Add Review
      </a>
    </div>
    <div class="review" v-for="review in reviews" v-bind:key="review.id">
      <div class="review-left">
        <img v-bind:src="review.avatar" class="avatar"/>
        <div class="review-actions">             <!-- parseInt convert the id from a String to an Int-->
          <a href="#" class="edit-review" v-on:click="editReview(parseInt(review.id))">
            <i class="far fa-edit"></i> Edit
          </a>
          <a href="#" class="delete-review" v-on:click="deleteReview(review.id)">
            <i class="far fa-trash-alt"></i> Delete
          </a>
        </div>
      </div>
      <div class="review-info">
        <h2>{{review.title}}</h2>
        <span>{{review.name}} | {{formatDate(review.createdAt)}}</span>
        <p class="feedback">{{review.review}}</p>
      </div>
    </div>
  </div>
</template>

<script>
import moment from 'moment';

export default {    
  name: "ProductReviews",
  props: {          // attributes whose values are coming from outside the component
    apiURL: String  // Set by ProductPage component that uses this component
  },
  data() {
    return {
      reviews: []   // array to hold the reviews retrieved from the api
    };
  },
  methods: {
    addReview() {
      this.$emit('addReview')     // fire/trigger the addReview event
    },
    editReview(id) {
      this.$emit('editReview',id) // fire/trigger the editReview event with the id of the review
    },
    deleteReview(id) {
           // we need to do a PUT request to API to add the new review
    fetch(`${this.apiURL}/${id}`, {    // go to the URL stored in out apiURl attributes (came from ProductPage component)
         method: 'DELETE',    // tell fetch() to issue a POST HTTP request
         headers: {         //     telling fetch() what to include in the headers of the request
                  "Content-Type": "application/json"  // tell the api we are sending json formatterd data
                  },
         body:  JSON.stringify(this.review) // tell fetch() to put this data in the body of the request as a string
    })
    .then((response) => {          // when the fetch() is done - get the response
      if(response.ok)  {           // if the PUT was ok (status 200)
        // The review has been deleted from the ap, but NOT the array in app
        const index = this.reviews.map(review => review.id).indexOf(id); // get index of the deleted review
        this.reviews.splice(index,1)  // remove the one element in array at index of the review we deleted
        
        this.$emit('showReviews')  // fire the showReviews event which will display the reviews in the array
      } 
    })      
     .catch((err) =>  console.error(err))
    },
    formatDate(d) {
      return moment(d, 'YYYY-MM-DD h:mm:ss a').format('MMMM Do YYYY, h:mm:ss A');
    }
  },
  created() {  // Processing to be done at the created lifecycle hook (before the html is displayed)
     // get the data from our api for display - copy the data into our reviews array
     fetch(this.apiURL)              // go to the url in our apiURL attribute with a HTTP GET request (default for fetch())
        .then((response) => {           // when the fetch() completes
              return response.json();   // convert the data in the response body to json
      })
        .then((theJsonData) => {        // when the response data has been converted to json
              this.reviews = theJsonData;   // assign the json data to the reviews array
      })
      .catch((err) => {console.log(err)})  // if there is an just write it to console
     }
};
</script>

<style>
.header {
  display: flex;
  border-bottom: 1px solid #ccc;
}
h2 {
  border:none;
}
h2 span {
  font-size:14px;
}
a.add-review {
  display: block;
  margin-top:7px;
  margin-left:auto;
  text-decoration: none;
  border:none;
  color:#4EADEA;
}
.review {
  display: flex;
  margin: 20px;
  border-bottom: 1px solid #ccc;
}
.review-left {
  margin-right: 20px;
}
.avatar {
    display: block;
    width: 100px;
    border-radius: 50%;
    box-shadow: 0px 3px 10px rgb(0, 0, 0, 40%);
    margin: auto auto;
}
.feedback {
  margin-top: 10px;
  line-height: 1.7;
  padding-bottom: 15px;
}
.review-actions {
  margin-top: 20px;
  margin-left: 10px;
  text-align: center;
}
.review-actions a, .review-actions a:visited {
  display: block;
  color:black;
  margin-top:10px;
  text-decoration: none;
  color:#4EADEA;
}
.review-actions a:hover {
  color:rgb(0, 116, 189);
}
</style>
