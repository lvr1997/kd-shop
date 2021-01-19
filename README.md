![images](https://gitee.com/lvr1997/PicGioRepository/raw/master/img/kdmall-logo.png)

后端

![images](https://img.shields.io/badge/SpringBoot-2.2.12.RELEASE-brightgreen) 
![images](https://img.shields.io/badge/Mybatis-3.3-yellowgreen)
![images](https://img.shields.io/badge/jwt-0.9.1-yellow)

前端

![images](https://img.shields.io/badge/Vue-2.6-green)
![images](https://img.shields.io/badge/vue--router-3.4.9-yellow)
![images](https://img.shields.io/badge/vuex-3.6.0-orange)
![images](https://img.shields.io/badge/ElementUI-2.14.1-blue)
![images](https://img.shields.io/badge/axios-0.21.0-green)
![images](https://img.shields.io/badge/echarts-4.9.0-blue)
![images](https://img.shields.io/badge/sass-0.9.1-gray)

#### 基于科大二手工坊的V2.0版本

## 项目介绍
本项目的灵感是来源于我的2019年毕业设计科大二手工坊，
当时科大二手工坊是基于SSM框架构建，现在想将项目升级为SpringBoot版，
但是并不是完全拷贝，技术和项目模块上也做了一些改变，也当做是对我毕业一年以来
学习上的一些总结吧。

## 技术点

poi实现结果导入导出
 
jwt做登录token校验
 
使用spring-security完成权限认证

调用支付宝/微信支付接口支付

<dependency>
    <groupId>com.alipay.sdk</groupId>
    <artifactId>alipay-easysdk</artifactId>
    <version>2.1.2</version>
</dependency>


...

## 更新记录

`V1.0`

1. **2020-5-13** 初始化项目 `kd-shop` `v1.0`
2. **2020-5-14** 项目配置修改，用户登录接口和查找用户接口完成
3. **2020-5-14** 用户登录增加MD5校验，对登录接口进行测试，修复bug
4. **2020-5-17** 实现查询结果统一返回 `JSONResult`
5. **2020-5-20** 解决登录bug，当用户名密码错误时返回状态码给前台
6. **2020-5-27** 查询用户接口重写，实现用户角色连表分页查询
7. **2020-5-30** 查询用户接口，封装统一`VO`返回
8. **2020-5-30** 整合Shiro
9. **2020-10-12** 去掉无用代码
10. **2020-10-14**添加项目说明及logo
11. **2020-10-15** 解决跨域
12. **2020-10-27** 首页实现轮播图、分类、闲置物品查询

`V2.0`

1. **2020-12-24** 引入开源项目`RuoYi-vue` 对`kd-shop`进行项目重构，版本： `V2.0` ，后端服务可以正常启动
2. **2020-12-25** 更新`README.md`
3. **2020-12-29** 实现使用学生用户登录时跳转到前台页面，管理用户登录跳转到后台管理页面功能
4. **2021-01-04** 解决根据不同角色跳转`bug`

## 项目计划

前台部分：
- [ ] 首页
    - [x] 分类展示
    - [ ] 闲置检索
    - [ ] 发布商品
- [x] 学生用户登录
    - [ ] 找回密码（通过发送邮件/短信验证码找回）
    - [ ] 注册
- [ ] 发布/想要
    - [ ] 管理我发布的商品
    - [ ] 管理我想要的商品    
- [ ] 用户留言（收到的留言，发布的留言）
- [x] 个人信息管理
- [ ] 订单管理
- [ ] 意见反馈
- [ ] 累计收入，累计支出
- [ ] 支付
- [ ] 收货地址管理
- [ ] 商品收藏
- [ ] 实时通讯功能

后台管理系统部分：

- [ ] 首页轮播图管理
- [ ] 闲置管理
- [ ] 分类管理
- [ ] 举报管理
- [ ] 留言管理
- [ ] 订单管理

## 关于本项目

环境准备：

项目开发环境： IDEA

数据库：Mysql5.7

后端:

1. 启动本地 `Redis-server` 不需要密码 [下载地址 (提取码: aabs)](https://pan.baidu.com/s/1u4LOwn-SIjgY8bvA3_o__g)
2. 导入sql文件 在项目根目录 `sql` 文件夹下
3. 在 `kd-shop-admin` 模块 启动 `KdShopApplication`

前端：

1. 进入到前端工程目录 `cd kd-shop-web`
2. 安装依赖 `npm install`
3. 启动项目 `npm run dev`

感兴趣的话可以添加 qq群 696224249 一起讨论哦 ^v^

## 鸣谢

感谢开源项目 [官网：RuoYi-Vue](http://www.ruoyi.vip) 为本项目提供了技术支持

