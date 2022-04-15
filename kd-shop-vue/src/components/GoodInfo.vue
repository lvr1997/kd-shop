<template>
  <div class="product-wrapper mb-50">
    <div class="product-img mb-25">
      <a href="product-details.html">
        <img src="@/static/picture/pro1.jpg" alt="" />
      </a>
      <div class="product-action text-center">
        <a href="#" title="查看大图">
          <EyeOutlined />
        </a>
        <a href="#" title="交易方式：线下交易">
          <TransactionOutlined />
        </a>
        <a href="#" title="3人想要">
          <HeartOutlined />
        </a>
      </div>
      <div class="sale-tag">
        <span class="new">new</span>
        <span class="sale">已售</span>
      </div>
    </div>
    <div class="product-content">
      <div class="pro-cat mb-10">
        <a href="shop.html">分类名称, </a>
        <!--<a href="shop.html">家具</a>-->
      </div>
      <h4><!-- query:{goodId:goodInfo.id} -->
        <router-link :to="{path: '/goods/detail'}">闲置名称</router-link>
      </h4>
      <div class="product-meta">
        <div class="pro-price">
          <span>售价</span>
          <span class="old-price">原价</span>
        </div>
      </div>
      <div class="product-wishlist">
        <a href="#"><HeartOutlined /></a>
      </div>
    </div>
  </div>
</template>

<script>
import { HeartOutlined,EyeOutlined,TransactionOutlined } from '@ant-design/icons-vue';
export default {
	props: ['goodInfo'],
	components: {
		HeartOutlined,
		EyeOutlined,
		TransactionOutlined
	}
};
</script>

<style scoped>
/* 6. Product */
.box-90{
	padding-left: 90px;
	padding-right: 90px;
}

.box-105{
	padding-left: 105px;
	padding-right: 105px;
}

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

img.secondary-img {
	position: absolute;
	left: 0;
	top: 0;
	transition: .3s;
	opacity: 0;
}

/*.product-wrapper:hover img.secondary-img{opacity: 1;z-index: 1;}*/

/* roduct-action */

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

.product-slider.owl-carousel .owl-nav div,.product-slider-2.owl-carousel .owl-nav div {
	position: absolute;
	top: 50%;
	left: -70px;
	transform: translateY(-50%);
	background: none;
	border: 0;
	font-size: 13px;
	padding: 0;
	color: #10111e;
	z-index: 2;
	opacity: 1;
	visibility: visible;
	height: 100px;
	width: 30px;
	border-radius: 0;
	cursor: pointer;
	background: #fff1f0;
	line-height: 100px;
}

.product-slider.owl-carousel .owl-nav div.owl-next,.product-slider-2.owl-carousel .owl-nav div.owl-next{left: auto;right:-70px;}

.product-slider:hover .owl-nav div,.product-slider-2:hover .owl-nav div{
    opacity: 1;
    visibility: visible;
}

.product-slider .owl-nav div:hover,.product-slider-2 .owl-nav div:hover{
    background: #fe4536;
	color: #fff;
	box-shadow: 0px 6px 12px 0px rgba(254, 69, 54, 0.4);
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

/* top seller */
.top-seller {
	position: relative;
}

.top-seller-content {
	background: #fff;
	display: inline-block;
	padding: 45px;
	margin-top: -80px;
	padding-bottom: 0;
}

.top-seller-content h2 {
	font-size: 40px;
	margin-bottom: 15px;
}

.top-seller-content h2 a:hover  {
	color: #fe4536;
}

.sellet-2-content {
	display: inline-block;
	width: 450px;
	position: absolute;
	left: 0;
	background: #fff;
	padding: 45px;
	text-align: left;
	top: 35px;
}

.sellet-2-content h2 {
	font-size: 80px;
}

.sellet-2-content h2 a:hover {
	color: #fe4536;
}

.shop-btn {
	background: #fe4536;
	height: 60px;
	width: 60px;
	font-size: 22px;
	display: inline-block;
	color: #fff;
	text-align: center;
	line-height: 56px;
	border-radius: 50%;
	margin: 0 7px;
	box-shadow: 0px 12px 24px 0px rgba(186, 186, 186, 0.3);
}

.shop-btn:hover{background: #84b77c;color: #fff}

.top-seller-btn a {
	display: inline-block;
	margin-right: 20px;
}

</style>
