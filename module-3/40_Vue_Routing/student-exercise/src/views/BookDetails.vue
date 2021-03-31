<template>
<div>
 <h2>{{book.title}}</h2> 
<p> {{book.author}}</p>
<img v-if="book.isbn" v-bind:src="'http://covers.openlibrary.org/b/isbn/' + book.isbn + '-M.jpg'" />
<p v-if="book.read">I have read this book</p>
<p v-if="!book.read">I have not read this book</p>
</div>
  
  

</template>

<script>


export default {

  name: 'book-details',
  components: { 
      
      
      },
      computed:{
     book(){
         return this.$store.state.books.find( book => {
                return book.isbn == this.$store.state.activeBook;
            })
    } },

      created(){
    const isbnFromURL = this.$route.params.isbn;
    this.$store.commit('SET_ACTIVE_BOOK', isbnFromURL);
}

}
</script>

<style>

</style>