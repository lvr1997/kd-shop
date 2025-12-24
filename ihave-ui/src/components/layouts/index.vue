<template>
  <BaseHeader />
  <div class="flex main-container">
    <div w="full">
      <RouterView />
    </div>
  </div>
  <BaseFooter />

  <!-- 新增：返回顶部按钮 -->
  <el-backtop :right="100" :bottom="120" />
</template>

<script setup lang="ts">
import BaseHeader from './BaseHeader.vue';
</script>

<style scoped>
.main-container {
  padding-bottom: var(--footer); /* 新增：防止内容被 BaseFooter 遮挡 */
}
</style>