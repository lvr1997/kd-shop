<template>
   <!-- banner area start -->
    <section class="banner-area pt-30 pl-15 pr-15">
      <div class="container-fluid">
        <div class="row">
          <div class="col-lg-4 col-md-6">
            <div class="banner mb-30">
              <a href="shop.html"
                ><img src="@/static/picture/banner11.jpg" alt=""
              /></a>
            </div>
          </div>
          <div class="col-lg-4 col-md-6">
            <div class="banner mb-30">
              <a href="shop.html"
                ><img src="@/static/picture/banner21.jpg" alt=""
              /></a>
            </div>
          </div>
          <div class="col-lg-4 col-md-6">
            <div class="banner mb-30">
              <a href="shop.html"
                ><img src="@/static/picture/banner32.jpg" alt=""
              /></a>
            </div>
          </div>
        </div>
      </div>
    </section>
    <!-- banner area end -->
</template>

<script>
export default {

}
</script>

<style scoped>
/* 4. Banner */
.banner {
  overflow: hidden;
}

.banner:hover img {
  transform: scale(1.05);
}

.banner-trend {
  position: absolute;

  bottom: 45px;

  left: 45px;

  right: 45px;

  background: #fff;

  padding: 45px;
}

.banner-trend span {
  font-size: 14px;

  letter-spacing: 2px;

  text-transform: uppercase;

  font-weight: 500;

  color: #84b77c;

  display: block;

  margin-bottom: 10px;
}

.banner-trend h2 {
  font-size: 30px;
}

.banner-trend h2 a:hover {
  color: #fe4536;
}

.discover-link a {
  color: #fe4536;

  text-transform: uppercase;

  font-weight: 500;

  letter-spacing: 2px;
}

.discover-link a:hover {
  color: #84b77c;
}

.discover-link {
  position: absolute;

  right: 45px;

  top: 50%;

  transform: translateY(-50%);
}

.banner-look {
  position: absolute;

  top: 40px;

  right: 40px;

  background: #fff;

  padding: 40px;

  border-top: 3px solid #84b77c;

  width: 410px;
}

.banner-look span {
  font-size: 14px;

  letter-spacing: 2px;

  text-transform: uppercase;

  font-weight: 500;

  color: #84b77c;

  display: block;

  margin-bottom: 10px;
}

.banner-look h2 {
  font-size: 40px;

  margin-bottom: 15px;
}

.banner-look img {
  display: block;

  margin-bottom: 15px;
}

.banner-look p {
  margin-bottom: 20px;
}

</style>