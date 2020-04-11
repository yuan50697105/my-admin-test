<template>
    <div>
        <span>{{counter}}</span>
        <button @click="add">添加</button>
        <button @click="decrease">减少</button>
    </div>
</template>

<script>
    export default {
        name: "Counter",
        data() {
            return {
                counter: 0
            }
        },
        methods:{
            add:function () {
                this.counter += 1;
            },
            decrease:function () {
                this.counter -= 1;
            }
        }
    }
</script>

<style scoped>

</style>
