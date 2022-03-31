<template>
  <main id="main" class="clearfix">
    <!-- breadcrumb-area-start -->
    <Breadcrumb :title="title" :nav="nav"></Breadcrumb>
    <!-- breadcrumb-area-end -->

    <section class="publish-area pb-70">
      <div class="container">
        <!--        上传区        -->
        <div class="row images-area">
          <div class="class-lg-12">
            <div class="input-line image">
              <!--    上传后的图片   -->
              <!--                            <div class="uploaded">-->
              <!--                                <img class="good-image" src="" alt="">-->
              <!--                                <CloseCircleOutlined />-->
              <!--                            </div>-->

              <div class="layui-box layui-upload-button">
                <form
                  target="layui-upload-iframe"
                  method="post"
                  enctype="multipart/form-data"
                  action=""
                >
                  <input
                    type="file"
                    name="info"
                    class="layui-upload-file info-img-upload"
                  />
                </form>
                <span class="layui-upload-icon">
                  <PlusCircleOutlined />
                  上传图片
                </span>
              </div>
            </div>
          </div>
        </div>
        <!--        填写信息区        -->
        <form action="#" method="post">
          <div class="row mt-50">
            <div class="col-lg-6 center-pill">
              <div class="checkbox-form">
                <!--                                <h3>闲置基本信息</h3>-->
                <div class="row">
                  <div class="col-md-12">
                    <div class="country-select">
                      <label>选择学校 <span class="required">*</span></label>
                      <select>
                        <option value="volvo">黑龙江科技大学</option>
                        <option value="saab">哈尔滨工业大学</option>
                        <option value="mercedes">哈尔滨理工大学</option>
                        <option value="audi">哈尔滨工程大学</option>
                        <option value="audi2">黑龙江大学</option>
                        <option value="audi3">北京理工大学</option>
                        <option value="audi4">北京科技大学</option>
                        <option value="audi5">中国石油大学</option>
                      </select>
                    </div>
                  </div>
                  <div class="col-md-12">
                    <div class="publish-form-list">
                      <label>闲置名称</label>
                      <input type="text" placeholder="" />
                    </div>
                  </div>
                  <div class="col-md-12">
                    <div class="country-select">
                      <label>分类 <span class="required">*</span></label>
                      <select>
                        <option value="volvo">数码</option>
                        <option value="saab">生活用品</option>
                        <option value="mercedes">寝具</option>
                      </select>
                    </div>
                  </div>
                  <div class="col-md-12">
                    <div class="order-notes">
                      <div class="publish-form-list">
                        <label>闲置详情</label>
                        <textarea
                          id="checkout-mess"
                          cols="30"
                          rows="10"
                          placeholder="用几句话来描述一下你的物品吧！"
                        ></textarea>
                      </div>
                    </div>
                  </div>
                  <div class="col-md-6">
                    <div class="publish-form-list">
                      <label>出售价格 <span class="required">*</span></label>
                      <input type="text" placeholder="" />
                    </div>
                  </div>

                  <div class="col-md-6">
                    <div class="publish-form-list">
                      <label>原购买价格 <span class="required">*</span></label>
                      <input type="text" placeholder="" />

                      <button
                        v-show="!showBuyLink"
                        class="btn buy-link-btn"
                        type="button"
                        @click="handleShowBuyLink"
                      >
                        <PlusSquareOutlined />
                        添加原购买链接
                      </button>
                      <button
                        v-show="showBuyLink"
                        class="btn buy-link-btn"
                        type="button"
                        style="color: #721c24"
                        @click="handleShowBuyLink"
                      >
                        <MinusSquareOutlined />
                        关闭原购买链接
                      </button>
                    </div>
                  </div>
                  <div class="col-md-12" v-show="showBuyLink">
                    <div class="publish-form-list">
                      <label>原购买链接</label>
                      <input type="text" placeholder="http://" />
                    </div>
                  </div>
                  
                  <div class="col-md-12">
                    <div class="publish-form-list">
                      <label>交易地址 <span class="required">*</span></label>
                      <input type="text" placeholder="Street address" />
                    </div>
                  </div>
                  <div class="col-md-12">
                    <div class="publish-form-list">
                      <label>手机号 <span class="required">*</span></label>
                      <input type="text" placeholder="Town / City" />
                    </div>
                  </div>
                </div>
                <div class="publish-button mt-20">
                  <button type="submit" class="btn theme-btn">保存</button>
                  <button type="submit" class="btn theme-btn">
                    保存并发布
                  </button>
                </div>
              </div>
            </div>
          </div>
        </form>
      </div>
    </section>
  </main>
</template>

<script>
import Breadcrumb from "@/components/Breadcrumb.vue";
import { PlusCircleOutlined,PlusSquareOutlined,MinusSquareOutlined } from "@ant-design/icons-vue";

export default {
  name: "Publish",
  data() {
    return {
      title: "发布闲置",
      nav: ["Home", "Publish"],
      showBuyLink: false, //是否显示购买链接
    };
  },
  method: {
    handleShowBuyLink() {
        this.showBuyLink = !this.showBuyLink;
    }
  },
  components: {
    Breadcrumb,
    PlusCircleOutlined,
    PlusSquareOutlined,
    MinusSquareOutlined
  },
};
</script>

<style scoped>
.country-select {

  margin-bottom: 30px;

  position: relative;

}



.country-select label, .checkout-form-list label {

  color: #6f7172;

  display: block;

  margin: 0 0 5px;

}



.country-select label span.required, .checkout-form-list label span.required {

  color: red;

}



.country-select select {

  -moz-appearance: none;

  border: 1px solid #eaedff;

  height: 45px;

  padding-left: 10px;

  width: 100%;

  color: #6f7172;

}

.order-notes textarea {
  border: 1px solid #eaedff;
  height: 90px;
  padding: 15px;
  width: 100%;
}

.order-notes textarea::-moz-placeholder {
  color: #6f7172;
  opacity: 1;
}

.order-notes textarea::placeholder {
  color: #6f7172;
  opacity: 1;
}


.publish-form-list {
  margin-bottom: 30px;
}
.publish-form-list input[type="text"],
.checkout-form-list input[type="password"],
.checkout-form-list input[type="email"] {
  background: #ffffff;
  border: 1px solid #eaedff;
  border-radius: 0;
  height: 45px;
  padding: 0 0 0 10px;
  width: 100%;
}

.images-area {
  justify-content: center;
}
.input-line.image {
  text-align: center;
}
.input-line {
  margin-top: 30px;
}
.image .layui-box.layui-upload-button {
  width: 153px;
  height: 153px;
  border: #eaedff solid 2px;
}

.layui-upload-button {
  position: relative;
  display: inline-block;
  vertical-align: middle;
  min-width: 60px;
  height: 36px;
  line-height: 36px;
  border: 1px solid #dfdfdf;
  border-radius: 2px;
  overflow: hidden;
  background-color: #fff;
  color: #666;
}
.layui-upload-button {
  outline: 0;
  -webkit-transition: border-color 0.3s cubic-bezier(0.65, 0.05, 0.35, 0.5);
  transition: border-color 0.3s cubic-bezier(0.65, 0.05, 0.35, 0.5);
  -webkit-box-sizing: border-box !important;
  -moz-box-sizing: border-box !important;
  box-sizing: border-box !important;
}

.layui-upload-button input {
  position: absolute;
  left: 0;
  top: 0;
  z-index: 10;
  font-size: 100px;
  width: 100%;
  height: 100%;
}
.layui-upload-button input,
.layui-upload-file {
  opacity: 0.01;
  filter: Alpha(opacity=1);
  cursor: pointer;
}

.image .layui-upload-icon {
  width: 153px;
  height: 153px;
  margin: 0;
  text-align: center;
  line-height: 149px;
  font-size: 20px;
}

.layui-upload-icon {
  display: block;
  margin: 0 15px;
  text-align: center;
}

.image .layui-upload-icon i {
  font-size: 28px;
  font-weight: bold;
}

.layui-upload-icon i {
  margin-right: 5px;
  vertical-align: middle;
  font-size: 20px;
  color: #fe5245;
}

.uploaded {
  display: inline-block;
  margin-right: 10px;
  position: relative;
}

.good-image {
  width: 150px;
  height: 150px;
  border-radius: 5px;
  border: #eaedff solid 2px;
}
.uploaded i {
  color: #f40;
  position: absolute;
  font-size: 24px;
  right: -13px;
  top: -10px;
  cursor: pointer;
}

.publish-button {
  text-align: right;
}
.publish-button button:first-child {
  border: #eaedff solid 1px;
  background-color: #ffffff;
  color: #0b0b0b;
  margin-right: 10px;
}
.publish-button button:first-child:hover {
    color: #0b0b0b;
}

.buy-link-btn {
  position: absolute;
  padding: 15px 20px;
}

.form-radio-group {
  padding: 5px 0;
}
.form-radio-group label {
  margin-right: 20px;
}
</style>