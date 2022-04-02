<template>
  <main>
    <!-- breadcrumb-area-start -->
    <Breadcrumb :title="title" :nav="nav"></Breadcrumb>
    <!-- breadcrumb-area-end -->

    <!-- checkout-area start -->
    <section class="checkout-area pb-70">
      <div class="container">
        <form action="#">
          <div class="order-row row">
            <div class="col-lg-6">
              <div class="your-order mb-30">
                <h3>Your order</h3>
                <div class="your-order-table table-responsive">
                  <table>
                    <thead>
                      <tr>
                        <th class="product-name">Product</th>
                        <th class="product-total">Total</th>
                      </tr>
                    </thead>
                    <tbody>
                      <tr class="cart_item">
                        <td class="product-name">
                          Vestibulum suscipit
                          <strong class="product-quantity"> × 1</strong>
                        </td>
                        <td class="product-total">
                          <span class="amount">$165.00</span>
                        </td>
                      </tr>
                      <tr class="cart_item">
                        <td class="product-name">
                          Vestibulum dictum magna
                          <strong class="product-quantity"> × 1</strong>
                        </td>
                        <td class="product-total">
                          <span class="amount">$50.00</span>
                        </td>
                      </tr>
                    </tbody>
                    <tfoot>
                      <tr class="cart-subtotal">
                        <th>Cart Subtotal</th>
                        <td><span class="amount">$215.00</span></td>
                      </tr>
                      <tr class="shipping">
                        <th>Shipping</th>
                        <td>
                          <ul>
                            <li>
                              <input type="radio" />
                              <label>
                                Flat Rate: <span class="amount">$7.00</span>
                              </label>
                            </li>
                            <li>
                              <input type="radio" />
                              <label>Free Shipping:</label>
                            </li>
                            <li></li>
                          </ul>
                        </td>
                      </tr>
                      <tr class="order-total">
                        <th>Order Total</th>
                        <td>
                          <strong><span class="amount">$215.00</span></strong>
                        </td>
                      </tr>
                    </tfoot>
                  </table>
                </div>

                <div class="payment-method">
                  <div class="accordion" id="accordionExample">
                    <div class="card">
                      <div class="card-header" id="headingOne">
                        <h5 class="mb-0">
                          <button
                            class="btn-link"
                            type="button"
                            data-toggle="collapse"
                            data-target="#collapseOne"
                            aria-expanded="true"
                            aria-controls="collapseOne"
                          >
                            Direct Bank Transfer
                          </button>
                        </h5>
                      </div>

                      <div
                        id="collapseOne"
                        class="collapse show"
                        aria-labelledby="headingOne"
                        data-parent="#accordionExample"
                      >
                        <div class="card-body">
                          Make your payment directly into our bank account.
                          Please use your Order ID as the payment reference.
                          Your order won’t be shipped until the funds have
                          cleared in our account.
                        </div>
                      </div>
                    </div>
                    <div class="card">
                      <div class="card-header" id="headingTwo">
                        <h5 class="mb-0">
                          <button
                            class="btn-link collapsed"
                            type="button"
                            data-toggle="collapse"
                            data-target="#collapseTwo"
                            aria-expanded="false"
                            aria-controls="collapseTwo"
                          >
                            Cheque Payment
                          </button>
                        </h5>
                      </div>
                      <div
                        id="collapseTwo"
                        class="collapse"
                        aria-labelledby="headingTwo"
                        data-parent="#accordionExample"
                      >
                        <div class="card-body">
                          Please send your cheque to Store Name, Store Street,
                          Store Town, Store State / County, Store Postcode.
                        </div>
                      </div>
                    </div>
                    <div class="card">
                      <div class="card-header" id="headingThree">
                        <h5 class="mb-0">
                          <button
                            class="btn-link collapsed"
                            type="button"
                            data-toggle="collapse"
                            data-target="#collapseThree"
                            aria-expanded="false"
                            aria-controls="collapseThree"
                          >
                            PayPal
                          </button>
                        </h5>
                      </div>
                      <div
                        id="collapseThree"
                        class="collapse"
                        aria-labelledby="headingThree"
                        data-parent="#accordionExample"
                      >
                        <div class="card-body">
                          Pay via PayPal; you can pay with your credit card if
                          you don’t have a PayPal account.
                        </div>
                      </div>
                    </div>
                  </div>
                  <div class="order-button-payment mt-20">
                    <button type="submit" class="btn theme-btn">
                      Place order
                    </button>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </form>
      </div>
    </section>
    <!-- checkout-area end -->
  </main>
</template>

<script>
import Breadcrumb from "@/components/Breadcrumb.vue";
export default {
  data() {
    return {
      title: "订单",
      nav: ["order"],
    };
  },
  components: {
    Breadcrumb,
  },
};
</script>

<style scoped>
.order-row {
  justify-content: center;
}
.your-order {
  padding: 30px 40px 45px;

  border: 3px solid #eaedff;
}

@media (max-width: 767px) {
  .your-order {
    padding: 15px;
  }
}

.your-order h3 {
  border-bottom: 1px solid #eaedff;

  font-size: 30px;

  margin: 0 0 20px;

  padding-bottom: 10px;

  width: 100%;
}

.your-order-table table {
  background: none;

  border: 0;

  width: 100%;
}

.your-order-table table th,
.your-order-table table td {
  border-bottom: 1px solid #eaedff;

  border-right: medium none;

  color: #6f7172;

  font-size: 14px;

  padding: 15px 0;

  text-align: left;
}

@media (max-width: 767px) {
  .your-order-table table th,
  .your-order-table table td {
    padding-right: 10px;
  }
}

.your-order-table table th {
  border-top: medium none;

  color: #6f7172;

  font-weight: normal;

  text-align: left;

  vertical-align: middle;

  white-space: nowrap;

  width: 250px;
}

.panel-body > p {
  color: #222;
}

.your-order-table table .shipping ul li input {
  position: relative;

  top: 2px;
}

.your-order-table table .shipping ul li label {
  color: #6f7172;
}

.your-order-table table .shipping th {
  vertical-align: top;
}

.your-order-table table .order-total th {
  border-bottom: 0;

  font-size: 14px;
}

.your-order-table table .order-total td {
  border-bottom: medium none;
}

.your-order-table table tr.cart_item:hover {
  background: #f9f9f9;
}

.your-order-table table tr.order-total td span {
  color: #fe4536;

  font-size: 18px;

  font-weight: 500;
}

.payment-method {
  margin-top: 40px;
}

.panel-title > a {
  display: block;
}

.order-button-payment input {
  background: #232323 none repeat scroll 0 0;

  border: medium none;

  color: #fff;

  font-size: 15px;

  font-weight: 600;

  height: 40px;

  margin: 0px 0 0;

  padding: 0;

  text-transform: uppercase;

  transition: all 0.3s ease 0s;

  width: 100%;
}

.order-button-payment input:hover {
  background: #fe4536 none repeat scroll 0 0;
}

.payment-method .btn-link {
  -moz-user-select: none;

  background: no-repeat;

  border: medium none;

  border-radius: 0;

  color: #444;

  cursor: pointer;

  display: inline-block;

  font-size: 14px;

  font-weight: 500;

  letter-spacing: 1px;

  line-height: 1;

  margin-bottom: 0;

  padding: 3px 10px;

  text-align: center;

  text-transform: uppercase;

  transition: all 0.3s ease 0s;

  vertical-align: middle;

  white-space: nowrap;

  text-decoration: none;
}

.payment-method .card {
  background-color: #ffffff;

  border: 1px solid #eaedff;

  border-radius: 0;

  margin-bottom: 10px;
}

.payment-method .accordion .card:first-of-type {
  border: 1px solid #eaedff;
}

.card-header:first-child {
  border-radius: 0;
}

.payment-method .card-header {
  background-color: #ffffff;

  border-bottom: 1px solid #eaedff;
}

.order-button-payment button {
  width: 100%;
}
</style>