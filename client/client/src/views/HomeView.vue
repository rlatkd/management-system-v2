<template>
    <div class="home">
        <a href="/user">사용자 목록</a>
        <button @click="getData">데이터 호출</button>
    </div>
</template>

<script>
import axios from 'axios'
export default {
    name: 'HomeView',
    methods: {
        getData() {
            axios
            .post('http://localhost:8090/findAll')
            .then((res) => {
                console.log(res)
            })
            .catch((err) => {
                console.log(err)
            })
        }
    }
}
</script>

<style scoped>
.home {
    text-align: center;
}

a {
    color: black;
    text-decoration: none;
    font-weight: bold;
    font-size: 1.5rem;
}
</style>