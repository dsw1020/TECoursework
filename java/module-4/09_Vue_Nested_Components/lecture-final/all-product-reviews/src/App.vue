<template>
  <div id="app">
    <search-bar v-on:filter="handleFilter"/>   <!-- if the SearchBar fires the filter event, run handleFilter method -->
    <!-- v-bind is connecting the property in ProductReview to the filter variable in this compenent -->
    <product-review
      name="Cigar Parties for Dummies"
      description="Host and plan the perfect cigar party for all of your squirrelly friends."
      v-bind:searchValue="filter"  
       />
       <!-- v-bind is connecting the property in ProductReview to the filter variable in this compenent -->
    <product-review
      name="Tech Elevator Bootcamp Extravaganza"
      description="14 crazy weeks of fun and coding with an emphasis on the coding"
      v-bind:searchValue="filter"  
       />
  </div>
</template>

<script>
import ProductReview from './components/ProductReview.vue';
import SearchBar     from './components/SearchBar.vue';

export default {
  name: 'app',
  components: {
    ProductReview,
    SearchBar
  },
  data() {
    return {
      filter: ''   // will hold the text from the SearchBar when the filter event is triggered
    };
  },
  methods: {
      handleFilter(filterText)  {    // This is run from the v-on when the filter event is triggered by SearchBar
                                     // any data passed from event will be accessed through filterText
         this.filter =  filterText;  // copy the data from the event into our property called filter                        
  }
}
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}

#app div.main {
  display: inline-block;
  width: 45%;
  padding: 1em;
  border: 1px black solid;
  border-radius: 5px;
  margin: 0 1em;
  vertical-align: top;
}
</style>
