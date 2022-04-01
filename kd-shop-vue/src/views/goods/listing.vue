<template>
  <main>
    <!-- breadcrumb-area-start -->
    <Breadcrumb :title="title" :nav="nav"></Breadcrumb>
    <!-- breadcrumb-area-end -->

    <!-- shop-area start -->
    <section class="shop-area pt-100 pb-100">
      <div class="container">
        <div class="row">
          <div class="col-xl-12">
            <!-- tab filter -->
            <div class="row mb-10">
              <div class="col-xl-5 col-lg-6 col-md-6">
                <div class="product-showing mb-40">
                  <p>已为您找到 32 件物品</p>
                </div>
              </div>
              <div class="col-xl-7 col-lg-6 col-md-6">
                <div class="pro-filter mb-40 f-right">
                  <form action="#">
                    <select name="pro-filter" id="pro-filter">
                      <option value="1">Shop By</option>
                      <option value="2">Top Sales</option>
                      <option value="3">New Product</option>
                      <option value="4">A to Z Product</option>
                    </select>
                  </form>
                </div>
              </div>
            </div>
            <!-- tab content -->
            <div class="tab-content" id="myTabContent">
              <div
                class="tab-pane fade show active"
                id="home"
                role="tabpanel"
                aria-labelledby="home-tab"
              >
                <div class="row">
                  <div class="col-lg-4 col-md-6">
                    <GoodInfo></GoodInfo>
                  </div>
                  <div class="col-lg-4 col-md-6">
                    <GoodInfo></GoodInfo>
                  </div>
                  <div class="col-lg-4 col-md-6">
                    <GoodInfo></GoodInfo>
                  </div>
                  <div class="col-lg-4 col-md-6">
                    <GoodInfo></GoodInfo>
                  </div>
                  <div class="col-lg-4 col-md-6">
                    <GoodInfo></GoodInfo>
                  </div>
                  <div class="col-lg-4 col-md-6">
                    <GoodInfo></GoodInfo>
                  </div>
                  <div class="col-lg-4 col-md-6">
                    <GoodInfo></GoodInfo>
                  </div>
                  <div class="col-lg-4 col-md-6">
                    <GoodInfo></GoodInfo>
                  </div>
                  <div class="col-lg-4 col-md-6">
                    <GoodInfo></GoodInfo>
                  </div>
                </div>
              </div>
            </div>
            <!--      分页    -->
            <div class="basic-pagination basic-pagination-2 text-center mt-20">
              <ul>
                <li>
                  <a href="#"><LeftOutlined /></a>
                </li>
                <li><a href="#">01</a></li>
                <li class="active"><a href="#">02</a></li>
                <li><a href="#">03</a></li>
                <li>
                  <a href="#"><EllipsisOutlined /></a>
                </li>
                <li>
                  <a href="#"><RightOutlined /></a>
                </li>
              </ul>
            </div>
          </div>
        </div>
      </div>
    </section>
    <!-- shop-area end -->
  </main>
</template>

<script>
import Breadcrumb from "@/components/Breadcrumb.vue";
import GoodInfo from "@/components/GoodInfo";
import {
  LeftOutlined,
  RightOutlined,
  EllipsisOutlined,
} from "@ant-design/icons-vue";

export default {
  components: {
    Breadcrumb,
    GoodInfo,
    LeftOutlined,
    RightOutlined,
    EllipsisOutlined,
  },
  data() {
    return {
      title: "Shop",
      nav: ["Home", "Shop"],
    };
  },
};
</script>

<style scoped>
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
	outline: none;

}

.pro-filter::before {
	content: "";
	right: 15px;
	top: 18px;
	position: absolute;
	color: #758799;
	font-weight: 700;
	width: 8px;
	height: 8px;
	border-top: 1px solid #758799;
    border-right: 1px solid #758799;
    transform: rotate(135deg);
    -webkit-transform: rotate(135deg);
}
</style>
