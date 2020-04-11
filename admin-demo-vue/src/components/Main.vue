<template>
    <div>
        首页
        <header>头部</header>
        <div class="content">内容
            <input type="text" v-model="name">
            {{name}}
            <button v-bind:click="aaa"></button>
        </div>
    </div>
</template>

<script>
    export default {
        name: "Main",
        data() {
            return {
                name: "aaaa"
            }
        },
        methods:{
            aaa:function () {
                alert(name);
            }
        }
    }
</script>

<style scoped>
    .content {
        background-color: aqua;
    }
</style>
