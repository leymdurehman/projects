<template>
  <div id="app">
    <input type="file" @change="handleFileChange" />
    <button type="button" @click="uploadImage">Upload Image</button>
  </div>
</template>

<script>
export default {
  name: "app",
  data() {
    return {
      file: null
    };
  },
  methods: {
    handleFileChange(evt) {
      console.log(evt, evt.target.files);
      const file = evt.target.files[0];
      console.log(file);
      this.file = file;
    },
    uploadImage() {
      console.log("upload image");
      const formData = new FormData();
      formData.append("file", this.file);
      formData.append(
        "test",
        new Blob([JSON.stringify({ id: 1, name: "test" })], {
          type: "application/json"
        })
      );
      fetch("http://localhost:8080/instapic-api/api/photos/with-data", {
        method: "POST",
        body: formData
      })
        .then(response => console.log(response))
        .catch(err => console.error(err));
    }
  }
};
</script>

<style>
#app {
  font-family: "Avenir", Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
