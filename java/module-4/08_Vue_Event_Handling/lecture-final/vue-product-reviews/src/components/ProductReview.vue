 <template>
    <div class="main">
        <h2>Product Reviews for {{ name }}</h2>

        <p class="description">{{ description }}</p>

        <div class="well-display">
            <div class="well">
                <span class="amount" v-on:click="filter=0">{{ averageRating }}</span>
                Average Rating
            </div>

            <div class="well">
                <span class="amount" v-on:click="filter = 1">{{ numberOfOneStarReviews }}</span>
                1 Star Review{{ numberOfOneStarReviews === 1 ? '' : 's' }}
            </div>

            <div class="well">
                <span class="amount" v-on:click="filter=2">{{ numberOfTwoStarReviews }}</span>
                2 Star Review{{ numberOfTwoStarReviews === 1 ? '' : 's' }}
            </div>

            <div class="well">
                <span class="amount" v-on:click="filter = 3">{{ numberOfThreeStarReviews }}</span>
                3 Star Review{{ numberOfThreeStarReviews === 1 ? '' : 's' }}
            </div>

            <div class="well">
                <span class="amount" v-on:click="filter=4">{{ numberOfFourStarReviews }}</span>
                4 Star Review{{ numberOfFourStarReviews === 1 ? '' : 's' }}
            </div>

            <div class="well">
                <span class="amount" v-on:click="filter=5">{{ numberOfFiveStarReviews }}</span>
                5 Star Review{{ numberOfFiveStarReviews === 1 ? '' : 's' }}
            </div>
        </div>
        <!-- v-on adds and eventListener to an element                                           -->
        <!-- set a click eventListener and preventDefault  on the link for "Show Form"           -->
        <!-- when "Show Form is clicked... set showForm to true                                  -->
        <!-- only display "Show Form" if showForm variable is false (if the form is not showing) -->
        <a href="#" v-on:click.prevent="showForm = true" v-if="showForm === false">Show Form</a>

        <!-- v-if will add the element to the DOM  if the condition is true                       --> 
        <!-- v-if will remove the element from the DOM if condition is false                      -->
        <!-- When a submit event occurs prevent the default action & call the addNewReview method -->
        <form v-if="showForm === true" v-on:submit.prevent="addNewReview">
            <div class="form-element">
                <label for="reviewer">Name:</label><input id="reviewer" type="text" v-model="newReview.reviewer" />
            </div>
            <div class="form-element">
                <label for="title">Title:</label> <input id="title" type="text" v-model="newReview.title" />
            </div>
            <div class="form-element">
                <label for="rating">Rating:</label> <select id="rating" v-model.number="newReview.rating">
                    <option value="1">1 Star</option>
                    <option value="2">2 Stars</option>
                    <option value="3">3 Stars</option>
                    <option value="4">4 Stars</option>
                    <option value="5">5 Stars</option>
                </select>
            </div>
            <div class="form-element">
                <label for="review">Review</label>
                <textarea id="review" v-model="newReview.review"></textarea>
            </div>
            <!-- Disable the submit button if isFormValid computed property returns false            -->
            <button v-bind:disabled="!isFormValid">Submit</button>    <!-- This is the Submit button -->
             
            <button v-on:click.prevent="resetForm" type="cancel">Cancel</button>
        </form>
        <!-- only include in the following div reviews in the filteredReviews -->
        <div class="review" v-for="review in filteredReviews" v-bind:key="review.id">
            <h4>{{ review.reviewer }}</h4>
            <div class="rating">
                <img src="../assets/star.png" v-bind:title="review.rating + ' Star Review'" class="ratingStar" v-for="n in review.rating" v-bind:key="n" />
            </div>
            <h3>{{ review.title }}</h3>

            <p>{{ review.review }}</p>
        </div>
    </div>
</template>

<script>
export default {
    name: "product-review",
    data() {
        return {
            name: 'Cigar Parties for Dummies',
            description: 'Host and plan the perfect cigar party for all of your squirrelly friends.',
            showForm: false,
            filter: 0,      // This will be used in the filteredReviews method to indicate which ratings we want
            newReview: {},  // Hold new review data to be added to the reviews array - attributes are added when the form is processed
            reviews: [
                {
                    reviewer: "Malcolm Gladwell",
                    title: 'What a book!',
                    review: "It certainly is a book. I mean, I can see that. Pages kept together with glue (I hope that's glue) and there's writing on it, in some language.",
                    rating: 3
                },
                {
                    reviewer: "Tim Ferriss",
                    title: 'Had a cigar party started in less than 4 hours.',
                    review: "It should have been called the four hour cigar party. That's amazing. I have a new idea for muse because of this.",
                    rating: 4
                },
                {
                    reviewer: "Ramit Sethi",
                    title: 'What every new entrepreneurs needs. A door stop.',
                    review: "When I sell my courses, I'm always telling people that if a book costs less than $20, they should just buy it. If they only learn one thing from it, it was worth it. Wish I learned something from this book.",
                    rating: 1
                },
                {
                    reviewer: "Gary Vaynerchuk",
                    title: 'And I thought I could write',
                    review: "There are a lot of good, solid tips in this book. I don't want to ruin it, but prelighting all the cigars is worth the price of admission alone.",
                    rating: 3
                }
            ]
        };
    },
    computed: {  // functions in the computed property are executed anytime data used in any function is changed
  
        averageRating(vm) { // calculate average rating of all reviews using the array reduce() method
            let sum = vm.reviews.reduce( (currentSum, aReview) => {  // Call anonymous function with sum and current array object  
                return currentSum + aReview.rating;                  // Add the rating from the current object to sum and return
            }, 0);          // Initialize currentSun to 0
            return (sum / vm.reviews.length).toFixed(2);  // return the average rounded to two decimal places
        },
        numberOfOneStarReviews(vm) {                   // Determine # of 1-star reviews
            return vm.numberOfReviews(vm.reviews, 1);  // Call function to count # of 1-star reviews
        },
        numberOfTwoStarReviews(vm) {                   // Determine # of 2-star reviews
            return vm.numberOfReviews(vm.reviews, 2);  // Call function to count # of 2-star reviews
        },
        numberOfThreeStarReviews(vm) {                 // Determine # of 3-star reviews
            return vm.numberOfReviews(vm.reviews, 3);  // Call function to count # of 3-star reviews
        },
        numberOfFourStarReviews(vm) {                  // Determine # of 4-star reviews
            return vm.numberOfReviews(vm.reviews, 4);  // Call function to count # of 4-star reviews
        },
        numberOfFiveStarReviews(vm) {                  // Determine # of 1-star reviews
            return vm.numberOfReviews(vm.reviews, 5);  // Call function to count # of 5-star reviews
        },
        filteredReviews(vm) {  // return only the objects in the reviews array with the rating for box that was clicked
                               //    or if filter=0 return all reviews
            return vm.reviews.filter((aReview) => {   // Call filter() with current review object
                return vm.filter === 0 ? true : aReview.rating === vm.filter;   // only return reviews whose rating matches the filter value
            })
        },
         isFormValid() {   // Determine if form data is valid
            // return true if all of the values in newReview are truthy (not empty)
            return this.newReview.reviewer && this.newReview.title && // true if reviewer has a value && title  has value
                    this.newReview.rating  && this.newReview.review;  //      && rating   has a value && review has a value  
        },
    },
    methods: {  // functions in the methods attribute are only executed when called

        numberOfReviews(reviews, starRating) {        // Determine # of reviews in the reviews array with star rating passed in
            return reviews.reduce( (currentCount, review ) => {                // Use the array reduce() method to count reviews
                return currentCount + ( review.rating === starRating ? 1 : 0); // if the rating in the review matches the rating we want
            }, 0);   // initialize currentCount to 0                           //       add 1 to currentCOunt, else add 0
        },
        addNewReview() {      // add a new review to the start of the reviews array
            this.reviews.unshift(this.newReview);  // this.newReview is the newReview object in data()
                                                   // attributes/properties are added and filled in 
                                                   // via v-model (two-way binding) in the form
            this.resetForm()  // call the resetForm method to clear the values in newReview
        },
        resetForm() {         // Set the variable that controls form display to false and clear newReview
            this.showForm = false;   // Set form display control variable to hide the form
            this.newReview = {};     // clear newReview
        }
    }
}
</script>

<style scoped>
    div.main {
        margin: 1rem 0;
    }

    div.main div.well-display {
        display: flex;
        justify-content: space-around;
    }

    div.main div.well-display div.well {
        display: inline-block;
        width: 15%;
        border: 1px black solid;
        border-radius: 6px;
        text-align: center;
        margin: 0.25rem;
    }

    div.main div.well-display div.well span.amount {
        color: darkslategray;
        display: block;
        font-size: 2.5rem;
        cursor: pointer;
    }

    div.main div.review {
        border: 1px black solid;
        border-radius: 6px;
        padding: 1rem;
        margin: 10px;
    }

    div.main div.review div.rating {
        height: 2rem;
        display: inline-block;
        vertical-align: top;
        margin: 0 0.5rem;
    }

    div.main div.review div.rating img {
        height: 100%;
    }

    div.main div.review p {
        margin: 20px;
    }

    div.main h3 {
        display: inline-block;
    }

    div.main h4 {
        font-size: 1rem;
    }

    div.main .form-element {
        display: flex;
        justify-content: flex-end;
        padding: .5em;
    }

    div.main .form-element label {
        padding: .5em 1em .5em 0;
        flex: 1;
    }

    div.main .form-element input, div.main .form-element select, div.main .form-element textarea {
        flex: 2;
    }

    div.main .form-element textarea {
        height: 10rem;
    }

    div.main .form-element input, div.main .form-element button {
        padding: 0.5em;
    }

    div.main .form-element button {
        background: gray;
        color: white;
        border: 0;
    }
</style>
