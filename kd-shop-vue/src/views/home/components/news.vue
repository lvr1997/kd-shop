<template>
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
                <img src="@/static/picture/lb1.jpg" alt="" />
              </div>
              <div class="news__caption white-bg">
                <div class="news-meta mb-15">
                  <span
                    ><i class="far fa-calendar-check"></i> Sep 15, 2018
                  </span>
                  <span
                    ><a href="#"><i class="far fa-user"></i> Diboli</a></span
                  >
                  <span
                    ><a href="#"
                      ><i class="far fa-comments"></i> 23 Comments</a
                    ></span
                  >
                </div>
                <h2>
                  <a href="blog-details.html"
                    >Inspiration Is Under Construction Business & Fashion 2019.
                    In this situation we do that..</a
                  >
                </h2>
                <p>
                  Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed
                  do eiusmod tempor incididunt ut labore et dolore magna aliqua.
                  Ut enim ad minim veniam, quis nostrud exercitation ullamco
                  laboris nisi ut aliquip ex ea commodo..
                </p>
              </div>
            </div>
          </div>
          <div class="col-xl-4 col-lg-6 col-md-6">
            <div class="latest-news mb-40">
              <div class="news__thumb mb-25">
                <img src="@/static/picture/lb2.jpg" alt="" />
              </div>
              <div class="news__caption white-bg">
                <div class="news-meta mb-15">
                  <span
                    ><i class="far fa-calendar-check"></i> Sep 15, 2018
                  </span>
                  <span
                    ><a href="#"><i class="far fa-user"></i> Joly</a></span
                  >
                  <span
                    ><a href="#"
                      ><i class="far fa-comments"></i> 23 Comments</a
                    ></span
                  >
                </div>
                <h2>
                  <a href="blog-details.html"
                    >Inspiration Is Under Construction Business & Fashion 2019.
                    In this situation we do that..</a
                  >
                </h2>
                <p>
                  Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed
                  do eiusmod tempor incididunt ut labore et dolore magna aliqua.
                  Ut enim ad minim veniam, quis nostrud exercitation ullamco
                  laboris nisi ut aliquip ex ea commodo..
                </p>
              </div>
            </div>
          </div>
          <div class="col-xl-4 col-lg-6 col-md-6">
            <div class="latest-news mb-40">
              <div class="news__thumb mb-25">
                <img src="@/static/picture/lb2.jpg" alt="" />
              </div>
              <div class="news__caption white-bg">
                <div class="news-meta mb-15">
                  <span
                    ><i class="far fa-calendar-check"></i> Sep 15, 2018
                  </span>
                  <span
                    ><a href="#"><i class="far fa-user"></i> Joly</a></span
                  >
                  <span
                    ><a href="#"
                      ><i class="far fa-comments"></i> 23 Comments</a
                    ></span
                  >
                </div>
                <h2>
                  <a href="blog-details.html"
                    >Inspiration Is Under Construction Business & Fashion 2019.
                    In this situation we do that..</a
                  >
                </h2>
                <p>
                  Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed
                  do eiusmod tempor incididunt ut labore et dolore magna aliqua.
                  Ut enim ad minim veniam, quis nostrud exercitation ullamco
                  laboris nisi ut aliquip ex ea commodo..
                </p>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>
    <!-- latest-blog-area end -->
</template>

<script>
export default {

}
</script>

<style scoped>
/* 21. Blog */

.latest-news {

  position: relative; }



.news__thumb img {

  width: 100%; }

.postbox__thumb img {

	width: 100%;

}

.blog-inner-img img{

	width: 100%;

}

.news-meta span {

	font-weight: 500;

	letter-spacing: 2px;

	text-transform: uppercase;

	color: #747691;

	margin-right: 15px;

	font-size: 13px;

}

.news-meta span a {

	color: #747691;

}

.news-meta span a:hover {

	color: #fe4536;

}

.news__caption h2 {

	font-size: 24px;

	margin-bottom: 15px;

	line-height: 1.4;

}

      .news__caption h2 a:hover {

		color: #fe4536;

	}



.news-link {

  font-size: 12px;

  color: #e4ecf3;

  font-weight: 500;

  text-transform: uppercase;

  letter-spacing: 2px; }

  .news-link:hover {

    color: #ffffff; }



.news-link i {

  transition: .3s;

  display: inline-block; }



.news-link:hover i {

  transform: translateX(3px); }



.news__thumb-2 img {

  width: 100%;

}



.news__caption-2 {

  padding: 33px;

}



.news__caption-2 h2 {

  font-size: 20px;

  margin-bottom: 15px;

}



.news__caption-2 h2 a:hover {

  color: #fe4536;

}



.news__caption-2 p {

  margin-bottom: 0;

}



.news-meta span {

  text-transform: uppercase;

  margin-right: 25px;

  font-size: 13px;

}



@media only screen and (min-width: 992px) and (max-width: 1200px) {

  .news-meta span {

    margin-right: 10px;

  }

}



.news-meta span a {

  color: #fe4536;

  letter-spacing: 2px;

  font-weight: 500;

}



.news-meta span a:hover {

  color: #6100b3;

}



.postbox__thumb {

  position: relative;

}



.postbox__thumb a img {

  max-width: 100%;

}



.post-meta span {

  font-size: 12px;

  letter-spacing: 2px;

  font-weight: 500;

  text-transform: uppercase;

  color: #6f7172;

  margin-right: 20px;

}



@media (max-width: 767px) {

  .post-meta span {

    margin-right: 10px;

  }

}



.post-meta span a:hover {

  color: #84b77c;

}



.post-meta span i {

	color: #84b77c;

	margin-right: 2px;

}



.postbox__text {

  background: #faf9ff;

}



.p-50 {

  padding: 50px;

}



@media only screen and (min-width: 992px) and (max-width: 1200px) {

  .p-50 {

    padding: 30px;

  }

}



@media (max-width: 767px) {

  .p-50 {

    padding: 30px;

  }

}



.p-30 {

  padding: 30px;

}



.post-meta {

	margin-bottom: 20px;

}



.blog-title {

	font-size: 28px;

	line-height: 1.3;

	margin-bottom: 20px;

}



.blog-title a:hover {

  color: #fe4536;

}



.read-more {

  letter-spacing: 2px;

  font-size: 12px;

  text-transform: uppercase;

  font-weight: 500;

}



.read-more:hover {

  color: #fe4536;

}



.read-more i {

  transition: .3s;

  display: inline-block;

}



.read-more:hover i {

  transform: translateX(5px);

}

</style>