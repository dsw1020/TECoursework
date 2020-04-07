import Vue from 'vue'
import Router from 'vue-router'
import Users from './views/Users.vue'
import User from './views/User.vue'

Vue.use(Router)

export default new Router({
  mode: 'history',
  base: process.env.BASE_URL,
  routes: [
    {
      path: '/',                    // Where to go for the root path ('/')
      redirect: { name: 'users' }   // When you get the path redirect to this route
    },
    {
      path: '/users',
      name: 'users',
      component: Users
    },
    {
      path: '/users/:id',    // This path will have a parameter we're call id after the root
      name: 'user',          // This path is known as user in the router
      component: User        // This path will cause User.vue to be processed and mounted (added to DOM) 
    }
  ]
})
