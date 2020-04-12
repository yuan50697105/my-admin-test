<template>
  <div>
    <el-container>
      <el-header>头部</el-header>
      <el-aside width="100%">
        <el-menu :default-active="activeIndex" class="el-menu-demo" mode="horizontal" @select="handleSelect">
          <el-submenu index="index" v-for="(item,index) in items" :key="index">
            <template slot="title">{{item.item}}</template>
            <el-menu-item index="" v-for="itema in item.items" :key="itema">{{itema.item}}</el-menu-item>
          </el-submenu>
        </el-menu>
      </el-aside>
      <el-container>
        <el-main>Main</el-main>
      </el-container>
      <el-footer>底部</el-footer>
    </el-container>
  </div>
</template>

<script>
  export default {
    name: "Index",
    data() {
      return {
        items: [
          {
            item: "ssss",
            items: []
          },
          {
            item: "aaaa",
            items: [
              {item: "bbbbb"}
            ]
          }]
      }
    },
    methods: {
      handleSelect(key, keyPath) {
        console.log(key, keyPath);
      }
    }
  }
</script>

<style scoped>
  .el-header, .el-footer {
    background-color: #B3C0D1;
    color: #333;
    text-align: center;
    line-height: 60px;
  }
  
  .el-aside {
    background-color: #D3DCE6;
    color: #333;
    text-align: center;
    line-height: 200px;
  }
  
  .el-main {
    background-color: #E9EEF3;
    color: #333;
    text-align: center;
    line-height: 160px;
  }
  
  body > .el-container {
    margin-bottom: 40px;
  }
  
  .el-container:nth-child(5) .el-aside,
  .el-container:nth-child(6) .el-aside {
    line-height: 260px;
  }
  
  .el-container:nth-child(7) .el-aside {
    line-height: 320px;
  }
</style>
