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
    //     username: "lsh3",
    //     password: "waxycj.0819",
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
    //     Authorization: "Bearer " + "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJiMzYyMzE5ZjQzMjA0NDczYjE3NWNkMmQ4MWQ3ODFmOSIsInN1YiI6IjUiLCJpc3MiOiJzZyIsImlhdCI6MTY2NzEyMzEyNywiZXhwIjoxNjY4MzMyNzI3fQ.ZnkAGpCTR2c5nzTA6Zcf1VTLxTE9pZG7q0u9g1j9tOI",
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
    //     username: "lsh4",
    //     password: "plsh4",
    //     confirmedPassword : "plsh4",
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
