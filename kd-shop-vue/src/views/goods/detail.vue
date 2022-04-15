<template>
  <main>
    <!-- breadcrumb-area-start -->
    <Breadcrumb :title="title" :nav="nav"></Breadcrumb>
    <!-- breadcrumb-area-end -->

    <!-- shop-area start -->
    <section class="shop-details-area pt-100 pb-100">
      <div class="container">
        <div class="row">
          <div class="col-xl-6 col-lg-4">
            <div class="product-details-img mb-10">
              <div class="tab-content" id="myTabContentpro">
                <div
                  class="tab-pane fade show active"
                  id="home"
                  role="tabpanel"
                >
                  <div class="product-large-img">
                    <img
                      src="@/static/picture/pro2.jpg"
                      
                      alt=""
                    />
                  </div>
                </div>
                <div class="tab-pane fade" id="profile" role="tabpanel">
                  <div class="product-large-img">
                    <img
                      src="@/static/picture/pro2.jpg"
                      
                      alt=""
                    />
                  </div>
                </div>
                <div class="tab-pane fade" id="profile1" role="tabpanel">
                  <div class="product-large-img">
                    <img
                      src="@/static/picture/pro3.jpg"
                     
                      alt=""
                    />
                  </div>
                </div>
              </div>
            </div>
            <div class="shop-thumb-tab mb-30">
              <ul class="nav" id="myTab2" role="tablist">
                <li class="nav-item">
                  <a
                    class="nav-link active"
                    id="home-tab"
                    data-toggle="tab"
                    href="#home"
                    role="tab"
                    aria-selected="true"
                    ><img
                      src="@/static/picture/pro1.jpg"
                      alt=""
                    />
                  </a>
                </li>
                <li class="nav-item">
                  <a
                    class="nav-link"
                    id="profile-tab"
                    data-toggle="tab"
                    href="#profile"
                    role="tab"
                    aria-selected="false"
                    ><img
                      src="@/static/picture/pro2.jpg"
                      th:src="@{/picture/pro2.jpg}"
                      alt=""
                  /></a>
                </li>
                <li class="nav-item">
                  <a
                    class="nav-link"
                    id="profile-tab2"
                    data-toggle="tab"
                    href="#profile1"
                    role="tab"
                    aria-selected="false"
                    ><img
                      src="@/static/picture/pro3.jpg"
                      alt=""
                  /></a>
                </li>
              </ul>
            </div>
          </div>
          <div class="col-xl-6 col-lg-8">
            <div class="product-details mb-30 pl-30">
              <div class="details-cat mb-20">
                <a href="#">decor,</a>
                <a href="#">furniture</a>
              </div>
              <h2 class="pro-details-title mb-15">
                Limonda Women Winter Cloth
              </h2>
              <div class="details-price mb-20">
                <span>$119.00</span>
                <span class="old-price">$246.00</span>
              </div>
              <div class="product-variant">
                <div class="product-desc variant-item">
                  <p>
                    Lorem ipsum dolor sit amet, consectetur adipisicing elit,
                    sed do eiusmod tempor incididunt ut labore et dolore magna
                    aliqua. Ut enim ad minim veniam, quis nostrud exercitation
                    ullamco laboris nisi ut aliquip.
                  </p>
                </div>

                <div class="product-info-list variant-item">
                  <ul>
                    <li><span>Brands:</span> Hewlett-Packard</li>
                    <li><span>Product Code:</span> d12</li>
                    <li><span>Reward Points:</span> 100</li>
                    <li>
                      <span>Stock:</span> <span class="in-stock">In Stock</span>
                    </li>
                  </ul>
                </div>

                <div class="product-action-details variant-item">
                  <div class="product-details-action">
                      
                      <div class="plus-minus">
                        <button class="btn theme-btn">买！</button>
                      </div>
                      <button class="details-action-icon" type="submit">
                        <HeartOutlined />
                      </button>
                      <button class="details-action-icon" type="submit">
                        <MessageOutlined />
                      </button>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
        <div class="row mt-50">
          <div class="col-xl-8 col-lg-8">
            <div class="product-review">
              <ul class="nav review-tab" role="tablist">
                <li class="nav-item">
                  <a class="nav-link" :class="tabAction?'active':''" @click="handleTab">闲置描述</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" :class="!tabAction?'active':''" @click="handleTab">评论 (2)</a>
                </li>
              </ul>
              <div class="tab-content">
                <div class="tab-pane fade" :class="tabAction?'show active':''">
                  <div class="desc-text">
                    <p>
                      Lorem ipsum dolor sit amet, consectetur adipisicing elit,
                      sed do eiusmod tempor incididunt ut labore et dolore magna
                      aliqua. Ut enim ad minim veniam, quis nostrud exercitation
                      ullamco laboris nisi ut aliquip ex ea commodo consequat.
                      Duis aute irure dolor in reprehenderit in voluptate velit
                      esse cillum dolore eu fugiat nulla pariatur. Excepteur
                      sint occaecat cupidatat non proident, sunt in culpa qui
                      officia deserunt mollit anim id est laborum. Sed ut
                      perspiciatis unde omnis iste natus error sit voluptatem
                      accusantium doloremque laudantium, totam rem aperiam,
                      eaque ipsa quae ab illo inventore veritatis et quasi
                      architecto beatae vitae dicta sunt explicabo.
                    </p>
                    <p>
                      Nemo enim ipsam voluptatem quia voluptas sit aspernatur
                      aut odit aut fugit, sed quia consequuntur magni dolores
                      eos qui ratione voluptatem sequi nesciunt. Neque porro
                      quisquam est, qui dolorem ipsum quia dolor sit amet,
                      consectetur, adipisci velit, sed quia non numquam eius
                      modi tempora incidunt ut labore et dolore magnam aliquam
                      quaerat voluptatem.
                    </p>
                  </div>
                </div>
                <div class="tab-pane fade" :class="!tabAction?'show active':''">
                  <div class="desc-text review-text">
                    <div class="product-commnets">
                      <div class="product-commnets-list mb-25 pb-15">
                        <div class="pro-comments-img">
                          <img
                            src="../../static/picture/01.png"
                            alt=""
                          />
                        </div>
                        <div class="pro-commnets-text">
                          <h4>
                            Roger West -
                            <span>2018-07-05</span>
                          </h4>
                          <div class="pro-rating">
                            <a-rate :value="5" disabled/>
                          </div>
                          <p>
                            Lorem ipsum dolor sit amet, consectetur adipisicing
                            elit, sed do eiusmod tempor incididunt ut labore et
                            dolore magna aliqua. Ut enim ad minim veniam, quis
                            nostrud exercitation.
                          </p>
                        </div>
                      </div>
                      <div class="product-commnets-list mb-25 pb-15">
                        <div class="pro-comments-img">
                          <img
                            src="../../static/picture/02.png"
                           
                            alt=""
                          />
                        </div>
                        <div class="pro-commnets-text">
                          <h4>
                            Roger West -
                            <span>June 5, 2018</span>
                          </h4>
                          <div class="pro-rating">
                            <a-rate :value="5" disabled/>
                          </div>
                          <p>
                            Lorem ipsum dolor sit amet, consectetur adipisicing
                            elit, sed do eiusmod tempor incididunt ut labore et
                            dolore magna aliqua. Ut enim ad minim veniam, quis
                            nostrud exercitation.
                          </p>
                        </div>
                      </div>
                    </div>
                    <div class="review-box mt-50">
                      <h4>留下你的足迹</h4>
                      <div class="your-rating mb-40">
                        <span>觉得该物品怎么样？ </span>
                        <div class="rating-list">
                          <a-rate v-model:value="rating"/>
                        </div>
                      </div>
                      <form class="review-form" action="#">
                        <div class="row">
                          <div class="col-xl-12">
                            <label for="message">你的评论</label>
                            <textarea
                              name="message"
                              id="message"
                              cols="30"
                              rows="10"
                            ></textarea>
                          </div>
                          <div class="col-xl-12">
                            <button class="btn theme-btn">
                              提交！
                            </button>
                          </div>
                        </div>
                      </form>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
          <div class="col-xl-4 col-lg-4">
            <div class="pro-details-banner">
              <a href="shop.html"
                ><img
                  src="../../static/picture/pro-details.jpg"
                  alt=""
              /></a>
            </div>
          </div>
        </div>
      </div>
    </section>
    <!-- shop-area end -->

    <!-- product-area start -->
    <section class="product-area pb-100">
      <div class="container">
        <div class="row">
          <div class="col-xl-12">
            <div class="area-title text-center mb-50">
              <h2>为您推荐</h2>
              <p>你可能还对以下几个商品感兴趣？</p>
            </div>
          </div>
        </div>
        <div class="product-slider-2">
          <div class="pro-item">
            <GoodInfo></GoodInfo>
          </div>
          <div class="pro-item">
            <GoodInfo></GoodInfo>
          </div>
          <div class="pro-item">
            <GoodInfo></GoodInfo>
          </div>
          <div class="pro-item">
            <GoodInfo></GoodInfo>
          </div>
        </div>
      </div>
    </section>
    <!-- product-area end -->
  </main>
</template>

<script>
import Breadcrumb from "@/components/Breadcrumb.vue";
import GoodInfo from "@/components/GoodInfo";
import { HeartOutlined, MessageOutlined } from '@ant-design/icons-vue'
export default {
  name: "Detail",
  components: {
	Breadcrumb,
	GoodInfo,
  HeartOutlined, MessageOutlined
  },
  data() {
    return {
      title: "详情",
      nav: ["Home","Goods", "Detail"],
      tabAction: true,
      rating: 3
    };
  },
  created() {},
  methods: {
    handleTab() {
      this.tabAction = !this.tabAction
    }
  },
};
</script>
<style lang="less" scoped>
/* 14. Shop Details */

.shop-tab ul li {

     margin-left: 20px;

}

.shop-tab ul li a {

     font-size: 16px;

     font-weight: 500;

     color: #6f7172;

     letter-spacing: 2px;

     padding: 0;

     text-transform: uppercase;

     position: relative;

     height: 50px;

     width: 50px;

     border-radius: 50%;

     background: #f6f6ff;

     line-height: 50px;

     text-align: center;

}

.product-large-img img {

	width: 100%;

}

.shop-thumb-tab ul {

	margin: 0 -5px;

}

.shop-thumb-tab ul li {

	margin-bottom: 20px;

	display: inline-block;

	width: 33.33%;

	padding: 0 5px;

}

 .shop-thumb-tab ul li a {

     padding: 0;

}

.product-details-img {

	margin-left: 0;

	overflow: hidden;

}



/* details info */

.details-cat a {

	font-size: 14px;

	text-transform: uppercase;

	font-weight: 500;

	letter-spacing: 2px;

	color: #747691;

}

.details-cat a:hover{

	color: #fe4536;

}

.details-price span {

	color: #fe4536;

	font-weight: 300;

	font-size: 40px;

	margin-right: 25px;

}

.details-price .old-price {

	color: #d9dbec;

	text-decoration: line-through;

}

.variant-name span {

	text-transform: uppercase;

	font-weight: 500;

	letter-spacing: 2px;

}



.variant-name {

	display: inline-block;

	margin-right: 30px;

}

.shop-color{

	display: inline-block;

}

.shop-color li{

	display: inline-block;

	margin-bottom: 0;

}

.shop-size{

	display: inline-block;

}

.shop-size li{

	display: inline-block;

	margin-bottom: 0;

}

.shop-size li a {

	color: #747691;

	text-transform: uppercase;

	border: 2px solid transparent;

	line-height: 1;

	padding: 10px;

	padding-bottom: 8px;

	display: inline-block;

}

.shop-size li.active a {

	border: 2px solid #fe4536;

	color: #fe4536;

}

.variant-item {

	padding: 30px 0;

	border-top: 1px solid #ffe7e5;

}



.details-timer{

	display: inline-block;

}

.details-timer .cdown {

	height: 60px;

	width: 60px;

	border-radius: 0;

	line-height: 60px;

	padding: 11px 0;

	background: #fff1f0;

	margin-right: 10px;

	box-shadow: none;

}

.details-timer .cdown span {

	font-size: 18px;

	color: #fe4536;

	margin-bottom: 7px;

}

.details-timer .cdown p {

	color: #747691;

	font-weight: 400;

}

.product-coming .variant-name span{

	position: relative;

	top: -11px;

}

.product-desc p{

	margin-bottom: 0;

}

.product-info-list ul{



}

.product-info-list ul li{

	margin-bottom: 10px;

}

.product-info-list ul li span {

	font-weight: 500;

	color: #232b37;

	width: 120px;

	display: inline-block;

}

.product-info-list ul li span.in-stock {

	font-weight: 400;

	color: #fe4536;

}

.product-details-action {
  display: flex;
  align-items: center;
}

.plus-minus {

	display: inline-block;
  margin-right: 20px;
  button {
    height: 50px;
    padding: 18px 50px;
  }

}

.details-action-icon {

	height: 50px;

	width: 50px;

	border: 0;

	background: #fff1f0;

	border-radius: 50px;

	margin-right: 13px;

	color: #fe4536;

	font-size: 15px;

	line-height: 50px;

}

.details-action-icon:hover {

	background: #fe4536;

	color: #fff;

}

/* review */

.pro-details-banner {

	margin-top: 84px;

}

.review-tab .nav-link {

	color: #333;

	font-size: 14px;

	font-weight: 500;

	padding: 20px 40px;

	color: #747691;

	text-transform: uppercase;

	letter-spacing: 2px;

	line-height: 1;

	border: 2px solid #ecedff

}

.review-tab .nav-item {

	margin-right: 30px;

	position: relative;

	margin-bottom: 25px;

}

.review-tab .nav-link.active {

  background: #fe4536;

  border-color: #fe4536;

  color: #fff;

}

.desc-text {

	padding: 40px;

	border: 4px solid #f9f9f9;

}

.pro-comments-img {

  float: left;

}

.pro-commnets-text {

	overflow: hidden;

	padding-left: 15px;

}

.pro-commnets-text h4 {

	font-size: 17px;

	margin-bottom: 0;

}

.pro-commnets-text span {

  font-size: 14px;

}

.pro-commnets-text .rating {

  margin-bottom: 20px;

}

.pro-commnets-text > p {

  margin: 0;

}

.product-commnets-list {

  border-bottom: 1px solid #e5e5e5;

}

.pro-rating i {

	font-size: 12px;

	color: #FE4536;

}

.pro-commnets-text .pro-rating {

	margin-bottom: 5px;

	margin-top: 8px;

}

.pro-commnets-text .pro-rating {

	margin-bottom: 5px;

	margin-top: 8px;

}

.product-commnets .product-commnets-list:last-child{border: 0}



.review-box > h4 {

  font-size: 18px;

  font-weight: 500;

  margin-bottom: 10px;

}

.rating-list {

  display: inline-block;

}

.your-rating > span {

  color: #414149;

  font-size: 16px;

}

.rating-list > a {

  color: #646464;

  font-size: 13px;

}

.rating-list > a:hover {

  color: #FE4536;

}

.review-form{}

.review-form label {

	display: block;

	font-size: 13px;

	margin-bottom: 15px;

	font-weight: 500;

	text-transform: uppercase;

	letter-spacing: 2px;

}

.review-form textarea {

	border: 2px solid #ecedff;

	height: 80px;

	margin-bottom: 25px;

	padding: 15px;

	width: 100%;

}

.review-form input {

  border: 2px solid #ecedff;

  height: 50px;

  margin-bottom: 30px;

  padding: 0 15px;

  width: 100%;

}

.review-form button{}

.product-slider-2 {
  display: flex;
  justify-content: space-around;
  .pro-item {
    margin-right: 20px;
  }
}

</style>
