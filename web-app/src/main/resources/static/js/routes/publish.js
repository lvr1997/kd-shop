let template = `
    <main id="main" class="clearfix">
        <!-- breadcrumb-area-start -->
        <section class="breadcrumb-area" data-background="img/bg/page-title.png">
            <div class="container">
                <div class="row">
                    <div class="col-xl-12">
                        <div class="breadcrumb-text text-center">
                            <h1>Product Publish</h1>
                            <ul class="breadcrumb-menu">
                                <li><span>Home</span></li>
                                <li><span>Publish</span></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </section>
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
<!--                                <i class="fa fa-minus-circle"></i>-->
<!--                            </div>-->

                            <div class="layui-box layui-upload-button">
                                <form target="layui-upload-iframe" method="post" enctype="multipart/form-data" action="">
                                    <input type="file" name="info" class="layui-upload-file info-img-upload">
                                </form>
                                <span class="layui-upload-icon">
                                        <i class="fa fa-plus-circle"></i>
                                        上传图片
                                    </span>
                            </div>
                        </div>
                    </div>
                </div>
                <!--        填写信息区        -->
                <form action="/product/published" method="post">
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
                                            <input type="text" placeholder="">
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
                                                <textarea id="checkout-mess" cols="30" rows="10" placeholder="用几句话来描述一下你的物品吧！"></textarea>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-6">
                                        <div class="publish-form-list">
                                            <label>出售价格 <span class="required">*</span></label>
                                            <input type="text" placeholder="">
                                        </div>
                                    </div>

                                    <div class="col-md-6">
                                        <div class="publish-form-list">
                                            <label>原购买价格 <span class="required">*</span></label>
                                            <input type="text" placeholder="">

                                            <button v-show="showBuyLink" class="btn buy-link-btn" @click="showBuyLink=!showBuyLink">
                                                <i class="fas fa-plus-circle"></i>
                                                添加原购买链接</button>
                                            <button v-show="!showBuyLink" class="btn buy-link-btn" style="color: #721c24" @click="showBuyLink=!showBuyLink">
                                                <i class="fas fa-minus-circle"></i>
                                                关闭原购买链接</button>
                                        </div>
                                    </div>
                                    <div class="col-md-12" v-show="!showBuyLink">
                                        <div class="publish-form-list">
                                            <label>原购买链接</label>
                                            <input type="text" placeholder="http://">
                                        </div>
                                    </div>
                                    <div class="col-md-12">
                                        <div class="publish-form-list">
                                            <label>交易方式 <span class="required">*</span></label>
                                            <div class="form-radio-group">
                                                <label for="radio1"><input id="radio1" name="exchangeWay" type="radio" value="1"/> 线上</label>
                                                <label for="radio2"><input id="radio2" name="exchangeWay" type="radio" value="2"/> 线下</label>
                                                <label for="radio3"><input id="radio3" name="exchangeWay" type="radio" value="1"/> 线上/线下</label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-12">
                                        <div class="publish-form-list">
                                            <label>交易地址 <span class="required">*</span></label>
                                            <input type="text" placeholder="Street address">
                                        </div>
                                    </div>
                                    <div class="col-md-12">
                                        <div class="publish-form-list">
                                            <label>手机号 <span class="required">*</span></label>
                                            <input type="text" placeholder="Town / City">
                                        </div>
                                    </div>
                                </div>
                                <div class="publish-button mt-20">
                                    <button type="submit" class="btn theme-btn">保存</button>
                                    <button type="submit" class="btn theme-btn">保存并发布</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </form>
            </div>
        </section>
    </main>
`;
let productPublish = {
    template: template
};