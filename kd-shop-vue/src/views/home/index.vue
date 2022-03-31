<template>
  <main>
    <!-- 轮播 -->
    <Slider></Slider>
    <!-- banner -->
    <Banner></Banner>
    <!-- product-area start -->
    <section class="product-area box-90 pt-70 pb-40">
      <div class="container-fluid">
        <div class="row">
          <div class="col-xl-5 col-lg-12">
            <div class="area-title mb-50">
              <h2>最新发布</h2>
              <p>浏览我们种类繁多的产品</p>
            </div>
          </div>
          <div class="col-xl-7 col-lg-12">
            <div class="product-tab mb-40">
              <ul class="nav product-nav justify-content-xl-end">
                <li class="nav-item">
                  <a class="nav-link active">生活日用</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link">寝具</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link">宿舍用品</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link">电子数码</a>
                </li>
              </ul>
            </div>
          </div>
        </div>
        <div class="row">
          <div class="pro-item col-xl-3">
            <GoodInfo></GoodInfo>
          </div>
          <div class="pro-item col-xl-3">
            <GoodInfo></GoodInfo>
          </div>
          <div class="pro-item col-xl-3">
            <GoodInfo></GoodInfo>
          </div>
          <div class="pro-item col-xl-3">
            <GoodInfo></GoodInfo>
          </div>
        </div>
      </div>
    </section>
    <!-- product-area end -->

    <!-- 我们的特色 -->
    <Features></Features>

    <!-- 最新资讯 -->
    <News></News>

    <!-- subscribe-area start -->
    <section class="subscribe-area box-105">
      <div class="subscribe-inner black-bg pt-70 pb-20">
        <div class="container-fluid">
          <div class="row">
            <div class="col-xl-5">
              <div class="subscribe d-flex fix">
                <div class="subscribe-icon">
                  <img src="@/static/picture/subscribe.png" alt="" />
                </div>
                <div class="area-title white-color mb-50">
                  <h2>新闻通讯</h2>
                  <p>订阅这里获取每一个更新</p>
                </div>
              </div>
            </div>
            <div class="col-xl-7">
              <div class="subscribe fix">
                <div class="subscribe-form mb-50">
                  <form action="#">
                    <input type="text" placeholder="Enter your email address" />
                    <button class="btn theme-btn" type="submit">
                      立即订阅
                    </button>
                  </form>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>
    <!-- subscribe-area end -->
  </main>
</template>

<script>
import Slider from './components/slider.vue'
import Banner from './components/banner.vue'
import GoodInfo from "@/components/GoodInfo";
import Features from './components/features.vue'
import News from './components/news.vue'
export default {
  components: {
    Slider,
    Banner,
    Features,
    News,
    GoodInfo,
  },
};
</script>

<style scoped>
/* 6. Product */
.product-wrapper {

	overflow: hidden;

}

.product-img {

	position: relative;

	overflow: hidden;

}

.product-img > a{}

.product-img img {

	width: 100%;

}

.product-action {

	position: absolute;

	bottom: 40px;

	transition: .3s;

	z-index: 2;

	opacity: 0;

	visibility: hidden;

	left: 0;

	right: 0;

}

.product-wrapper:hover .product-action {

	opacity: 1;

	visibility: visible;

}

.product-action a {

	background: #fff;

	height: 50px;

	width: 50px;

	font-size: 20px;

	display: inline-block;

	color: #8688a6;

	text-align: center;

	line-height: 51px;

	border-radius: 50%;

	margin: 0 6px;

	box-shadow: 0px 12px 24px 0px rgba(186, 186, 186, 0.3);

}

.product-wrapper:hover .product-action a{

	margin: 0 7px;

}

.product-action a:last-child{margin-bottom: 0;}

.product-action a:hover{

	background: #fe4536;

	color: #fff;

}

.sale-tag {

	position: absolute;

	top: 30px;

	left: 30px;

	z-index: 99;

}

.sale-tag span {

	background: #84b77c;

	color: #fff;

	text-transform: uppercase;

	font-weight: 500;

	padding: 7px 15px;

	font-size: 12px;

	position: relative;

	padding-left: 19px;

	z-index: 99;

	display: block;

	margin-bottom: 7px;

	letter-spacing: 2px;

}

.sale-tag span.sale {

	background: #fe4536;

}

/* product-content */

.product-content {

	position: relative;
	padding-right: 50px;

}

.pro-cat a {

	font-size: 14px;

	color: #fe4536;

	text-transform: uppercase;

	letter-spacing: 2px;

}

.pro-cat a:hover {

	color: #84b77c;

}

.product-content h4 {

	font-size: 20px;

	margin-bottom: 15px;

}

.product-content h4 a:hover {

	color: #fe4536;

}

.pro-price span {

	font-weight: 500;

	font-size: 14px;

	color: #747691;

	margin-right: 25px;

}

.pro-price span.old-price {

	color: #bcbdce;

	text-decoration: line-through;

}

.product-wishlist {

	position: absolute;

	right: 0;

	top: 20px;

}

.product-wishlist a {

	background: #f3f4ff;

	height: 40px;

	width: 40px;

	display: inline-block;

	text-align: center;

	line-height: 41px;

	border-radius: 50%;

	color: #9798ad;

	font-size: 14px;

}

.product-wishlist a:hover {
	background: #fe4536;
	color: #fff;
}

/* product-nav */

.product-nav{}

.product-nav li {
	margin-left: 20px;
}

.product-nav li:last-child{padding-right: 0;}

.product-nav li:first-child{padding-left: 0;}

.product-nav li a {
	font-size: 14px;
	color: #10111e;
	font-weight: 500;
	padding: 18px 30px;
	border: 2px solid #ecedff;
	text-transform: uppercase;
	line-height: 1;
	letter-spacing: 2px;
}

.product-nav li a.active {

	color: #fff;

	background: #fe4536;

	border-color: #fe4536;

}

.user-header {
	text-align: center;
}
.user-avator {
	border-radius: 50px;
}
.shop-wallet {
	display: flex;
	justify-content: space-between;
	align-items: center;
}
.btn-wallet-earn {
	padding: 10px 20px;
	text-align: center;
	background-color: #1bb71e;
	color: #fff1f0;
}
/* 7. Area title */
.area-title h2 {
	font-size: 40px;
	margin-bottom: 10px;
}

.area-title.white-color h2 {
	color: #fff;
}

.area-title p {
	margin: 0;
}

.area-title .white-color p {
	color: #aaabc3;
}

/* 9. Subscribe   */

.subscribe-inner {
  padding-left: 270px;

  padding-right: 270px;
}

.subscribe-icon {
  margin-right: 24px;

  margin-top: 8px;
}

.subscribe-form {
  position: relative;

  z-index: 99;
}

.subscribe-form form {
  position: relative;
}

.subscribe-form form input {
  width: 100%;

  height: 70px;

  border: 0;

  padding: 0 50px;

  text-transform: uppercase;

  font-weight: 500;

  background: #141626;

  font-size: 12px;

  color: #aaabc3;
}

@media (max-width: 767px) {
  .subscribe-form form input {
    padding: 0 30px;
  }
}

.subscribe-form form button {
  position: absolute;

  top: 0;

  right: 0;

  height: 100%;
}

@media (max-width: 767px) {
  .subscribe-form form button {
    position: static;

    margin-top: 10px;
  }
}

.subscribe-form input::-moz-placeholder {
  color: #aaabc3;
  font-size: 12px;

  letter-spacing: 2px;
}

.subscribe-form input::placeholder {
  color: #aaabc3;
  font-size: 12px;

  letter-spacing: 2px;
}
</style>