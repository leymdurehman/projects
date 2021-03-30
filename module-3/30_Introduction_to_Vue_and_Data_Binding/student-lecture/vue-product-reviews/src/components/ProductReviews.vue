<template>
    <div class ="main">
        <h2> Product Reviews for {{name}} </h2> 
        <p class= "description">{{description}}</p> 
        <select v-model="showDescription">
                <option v-bind:value ="true"> Show Description</option>
                <option v-bind:value ="false"> Hide Description</option>


        </select>
        <div class="well-display">
            <div class="well">
                <span class="amount"></span>
                {{averageRating}} Average Rating
            </div>
             <div class="well">
                <span class="amount">{{numberOfOneStarReviews}}</span>
                1 Star Review{{numberofOneStarReviews === 1 ? ' ' : 's'}}
                <!-- this is saying ^ : if its 1 then empty string else add s -->
            </div>
           
             <div class="well">
                <span class="amount"></span>
                2 Star Review
            </div>

             <div class="well">
                <span class="amount"></span>
                3 Star Review
            </div>

             <div class="well">
                <span class="amount"></span>
                4 Star Review
            </div>
             <div class="well">
                <span class="amount"></span>
                5 Star Review
            </div>




        </div>
        <div class = "review" v-for="review in reviews" v-bind:key="review.id">
            <h4> {{review.reviewer}}</h4>
            <div class ="rating">
                <!--- watch singulars and plurals with using v- for loop -->
            <img src="../assets/star.png" v-for="i in review.rating"
                v-bind:key="i" v-bind:title=" review.rating + ' Star Review'"/>
        </div>
        <h3> {{review.title}}</h3>
        <p>{{review.review}}</p>
         </div>
    </div>
</template>

<script>
export default {
    name: 'product-reviews',
    showDescription : true,
    data(){
        return {
            name: 'Cigar Parties for Dummies',
            description: 'Host and plan the perfect cigar party for all of your squirrelly friends',
            reviews : [
            {
            reviewer: 'Malcolm Gladwell',
            title: 'What a book!',
            review:
            "It certainly is a book. I mean, I can see that. Pages kept together with glue (I hope that's glue) and there's writing on it, in some language.",
            rating: 3
            },
            {
            reviewer: 'Tim Ferriss',
            title: 'Had a cigar party started in less than 4 hours.',
            review:
            "It should have been called the four hour cigar party. That's amazing. I have a new idea for muse because of this.",
            rating: 4
            },
            {
            reviewer: 'Ramit Sethi',
            title: 'What every new entrepreneurs needs. A door stop.',
            review:
      "When I sell my courses, I'm always telling people that if a book costs less than $20, they should just buy it. If they only learn one thing from it, it was worth it. Wish I learned something from this book.",
    rating: 1
  },
  {
    reviewer: 'Gary Vaynerchuk',
    title: 'And I thought I could write',
    review:
      "There are a lot of good, solid tips in this book. I don't want to ruin it, but prelighting all the cigars is worth the price of admission alone.",
    rating: 3
  }
]
        }
    },
    computed: {
        averageRating(){
            let sum = this.reviews.reduce((currentSum, review) => {
                return currentSum + review.rating;
            },0);
            return sum / this.reviews.length;
        },
        numberOfOneStarReviews(){
            let count = this.reviews.reduce((currentCount, review)=> {
                return currentCount + (review.rating === 1 ? 1 : 0);
            }, 0)
            return count || this.count;
        }
    }
}
</script>

<!-- CSS  for this component-->
<style scoped>
div.main {
    margin: 1rem 0;
}
div.main div.well-display {
    display: flex;
    justify-content: space-around;
}
div.main div.well-display div.well {
    display: inline-block;
    width: 15%;
    border: 1px black solid;
    border-radius: 6px;
    text-align: center;
    margin: 0.25rem;
}
div.main div.well-display div.well span.amount {
    color: darkslategray;
    display: block;
    font-size: 2.5rem;
}
div.main div.review {
    border: 1px black solid;
    border-radius: 6px;
    padding: 1rem;
    margin: 10px;
}
div.main div.review div.rating {
    height: 2rem;
    display: inline-block;
    vertical-align: top;
    margin: 0 0.5rem;
}
div.main div.review div.rating img {
    height: 100%;
}
div.main div.review p {
    margin: 20px;
}
div.main div.review h3 {
    display: inline-block;
}
div.main div.review h4 {
    font-size: 1rem;
}
div.main div.review.favorited {
    background-color: lightyellow;
}
</style>
