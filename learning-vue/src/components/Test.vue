<template>
  <div>
<!--    <input type="text" v-model="name">-->
<!--    {{name}}-->
<!--    {{lastName}}-->
<!--    {{getname}}-->
    <a :href="url">百度</a>
    <div :text="1 === 1">xxxx</div>
    
  </div>
</template>

<script>
  export default {
    name: "Test",
    data() {
      return {
        name: 'aaaa',
        lastName: '',
        url:'https://www.baidu.com'
      }
    },
    watch: {
      name(name) {
        this.lastName = 'lastName' + name;
      }
    },
    computed: {
      getname(name){
        return name.split('').reserve().join('');
      }
    }
  }
</script>

<style scoped>

</style>
