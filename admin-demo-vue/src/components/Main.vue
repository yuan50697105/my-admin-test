<template>
    <div>
        首页
        <header>头部</header>
        <div class="content">内容
            <input type="text" v-model="name">
            {{name}}
            <button v-bind:click="aaa"></button>
        </div>
        <div class="content-list">
            <List/>
        </div>
        <div class="content-counter">
            <Counter/>
        </div>
    </div>
</template>

<script>
    import List from "./List";
    import Counter from "./Counter";
    export default {
        name: "Main",
        components: {Counter, List},
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

    .content-list {
    }
</style>
