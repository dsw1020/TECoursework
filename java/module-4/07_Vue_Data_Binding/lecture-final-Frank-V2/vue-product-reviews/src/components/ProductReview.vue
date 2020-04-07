<template>
    <div class="main">
        <h2>Product Reviews for {{ name }}</h2>

        <p class="description">{{ description }}</p>

        <div class="well-display">
            <div class="well">
                <span class="amount"> {{ averageRating }}</span>
                Average Rating
            </div>

            <div class="well">
                <span class="amount">{{ numberOfOneStarReviews }}</span>
                1 Star Review
            </div>

            <div class="well">
                <span class="amount">{{ numberOfTwoStarReviews }}</span>
                2 Star Review
            </div>

            <div class="well">
                <span class="amount">{{ numberOfThreeStarReviews }}</span>
                3 Star Review
            </div>

            <div class="well">
                <span class="amount">{{ numberOfFourStarReviews }}</span>
                4 Star Review
            </div>

            <div class="well">
                <span class="amount">{{ numberOfFiveStarReviews }}</span>
                5 Star Review
            </div>
        </div>

        <div class="review" v-for="review in reviews" v-bind:key="review.id">
            <h4>{{ review.reviewer }}</h4>
            <div class="rating">
                <img src="../assets/star.png" :title="review.rating + ' Star Review'" class="ratingStar" v-for="n in review.rating" />
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
        return {    // return this data when Vue calls the data() for the component
            name: 'Cigar Parties for Dummies',
            description: 'Host and plan the perfect cigar party for all of your squirrelly friends.',
            reviews: [
                {
                    id: 1,
                    reviewer: "Malcolm Gladwell",
                    title: 'What a book!',
                    review: "It certainly is a book. I mean, I can see that. Pages kept together with glue (I hope that's glue) and there's writing on it, in some language.",
                    rating: 3
                },
                {
                    id: 2,
                    reviewer: "Tim Ferriss",
                    title: 'Had a cigar party started in less than 4 hours.',
                    review: "It should have been called the four hour cigar party. That's amazing. I have a new idea for muse because of this.",
                    rating: 4
                },
                {
                    id: 3,
                    reviewer: "Ramit Sethi",
                    title: 'What every new entrepreneurs needs. A door stop.',
                    review: "When I sell my courses, I'm always telling people that if a book costs less than $20, they should just buy it. If they only learn one thing from it, it was worth it. Wish I learned something from this book.",
                    rating: 1
                },
                {
                    id: 4,
                    reviewer: "Gary Vaynerchuk",
                    title: 'And I thought I could write',
                    review: "There are a lot of good, solid tips in this book. I don't want to ruin it, but prelighting all the cigars is worth the price of admission alone.",
                    rating: 3
                },{
                    id: 5,
                    reviewer: "Jason Alexander",
                    title: 'It was OK',
                    review: "Why didn't they print it on papyrus? Would have been much cooler!",
                    rating: 5
                },
                {
                    id: 6,
                    reviewer: "Dan Gilbert",
                    title: 'Great book',
                    review: "I was wondering where the cigars came from?  Who owns the squirrels?",
                    rating: 2
                },
                {
                    id: 7,
                    reviewer: "Roman Gabriel",
                    title: 'Looks alot like a book I wrote',
                    review: "I think it was done well",
                    rating: 3
                },
                {
                    id: 8,
                    reviewer: "Don Corelone",
                    title: 'Drop the gun and grab the book',
                    review: "I had to buy it, they made me an offer I couldn't refuse.",
                    rating: 2
                },{
                    id: 9,
                    reviewer: "Frank Ginzo",
                    title: 'Excellent book!  Everyone should own 40 copies!',
                    review: "Craig paid me $20 to review it.  I really never looked at it",
                    rating: 5
                }
            ]
        };  // end of return block
    },     // end of data()

computed: {  // do this when any element it uses changes

    averageRating(vm) { // calcutate average rating - vm is an object that represents the data
        let sum = vm.reviews.reduce( (currentSum,  aReview) => {  // use the reduce() method to sum the rating in the reviews array
        return currentSum + aReview.rating;
        }, 0);   // 0 is  the initial value for currentSum
    return (sum / vm.reviews.length).toFixed(1);   // Calculate avereage by dividing sum by the number of reviews
    },                                             // toFixed() rounds to teh 3 of decimal places specified
    numberOfOneStarReviews(vm) {
        return vm.numberOfReviews(vm.reviews, 1);  // Call function to count number of 1 star reviews
    },
    numberOfTwoStarReviews(vm) {
        return vm.numberOfReviews(vm.reviews, 2);  // Call function to count number of 2 star reviews
    },
    numberOfThreeStarReviews(vm) {
        return vm.numberOfReviews(vm.reviews, 3);  // Call function to count number of 3 star reviews
    },
    numberOfFourStarReviews(vm) {
        return vm.numberOfReviews(vm.reviews, 4);  // Call function to count number of 4 star reviews
    },
    numberOfFiveStarReviews(vm) {
        return vm.numberOfReviews(vm.reviews, 5);  // Call function to count number of 5 star reviews
    }

},    // end of computed:
methods: { // only do this when called - DO NOT FORGET THE 's' in METHODS
 
    numberOfReviews(reviews, starType) {       // Count number of reviews with rating passe din as starType
            return reviews.reduce( (currentCount, review ) => {
                 return currentCount + ( review.rating === starType ? 1 : 0);
                }, 0);    // initialze current count to 0
    }
}    // end of methods
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
</style>