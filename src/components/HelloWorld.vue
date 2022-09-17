<template>
  <div class="hello">
    <h1>{{ msg }}</h1>

  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  data() {
    return {
      msg: ''
    }
  },
  mounted() {
    fetch('/api/users/all')
      .then(response => response.text())
      .then(date => {
        this.msg = date;
      })
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

</style>
