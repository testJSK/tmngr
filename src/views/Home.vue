<template>
  <div>
    <h1>Products</h1>
    <div class="row">
      <div class="col col-sm-4 mb-3 mt-3">
        <div class="card" v-for="product in products" :key="product">
          <div class="card-body" >
            <h3>{{ product.productname }}</h3>
            <div>{{ product.productcost }}</div>
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

export default {
  name: 'HomeView',
  components: {
    // HelloWorld
  },
  data(){
    return{
      products: []
    }
  },
  mounted() {
    fetch('/api/products/all')
        .then(response => response.json())
        .then(data => {
          console.log(data)
          this.products = data;
          console.log(this.users)
        });
  }
}
</script>
