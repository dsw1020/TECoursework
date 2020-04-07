import Vue from 'vue'          // include code for Vue framework
import App from './App.vue'    // include code for main Vue app

Vue.config.productionTip = false

new Vue({              // Instantiate a Vue object - render tells what Vue component to render a main 
  render: h => h(App)  // Use this vue file for the app
}).$mount('#app')      // $mount() - html in the template for the component
