/**
 * 组件注册
 *
 */
//商品组件
var productInfo =  {
    template: `
        <div class="product-wrapper mb-50">
            <div class="product-img mb-25">
                <a href="product-details.html">
                    <img src="../picture/pro1.jpg" th:src="@{/picture/pro1.jpg}" alt="">
                </a>
                <div class="product-action text-center">
                    <a href="#" title="查看大图">
                        <i class="flaticon-eye"></i>
                    </a>
                    <a href="#" data-toggle="tooltip" data-placement="right" title="Compare">
                        <i class="flaticon-compare"></i>
                    </a>
                    <a href="#" title="已被3人收藏">
                        <i class="far fa-heart"></i>
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
                <h4>
                    <a href="product-details.html">闲置名称</a>
                </h4>
                <div class="product-meta">
                    <div class="pro-price">
                        <span>售价</span>
                        <span class="old-price">原价</span>
                    </div>
                </div>
                <div class="product-wishlist">
                    <a href="#"><i class="far fa-heart" title="Wishlist"></i></a>
                </div>
            </div>
        </div>
    `,
    data() {
        return {

        }
    }
};

//整个vue根实例
const app = new Vue({
    components: {
        productInfo
    }
}).$mount('#app');
