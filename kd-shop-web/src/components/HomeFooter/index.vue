<template>
  <!-- footer -->
  <el-footer>
    <div class="footer-bottom-wrap">
      <div class="footer-bottom">
        <p class="tips">本站所有信息均为用户自由发布，本站不对信息的真实性负任何责任，交易时请注意识别信息的真假如有网站内容侵害了您的权益请联系我们删除</p>
        <p class="right">
          <span>Copyright © 2017-2018, kd-shop, All Rights Reserved</span>
        </p>
      </div>
    </div>
  </el-footer>
</template>

<script>
  export default {
    name: "HomeFooter"
  }
</script>

<style lang="scss" scoped>
  .el-footer {
    height: 180px !important;
    border-top: 1px solid #F2F2F2;
  }
  .footer-bottom-wrap {
    background-color: #fff;
    min-width: 1100px;
    .footer-bottom {
      width: 1100px;
      margin: 0 auto;
      padding-top: 20px;
      p {
        margin-top: 15px;
        font-size: 13px;
        color: #A9AAAA;
      }
    }
  }
</style>
