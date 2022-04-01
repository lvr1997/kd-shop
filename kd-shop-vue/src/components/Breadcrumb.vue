<template>
  <!-- breadcrumb-area-start -->
  <section class="breadcrumb-area">
    <div class="container">
      <div class="row">
        <div class="col-xl-12">
          <div class="breadcrumb-text text-center">
            <h1>{{ title }}</h1>
            <ul class="breadcrumb-menu">
              <li v-for="(item, index) in nav" :key="index">
                <span>{{ item }}</span>
              </li>
            </ul>
          </div>
        </div>
      </div>
    </div>
  </section>
  <!-- breadcrumb-area-end -->
</template>

<script>
export default {
  props: {
    title: {
      type: String,
      required: true,
      default: "Home",
    },
    nav: {
      type: Array,
      required: true,
    },
  },
};
</script>

<style scoped>
/* 12. Breadcrumb */

.breadcrumb-area {
  background-position: center center;

  background-size: cover;

  padding: 120px 0;
}

.breadcrumb-text {
  position: relative;

  z-index: 1;
}

.breadcrumb-text > h1 {
  font-size: 60px;

  margin-bottom: 30px;
}

.breadcrumb-text p {
  font-size: 26px;

  color: #637595;

  margin-bottom: 50px;
}

.breadcrumb-menu {
  display: inline-block;

  border-radius: 0;

  padding: 24px 42px;

  background: #ffffff;

  line-height: 1;
}

.breadcrumb-menu li {
  display: inline-block;

  position: relative;

  padding: 0 13px;
}

.breadcrumb-menu li a {
  color: #525470;

  font-size: 14px;

  text-transform: uppercase;

  transition: all 0.3s ease 0s;

  letter-spacing: 2px;

  font-weight: 500;
}

.breadcrumb-menu li::before {
  background: #c4c5d5;

  display: inline-block;

  left: -4px;

  padding-bottom: 0;

  position: absolute;

  top: -2px;

  height: 17px;

  width: 2px;

  content: "";
}

.breadcrumb-menu li:first-child::before {
  display: none;
}

.breadcrumb-menu span {
  color: #abadc5;

  font-size: 14px;

  font-weight: 500;

  text-transform: uppercase;

  transition: all 0.3s ease 0s;

  letter-spacing: 2px;
}


</style>