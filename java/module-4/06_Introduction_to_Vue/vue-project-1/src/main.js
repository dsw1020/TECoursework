import Vue from 'vue'           // include the Vue framework
import App from './App.vue'     // include the code from the App.vue file

Vue.config.productionTip = false

new Vue({               // instantiate a Vue object - render property tells Vue what to render in the browser
  render: h => h(App),  // h(App) - tells the Vue object what the Vue component is
}).$mount('#app')       //$mount says to put the Vue stuff here in the html
                        //    #app - put the vue stuff at the id='app" in the html 