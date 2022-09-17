<template>
  <div class="home">
    <h1>{{ msg }}</h1>
  </div>
</template>

<script>
// @ is an alias to /src
// import HelloWorld from '@/components/HelloWorld.vue'

export default {
  name: 'HomeView',
  components: {
    // HelloWorld
  },
  data(){
    return{
      msg: ""
    }
  },
}
</script>
