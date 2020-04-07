// router.js is created when you add the router to a Vue project or you specify it on Vue create */

import Vue    from 'vue'                    // include the basic Vue framework
import Router from 'vue-router'             // include the Router part of the Vue framework
import Home   from './views/Home.vue'       // include the Home.vue code
import Books  from './views/Books.vue'      // include the Books.vue code

Vue.use(Router)                  // Telling Vue we want to use the Router

export default new Router({      // Instantiate a Router object
  mode: 'history',               // Use history mode so we can of where we went
  base: process.env.BASE_URL,
  routes: [                      // The paths and related components the router is going to manage
    {
      path: '/',                 // The URL path for this entry
      name: 'home',              // name used in the <router-link> for the path
      component: Home            // The Vue to component to mount when the path is chosen
    },
    {
      path: '/about',
      name: 'about',
      // route level code-splitting
      // this generates a separate chunk (about.[hash].js) for this route
      // which is lazy-loaded when the route is visited.
      component: () => import(/* webpackChunkName: "about" */ './views/About.vue')
    },
    {
      path: "/books",
      name: "books",
      component: Books
    }
  ]
})
