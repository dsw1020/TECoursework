<template>
  <div class="books">
    <h1>Related Books</h1>
    <p>This is a list if other books you might enjoy</p>
    <books-list />
  </div>
</template>
<script>
import BooksList from "@/components/BooksList"

export default {
  name: "books",
  components :{
  BooksList
}
};
</script>
<style scoped>
.books {
  margin-top: 20px;
}
</style>
