<template>
  <div class="card" v-bind:class="{'read': book.read}">
     <div class="book-title">
        <h2>{{ book.title }}</h2>
     </div>
     <div class="book-author">
        <h3> {{book.author}}</h3>
     </div>
     <div>
        <img v-if="book.isbn" v-bind:src="'http://covers.openlibrary.org/b/isbn/' + book.isbn + '-M.jpg'" />
     </div>   
         <button @click="setReadStatus(book)">
            {{unreadOrReadText(book)}}
         </button>
 </div>
</template>

<script>

export default {
    name: 'book-card',
    props: ['book'],
             
    
  data(){
        return{
            readStatus: this.$store.state.book.read
        }
    } ,
    methods: {
        unreadOrReadText(book){
        let textDisplay = "";
        if (book.read === true){
        return textDisplay = 'Mark Unread';
        } else {
        textDisplay = 'Mark Read';
        return textDisplay;
        }
        
        },

        setReadStatus(book){
            this.$store.commit("SET_STATUS", book);
            

           
        }
    }
}

</script>

<style>
.card {
    border: 2px solid black;
    border-radius: 10px;
    width: 250px;
    height: 550px;
    margin: 20px;
}

.card.read {
    background-color: lightgray;
}

.card .book-title {
    font-size: 1.5rem;
}

.card .book-author {
    font-size: 1rem;
}
</style>
