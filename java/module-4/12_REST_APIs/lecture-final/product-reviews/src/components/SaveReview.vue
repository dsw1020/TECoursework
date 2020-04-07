<template>
  <div class="save-review">
    <div class="header">
      <h2>{{pageTitle}}</h2>
      <a href="#" class="back" v-on:click="backToReviews()">
        <i class="fas fa-list-ul"></i> Return to Reviews
      </a>
    </div>
    <div class="form">
      <div class="form-input">
        <span class="label">Full Name:</span>
        <input type="text" v-model="review.name" placeholder="Enter Full Name" />
      </div>
      <div class="form-input">
        <span class="label">Title:</span>
        <input type="text" v-model="review.title" placeholder="Enter Review Title" />
      </div>
      <div class="form-input">
        <span class="label">Review:</span>
        <textarea name="review" id="review" cols="60" rows="10" v-model="review.review"></textarea>
      </div>
      <button v-bind:disabled="!isValidForm" v-on:click="saveReview">Save Review</button>
    </div>
  </div>
</template>

<script>
export default {
  props: {            // Attributes whose values are coming from outside the component
    apiURL: String,   // value coming from ProductPage that includes this component
    reviewID: Number
  },
  data() {
    return {
      review: {    // Use this when we add a review to hold the new review values
        name: "",  // filled in
        title: "", //       automatically from the form
        review: "" //              because of two-way binding with v-model:
      }
    };
  },
  methods: {
    backToReviews() {
      this.$emit("showReviews");   // fire the showReviews event
    },
    saveReview() {   // run the createReview() or updateReviews based on reviewID
      this.reviewID === 0 ? this.createReview() : this.updateReview();
    },
    createReview() {  // This is run if the reviewID is 0
    // we need to do a POST request to API to add the new review
    fetch(this.apiURL, {    // go to the URL stored in out apiURl attributes (came from ProductPage component)
         method: 'POST',    // tell fetch() to issue a POST HTTP request
         headers: {         //     telling fetch() what to include in the headers of the request
                  "Content-Type": "application/json"  // tell the api we are sending json formatterd data
                  },
         body:  JSON.stringify(this.review) // tell fetch() to put this data in the body of the request as a string
    })
    .then((response) => {          // when the fetch() is done - get the response
      if(response.ok)  {           // if the POST was ok (status 200)
        this.$emit('showReviews')  // fire the showReviews event
      } 
    })      
     .catch((err) =>  console.error(err))
    },
    updateReview() {
       // we need to do a PUT request to API to add the new review
    fetch(`${this.apiURL}/${this.reviewID}`, {    // go to the URL stored in out apiURl attributes (came from ProductPage component)
         method: 'PUT',    // tell fetch() to issue a POST HTTP request
         headers: {         //     telling fetch() what to include in the headers of the request
                  "Content-Type": "application/json"  // tell the api we are sending json formatterd data
                  },
         body:  JSON.stringify(this.review) // tell fetch() to put this data in the body of the request as a string
    })
    .then((response) => {          // when the fetch() is done - get the response
      if(response.ok)  {           // if the PUT was ok (status 200)
        this.$emit('showReviews')  // fire the showReviews event
      } 
    })      
     .catch((err) =>  console.error(err))
    } // This is run if the reviewID is not 0
  },
  computed: {
    isValidForm() {  // a form must have value sin all the input fields to be valid
      return (
        this.review.name != "" &&
        this.review.title != "" &&
        this.review.review != ""
      );
    },
    pageTitle() {
      return this.reviewID === 0
        ? "Add Review"
        : "Edit Review - " + this.review.title;
    }
  },
  created() {}
};
</script>

<style>
.save-review {
  grid-area: product-add;
  margin-top: 30px;
}
.header {
  display: flex;
  border-bottom: 1px solid #ccc;
}
h2 {
  border: none;
}
a.back {
  display: block;
  margin-top: 7px;
  margin-left: auto;
  text-decoration: none;
  border: none;
  color: #4eadea;
}
.form {
  margin-top: 20px;
  width: 510px;
}
.form-input {
  padding: 10px;
}
.label {
  width: 200px;
  display: block;
}
input {
  font-size: 16px;
  width: 480px;
  padding: 6px;
}
textarea {
  font-size: 16px;
  line-height: 1.5;
}
button {
  background-color: #4eadea;
  padding: 5px;
  border-radius: 10px;
  width: 150px;
  color: #fff;
  text-transform: uppercase;
  font-size: 15px;
  float: right;
}
</style>
