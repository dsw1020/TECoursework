<template>
  <div id="app">
    <product-review></product-review>  <!-- Vue component filename ProductReview.vue-->
  </div>
</template>

<script>
import ProductReview from './components/ProductReview.vue'
export default {    /* Expose data outside this JavaScript code     */
  name: 'app',      /* name of the component data                   */
  components : {    /* identify vue components used in the template */
    ProductReview   /* html tag name is <product-review>            */
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
}

#nav {
  padding: 30px;
}

#nav a {
  font-weight: bold;
  color: #2c3e50;
}

#nav a.router-link-exact-active {
  color: #42b983;
}
</style>
