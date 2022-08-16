<template>
     <!-- preloader -->
    <div id="preloader" v-show="isLoading">
      <div class="preloader">
        <span></span>
        <span></span>
      </div>
    </div>
    <!-- preloader end  -->
</template>

<script>
    export default {
        props: {
            isLoading: Boolean,

        }
    }
</script>