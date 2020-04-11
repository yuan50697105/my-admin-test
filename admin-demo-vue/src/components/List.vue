<template>
    <div>
       <ul>
           <li v-for="item in items" :key="item">{{item}}</li>
       </ul>
    </div>
</template>

<script>
    export default {
        name: "List",
        data() {
            return {
                items: [1, 2, 3]
            }
        }
    }
</script>

<style scoped>
</style>
