<template>
  <div>
      <form class="new-book-form">
          <div class='title-input'>
              <label for="title">Title:</label>
              <input type="text" name="title" v-model.trim="newBook.title"/>
          </div>
          <div class="author-input">
              <label for="author">Author:</label>
              <input type="text" name="author" v-model.trim="newBook.author"/>
          </div>
          <div class="isbn-input">
              <label for="isbn">ISBN:</label>
              <input type="text" name="isbn" v-model.trim="newBook.isbn"/>
          </div>
          <button type="submit" @click.prevent="addBook()">Add Book</button>
      </form>
  </div>
</template>
<script>
export default {
    name: 'new-book-form',
    data(){
        return {
            newBook: {
                read: false
            }
        }
    },
    methods: {
        addBook(){
            this.$store.commit("ADD_BOOK", this.newBook);
            this.resetForm();
        },
        resetForm(){
            this.newBook = {
                read: false
            }
        }
    }
}
</script>
<style>
</style>





