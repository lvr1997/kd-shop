<template>
  <!-- 后台界面  菜单栏 -->
  <el-menu
    :default-active="route.path"
    class="el-menu-vertical-demo"
    :collapse="isCollapse"
    router
    @open="handleOpen"
    @close="handleClose"
  >
    <el-menu-item index="/admin">
      <el-icon><House /></el-icon>
      <template #title>首页</template>
    </el-menu-item>
    <el-sub-menu index="2">
      <template #title>
        <el-icon><location /></el-icon>
        <span>后台数据管理</span>
      </template>
      <el-menu-item index="/admin/carousel">轮播图管理</el-menu-item>
      <el-menu-item index="/admin/goods">闲置管理</el-menu-item>
      <el-menu-item index="/admin/category">分类管理</el-menu-item>
      <el-menu-item index="/admin/report">举报管理</el-menu-item>
      <el-menu-item index="/admin/message">留言管理</el-menu-item>
      <el-menu-item index="/admin/orders">订单管理</el-menu-item>
      <el-menu-item index="/admin/notice">公告管理</el-menu-item>
    </el-sub-menu> 
    <el-sub-menu index="3">
      <template #title>
        <el-icon><setting /></el-icon>
        <span>系统管理</span>
      </template>
      <el-menu-item index="/admin/user">用户管理</el-menu-item>
      <el-menu-item index="/admin/role" disabled>角色管理</el-menu-item>
      <el-menu-item index="/admin/school" disabled>学校管理</el-menu-item>
      <el-menu-item index="/admin/dirt">数据字典</el-menu-item>
    </el-sub-menu>
    <el-menu-item index="4">
      <el-icon><User /></el-icon>
      <template #title>个人中心</template>
    </el-menu-item>
  </el-menu>
</template>

<script lang="ts" setup>
import {
  House,
  Location,
  Setting,
  User
} from "@element-plus/icons-vue";
import { ref } from "vue";
import { useRoute } from "vue-router";

const route = useRoute();

const isCollapse = ref(false);
const handleOpen = (key: string, keyPath: string[]) => {
  console.log(key, keyPath);
};
const handleClose = (key: string, keyPath: string[]) => {
  console.log(key, keyPath);
};
</script>