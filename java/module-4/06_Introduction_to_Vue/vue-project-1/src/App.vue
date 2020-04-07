<template>
  <div id="app">
    <img alt="Vue logo" src="./assets/logo.png">
    <HelloWorld msg="Welcome to Your Vue.js App"/>
  </div>
</template>

<script>  // JavaScript part of the Vue component
import HelloWorld from './components/HelloWorld.vue'  // Include the Vue component code

export default { // Make this data available outside this JavaScript code
  name: 'App',   // name of the main Vue applicaiton (App.vue)
  components: {  // List of the Vue components that used in the Vue app
    HelloWorld
  }
}
</script>

<style lang="scss">
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
