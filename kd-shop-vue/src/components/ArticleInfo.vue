<template>
  <article class="postbox post format-image mb-40">
    <div class="postbox__thumb">
      <a href="#">
        <img src="../static/picture/b1.jpg" alt="blog image" />
      </a>
    </div>
    <div class="postbox__text p-30">
      <div class="post-meta mb-15">
        <span
          ><a href="#"><UserOutlined /> Diboli </a></span
        >
      </div>
      <h3 class="blog-title blog-title-sm">
        <a href="#">Lorem ipsum dolor sit amet, consectetur adipisic .</a>
      </h3>
      <div class="post-text">
        <p>
          Lorem ipsum dolor sit amet, consecte tur adipisicing elit, sed do
          eiusmod tempor incididunt ut labore et.
        </p>
      </div>
      <div class="read-more">
        <a href="#" class="read-more">read more <SwapRightOutlined /></a>
      </div>
    </div>
  </article>
</template>

<script>
import {SwapRightOutlined,UserOutlined} from '@ant-design/icons-vue'
export default {
    components: {
        SwapRightOutlined,UserOutlined
    }
};
</script>

<style scoped>

</style>