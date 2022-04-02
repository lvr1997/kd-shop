<template>
  <main>
    <!-- breadcrumb-area-start -->
    <Breadcrumb :title="title" :nav="nav"></Breadcrumb>
    <!-- breadcrumb-area-end -->

    <!-- contact-form-area start -->
    <section class="contact-form-area grey-bg pt-100 pb-100">
      <div class="container">
        <div class="form-wrapper">
          <div class="row align-items-center">
            <div class="col-xl-8 col-lg-8">
              <div class="section-title mb-55">
                <p><span></span> Anything On your Mind</p>
                <h1>意见反馈</h1>
              </div>
            </div>
            <div class="col-xl-4 col-lg-3 d-none d-xl-block">
              <div class="section-link mb-80 text-right">
                <a class="btn theme-btn" href="#"
                  > make call</a
                >
              </div>
            </div>
          </div>
          <div class="contact-form">
            <form id="contact-form" action="#">
              <div class="row">
                <div class="col-lg-6">
                  <div class="form-box user-icon mb-30">
                    <input type="text" name="name" placeholder="Your Name" />
                  </div>
                </div>
                <div class="col-lg-6">
                  <div class="form-box email-icon mb-30">
                    <input type="text" name="email" placeholder="Your Email" />
                  </div>
                </div>
                <div class="col-lg-6">
                  <div class="form-box phone-icon mb-30">
                    <input type="text" name="phone" placeholder="Your Phone" />
                  </div>
                </div>
                <div class="col-lg-6">
                  <div class="form-box subject-icon mb-30">
                    <input
                      type="text"
                      name="subject"
                      placeholder="Your Subject"
                    />
                  </div>
                </div>
                <div class="col-lg-12">
                  <div class="form-box message-icon mb-30">
                    <textarea
                      name="message"
                      id="message"
                      cols="30"
                      rows="10"
                      placeholder="Your Message"
                    ></textarea>
                  </div>
                  <div class="contact-btn text-center">
                    <button class="btn theme-btn" type="submit">
                      get action
                    </button>
                  </div>
                </div>
              </div>
            </form>
            <p class="ajax-response text-center"></p>
          </div>
        </div>
      </div>
    </section>
    <!-- contact-form-area end -->
  </main>
</template>

<script>
import Breadcrumb from "@/components/Breadcrumb.vue";
export default {
  data() {
    return {
      title: "联系我们",
      nav: ["Home", "Contact"],
    };
  },
  components: {
    Breadcrumb,
  },
};
</script>

<style scoped>
.contact {
	border: 1px solid #eaedff;
	padding: 40px 10px;
}

.contact-area {
  background-position: center center;
  background-repeat: no-repeat;
}

.contact i {
	background: #84b77c;
	font-size: 40px;

	height: 150px;

	width: 150px;

	color: #ffffff;

	border-radius: 50%;

	line-height: 135px;

	border: 10px solid #fff;

	box-shadow: 0px 16px 32px 0px rgba(206, 226, 255, 0.4);

	margin-bottom: 30px;

}

.contact h3 {

	font-size: 26px;

	margin-bottom: 15px;

}



.contact p {

  margin: 0;

  padding: 0 50px;

}

@media only screen and (min-width: 992px) and (max-width: 1200px) {
  .contact p {
    padding: 0 10px;
  }
}

@media only screen and (min-width: 768px) and (max-width: 991px) {
  .contact p {
    padding: 0 0px;
  }
}

.contact-form input {

  background: #ffffff;

  height: 80px;

  width: 100%;

  padding: 0 80px;

  padding-right: 30px;

  border: 0;

  color: #aab5ca;

  font-weight: 500;

  letter-spacing: 2px;

  text-transform: uppercase;

}

.contact-form textarea {

  color: #aab5ca;

  font-weight: 500;

  letter-spacing: 2px;

  text-transform: uppercase;

  height: 300px;

  width: 100%;

  padding: 30px 80px;

  border: 0;

}

.contact-form input::-moz-placeholder, .contact-form input::placeholder {

  color: #aab5ca;

}

.contact-form textarea::-moz-placeholder, .contact-form textarea::placeholder {

  color: #aab5ca;

}

.contact-map {

  height: 670px;

  width: 100%;

}

</style>
