let template = `
    <main>
    <!-- slider-area start -->
    <section class="slider-area pos-relative">
        <div class="slider-active">
            <div class="single-slider slide-1-style slide-height d-flex align-items-center">
                <div class="shape-title bounce-animate">
                    <h2>2022</h2>
                </div>
                <div class="shape-icon bounce-animate">
                    <img src="./picture/shape-icon.png" th:src="@{/picture/shape-icon.png}" alt="">
                </div>
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-xl-7">
                            <div class="slide-content">
                                <span data-animation="fadeInRight" data-delay=".2s">[I have] 校园二手交易平台</span>
                                <h1 data-animation="fadeInUp" data-delay=".5s">你想要的
                                    我这都有</h1>
                                <div class="slide-btn">
                                    <a class="btn theme-btn" th:href="@{/product/publish}" data-animation="fadeInLeft" data-delay=".7s">我有闲置 | 立即发布</a>
                                    <a class="btn white-btn" href="shop.html" data-animation="fadeInRight" data-delay=".9s">分类</a>
                                </div>
                            </div>
                        </div>
                        <div class="col-xl-5">
                            <div class="slide-shape1" data-animation="bounceInRight" data-delay=".9s"><img src="./picture/shape1.png" th:src="@{/picture/shape1.png}" alt=""></div>
                            <div class="slide-shape2" data-animation="bounceInRight" data-delay="1.2s"><img src="./picture/shape2.png" th:src="@{/picture/shape2.png}" alt=""></div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="single-slider slide-1-style slide-height d-flex align-items-center">
                <div class="shape-title bounce-animate">
                    <h2>2022</h2>
                </div>
                <div class="shape-icon bounce-animate">
                    <img src="./picture/shape-icon.png" th:src="@{/picture/shape-icon.png}" alt="">
                </div>
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-xl-7">
                            <div class="slide-content">
                                <span data-animation="fadeInRight" data-delay=".2s">Furniture Collection</span>
                                <h1 data-animation="fadeInUp" data-delay=".5s">Synnes Dining
                                    Chair Upholstered</h1>
                                <div class="slide-btn">
                                    <a class="btn theme-btn" href="shop.html" data-animation="fadeInLeft" data-delay=".7s">shop now</a>
                                    <a class="btn white-btn" href="shop.html" data-animation="fadeInRight" data-delay=".9s">category</a>
                                </div>
                            </div>
                        </div>
                        <div class="col-xl-5">
                            <div class="slide-shape1" data-animation="bounceInRight" data-delay=".9s"><img src="./picture/shape3.png" th:src="@{/picture/shape3.png}" alt=""></div>
                            <div class="slide-shape2" data-animation="bounceInRight" data-delay="1.1s"><img src="./picture/shape4.png" th:src="@{/picture/shape4.png}" alt=""></div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- slider-area end -->

    <!-- banner area start -->
    <section class="banner-area pt-30 pl-15 pr-15">
        <div class="container-fluid">
            <div class="row">
                <div class="col-lg-4 col-md-6">
                    <div class="banner mb-30">
                        <a href="shop.html"><img src="./picture/banner11.jpg" alt=""></a>
                    </div>
                </div>
                <div class="col-lg-4 col-md-6">
                    <div class="banner mb-30">
                        <a href="shop.html"><img src="./picture/banner21.jpg" alt=""></a>
                    </div>
                </div>
                <div class="col-lg-4 col-md-6">
                    <div class="banner mb-30">
                        <a href="shop.html"><img src="./picture/banner32.jpg" alt=""></a>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- banner area end -->

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
                        <ul class="nav product-nav  justify-content-xl-end" id="myTab1" role="tablist">
                            <!--                            <li class="nav-item" v-for="(item, index) in newGoodCategories" :key="index">-->
                            <!--                               <a class="nav-link active" :id="item.signId" data-toggle="tab" href="#home" role="tab" aria-controls="home" aria-selected="true"></a>-->
                            <!--                            </li>-->
                            <li class="nav-item">
                                <a class="nav-link active" id="home-tab" data-toggle="tab" href="#home" role="tab" aria-controls="home" aria-selected="true">生活日用</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" id="profile-tab" data-toggle="tab" href="#profile" role="tab" aria-controls="profile" aria-selected="false">寝具</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" id="contact-tab" data-toggle="tab" href="#contact" role="tab" aria-controls="contact" aria-selected="false">宿舍用品</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" id="contact-tab1" data-toggle="tab" href="#contact9" role="tab" aria-controls="contact" aria-selected="false">电子数码</a>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-xl-12">
                    <div class="product-tab-content">
                        <div class="tab-content" id="myTabContent">
                            <div class="tab-pane fade show active" id="home" role="tabpanel" aria-labelledby="home-tab">
                                <div class="product-slider owl-carousel">
                                    <div class="pro-item">
                                        <product-info></product-info>
<!--                                        <product-info></product-info>-->
                                    </div>
                                    <div class="pro-item">
                                        <product-info></product-info>
<!--                                        <product-info></product-info>-->
                                    </div>
                                    <div class="pro-item">
                                        <product-info></product-info>
<!--                                        <product-info></product-info>-->
                                    </div>
                                    <div class="pro-item">
                                        <product-info></product-info>
<!--                                        <product-info></product-info>-->
                                    </div>
                                    <div class="pro-item">
                                        <product-info></product-info>
<!--                                        <product-info></product-info>-->
                                    </div>
                                </div>
                            </div>
                            <div class="tab-pane fade" id="profile" role="tabpanel" aria-labelledby="profile-tab">
                                <div class="product-slider owl-carousel">
                                    <div class="pro-item">
                                        <product-info></product-info>
                                    </div>
                                    <div class="pro-item">
                                        <product-info></product-info>
                                    </div>
                                    <div class="pro-item">
                                        <product-info></product-info>
                                    </div>
                                    <div class="pro-item">
                                        <product-info></product-info>
                                    </div>
                                    <div class="pro-item">
                                        <product-info></product-info>
                                    </div>
                                </div>
                            </div>
                            <div class="tab-pane fade" id="contact" role="tabpanel" aria-labelledby="contact-tab">
                                <div class="product-slider owl-carousel">
                                    <div class="pro-item">
                                        <div class="product-wrapper mb-50">
                                            <div class="product-img mb-25">
                                                <a href="product-details.html">
                                                    <img src="../picture/pro8.jpg" th:src="@{/picture/pro8.jpg}" alt="">
                                                    <img class="secondary-img" src="../picture/pro1.jpg" th:src="@{/picture/pro1.jpg}" alt="">
                                                </a>
                                                <div class="product-action text-center">
                                                    <a href="#" title="Shoppingb Cart">
                                                        <i class="flaticon-shopping-cart"></i>
                                                    </a>
                                                    <a href="#" title="Quick View">
                                                        <i class="flaticon-eye"></i>
                                                    </a>
                                                    <a href="#" data-toggle="tooltip" data-placement="right" title="Compare">
                                                        <i class="flaticon-compare"></i>
                                                    </a>
                                                </div>
                                            </div>
                                            <div class="product-content">
                                                <div class="pro-cat mb-10">
                                                    <a href="shop.html">decor, </a>
                                                    <a href="shop.html">furniture</a>
                                                </div>
                                                <h4>
                                                    <a href="product-details.html">Minimal Troma Furniture</a>
                                                </h4>
                                                <div class="product-meta">
                                                    <div class="pro-price">
                                                        <span>$119.00 USD</span>
                                                        <span class="old-price">$230.00 USD</span>
                                                    </div>
                                                </div>
                                                <div class="product-wishlist">
                                                    <a href="#"><i class="far fa-heart" title="Wishlist"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="product-wrapper mb-50">
                                            <div class="product-img mb-25">
                                                <a href="product-details.html">
                                                    <img src="../picture/pro6.jpg" th:src="@{/picture/pro6.jpg}" alt="">
                                                    <img class="secondary-img" src="../picture/pro4.jpg" th:src="@{/picture/pro4.jpg}" alt="">
                                                </a>
                                                <div class="product-action text-center">
                                                    <a href="#" title="Shoppingb Cart">
                                                        <i class="flaticon-shopping-cart"></i>
                                                    </a>
                                                    <a href="#" title="Quick View">
                                                        <i class="flaticon-eye"></i>
                                                    </a>
                                                    <a href="#" data-toggle="tooltip" data-placement="right" title="Compare">
                                                        <i class="flaticon-compare"></i>
                                                    </a>
                                                </div>
                                                <div class="sale-tag">
                                                    <span class="new">new</span>
                                                    <span class="sale">sale</span>
                                                </div>
                                            </div>
                                            <div class="product-content">
                                                <div class="pro-cat mb-10">
                                                    <a href="shop.html">decor, </a>
                                                    <a href="shop.html">furniture</a>
                                                </div>
                                                <h4>
                                                    <a href="product-details.html">Minimal Troma Furniture</a>
                                                </h4>
                                                <div class="product-meta">
                                                    <div class="pro-price">
                                                        <span>$119.00 USD</span>
                                                        <span class="old-price">$230.00 USD</span>
                                                    </div>
                                                </div>
                                                <div class="product-wishlist">
                                                    <a href="#"><i class="far fa-heart" title="Wishlist"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="pro-item">
                                        <div class="product-wrapper mb-50">
                                            <div class="product-img mb-25">
                                                <a href="product-details.html">
                                                    <img src="../picture/pro8.jpg" th:src="@{/picture/pro8.jpg}" alt="">
                                                    <img class="secondary-img" src="../picture/pro6.jpg" th:src="@{/picture/pro6.jpg}" alt="">
                                                </a>
                                                <div class="product-action text-center">
                                                    <a href="#" title="Shoppingb Cart">
                                                        <i class="flaticon-shopping-cart"></i>
                                                    </a>
                                                    <a href="#" title="Quick View">
                                                        <i class="flaticon-eye"></i>
                                                    </a>
                                                    <a href="#" data-toggle="tooltip" data-placement="right" title="Compare">
                                                        <i class="flaticon-compare"></i>
                                                    </a>
                                                </div>
                                            </div>
                                            <div class="product-content">
                                                <div class="pro-cat mb-10">
                                                    <a href="shop.html">decor, </a>
                                                    <a href="shop.html">furniture</a>
                                                </div>
                                                <h4>
                                                    <a href="product-details.html">Minimal Troma Furniture</a>
                                                </h4>
                                                <div class="product-meta">
                                                    <div class="pro-price">
                                                        <span>$119.00 USD</span>
                                                        <span class="old-price">$230.00 USD</span>
                                                    </div>
                                                </div>
                                                <div class="product-wishlist">
                                                    <a href="#"><i class="far fa-heart" title="Wishlist"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="product-wrapper mb-50">
                                            <div class="product-img mb-25">
                                                <a href="product-details.html">
                                                    <img src="../picture/pro3.jpg" th:src="@{/picture/pro3.jpg}" alt="">
                                                    <img class="secondary-img" src="../picture/pro4.jpg" th:src="@{/picture/pro4.jpg}" alt="">
                                                </a>
                                                <div class="product-action text-center">
                                                    <a href="#" title="Shoppingb Cart">
                                                        <i class="flaticon-shopping-cart"></i>
                                                    </a>
                                                    <a href="#" title="Quick View">
                                                        <i class="flaticon-eye"></i>
                                                    </a>
                                                    <a href="#" data-toggle="tooltip" data-placement="right" title="Compare">
                                                        <i class="flaticon-compare"></i>
                                                    </a>
                                                </div>
                                                <div class="sale-tag">
                                                    <span class="sale">sale</span>
                                                </div>
                                            </div>
                                            <div class="product-content">
                                                <div class="pro-cat mb-10">
                                                    <a href="shop.html">decor, </a>
                                                    <a href="shop.html">furniture</a>
                                                </div>
                                                <h4>
                                                    <a href="product-details.html">Minimal Troma Furniture</a>
                                                </h4>
                                                <div class="product-meta">
                                                    <div class="pro-price">
                                                        <span>$119.00 USD</span>
                                                        <span class="old-price">$230.00 USD</span>
                                                    </div>
                                                </div>
                                                <div class="product-wishlist">
                                                    <a href="#"><i class="far fa-heart" title="Wishlist"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="pro-item">
                                        <div class="product-wrapper mb-50">
                                            <div class="product-img mb-25">
                                                <a href="product-details.html">
                                                    <img src="../picture/pro1.jpg" th:src="@{/picture/pro1.jpg}" alt="">
                                                    <img class="secondary-img" src="../picture/pro2.jpg" th:src="@{/picture/pro2.jpg}" alt="">
                                                </a>
                                                <div class="product-action text-center">
                                                    <a href="#" title="Shoppingb Cart">
                                                        <i class="flaticon-shopping-cart"></i>
                                                    </a>
                                                    <a href="#" title="Quick View">
                                                        <i class="flaticon-eye"></i>
                                                    </a>
                                                    <a href="#" data-toggle="tooltip" data-placement="right" title="Compare">
                                                        <i class="flaticon-compare"></i>
                                                    </a>
                                                </div>
                                                <div class="sale-tag">
                                                    <span class="new">new</span>
                                                    <span class="sale">sale</span>
                                                </div>
                                            </div>
                                            <div class="product-content">
                                                <div class="pro-cat mb-10">
                                                    <a href="shop.html">decor, </a>
                                                    <a href="shop.html">furniture</a>
                                                </div>
                                                <h4>
                                                    <a href="product-details.html">Minimal Troma Furniture</a>
                                                </h4>
                                                <div class="product-meta">
                                                    <div class="pro-price">
                                                        <span>$119.00 USD</span>
                                                        <span class="old-price">$230.00 USD</span>
                                                    </div>
                                                </div>
                                                <div class="product-wishlist">
                                                    <a href="#"><i class="far fa-heart" title="Wishlist"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="product-wrapper mb-50">
                                            <div class="product-img mb-25">
                                                <a href="product-details.html">
                                                    <img src="../picture/pro2.jpg" th:src="@{/picture/pro2.jpg}" alt="">
                                                    <img class="secondary-img" src="../picture/pro4.jpg" th:src="@{/picture/pro4.jpg}" alt="">
                                                </a>
                                                <div class="product-action text-center">
                                                    <a href="#" title="Shoppingb Cart">
                                                        <i class="flaticon-shopping-cart"></i>
                                                    </a>
                                                    <a href="#" title="Quick View">
                                                        <i class="flaticon-eye"></i>
                                                    </a>
                                                    <a href="#" data-toggle="tooltip" data-placement="right" title="Compare">
                                                        <i class="flaticon-compare"></i>
                                                    </a>
                                                </div>
                                                <div class="sale-tag">
                                                    <span class="new">30%</span>
                                                    <span class="sale">Sale</span>
                                                </div>
                                            </div>
                                            <div class="product-content">
                                                <div class="pro-cat mb-10">
                                                    <a href="shop.html">decor, </a>
                                                    <a href="shop.html">furniture</a>
                                                </div>
                                                <h4>
                                                    <a href="product-details.html">Minimal Troma Furniture</a>
                                                </h4>
                                                <div class="product-meta">
                                                    <div class="pro-price">
                                                        <span>$119.00 USD</span>
                                                        <span class="old-price">$230.00 USD</span>
                                                    </div>
                                                </div>
                                                <div class="product-wishlist">
                                                    <a href="#"><i class="far fa-heart" title="Wishlist"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="pro-item">
                                        <div class="product-wrapper mb-50">
                                            <div class="product-img mb-25">
                                                <a href="product-details.html">
                                                    <img src="../picture/pro3.jpg" th:src="@{/picture/pro3.jpg}" alt="">
                                                    <img class="secondary-img" src="../picture/pro6.jpg" th:src="@{/picture/pro6.jpg}" alt="">
                                                </a>
                                                <div class="product-action text-center">
                                                    <a href="#" title="Shoppingb Cart">
                                                        <i class="flaticon-shopping-cart"></i>
                                                    </a>
                                                    <a href="#" title="Quick View">
                                                        <i class="flaticon-eye"></i>
                                                    </a>
                                                    <a href="#" data-toggle="tooltip" data-placement="right" title="Compare">
                                                        <i class="flaticon-compare"></i>
                                                    </a>
                                                </div>
                                                <div class="sale-tag">
                                                    <span class="new">new</span>
                                                    <span class="sale">sale</span>
                                                </div>
                                            </div>
                                            <div class="product-content">
                                                <div class="pro-cat mb-10">
                                                    <a href="shop.html">decor, </a>
                                                    <a href="shop.html">furniture</a>
                                                </div>
                                                <h4>
                                                    <a href="product-details.html">Minimal Troma Furniture</a>
                                                </h4>
                                                <div class="product-meta">
                                                    <div class="pro-price">
                                                        <span>$119.00 USD</span>
                                                        <span class="old-price">$230.00 USD</span>
                                                    </div>
                                                </div>
                                                <div class="product-wishlist">
                                                    <a href="#"><i class="far fa-heart" title="Wishlist"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="product-wrapper mb-50">
                                            <div class="product-img mb-25">
                                                <a href="product-details.html">
                                                    <img src="../picture/pro4.jpg" th:src="@{/picture/pro4.jpg}" alt="">
                                                    <img class="secondary-img" src="../picture/pro8.jpg" th:src="@{/picture/pro8.jpg}" alt="">
                                                </a>
                                                <div class="product-action text-center">
                                                    <a href="#" title="Shoppingb Cart">
                                                        <i class="flaticon-shopping-cart"></i>
                                                    </a>
                                                    <a href="#" title="Quick View">
                                                        <i class="flaticon-eye"></i>
                                                    </a>
                                                    <a href="#" data-toggle="tooltip" data-placement="right" title="Compare">
                                                        <i class="flaticon-compare"></i>
                                                    </a>
                                                </div>
                                            </div>
                                            <div class="product-content">
                                                <div class="pro-cat mb-10">
                                                    <a href="shop.html">decor, </a>
                                                    <a href="shop.html">furniture</a>
                                                </div>
                                                <h4>
                                                    <a href="product-details.html">Minimal Troma Furniture</a>
                                                </h4>
                                                <div class="product-meta">
                                                    <div class="pro-price">
                                                        <span>$119.00 USD</span>
                                                        <span class="old-price">$230.00 USD</span>
                                                    </div>
                                                </div>
                                                <div class="product-wishlist">
                                                    <a href="#"><i class="far fa-heart" title="Wishlist"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="pro-item">
                                        <div class="product-wrapper mb-50">
                                            <div class="product-img mb-25">
                                                <a href="product-details.html">
                                                    <img src="../picture/pro5.jpg" th:src="@{/picture/pro5.jpg}" alt="">
                                                    <img class="secondary-img" src="../picture/pro2.jpg" th:src="@{/picture/pro2.jpg}" alt="">
                                                </a>
                                                <div class="product-action text-center">
                                                    <a href="#" title="Shoppingb Cart">
                                                        <i class="flaticon-shopping-cart"></i>
                                                    </a>
                                                    <a href="#" title="Quick View">
                                                        <i class="flaticon-eye"></i>
                                                    </a>
                                                    <a href="#" data-toggle="tooltip" data-placement="right" title="Compare">
                                                        <i class="flaticon-compare"></i>
                                                    </a>
                                                </div>
                                                <div class="sale-tag">
                                                    <span class="new">new</span>
                                                </div>
                                            </div>
                                            <div class="product-content">
                                                <div class="pro-cat mb-10">
                                                    <a href="shop.html">decor, </a>
                                                    <a href="shop.html">furniture</a>
                                                </div>
                                                <h4>
                                                    <a href="product-details.html">Minimal Troma Furniture</a>
                                                </h4>
                                                <div class="product-meta">
                                                    <div class="pro-price">
                                                        <span>$119.00 USD</span>
                                                        <span class="old-price">$230.00 USD</span>
                                                    </div>
                                                </div>
                                                <div class="product-wishlist">
                                                    <a href="#"><i class="far fa-heart" title="Wishlist"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="product-wrapper mb-50">
                                            <div class="product-img mb-25">
                                                <a href="product-details.html">
                                                    <img src="../picture/pro7.jpg" th:src="@{/picture/pro7.jpg}" alt="">
                                                    <img class="secondary-img" src="../picture/pro4.jpg" th:src="@{/picture/pro4.jpg}" alt="">
                                                </a>
                                                <div class="product-action text-center">
                                                    <a href="#" title="Shoppingb Cart">
                                                        <i class="flaticon-shopping-cart"></i>
                                                    </a>
                                                    <a href="#" title="Quick View">
                                                        <i class="flaticon-eye"></i>
                                                    </a>
                                                    <a href="#" data-toggle="tooltip" data-placement="right" title="Compare">
                                                        <i class="flaticon-compare"></i>
                                                    </a>
                                                </div>
                                                <div class="sale-tag">
                                                    <span class="sale">60%</span>
                                                </div>
                                            </div>
                                            <div class="product-content">
                                                <div class="pro-cat mb-10">
                                                    <a href="shop.html">decor, </a>
                                                    <a href="shop.html">furniture</a>
                                                </div>
                                                <h4>
                                                    <a href="product-details.html">Minimal Troma Furniture</a>
                                                </h4>
                                                <div class="product-meta">
                                                    <div class="pro-price">
                                                        <span>$119.00 USD</span>
                                                        <span class="old-price">$230.00 USD</span>
                                                    </div>
                                                </div>
                                                <div class="product-wishlist">
                                                    <a href="#"><i class="far fa-heart" title="Wishlist"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>

                                </div>
                            </div>
                            <div class="tab-pane fade" id="contact9" role="tabpanel" aria-labelledby="contact-tab1">
                                <div class="product-slider owl-carousel">
                                    <div class="pro-item">
                                        <div class="product-wrapper mb-50">
                                            <div class="product-img mb-25">
                                                <a href="product-details.html">
                                                    <img src="../picture/pro3.jpg" th:src="@{/picture/pro3.jpg}" alt="">
                                                    <img class="secondary-img" src="../picture/pro6.jpg" th:src="@{/picture/pro6.jpg}" alt="">
                                                </a>
                                                <div class="product-action text-center">
                                                    <a href="#" title="Shoppingb Cart">
                                                        <i class="flaticon-shopping-cart"></i>
                                                    </a>
                                                    <a href="#" title="Quick View">
                                                        <i class="flaticon-eye"></i>
                                                    </a>
                                                    <a href="#" data-toggle="tooltip" data-placement="right" title="Compare">
                                                        <i class="flaticon-compare"></i>
                                                    </a>
                                                </div>
                                                <div class="sale-tag">
                                                    <span class="new">new</span>
                                                    <span class="sale">sale</span>
                                                </div>
                                            </div>
                                            <div class="product-content">
                                                <div class="pro-cat mb-10">
                                                    <a href="shop.html">decor, </a>
                                                    <a href="shop.html">furniture</a>
                                                </div>
                                                <h4>
                                                    <a href="product-details.html">Minimal Troma Furniture</a>
                                                </h4>
                                                <div class="product-meta">
                                                    <div class="pro-price">
                                                        <span>$119.00 USD</span>
                                                        <span class="old-price">$230.00 USD</span>
                                                    </div>
                                                </div>
                                                <div class="product-wishlist">
                                                    <a href="#"><i class="far fa-heart" title="Wishlist"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="product-wrapper mb-50">
                                            <div class="product-img mb-25">
                                                <a href="product-details.html">
                                                    <img src="../picture/pro4.jpg" th:src="@{/picture/pro4.jpg}" alt="">
                                                    <img class="secondary-img" src="../picture/pro8.jpg" th:src="@{/picture/pro8.jpg}" alt="">
                                                </a>
                                                <div class="product-action text-center">
                                                    <a href="#" title="Shoppingb Cart">
                                                        <i class="flaticon-shopping-cart"></i>
                                                    </a>
                                                    <a href="#" title="Quick View">
                                                        <i class="flaticon-eye"></i>
                                                    </a>
                                                    <a href="#" data-toggle="tooltip" data-placement="right" title="Compare">
                                                        <i class="flaticon-compare"></i>
                                                    </a>
                                                </div>
                                            </div>
                                            <div class="product-content">
                                                <div class="pro-cat mb-10">
                                                    <a href="shop.html">decor, </a>
                                                    <a href="shop.html">furniture</a>
                                                </div>
                                                <h4>
                                                    <a href="product-details.html">Minimal Troma Furniture</a>
                                                </h4>
                                                <div class="product-meta">
                                                    <div class="pro-price">
                                                        <span>$119.00 USD</span>
                                                        <span class="old-price">$230.00 USD</span>
                                                    </div>
                                                </div>
                                                <div class="product-wishlist">
                                                    <a href="#"><i class="far fa-heart" title="Wishlist"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="pro-item">
                                        <div class="product-wrapper mb-50">
                                            <div class="product-img mb-25">
                                                <a href="product-details.html">
                                                    <img src="../picture/pro5.jpg" th:src="@{/picture/pro5.jpg}" alt="">
                                                    <img class="secondary-img" src="../picture/pro2.jpg" th:src="@{/picture/pro2.jpg}" alt="">
                                                </a>
                                                <div class="product-action text-center">
                                                    <a href="#" title="Shoppingb Cart">
                                                        <i class="flaticon-shopping-cart"></i>
                                                    </a>
                                                    <a href="#" title="Quick View">
                                                        <i class="flaticon-eye"></i>
                                                    </a>
                                                    <a href="#" data-toggle="tooltip" data-placement="right" title="Compare">
                                                        <i class="flaticon-compare"></i>
                                                    </a>
                                                </div>
                                                <div class="sale-tag">
                                                    <span class="new">new</span>
                                                </div>
                                            </div>
                                            <div class="product-content">
                                                <div class="pro-cat mb-10">
                                                    <a href="shop.html">decor, </a>
                                                    <a href="shop.html">furniture</a>
                                                </div>
                                                <h4>
                                                    <a href="product-details.html">Minimal Troma Furniture</a>
                                                </h4>
                                                <div class="product-meta">
                                                    <div class="pro-price">
                                                        <span>$119.00 USD</span>
                                                        <span class="old-price">$230.00 USD</span>
                                                    </div>
                                                </div>
                                                <div class="product-wishlist">
                                                    <a href="#"><i class="far fa-heart" title="Wishlist"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="product-wrapper mb-50">
                                            <div class="product-img mb-25">
                                                <a href="product-details.html">
                                                    <img src="../picture/pro7.jpg" th:src="@{/picture/pro3.jpg}" alt="">
                                                    <img class="secondary-img" src="../picture/pro4.jpg" th:src="@{/picture/pro3.jpg}" alt="">
                                                </a>
                                                <div class="product-action text-center">
                                                    <a href="#" title="Shoppingb Cart">
                                                        <i class="flaticon-shopping-cart"></i>
                                                    </a>
                                                    <a href="#" title="Quick View">
                                                        <i class="flaticon-eye"></i>
                                                    </a>
                                                    <a href="#" data-toggle="tooltip" data-placement="right" title="Compare">
                                                        <i class="flaticon-compare"></i>
                                                    </a>
                                                </div>
                                                <div class="sale-tag">
                                                    <span class="sale">60%</span>
                                                </div>
                                            </div>
                                            <div class="product-content">
                                                <div class="pro-cat mb-10">
                                                    <a href="shop.html">decor, </a>
                                                    <a href="shop.html">furniture</a>
                                                </div>
                                                <h4>
                                                    <a href="product-details.html">Minimal Troma Furniture</a>
                                                </h4>
                                                <div class="product-meta">
                                                    <div class="pro-price">
                                                        <span>$119.00 USD</span>
                                                        <span class="old-price">$230.00 USD</span>
                                                    </div>
                                                </div>
                                                <div class="product-wishlist">
                                                    <a href="#"><i class="far fa-heart" title="Wishlist"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="pro-item">
                                        <div class="product-wrapper mb-50">
                                            <div class="product-img mb-25">
                                                <a href="product-details.html">
                                                    <img src="../picture/pro1.jpg" th:src="@{/picture/pro3.jpg}" alt="">
                                                    <img class="secondary-img" src="../picture/pro2.jpg" th:src="@{/picture/pro3.jpg}" alt="">
                                                </a>
                                                <div class="product-action text-center">
                                                    <a href="#" title="Shoppingb Cart">
                                                        <i class="flaticon-shopping-cart"></i>
                                                    </a>
                                                    <a href="#" title="Quick View">
                                                        <i class="flaticon-eye"></i>
                                                    </a>
                                                    <a href="#" data-toggle="tooltip" data-placement="right" title="Compare">
                                                        <i class="flaticon-compare"></i>
                                                    </a>
                                                </div>
                                                <div class="sale-tag">
                                                    <span class="new">new</span>
                                                    <span class="sale">sale</span>
                                                </div>
                                            </div>
                                            <div class="product-content">
                                                <div class="pro-cat mb-10">
                                                    <a href="shop.html">decor, </a>
                                                    <a href="shop.html">furniture</a>
                                                </div>
                                                <h4>
                                                    <a href="product-details.html">Minimal Troma Furniture</a>
                                                </h4>
                                                <div class="product-meta">
                                                    <div class="pro-price">
                                                        <span>$119.00 USD</span>
                                                        <span class="old-price">$230.00 USD</span>
                                                    </div>
                                                </div>
                                                <div class="product-wishlist">
                                                    <a href="#"><i class="far fa-heart" title="Wishlist"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="product-wrapper mb-50">
                                            <div class="product-img mb-25">
                                                <a href="product-details.html">
                                                    <img src="../picture/pro2.jpg" th:src="@{/picture/pro3.jpg}" alt="">
                                                    <img class="secondary-img" src="../picture/pro4.jpg" th:src="@{/picture/pro3.jpg}" alt="">
                                                </a>
                                                <div class="product-action text-center">
                                                    <a href="#" title="Shoppingb Cart">
                                                        <i class="flaticon-shopping-cart"></i>
                                                    </a>
                                                    <a href="#" title="Quick View">
                                                        <i class="flaticon-eye"></i>
                                                    </a>
                                                    <a href="#" data-toggle="tooltip" data-placement="right" title="Compare">
                                                        <i class="flaticon-compare"></i>
                                                    </a>
                                                </div>
                                                <div class="sale-tag">
                                                    <span class="new">30%</span>
                                                    <span class="sale">Sale</span>
                                                </div>
                                            </div>
                                            <div class="product-content">
                                                <div class="pro-cat mb-10">
                                                    <a href="shop.html">decor, </a>
                                                    <a href="shop.html">furniture</a>
                                                </div>
                                                <h4>
                                                    <a href="product-details.html">Minimal Troma Furniture</a>
                                                </h4>
                                                <div class="product-meta">
                                                    <div class="pro-price">
                                                        <span>$119.00 USD</span>
                                                        <span class="old-price">$230.00 USD</span>
                                                    </div>
                                                </div>
                                                <div class="product-wishlist">
                                                    <a href="#"><i class="far fa-heart" title="Wishlist"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="pro-item">
                                        <div class="product-wrapper mb-50">
                                            <div class="product-img mb-25">
                                                <a href="product-details.html">
                                                    <img src="../picture/pro8.jpg" th:src="@{/picture/pro3.jpg}" alt="">
                                                    <img class="secondary-img" src="../picture/pro1.jpg" th:src="@{/picture/pro3.jpg}" alt="">
                                                </a>
                                                <div class="product-action text-center">
                                                    <a href="#" title="Shoppingb Cart">
                                                        <i class="flaticon-shopping-cart"></i>
                                                    </a>
                                                    <a href="#" title="Quick View">
                                                        <i class="flaticon-eye"></i>
                                                    </a>
                                                    <a href="#" data-toggle="tooltip" data-placement="right" title="Compare">
                                                        <i class="flaticon-compare"></i>
                                                    </a>
                                                </div>
                                            </div>
                                            <div class="product-content">
                                                <div class="pro-cat mb-10">
                                                    <a href="shop.html">decor, </a>
                                                    <a href="shop.html">furniture</a>
                                                </div>
                                                <h4>
                                                    <a href="product-details.html">Minimal Troma Furniture</a>
                                                </h4>
                                                <div class="product-meta">
                                                    <div class="pro-price">
                                                        <span>$119.00 USD</span>
                                                        <span class="old-price">$230.00 USD</span>
                                                    </div>
                                                </div>
                                                <div class="product-wishlist">
                                                    <a href="#"><i class="far fa-heart" title="Wishlist"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="product-wrapper mb-50">
                                            <div class="product-img mb-25">
                                                <a href="product-details.html">
                                                    <img src="../picture/pro6.jpg" th:src="@{/picture/pro6.jpg}" alt="">
                                                    <img class="secondary-img" src="./picture/pro4.jpg" th:src="@{/picture/pro3.jpg}" alt="">
                                                </a>
                                                <div class="product-action text-center">
                                                    <a href="#" title="Shoppingb Cart">
                                                        <i class="flaticon-shopping-cart"></i>
                                                    </a>
                                                    <a href="#" title="Quick View">
                                                        <i class="flaticon-eye"></i>
                                                    </a>
                                                    <a href="#" data-toggle="tooltip" data-placement="right" title="Compare">
                                                        <i class="flaticon-compare"></i>
                                                    </a>
                                                </div>
                                                <div class="sale-tag">
                                                    <span class="new">new</span>
                                                    <span class="sale">sale</span>
                                                </div>
                                            </div>
                                            <div class="product-content">
                                                <div class="pro-cat mb-10">
                                                    <a href="shop.html">decor, </a>
                                                    <a href="shop.html">furniture</a>
                                                </div>
                                                <h4>
                                                    <a href="product-details.html">Minimal Troma Furniture</a>
                                                </h4>
                                                <div class="product-meta">
                                                    <div class="pro-price">
                                                        <span>$119.00 USD</span>
                                                        <span class="old-price">$230.00 USD</span>
                                                    </div>
                                                </div>
                                                <div class="product-wishlist">
                                                    <a href="#"><i class="far fa-heart" title="Wishlist"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="pro-item">
                                        <div class="product-wrapper mb-50">
                                            <div class="product-img mb-25">
                                                <a href="product-details.html">
                                                    <img src="./picture/pro8.jpg" th:src="@{/picture/pro3.jpg}" alt="">
                                                    <img class="secondary-img" src="./picture/pro6.jpg" th:src="@{/picture/pro3.jpg}" alt="">
                                                </a>
                                                <div class="product-action text-center">
                                                    <a href="#" title="Shoppingb Cart">
                                                        <i class="flaticon-shopping-cart"></i>
                                                    </a>
                                                    <a href="#" title="Quick View">
                                                        <i class="flaticon-eye"></i>
                                                    </a>
                                                    <a href="#" data-toggle="tooltip" data-placement="right" title="Compare">
                                                        <i class="flaticon-compare"></i>
                                                    </a>
                                                </div>
                                            </div>
                                            <div class="product-content">
                                                <div class="pro-cat mb-10">
                                                    <a href="shop.html">decor, </a>
                                                    <a href="shop.html">furniture</a>
                                                </div>
                                                <h4>
                                                    <a href="product-details.html">Minimal Troma Furniture</a>
                                                </h4>
                                                <div class="product-meta">
                                                    <div class="pro-price">
                                                        <span>$119.00 USD</span>
                                                        <span class="old-price">$230.00 USD</span>
                                                    </div>
                                                </div>
                                                <div class="product-wishlist">
                                                    <a href="#"><i class="far fa-heart" title="Wishlist"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="product-wrapper mb-50">
                                            <div class="product-img mb-25">
                                                <a href="product-details.html">
                                                    <img src="./picture/pro3.jpg" alt="">
                                                    <img class="secondary-img" src="./picture/pro4.jpg" alt="">
                                                </a>
                                                <div class="product-action text-center">
                                                    <a href="#" title="Shoppingb Cart">
                                                        <i class="flaticon-shopping-cart"></i>
                                                    </a>
                                                    <a href="#" title="Quick View">
                                                        <i class="flaticon-eye"></i>
                                                    </a>
                                                    <a href="#" data-toggle="tooltip" data-placement="right" title="Compare">
                                                        <i class="flaticon-compare"></i>
                                                    </a>
                                                </div>
                                                <div class="sale-tag">
                                                    <span class="sale">sale</span>
                                                </div>
                                            </div>
                                            <div class="product-content">
                                                <div class="pro-cat mb-10">
                                                    <a href="shop.html">decor, </a>
                                                    <a href="shop.html">furniture</a>
                                                </div>
                                                <h4>
                                                    <a href="product-details.html">Minimal Troma Furniture</a>
                                                </h4>
                                                <div class="product-meta">
                                                    <div class="pro-price">
                                                        <span>$119.00 USD</span>
                                                        <span class="old-price">$230.00 USD</span>
                                                    </div>
                                                </div>
                                                <div class="product-wishlist">
                                                    <a href="#"><i class="far fa-heart" title="Wishlist"></i></a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- product-area end -->

    <!-- features-area start -->
    <section class="features-area box-90">
        <div class="container-fluid">
            <div class="theme-soft-bg fix pt-100 pb-50">
                <div class="row">
                    <div class="col-xl-12">
                        <div class="area-title text-center mb-50">
                            <h2>Special Features</h2>
                            <p>Get special services from our shop.</p>
                        </div>
                    </div>
                </div>
                <div class="features">
                    <div class="single-seatures width-20 mb-50 text-center">
                        <i class="flaticon-shopping-cart-1"></i>
                        <span>Free Delivery</span>
                        <h3>Free Delivery</h3>
                    </div>
                    <div class="single-seatures width-20 mb-50 text-center">
                        <i class="flaticon-good"></i>
                        <span>100% Customer</span>
                        <h3>Feedbacks</h3>
                    </div>
                    <div class="single-seatures width-20 mb-50 text-center">
                        <i class="flaticon-return-1"></i>
                        <span>10 Days</span>
                        <h3>For Free Return</h3>
                    </div>
                    <div class="single-seatures width-20 mb-50 text-center">
                        <i class="flaticon-return"></i>
                        <span>Payment</span>
                        <h3>Secure System</h3>
                    </div>
                    <div class="single-seatures width-20 mb-50 text-center">
                        <i class="flaticon-customer-service"></i>
                        <span>24/7</span>
                        <h3>Online Supports</h3>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- features-area end -->


    <!-- latest-blog-area start -->
    <section class="latest-blog-area pt-95 pb-60 box-90">
        <div class="container-fluid">
            <div class="row">
                <div class="col-xl-12">
                    <div class="area-title text-center mb-50">
                        <h2>News Feeds</h2>
                        <p>Check it out every updates</p>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-xl-4 col-lg-6 col-md-6">
                    <div class="latest-news mb-40">
                        <div class="news__thumb mb-25">
                            <img src="./picture/lb1.jpg" th:src="@{/picture/lb1.jpg}" alt="">
                        </div>
                        <div class="news__caption white-bg">
                            <div class="news-meta mb-15">
                                <span><i class="far fa-calendar-check"></i> Sep 15, 2018 </span>
                                <span><a href="#"><i class="far fa-user"></i> Diboli</a></span>
                                <span><a href="#"><i class="far fa-comments"></i> 23 Comments</a></span>
                            </div>
                            <h2><a href="blog-details.html">Inspiration Is Under Construction Business &
                                Fashion 2019. In this situation we do that..</a></h2>
                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna
                                aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo..</p>
                        </div>
                    </div>
                </div>
                <div class="col-xl-4 col-lg-6 col-md-6">
                    <div class="latest-news mb-40">
                        <div class="news__thumb mb-25">
                            <img src="./picture/lb2.jpg" th:src="@{/picture/lb2.jpg}" alt="">
                        </div>
                        <div class="news__caption white-bg">
                            <div class="news-meta mb-15">
                                <span><i class="far fa-calendar-check"></i> Sep 15, 2018 </span>
                                <span><a href="#"><i class="far fa-user"></i> Joly</a></span>
                                <span><a href="#"><i class="far fa-comments"></i> 23 Comments</a></span>
                            </div>
                            <h2><a href="blog-details.html">Inspiration Is Under Construction Business &
                                Fashion 2019. In this situation we do that..</a></h2>
                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna
                                aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo..</p>
                        </div>
                    </div>
                </div>
                <div class="col-xl-4 col-lg-6 col-md-6">
                    <div class="latest-news mb-40">
                        <div class="news__thumb mb-25">
                            <img src="./picture/lb2.jpg" th:src="@{/picture/lb2.jpg}" alt="">
                        </div>
                        <div class="news__caption white-bg">
                            <div class="news-meta mb-15">
                                <span><i class="far fa-calendar-check"></i> Sep 15, 2018 </span>
                                <span><a href="#"><i class="far fa-user"></i> Joly</a></span>
                                <span><a href="#"><i class="far fa-comments"></i> 23 Comments</a></span>
                            </div>
                            <h2><a href="blog-details.html">Inspiration Is Under Construction Business &
                                Fashion 2019. In this situation we do that..</a></h2>
                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna
                                aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo..</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- latest-blog-area end -->

    <!-- subscribe-area start -->
    <section class="subscribe-area box-105">
        <div class="subscribe-inner black-bg pt-70 pb-20">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-xl-5">
                        <div class="subscribe d-flex fix">
                            <div class="subscribe-icon">
                                <img src="./picture/subscribe.png" alt="">
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
                                    <input type="text" placeholder="Enter your email address">
                                    <button class="btn theme-btn" type="submit">立即订阅</button>
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
`;

let Home = {
  template: template
};