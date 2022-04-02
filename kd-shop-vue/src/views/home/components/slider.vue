<template>
  <!-- slider-area start -->
    <section class="slider-area pos-relative">
      <Carousel class="slider-active" arrows>
        <template #prevArrow>
            <button class="slick-prev slick-arrow">
                <!-- <LeftCircleOutlined/> -->
            </button>
        </template>
        <template #nextArrow>
            <button class="slick-next slick-arrow">
                <!-- <RightCircleOutlined/> -->
            </button>
        </template>
        
        <div class="single-slider slide-1-style slide-height d-flex align-items-center">
          <div class="shape-title bounce-animate">
            <h2>2022</h2>
          </div>
          <div class="shape-icon bounce-animate">
            <img src="@/static/picture/shape-icon.png" alt="" />
          </div>
          <div class="container-fluid">
            <div class="row">
              <div class="col-xl-7">
                <div class="slide-content">
                  <span data-animation="fadeInRight" data-delay=".2s">[I have] 校园二手交易平台</span>
                  <h1 data-animation="fadeInUp" data-delay=".5s">
                    你想要的 我这都有
                  </h1>
                  <div class="slide-btn">
                    <router-link
                      to="/goods/publish"
                      class="btn theme-btn"
                      data-animation="fadeInLeft"
                      data-delay=".7s"
                      >我有闲置 | 立即发布</router-link>
                    <a
                      class="btn white-btn"
                      data-animation="fadeInRight"
                      data-delay=".9s"
                      >分类</a>
                  </div>
                </div>
              </div>
              <div class="col-xl-5">
                <div
                  class="slide-shape1"
                  data-animation="bounceInRight"
                  data-delay=".9s"
                >
                  <img
                    src="@/static/picture/shape1.png"
                    th:src="@{/picture/shape1.png}"
                    alt=""
                  />
                </div>
                <div
                  class="slide-shape2"
                  data-animation="bounceInRight"
                  data-delay="1.2s"
                >
                  <img
                    src="@/static/picture/shape2.png"
                    alt=""
                  />
                </div>
              </div>
            </div>
          </div>
        </div>
        <div class="single-slider slide-1-style slide-height d-flex align-items-center">
          <div class="shape-title bounce-animate">
            <h2>2022</h2>
          </div>
          <div class="shape-icon bounce-animate">
            <img src="@/static/picture/shape-icon.png" alt="" />
          </div>
          <div class="container-fluid">
            <div class="row">
              <div class="col-xl-7">
                <div class="slide-content">
                  <span data-animation="fadeInRight" data-delay=".2s"
                    >Furniture Collection</span
                  >
                  <h1 data-animation="fadeInUp" data-delay=".5s">
                    Synnes Dining Chair Upholstered
                  </h1>
                  <div class="slide-btn">
                    <a
                      class="btn theme-btn"
                      href="shop.html"
                      data-animation="fadeInLeft"
                      data-delay=".7s"
                      >shop now</a
                    >
                    <a
                      class="btn white-btn"
                      href="shop.html"
                      data-animation="fadeInRight"
                      data-delay=".9s"
                      >category</a
                    >
                  </div>
                </div>
              </div>
              <div class="col-xl-5">
                <div
                  class="slide-shape1"
                  data-animation="bounceInRight"
                  data-delay=".9s"
                >
                  <img src="@/static/picture/shape3.png" alt="" />
                </div>
                <div
                  class="slide-shape2"
                  data-animation="bounceInRight"
                  data-delay="1.1s"
                >
                  <img src="@/static/picture/shape4.png" alt="" />
                </div>
              </div>
            </div>
          </div>
        </div>
      </Carousel>
    </section>
    <!-- slider-area end -->
</template>

<script>
import { Carousel } from 'ant-design-vue'
// import { LeftCircleOutlined, RightCircleOutlined } from '@ant-design/icons-vue';

export default {
    components: {
        Carousel,
    }
}
</script>

<style scoped>
/* @import url("../../../assets/css/owl.carousel.min.css"); */
/* 3. Slider */
.slider-area {
  position: relative;
  z-index: 1;
}

.shape-title {
}

.shape-title {
  position: absolute;

  top: 54px;

  z-index: -1;

  left: 220px;
}

.shape-title h2 {
  font-size: 300px;

  color: #ededed;

  font-weight: 500;
}

.shape-icon {
  position: absolute;

  bottom: 40px;

  left: 150px;
}

.slide-shape1 {
  position: absolute;

  left: 40px;

  top: -75px;
}

.slide-shape2 {
  position: absolute;

  right: -60px;

  bottom: 0;
}

.slide-height {
  min-height: 700px;

  background-size: cover;

  background-position: center center;
}

.slide-height-2 {
  min-height: 950px;
}

.slide-height-4 {
  background-size: cover;
}

.slide-height-5 {
  min-height: 600px;
}

.slide-1-style {
  padding: 0 325px;
  position: relative;
}

.slide-height-full {
  min-height: 960px;

  background-size: cover;

  background-position: center center;
}

.slide-content span {
  font-size: 14px;

  letter-spacing: 2px;

  text-transform: uppercase;

  font-weight: 500;

  color: #747691;

  display: block;

  margin-bottom: 20px;
}

.slide-content h1 {
  font-size: 80px;

  font-weight: 500;

  margin-bottom: 40px;
}

.slide-btn a {
  margin-right: 25px;
}

.slider-active .slick-dots {
  text-align: center;

  bottom: 30px;

  z-index: 99;

  position: absolute;

  left: 0;

  right: 0;

  z-index: 12;
}

.slider-active .slick-dots li {
  display: inline-block;

  margin: 0 4px;
}

.slider-active .slick-dots li button {
  background: no-repeat;

  border: 0;

  height: 10px;

  width: 13px;

  text-indent: -9999px;

  transition: 0.3s;

  padding: 0;

  border: 2px solid #cccccc;

  height: 13px;

  border-radius: 50%;
}

.slider-active .slick-dots li.slick-active button {
  border-color: #292929;
}

.slider-white .slick-dots li.slick-active button {
  border-color: #fff;

  background: #fff;
}

.slider-active button.slick-arrow {
  position: absolute;

  top: 50%;

  left: 90px;

  transform: translateY(-50%);

  background: none;

  border: 0;

  font-size: 16px;

  padding: 0;

  color: #10111e;

  z-index: 2;

  opacity: 0;

  visibility: hidden;

  height: 80px;

  width: 80px;

  border-radius: 50%;

  cursor: pointer;

  background: #fff;

  line-height: 80px;
}

.slider-3 button.slick-arrow {
  color: #10111e;

  background: #fff1f0;
}

.slider-active button.slick-next {
  left: auto;
  right: 90px;
}

.slider-active:hover button.slick-prev {
  left: 105px;
}

.slider-active:hover button.slick-next {
  right: 105px;
}

.slider-active:hover button {
  opacity: 1;

  visibility: visible;
}

.slider-active button:hover {
  background: #fe4536;

  color: #fff;

  box-shadow: 0px 6px 12px 0px rgba(254, 69, 54, 0.4);
}

.slider-price span {
  display: inline-block;

  font-size: 40px;

  font-weight: 300;

  color: #fe4536;

  margin-right: 20px;

  margin-bottom: 0;
}

.slider-price .old-price {
  color: #b2b4ca;

  text-decoration: line-through;
}

/* slider 2 */

.slider-2 .slide-content h1 {
  margin-bottom: 14px;
}

.home-2-shape {
  color: #fff !important;

  opacity: 0.3;
}

.slider-2 .shape-title h2 {
  color: #e5dfda;
}

.slider-2 .shape-title h2.home-2-shape {
  color: #fff;

  opacity: 0.3;
}

.slider-2 .shape-title {
  top: 21%;
}

/* slider 3 */

.slide-content-3 h1 {
  font-size: 140px;

  font-weight: 500;

  margin-bottom: 40px;

  line-height: 0.8;
}

.shape-title-3 h2 {
  font-size: 600px;

  color: #fffbf7;
}

.shape-title-3 {
  top: -95px;

  left: 0;

  line-height: 1;
}

.shape-icon-3 {
  position: absolute;

  bottom: 40px;

  left: auto;

  right: -95px;

  top: 33%;
}

/* slider 4 */

.slide-content-4 h1 {
  font-size: 80px;

  font-size: 120px;

  color: #ffffff;

  margin-bottom: 25px;
}

.shape-title-4 {
  position: absolute;

  top: auto;

  z-index: -1;

  left: auto;

  right: 0;

  bottom: 0;

  line-height: 1;
}

.shape-title-4 h2 {
  font-size: 300px;

  color: #fff;

  opacity: 0.05;

  line-height: 0.7;
}

.shape-icon-4 {
  bottom: auto;

  left: auto;

  right: 150px;

  top: 30%;
}

/* slider 5 */

.shape-title-5 {
  left: 0;

  top: auto;

  bottom: 30px;

  z-index: 1;
}

.shape-title-5 h2 {
  color: #fffbf7;

  line-height: 0.5;

  opacity: 0.2;
}

.slide-content-5 {
  position: relative;

  z-index: 9;
}

.slider-active-5 .slick-dots {
  text-align: center;

  margin-top: -40px;

  position: absolute;

  z-index: 99;

  left: 0;

  right: 0;
}

.slider-active-5 .slick-dots li {
  display: inline-block;

  margin: 0 5px;
}

.slider-active-5 .slick-dots li button {
  background: #fe4536;

  border: 0;

  height: 4px;

  width: 20px;

  text-indent: -9999px;
}

.slider-active-5 .slick-dots li.slick-active button {
  background: #fff;
}

.slider-active-5 {
}
</style>