<template>
  <div>
    <h1>Products {{ products }}</h1>
    <div class="row">
      <div class="col col-sm-4 mb-3 mt-3">
        <div class="card" v-for="product in products" :key="product">
          <div class="card-body" >
            <h3>{{ prod.productname }}</h3>
            <div>{{ prod.productcost }}</div>
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
// import HelloWorld from '@/components/HelloWorld.vue'
import { mapGetters } from 'vuex';
export default {
  name: 'HomeView',
  components: {
    // HelloWorld
  },
  data(){
    return{
      prod: []
    }
  },
  computed: {
    ...mapGetters( 'product', { products: 'items' })
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
