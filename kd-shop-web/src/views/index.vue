<template>
  <div>
    <home-header></home-header>
    <el-container>
      <!-- main start -->
      <el-main>
        <div class="main-search">
          <el-input placeholder="请输入内容" v-model="searchKey.name" class="input-with-select">
            <el-select v-model="searchKey.catelogId" slot="prepend" placeholder="请选择">
              <el-option v-for="item in catelogs" :key="item.id" :label="item.name" :value="item.id"/>
            </el-select>
            <el-button slot="append" icon="el-icon-search" />
          </el-input>
        </div>
        <el-button type="primary" icon="el-icon-circle-plus-outline" @click="toPublish" style="float: right; margin-right: 50px;">发布闲置</el-button>
        <div class="main-header">
          <div class="banner">
            <el-carousel height="250px">
              <el-carousel-item v-for="item in banners" :key="item.id">
                <img :src="item.imgUrl">
              </el-carousel-item>
            </el-carousel>
          </div>
        </div>
        <!-- goods start -->
        <div class="main-header main-body">
          <el-card :body-style="{ padding: '0px' }" v-for="good in goods" :key="good.id" shadow="hover">
            <img :src="good.images[0].imgUrl" class="image">
            <div style="padding: 14px;">
              <span>{{ good.good.name }}</span>
              <div class="bottom clearfix">
                发布时间：<time class="time">{{ good.good.polishTime }}</time>
                <el-button type="text" class="button">详情</el-button>
              </div>
            </div>
          </el-card>
        </div>
        <!-- goods end -->
      </el-main>
      <!-- main end -->
    </el-container>
    <home-footer></home-footer>
  </div>
</template>

<script>
import HomeHeader from '@/components/HomeHeader'
import HomeFooter from '@/components/HomeFooter'
import { indexData } from '@/api/kdshop/home.js' // 导入api接口

export default {
  name: 'Index',
  components: {
    HomeHeader,
    HomeFooter
  },
  data() {
    return {
      catelogs: [],
      banners: [],
      goods: [],
      searchKey: {
        name: '',
        catelogId: 1
      }
    }
  },
  // 组件创建时执行
  created() {
    this.getIndexData()
  },
  methods: {
    toPublish() {
      this.$router.push({ path: "/publish",replace: true }).catch(()=>{});
    },
    getIndexData() {
      indexData(this.searchKey).then(res => {
        // 处理响应数据
        // console.log(res.data)
        this.catelogs = res.data.catelog
        this.banners = res.data.carousel
        this.goods = res.data.goods
      }).catch(error => {
          console.log(error)
      })
    }
  }
}
</script>

<style lang="scss" scoped>
  body > .el-container {
    margin-bottom: 40px;
  }
  .el-main {
    background-color: #E9EEF3;
    color: #333;
    text-align: center;
  }
  .main-search {
    width: 550px;
    margin: 0 auto;
    .el-select {
      width: 120px;
    }
  }
  ::v-deep .el-input-group__prepend {
    background-color: #fff;
  }
  ::v-deep .el-input-group__append {
    background-color: #409EFF;
    width: 60px;
    .el-icon-search {
      color: #FFFFFF;
    }
  }
  .main-header{
    width: 1200px;
    margin: 20px auto;
    overflow: hidden;
  }
  .banner {
    float: right;
    width: 500px;
    margin-right: 342px;
    // border: 1px solid red;
    img {
      width: 500px;
    }
  }

  .main-body {
    margin-top: 25px;
    text-align: left;
    .el-card {
      width: 270px;
      float: left;
      margin-right: 28px;
      margin-top: 15px;
      .image {
        width: 100%;
        display: block;
      }
      .bottom {
        margin-top: 13px;
        line-height: 12px;
      }
      .button {
        padding: 0;
        float: right;
      }
      .time {
        font-size: 13px;
        color: #999;
      }
    }
  }
  .clearfix:before,
  .clearfix:after {
    display: table;
    content: "";
  }

  .clearfix:after {
    clear: both
  }
</style>
