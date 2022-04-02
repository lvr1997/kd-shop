<template>
  <!-- header start class="transparent-header" -->
  <header>
    <div id="header-sticky" class="header-area box-90">
      <div class="container-fluid">
        <div class="row align-items-center">
          <div
            class="
              col-xl-2 col-lg-6 col-md-6 col-7 col-sm-3
              d-flex
              align-items-center
            "
          >
            <div class="basic-bar cat-toggle" @click="showCategoryMenu = !showCategoryMenu">
              <span class="bar1"></span>
              <span class="bar2"></span>
              <span class="bar3"></span>
            </div>
            <div class="logo">
              <a href="javascript:void(0)">I have</a>
            </div>
            <div class="category-menu" v-show="showCategoryMenu">
              <h4>闲置分类</h4>
              <ul>
                <li><a href="shop.html"> 学习用品</a></li>
                <li><a href="shop.html"> 床上用品</a></li>
                <li><a href="shop.html"> 电子数码</a></li>
                <li><a href="shop.html"> 服饰衣物</a></li>
                <li><a href="shop.html"> 棋牌休闲</a></li>
                <li><a href="shop.html"> 户外运动</a></li>
              </ul>
            </div>
          </div>
          <div class="col-xl-7 col-lg-6 col-md-8 col-8 d-none d-xl-block">
            <div class="main-menu text-center">
              <nav id="mobile-menu">
                <ul>
                  <li>
                    <router-link to="/home">首页</router-link>
                  </li>
                  <li class="mega-menu">
                    <router-link to="/shop">小铺</router-link>
                  </li>
                  <li>
                    <router-link to="/goods/listing">买闲置 </router-link>
                  </li>
                  <li>
                    <router-link to="/news">新闻</router-link>
                  </li>
                  <li>
                    <router-link to="/about">联系我们</router-link>
                  </li>
                </ul>
              </nav>
            </div>
          </div>
          <div class="col-xl-3 col-lg-6 col-md-6 col-5 col-sm-9 pl-0">
            <div class="header-right f-right">
              <ul>
                <li class="search-btn">
                  <a class="search-btn nav-search search-trigger" href="#"
                    ><SearchOutlined /></a>
                </li>
                <li class="login-btn">
                  <router-link to="/login"><UserOutlined /></router-link>
                </li>
                <li class="d-shop-cart">
                  <a href="wishlist"
                    ><HeartOutlined />
                    <span class="cart-count">3</span></a
                  >
                </li>
              </ul>
            </div>
          </div>
          <div class="col-12 d-xl-none">
            <div class="mobile-menu"></div>
          </div>
        </div>
      </div>
    </div>
  </header>
  <!-- header end -->
</template>

<script>
import { HeartOutlined, SearchOutlined, UserOutlined } from '@ant-design/icons-vue';
export default {
  data(){
    return { 
      showCategoryMenu: false
    }
  },
  components: {
    HeartOutlined, SearchOutlined, UserOutlined
  }
}
</script>

<style scoped>
/* 2. Header */
.basic-bar {
  height: 60px;

  width: 60px;

  background: #fe4536;

  border-radius: 50%;

  margin-right: 50px;

  padding: 14px 0;

  cursor: pointer;
}

.basic-bar span {
  height: 2px;

  width: 15px;

  display: block;

  background: #fff;

  margin: auto;

  margin-top: 6px;

  margin-bottom: 6px;

  transition: 0.3s;
}

.basic-bar:hover span {
  width: 30px;
}

.basic-bar span.bar1 {
}

.basic-bar span.bar2 {
  width: 30px;
}

.basic-bar span.bar3 {
}

.transparent-header {
  position: absolute;

  top: 0;

  left: 0;

  right: 0;

  z-index: 9;
}

.header-info span {
  position: relative;

  margin-right: 29px;

  font-size: 14px;

  color: #666;
}

.header-info span::before {
  background: #ddd;

  content: "";

  height: 21px;

  position: absolute;

  right: -18px;

  top: 0px;

  width: 1px;
}

.header-info span:last-child:before {
  display: none;
}

.header-right-member {
}

.header-right-member ul {
}

.header-right-member ul li {
  display: inline-block;

  margin-left: 25px;

  position: relative;

  padding: 12px 0px;
}

.header-right-member ul li a {
  font-size: 14px;

  color: #666;
}

.header-right-member ul li:hover > a {
  color: #fe4536;
}

.header-right-member ul li ul {
  position: absolute;

  top: 100%;

  left: 0;

  background: #444;

  width: 110px;

  text-align: left;

  padding: 10px;

  transition: 0.3s;

  visibility: hidden;

  opacity: 0;

  z-index: 9;
}

.header-right-member ul li:hover ul {
  visibility: visible;
  opacity: 1;
}

.header-right-member ul li ul li {
  margin: 0;

  display: block;

  padding: 3px 0;
}

.header-right-member ul li ul li a {
  color: #fff;

  font-size: 12px;
}

/* main-menu */

.main-menu ul li {
  display: inline-block;

  margin: 0 25px;

  line-height: 1;

  position: relative;
}

.main-menu ul li a {
  color: #10111e;

  font-size: 14px;

  line-height: 1;

  font-weight: 500;

  padding: 60px 0;

  display: inline-block;

  text-transform: uppercase;
}

.main-menu ul li:hover > a {
  color: #fe4536;
}

.main-menu ul li ul.submenu {
  position: absolute;

  top: 100%;

  left: 0;

  background: #fff;

  width: 250px;

  transition: 0.3s;

  opacity: 0;

  visibility: hidden;

  z-index: 9;

  text-align: left;

  box-shadow: 0px 12px 24px 0px rgba(254, 69, 54, 0.3);
}

.main-menu ul li ul.submenu li {
  margin: 0;

  display: block;

  border-bottom: 1px solid #b0c6c64d;
}

.main-menu ul li ul.submenu li:last-child {
  border: 0;
}

.main-menu ul li ul.submenu li a {
  padding: 16px 20px;

  color: #10111e;

  font-size: 12px;

  display: block;
}

.main-menu ul li ul.submenu li:hover > a {
  color: #fe4536;
}

.main-menu ul li:hover > ul.submenu {
  opacity: 1;
  visibility: visible;
}

.main-menu ul li ul.submenu li ul.submenu {
  left: 100%;

  top: 0;

  opacity: 0;

  visibility: hidden;
}

.main-menu ul li ul.submenu li:hover > ul.submenu {
  opacity: 1;

  visibility: visible;
}

.main-menu.menu-white ul li:last-child {
  margin: 0;
}

/* mega-menu */

.main-menu ul li.mega-menu > ul.submenu {
  min-width: 800px;

  opacity: 0;

  visibility: hidden;

  padding: 35px;

  z-index: 0;
}

.main-menu ul li.mega-menu:hover ul.submenu {
  visibility: visible;

  opacity: 1;

  z-index: 11;
}

.main-menu ul li.mega-menu ul.submenu li ul.submenu {
  position: static;

  display: block;

  border: none;

  margin-top: 20px;

  opacity: 0;

  visibility: hidden;

  width: auto;

  box-shadow: none;
}

.main-menu ul li.mega-menu:hover ul.submenu li ul.submenu {
  visibility: visible;

  opacity: 1;

  z-index: 11;
}

.main-menu ul li.mega-menu ul.submenu li ul.submenu li a {
  font-size: 13px;

  text-transform: capitalize;

  font-weight: 400;

  padding: 13px 0;
}

.main-menu ul li.mega-menu ul.submenu li ul.submenu li:last-child a {
  padding-bottom: 0;
}

.main-menu ul li.mega-menu ul.submenu li ul.submenu li:last-child {
  border-bottom: 0;
}

.main-menu ul li.mega-menu ul.submenu > li {
  border: 0;
}

.main-menu ul li.mega-menu > ul.submenu > li {
  width: 33.3333%;

  min-width: 33.3333%;

  display: block;

  float: left;

  padding-right: 30px;
}

.main-menu ul li.mega-menu > ul.submenu > li:last-child {
  padding-right: 0px;
}

.main-menu ul li.mega-menu > ul.submenu ul.submenu {
  margin-top: 20px;
}

.main-menu ul li.mega-menu > ul.submenu li a {
  display: block;

  padding-left: 0;
}

.main-menu ul li.mega-menu > ul.submenu > li > a {
  font-size: 12px;

  line-height: inherit;

  font-weight: 600;

  color: #10111e;

  padding: 0;

  text-transform: uppercase;
}

#header-sticky {
  transition: 0.3s;
}

.logo {
  transition: 0.3s;
}

.header-right {
  transition: 0.3s;
}

.sticky-header {
  animation: 300ms ease-in-out 0s normal none 1 running fadeInDown;

  background: #fff;

  box-shadow: 0 0 15px rgba(0, 0, 0, 0.1);

  left: 0;

  margin: 0 auto;

  position: fixed;

  right: 0;

  top: 0;

  width: 100%;

  z-index: 99;
}

@keyframes fadeInDown {
  from {
    opacity: 0;

    transform: translate3d(0, -100%, 0);
  }

  to {
    opacity: 1;

    transform: none;
  }
}

.sticky-header .main-menu ul li a {
  padding: 35px 0;
}

/* header-right */

.header-right {
  position: relative;

  padding-left: 10px;

  margin-left: 10px;
}

.header-right ul li {
  display: inline-block;

  margin-left: 10px;

  line-height: 1;

  position: relative;
}

.header-right > ul > li > a {
  font-size: 16px;

  position: relative;

  height: 50px;

  width: 50px;

  background: #fff1f0;

  display: inline-block;

  line-height: 50px;

  text-align: center;

  border-radius: 50%;

  color: #fe5245;
}

.header-right ul li a:hover {
  background: #fe5245;

  color: #fff;
}

.cart-count {
  position: absolute;

  background: #fe4536;

  color: #fff;

  height: 20px;

  width: 20px;

  font-size: 10px;

  text-align: center;

  font-weight: 500;

  border-radius: 50%;

  line-height: 22px;

  left: 32px;

  top: -8px;
}

/* minicart */

.header-right ul.minicart {
  background: #fff;

  opacity: 0;

  padding: 25px;

  position: absolute;

  right: 0;

  top: 100%;

  transition: all 0.3s ease 0s;

  width: 350px;

  z-index: 9;

  box-shadow: 0px 12px 24px 0px rgba(254, 69, 54, 0.3);

  visibility: hidden;
}

.header-right li:hover ul.minicart {
  opacity: 1;
  visibility: visible;
  z-index: 99;
}

.header-right ul li .minicart .cart-img {
  float: left;
}

.header-right ul li .minicart .cart-content {
  float: left;

  padding-left: 15px;

  text-align: left;
}

.cart-content h3 {
  color: #ddd;
}

ul.minicart .cart-content a {
  color: #10111e;

  font-size: 14px;

  background: none;
}

ul.minicart .cart-content a:hover {
  color: #fe4536;

  background: none;
}

ul.minicart .cart-img img {
  width: 85px;
}

ul.minicart .cart-price span {
  color: #ddd;

  font-size: 13px;
}

ul.minicart .cart-price .new {
  font-size: 14px;

  color: #747691;
}

ul.minicart .cart-price span {
  color: #a5a7bc;

  font-size: 13px;

  font-weight: 500;
}

.header-right ul li .minicart > li {
  display: block;

  margin-bottom: 22px;

  margin-left: 0;

  overflow: hidden;

  padding: 0;
}

.header-right ul li .minicart > li:last-child {
  margin-bottom: 0;
}

.header-right ul li .minicart .del-icon > a {
  color: #fe4536;
}

.header-right ul li .minicart .del-icon > a:hover {
  color: #a5a7bc;

  background: none;
}

.header-right ul li .minicart .del-icon {
  float: right;

  margin-top: 30px;
}

.total-price span {
  color: #747691;

  font-weight: 500;
}

.total-price {
  border-top: 1px solid #cacadb;

  overflow: hidden;

  padding-top: 25px;

  margin-top: 10px;
}

.header-right ul li .minicart .checkout-link a {
  background: #84b77c;

  color: #fff;

  display: block;

  font-weight: 500;

  padding: 16px 30px;

  text-align: center;

  font-size: 13px;

  margin-bottom: 8px;

  text-transform: uppercase;

  letter-spacing: 2px;
}

.header-right ul li .minicart .checkout-link a:last-child {
  margin: 0;
}

.header-right ul li .minicart .checkout-link a:hover,
.header-right ul li .minicart .checkout-link a.red-color {
  background: #fe4536;
}

.header-right ul li .minicart .checkout-link a.red-color:hover {
  background: #84b77c;
}

.header-sep {
  line-height: 1;

  height: 2px;
}

/* menu white */

.menu-white ul li a {
  color: #fff;
}

.menu-white {
}

/* header 3 */

/* extra info */

.extra-info {
  background: #152136;

  height: 100%;

  position: fixed;

  left: 0;

  top: 0;

  transition: all 0.7s ease 0s;

  width: 340px;

  z-index: 9999;

  transform: translateX(-100%);

  padding-bottom: 40px;
}

.extra-info.info-open {
  transform: translateX(0);
}

.extra-info.extra-info-left.info-open {
  transform: translateX(0);
}

.close-icon {
  margin-top: 0;

  text-align: right;

  position: absolute;

  right: 15px;

  top: 12px;

  line-height: 1;
}

.close-icon > button {
  background: rgba(0, 0, 0, 0) none repeat scroll 0 0;

  border: 0 none;

  color: #ff4a57;

  cursor: pointer;

  font-size: 20px;

  padding: 0;
}

.logo-side {
  padding: 30px 30px;

  border-bottom: 1px solid #344159;

  margin-bottom: 24px;
}

.side-info-bottom {
  padding: 0 30px;

  border-top: 1px solid #344159;

  padding-top: 30px;
}

.side-cta p {
  color: #aaabc3;
}

.side-cta h4 {
  color: #ffffff;
}

.social-icon-right a {
  color: #ffffff;

  margin-right: 15px;
}

.social-icon-right a:hover {
  color: #fe4536;
}

.side-menu ul li {
  display: block;

  margin: 0px;

  padding: 0 30px;
}

.side-menu ul li a {
  color: #fff;

  padding: 20px 0;

  display: block;
}

.side-menu ul li a i {
  float: right;
}

.side-menu ul li ul.submenu {
  top: 0;

  left: 100%;
}

.side-menu ul li ul.submenu li {
  text-align: left;

  padding: 0 0;
}

/* category-menu */

.category-menu {
  position: absolute;
  top: 150px;
  z-index: 999;
  background: #fff;
  width: 250px;
  padding: 0 30px;
  left: 15px;
  /* display: none; */
  box-shadow: 0px 12px 24px 0px rgba(254, 69, 54, 0.3);
}

.category-menu h4 {
  margin-bottom: 20px;

  padding-top: 25px;
}

.category-menu ul {
  margin-bottom: 30px;

  border-left: 3px solid #fff1f0;

  padding-left: 20px;

  margin-bottom: 30px;
}

.category-menu ul li {
}

.category-menu ul li:last-child {
  margin-bottom: 0px;
}

.category-menu ul li a {
  display: block;

  color: #747691;

  position: relative;

  padding: 10px 0;
}

.category-menu ul li a::before {
  position: absolute;

  height: 0;

  width: 4px;

  background: #fe4536;

  left: -24px;

  top: auto;

  bottom: 0;

  content: "";

  transition: 0.3s;
}

.category-menu ul li a:hover:before {
  height: 100%;

  top: 0;

  bottom: auto;
}

.category-menu ul li a:hover {
  color: #fe4536;
}

.category-menu ul li a i {
  color: #fe4536;

  width: 21px;

  display: inline-block;
}
</style>
