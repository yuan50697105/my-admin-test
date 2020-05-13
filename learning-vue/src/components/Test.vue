<template>
  <div>
    <!--    <input type="text" v-model="name">-->
    <!--    {{name}}-->
    <!--    {{lastName}}-->
    <!--    {{getname}}-->
    <a :href="url">百度</a>
    <div :text="1 === 1" :style="{color:'red'}">xxxx</div>
    <div :id="name" :class="{'active':isActive}">aa</div>
    <div v-if="isActive">
      激活
    </div>
    <div v-else>
      停用
    </div>
    <template v-if="isActive">
      <div> aaaa</div>
    </template>
    <template v-else>
      <div> bbbbb</div>
    </template>
    <template v-if="array.length>0">
      <ul>
        <li v-for="item in array" :key="item">
          {{item}}
        </li>
      </ul>
    </template>
    <template v-else>
      列表为空
    </template>
  </div>
</template>

<script>
  export default {
    name: "Test",
    data() {
      return {
        name: 'aaaa',
        lastName: '',
        url: 'https://www.baidu.com',
        isActive: false,
        array: [1, 2, 3]
      }
    },
    watch: {
      name(name) {
        this.lastName = 'lastName' + name;
      }
    },
    computed: {
      getname(name) {
        return name.split('').reserve().join('');
      }
    }
  }
</script>

<style scoped>
  .active {
    color: red;
  }
</style>
