<template>
  <main>
    <!-- breadcrumb-area-start -->
    <Breadcrumb :title="title" :nav="nav"></Breadcrumb>
    <!-- breadcrumb-area-end -->

    <!-- Cart Area Strat-->
    <section class="cart-area pt-100 pb-100">
      <div class="container">
        <div class="row">
          <div class="col-12">
            <form action="#">
              <div class="table-content table-responsive">
                <table class="table">
                  <thead>
                    <tr>
                      <th class="product-thumbnail">主图</th>
                      <th class="cart-product-name">名称</th>
                      <th class="product-price">价格</th>
                      <th class="product-quantity">购买</th>
                      <th class="product-subtotal">卖方</th>
                      <th class="product-remove">移除</th>
                    </tr>
                  </thead>
                  <tbody>
                    <tr>
                      <td class="product-thumbnail">
                        <a href="#"
                          ><img src="../../static/picture/pro1.jpg" alt=""
                        /></a>
                      </td>
                      <td class="product-name">
                        <a href="#">Bakix Furniture</a>
                      </td>
                      <td class="product-price">
                        <span class="amount">$130.00</span>
                      </td>
                      <td class="product-quantity">
                        <button class="btn theme-btn-2" type="submit">
                          去购买
                        </button>
                      </td>
                      <td class="product-subtotal">
                        <span class="amount">Lucy</span>
                      </td>
                      <td class="product-remove">
                        <a href="#"><CloseCircleFilled /></a>
                      </td>
                    </tr>
                    <tr>
                      <td class="product-thumbnail">
                        <a href="#"
                          ><img src="../../static/picture/pro2.jpg" alt=""
                        /></a>
                      </td>
                      <td class="product-name">
                        <a href="#">Sujon Chair Set</a>
                      </td>
                      <td class="product-price">
                        <span class="amount">$120.50</span>
                      </td>
                      <td class="product-quantity">
                        <button class="btn theme-btn-2" type="submit">
                          去购买
                        </button>
                      </td>
                      <td class="product-subtotal">
                        <span class="amount">Lucy</span>
                      </td>
                      <td class="product-remove">
                        <a href="#"><CloseCircleFilled /></a>
                      </td>
                    </tr>
                  </tbody>
                </table>
              </div>
            </form>
          </div>
        </div>
      </div>
    </section>
    <!-- Cart Area End-->
  </main>
</template>

<script>
import Breadcrumb from "@/components/Breadcrumb.vue";
import { CloseCircleFilled } from '@ant-design/icons-vue'
export default {
  data() {
    return {
      title: "心愿单",
      nav: ["Home", "MyWishlist"],
    };
  },
  components: {
    Breadcrumb,
    CloseCircleFilled
  },
};
</script>

<style scoped>
.table-content table {
  background: #ffffff;
  border-color: #eaedff;
  border-radius: 0;
  border-style: solid;
  border-width: 1px 0 0 1px;
  text-align: center;
  width: 100%;
  margin-bottom: 0;
}

.table-content table td.product-name {
  font-size: 16px;
  font-weight: 400;
  text-transform: capitalize;
}

.table-content table td a {
    color: rgba(0, 0, 0, 0.85)
}

.table-content table td.product-name a:hover {
  color: #fe4536;
}

.table-content table td {
  border-top: medium none;
  padding: 20px 10px;
  vertical-align: middle;
  font-size: 16px;
}

.table-content table th, .table-content table td {
  border-bottom: 1px solid #eaedff;
  border-right: 1px solid #eaedff;
}

.product-quantity input {
	border: none;
	color: #6f7172;
	font-size: 14px;
	font-weight: normal;
	border: 0;
}

.table td, .table th {
	border-top: 1px solid #eaedff;
}

.product-quantity > input {
  width: 80px;
  border-radius: 3px;
}

.table-content table td.product-subtotal {
  font-size: 16px;
}

.table-content table td .cart-plus-minus {
  float: none;
  margin: 0 auto;
}
td.product-thumbnail img {
	width: 125px;
}
</style>