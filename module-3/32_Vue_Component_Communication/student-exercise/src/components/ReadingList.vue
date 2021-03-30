<template>
  <div class="book-container">
    
    <book-card 
     v-for="book in allBooks" 
     v-bind:key="book.isbn" 
     v-bind:book="book"/> <!--- this directly binds to the prop in the child component----->
  </div>

</template>

<script>
import BookCard from './BookCard.vue'

export default {
    name: 'reading-list',
    components: {
      BookCard 
    },
    computed:{
        allBooks() {
      return this.$store.state.books;
      }
    }      
   
}
</script>

<style>
.book-container {
    display:flex;
    justify-content: space-evenly;
    flex-wrap: wrap;
}
</style>