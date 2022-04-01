<template>
   <main>
        <Breadcrumb :title="title" :nav="nav"></Breadcrumb>

        <!-- shop-area start -->
        <section class="shop-area pt-100 pb-100">
            <div class="container">
                <div class="row">
                    <div class="col-xl-8 col-lg-8">
                        <!-- tab filter -->
                        <div class="row mb-10">
                            <div class="col-xl-5 col-lg-6 col-md-6">
                                <div class="product-showing mb-40">
                                    <p>总共为您找到 32 条记录</p>
                                </div>
                            </div>
                            <div class="col-xl-7 col-lg-6 col-md-6">
                                <div class="shop-tab f-right">
                                    <ul class="nav text-center">
                                        <li class="nav-item">
                                            <a class="nav-link" :class="showGoodsOrOrders?'active':''" title="我发布的闲置" @click="showGoodsOrOrders = !showGoodsOrOrders"><ShopOutlined /></a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-link" :class="!showGoodsOrOrders?'active':''" title="我的订单" @click="showGoodsOrOrders = !showGoodsOrOrders"><RedEnvelopeOutlined /></a>
                                        </li>
                                    </ul>
                                </div>
<!--                                <div class="pro-filter mb-40 f-right">-->
<!--                                    <form action="#">-->
<!--                                        <select name="pro-filter" id="pro-filter">-->
<!--                                            <option value="1">Shop By </option>-->
<!--                                            <option value="2">Top Sales </option>-->
<!--                                            <option value="3">New Product </option>-->
<!--                                            <option value="4">A to Z Product </option>-->
<!--                                        </select>-->
<!--                                    </form>-->
<!--                                </div>-->
                            </div>
                        </div>
                        <!-- tab content -->
                        <div class="tab-content">
                            <div class="tab-pane fade show active">
                                <!-- 我发布的商品-->
                                <div class="tab-pane-mygoods" v-if="showGoodsOrOrders">
                                    <GoodInfo></GoodInfo>
                                    <GoodInfo></GoodInfo>
                                    <GoodInfo></GoodInfo>
                                    <GoodInfo></GoodInfo>
                                    <GoodInfo></GoodInfo>
                                    <GoodInfo></GoodInfo>
                                </div>
                                <!-- 我的订单 -->
                                <OrderItem v-else></OrderItem>
                            </div>
                        </div>
                        <!-- <div class="basic-pagination basic-pagination-2 text-center mt-20">
                            <ul>
                                <li><a href="#"><i class="fas fa-angle-double-left"></i></a></li>
                                <li><a href="#">01</a></li>
                                <li class="active"><a href="#">02</a></li>
                                <li><a href="#">03</a></li>
                                <li><a href="#"><i class="fas fa-ellipsis-h"></i></a></li>
                                <li><a href="#"><i class="fas fa-angle-double-right"></i></a></li>
                            </ul>
                        </div> -->
                    </div>
                    <div class="col-xl-4 col-lg-4">
                        <div class="sidebar-box">

                            <div class="shop-widget user-header">
                                <img class="user-avator" src="@/static/picture/author.png" alt="">
                            </div>

                            <div class="shop-widget">
                                <h3 class="shop-title">我的钱包</h3>
                                <div class="shop-wallet">
                                    <span>0.00</span>
                                    <button class="btn btn-primary btn-wallet-earn">充值</button>
                                </div>
                            </div>


                            <div class="shop-widget">
                                <h3 class="shop-title">收支情况</h3>
                                <div class="price-filter">
                                    
                                </div>
                            </div>

                            <!-- 我发布过的分类 -->
                            <div class="shop-widget">
                                <h3 class="shop-title">我发布的分类</h3>
                                <ul class="shop-tag">
                                    <li><a href="shop.html"> Minimal</a></li>
                                    <li><a href="shop.html"> T-Shirts</a></li>
                                    <li><a href="shop.html"> Pants</a></li>
                                    <li><a href="shop.html"> Jeants</a></li>
                                    <li><a href="shop.html"> Winter</a></li>
                                    <li><a href="shop.html"> Latest</a></li>
                                    <li><a href="shop.html"> New</a></li>
                                    <li><a href="shop.html"> Sale</a></li>
                                </ul>
                            </div>

                            <!-- 我收到的留言 -->
                            <div class="shop-widget">
                                <h3 class="shop-title">我收到的留言</h3>
                                <ul class="shop-sidebar-product">
                                    <li>
                                        <div class="side-pro-img">
                                            <a href="product-details.html"><img src="@/static/picture/shop-rsp1.jpg" alt=""></a>
                                        </div>
                                        <div class="side-pro-content">
                                            <h5><a href="product-details.html">用户A</a></h5>
                                            <div class="side-pro-price">
                                                <span>挺好的</span>
                                            </div>
                                        </div>
                                    </li>
                                    <li>
                                        <div class="side-pro-img">
                                            <a href="product-details.html"><img src="@/static/picture/shop-rsp1.jpg" alt=""></a>
                                        </div>
                                        <div class="side-pro-content">
                                            <h5><a href="product-details.html">用户A</a></h5>
                                            <div class="side-pro-price">
                                                <span>挺好的</span>
                                            </div>
                                        </div>
                                    </li>
                                    <li>
                                        <div class="side-pro-img">
                                            <a href="product-details.html"><img src="@/static/picture/shop-rsp1.jpg" alt=""></a>
                                        </div>
                                        <div class="side-pro-content">
                                            <h5><a href="product-details.html">用户A</a></h5>
                                            <div class="side-pro-price">
                                                <span>挺好的</span>
                                            </div>
                                        </div>
                                    </li>
                                    <li>
                                        <div class="side-pro-img">
                                            <a href="product-details.html"><img src="@/static/picture/shop-rsp1.jpg" alt=""></a>
                                        </div>
                                        <div class="side-pro-content">
                                            <h5><a href="product-details.html">用户A</a></h5>
                                            <div class="side-pro-price">
                                                <span>挺好的</span>
                                            </div>
                                        </div>
                                    </li>
                                </ul>
                            </div>

                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- shop-area end -->


        </main>

</template>

<script>
import Breadcrumb from '@/components/Breadcrumb.vue'
import GoodInfo from "@/components/GoodInfo";
import OrderItem from './components/orderItem.vue'

import { ShopOutlined, RedEnvelopeOutlined } from '@ant-design/icons-vue'

export default {
  data() {
    return {
      title: '我的',
      nav: ["Home", "Mine"],
      showGoodsOrOrders: true,
    }
    
  },
  components: {
    Breadcrumb,
    GoodInfo,
    OrderItem,
    ShopOutlined,
    RedEnvelopeOutlined
  }
}
</script>

<style lang="less" scoped>
/* 13. Shop */

.tab-pane-mygoods {
    display: flex;
    flex-wrap: wrap;
    justify-content: space-around;
    .product-wrapper {
        width: 48%;
    }
}

.product-showing p {

	margin: 0;

	border: 2px solid #f2f2f2;

	padding: 17px 30px;

	text-align: center;

	line-height: 1;

	display: inline-block;

	text-transform: uppercase;

	font-size: 12px;

	letter-spacing: 2px;

	font-weight: 500;

	color: #747691;

}

@media (max-width: 767px) {

	.product-showing p {

		padding: 17px 15px;

	}

}

.shop-tag li {

	display: inline-block;

	margin-right: 5px;

	margin-bottom: 6px;

}

.shop-tag li a {

	border: 1px solid #e7e7e7;

	padding: 5px 15px;

	display: inline-block;

	color: #747691;

	font-size: 14px;

}

.shop-tag li a:hover{

	background: #FE4536;

	color: #fff;

	border-color: #FE4536;

}

.pro-filter {
	position: relative;
	display: inline-block;
}

@media (max-width: 767px) {
	.pro-filter {
		float: left;
	}
}

.pro-filter select {

	border: 2px solid #f2f2f2;

	padding: 17px 30px;

	display: inline-block;

	text-transform: uppercase;

	font-size: 12px;

	letter-spacing: 2px;

	line-height: 1;

	color: #6f7172;

	appearance: none;

	-moz-appearance: none;

	width: 145px;

	font-weight: 500;

}

.pro-filter::before {

	content: "\f107";

	right: 15px;

	top: 15px;

	position: absolute;

	color: #758799;

	font-family: "Font Awesome 5 Free";

	font-weight: 700;

}

.shop-tab ul li {

	margin-left: 20px;

}

@media (max-width: 767px) {

	.shop-tab ul li {

		margin-left: 10px;

	}

}

.shop-tab ul li a {

	font-size: 16px;

	font-weight: 500;

	color: #fe4536;

	letter-spacing: 2px;

	padding: 0;

	text-transform: uppercase;

	position: relative;

	height: 50px;

	width: 50px;

	border-radius: 50%;

	background: #fff1f0;

	line-height: 50px;

	text-align: center;

}

.shop-tab ul li a.active {

	color: white;

	background: #fe4536;

	box-shadow: 0px 8px 16px 0px rgba(254, 69, 54, 0.3);

}



.pro-list-content .product-action {

	position: static;

	opacity: 1;

	visibility: visible;

}

.pro-list-content .product-action a {

	background: #84b77c;

	color: #fff;

	border-color: #84b77c;

}

.pro-list-content .product-action a:hover {

	background: #fe4536;

	color: #fff;

	border-color: #fe4536;

}

.pro-list-content p {

	margin-bottom: 22px;

}

.pro-list-content{}

.pro-list-content{}

/* shop widget */

.sidebar-box {

	padding: 35px 40px;

	border: 4px solid #f9f9f9;

}

.shop-widget {

	padding-bottom: 40px;

	margin-bottom: 40px;

	border-bottom: 2px dashed #ede8ff;

}

.shop-widget:last-child {

	padding-bottom: 0px;

	margin-bottom: 0px;

	border-bottom: 0;

}

.shop-title {

	font-size: 20px;

	text-transform: uppercase;

	margin-bottom: 30px;

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

.side-pro-img {

	float: left;

}

.side-pro-img img {

	margin-right: 14px;

}

.side-pro-rating {

	margin-bottom: 5px;

}

.side-pro-rating i {

	color: #FFBA00;

	font-size: 12px;

}

.side-pro-content h5 {

	font-size: 14px;

	margin-bottom: 7px;

}

.side-pro-content h5 a:hover {

	color: #FE4536;

}

.side-pro-price span {

	font-weight: 500;

	font-size: 13px;

	color: #747691;

}

.side-pro-content {

	overflow: hidden;

}

.shop-sidebar-product li{

	overflow: hidden;

	margin-bottom: 20px;

}

.shop-sidebar-product li:last-child{

	margin-bottom: 0px;

}


</style>