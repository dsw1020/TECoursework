<template>
  <div class="user-profile">
    <pre>{{user}}</pre>   <!-- Display the data in the user object -->
    <router-link to="/users">Back to Users List</router-link>
  </div>
</template>

<script>
import userService from '@/service/UserService';

export default {
  name: 'user-profile',
  data() {
    return {
      user: null,   // Will contain values for a user when displayed
    }
  },
  methods: {
    getUser(id) {  // get the user with the id passed as a parameter
      userService.get(id).then(user => this.user = user);   // Assign the data returned to the user object
    }
  },
  // specify processing at the created LifeCycle hook
  created() {         // After the Vue object is created and before display do some processing 
    this.getUser(this.$route.params.id);  // Run the getUser() with the parameter 
                                          //   called id specified in the path (route)
                                          // $route says go to the Vue router
  }
}
</script>
