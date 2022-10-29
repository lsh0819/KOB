<template>
  <NavBar />
  <router-view/>
</template>

<script>
import NavBar from "@/components/NavBar.vue"
import "bootstrap/dist/css/bootstrap.min.css"
import "bootstrap/dist/js/bootstrap"
// import $ from "jquery"

export default {
  components: {
    NavBar
  },
  setup(){
    // $.ajax({
    //   url: "http://localhost:3000/user/account/token/",
    //   type: "post",
    //   data: {
    //     username: "lsh",
    //     password: "plsh",
    //   },
    //   success(resp){
    //     console.log(resp);
    //   },
    //   error(resp){
    //     console.log(resp);
    //   }
    // }),
    // $.ajax({
    //   url: "http://localhost:3000/user/account/info/",
    //   type: "get",
    //   headers: {
    //     Authorization: "Bearer " + "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI3Zjk4NWE4NTYxZWQ0OWY5YWQ0MzEyNjg0ZTk4NjFhYiIsInN1YiI6IjEiLCJpc3MiOiJzZyIsImlhdCI6MTY2NzAyNjc1MCwiZXhwIjoxNjY4MjM2MzUwfQ.OGuasOrtMiebpxXEpe3uK0Bj2LBxqqjcbmnwXlnDwnA",
    //   },
    //   success(resp){
    //     console.log(resp);
    //   },
    //   error(resp){
    //     console.log(resp);
    //   }
    // }),
    // $.ajax({
    //   url: "http://localhost:3000/user/account/register/",
    //   type: "post",
    //   data: {
    //     username: "lsh2",
    //     password: "123",
    //     confirmedPassword : "123",
    //   },
    //   success(resp){
    //     console.log(resp);
    //   },
    //   error(resp){
    //     console.log(resp);
    //   }
    // })
  }
  
}
</script>

<style>
body {
  background-image: url("@/assets/images/background.png");
  background-size: cover;
}
</style>
