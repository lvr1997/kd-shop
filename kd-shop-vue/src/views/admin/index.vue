<template>
  <a-layout>
    <a-layout-sider
      breakpoint="lg"
      collapsed-width="0"
      @collapse="onCollapse"
      @breakpoint="onBreakpoint"
    >
      <div class="logo">Kd-shop</div>
      <a-menu
        theme="dark"
        mode="inline"
        :selectedKeys="selectedKeys"
        @click="routerClick"
      >
        <a-menu-item key="/admin/website">
          <user-outlined />
          <span class="nav-text">网站管理</span>
        </a-menu-item>
        <a-menu-item key="/admin/users">
          <video-camera-outlined />
          <span class="nav-text">用户管理</span>
        </a-menu-item>
        <a-menu-item key="/admin/school">
          <upload-outlined />
          <span class="nav-text">学校管理</span>
        </a-menu-item>
        <a-menu-item key="/admin/setting">
          <user-outlined />
          <span class="nav-text">系统设置</span>
        </a-menu-item>
      </a-menu>
    </a-layout-sider>
    <a-layout>
      <a-layout-header :style="{ background: '#fff', padding: 0 }">
        <MenuUnfoldOutlined class="trigger" v-show="collapsed" @click="() => (collapsed = !collapsed)" />
        <MenuFoldOutlined class="trigger" v-show="!collapsed" @click="() => (collapsed = !collapsed)" />
       
        <span>网站管理</span>
      </a-layout-header>
      <a-layout-content :style="{ margin: '24px 16px 0' }">
        <div
          :style="{ padding: '24px', background: '#fff', minHeight: '360px' }"
        >
          <router-view></router-view>
        </div>
      </a-layout-content>
      <a-layout-footer style="text-align: center">
        Ant Design ©2018 Created by Ant UED
      </a-layout-footer>
    </a-layout>
  </a-layout>
</template>

<script>
import {
  UserOutlined,
  VideoCameraOutlined,
  UploadOutlined,
  MenuUnfoldOutlined,
  MenuFoldOutlined,
} from "@ant-design/icons-vue";

export default {
  components: {
    UserOutlined,
    VideoCameraOutlined,
    UploadOutlined,
    MenuUnfoldOutlined,
    MenuFoldOutlined,
  },

  data() {
    return {
      collapsed: false,
      selectedKeys: [this.$route.path.substr(0, this.$route.path.lastIndexOf('/'))]
    };
  },

  methods: {
    onCollapse(collapsed, type) {
      console.log(collapsed, type);
    },

    onBreakpoint(broken) {
      console.log(broken);
    },

    routerClick({ item, key, keyPath }) {
      this.selectedKeys = [key]
    },
  },
};
</script>

<style scoped>
.logo {
  height: 32px;
  line-height: 32px;
  background: rgba(255, 255, 255, 0.2);
  margin: 16px;
  text-align: center;
}

.site-layout-sub-header-background {
  background: #fff;
}

.site-layout-background {
  background: #fff;
}

[data-theme="dark"] .site-layout-sub-header-background {
  background: #141414;
}

.trigger {
  font-size: 18px;
  line-height: 64px;
  padding: 0 24px;
  cursor: pointer;
  transition: color 0.3s;
}
 
.trigger:hover {
  color: #1890ff;
}
</style>