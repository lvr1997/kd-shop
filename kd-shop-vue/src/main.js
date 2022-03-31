import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import Antd from 'ant-design-vue'
import 'ant-design-vue/dist/antd.css'
import * as echarts from 'echarts'

const app = createApp(App)

// 引入antd-vue
app.use(Antd)
// 引入vuex
app.use(store)
// 引入 路由
app.use(router)
//引入EChart
app.echarts = echarts

app.mount('#app')
