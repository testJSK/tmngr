<template>
  <div>
    <h1>Products</h1>
    <div class="row">
      <div class="col col-sm-4 mb-3 mt-3">
        <div class="card" v-for="pr in products" :key="pr">
          <div class="card-body" >
<!--            <h3>{{ pr.title }}</h3>-->
<!--            <div>{{ pr.price }}</div>-->
            <router-link to="">Read more</router-link>
            <hr>
            <button class="btn btn-success">Remove</button>
            <button class="btn btn-success">Add</button>
          </div>
        </div>
      </div>
    </div>
  </div>

</template>

<script>
import { mapGetters } from 'vuex';
export default {
  name: 'HomeView',
  components: {
  },
  data(){
    return{
    }
  },
  computed: {
    ...mapGetters( 'products', { products: 'items' })
  }
  // mounted() {
  //   fetch('/api/products/all')
  //       .then(response => response.json())
  //       .then(data => {
  //         console.log(data)
  //         this.prod = data;
  //         console.log(this.users)
  //       });
  // }
}
</script>
