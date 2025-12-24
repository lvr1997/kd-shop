/*
 Navicat Premium Data Transfer

 Source Server         : locahost_3306
 Source Server Type    : MySQL
 Source Server Version : 80033 (8.0.33)
 Source Host           : localhost:3306
 Source Schema         : ihave

 Target Server Type    : MySQL
 Target Server Version : 80033 (8.0.33)
 File Encoding         : 65001

 Date: 19/09/2024 17:38:42
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for address
-- ----------------------------
DROP TABLE IF EXISTS `address`;
CREATE TABLE `address`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `uid` int NULL DEFAULT NULL,
  `recv_name` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `recv_province` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `recv_city` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `recv_area` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `recv_district` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `recv_addr` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `recv_phone` varchar(11) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `recv_tel` varchar(11) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `recv_zip` varchar(8) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `recv_tag` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `is_default` int NULL DEFAULT NULL,
  `created_user` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `created_time` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `modified_user` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `modified_time` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = COMPACT;

-- ----------------------------
-- Records of address
-- ----------------------------
INSERT INTO `address` VALUES (1, 1, '西瓜', '23', '01', '09', '黑龙江省哈尔滨市松北区', '黑龙江科技大学9#421', '15124680346', '', '150022', '宿舍', 1, NULL, NULL, NULL, NULL);
INSERT INTO `address` VALUES (2, 3, 'lr', '23', '01', '09', '黑龙江省哈尔滨市松北区', '宿舍', '17645653758', '', '150022', '宿舍', 1, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for carousel
-- ----------------------------
DROP TABLE IF EXISTS `carousel`;
CREATE TABLE `carousel`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '编号 主键',
  `title` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '轮播图标题',
  `create_at` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '创建时间',
  `status` tinyint NULL DEFAULT NULL COMMENT '状态：1显示 0隐藏',
  `descript` longtext CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL COMMENT '轮播图描述文字',
  `img_url` longtext CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL COMMENT '轮播图图片地址',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = COMPACT;

-- ----------------------------
-- Records of carousel
-- ----------------------------
INSERT INTO `carousel` VALUES (1, '毕业季', '2019-05-23', 1, '毕业季，二手随心发', 'banner1.png');
INSERT INTO `carousel` VALUES (2, '新概念图书', '2019-05-23', 1, '欢迎各位发布一些闲置的书籍', 'banner1.jpg');
INSERT INTO `carousel` VALUES (3, '毕业季毕业季', '2019-05-23', 1, '毕业季', 'banner2.png');

-- ----------------------------
-- Table structure for catelog
-- ----------------------------
DROP TABLE IF EXISTS `catelog`;
CREATE TABLE `catelog`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '编号 主键',
  `name` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '分类名称',
  `status` tinyint NULL DEFAULT 1 COMMENT '状态 1可用  0不可用',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = COMPACT;

-- ----------------------------
-- Records of catelog
-- ----------------------------
INSERT INTO `catelog` VALUES (1, '电子数码', 1);
INSERT INTO `catelog` VALUES (2, '棋牌休闲', 1);
INSERT INTO `catelog` VALUES (3, '服装衣物', 1);
INSERT INTO `catelog` VALUES (4, '书籍刊物', 1);
INSERT INTO `catelog` VALUES (5, '其他', 0);

-- ----------------------------
-- Table structure for comments
-- ----------------------------
DROP TABLE IF EXISTS `comments`;
CREATE TABLE `comments`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '评论编号',
  `user_id` int NOT NULL COMMENT '评论人用户id',
  `goods_id` int NOT NULL COMMENT '商品id',
  `create_at` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '评论时间',
  `content` longtext CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL COMMENT '评论内容',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = COMPACT;

-- ----------------------------
-- Records of comments
-- ----------------------------
INSERT INTO `comments` VALUES (1, 1, 1, '2019-05-19', 'hello');
INSERT INTO `comments` VALUES (2, 1, 1, '2019-05-19', '你好呀，初来乍到');

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT 'id',
  `catelog_id` int NOT NULL COMMENT '所属分类',
  `user_id` int NOT NULL COMMENT '发布人',
  `name` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '商品名称',
  `price` double NOT NULL COMMENT '出售价格',
  `real_price` double NULL DEFAULT NULL COMMENT '原购买价格',
  `start_time` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '上架时间',
  `polish_time` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '发布时间',
  `end_time` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '下架时间',
  `first_image` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '商品首图',
  `phone_number` varchar(11) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '联系人手机号',
  `good_buy_method` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '交易方式',
  `good_address` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '交易地址',
  `view_count` int NULL DEFAULT NULL COMMENT '商品发布数量',
  `describle` longtext CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL COMMENT '商品描述',
  `status` tinyint NULL DEFAULT 1 COMMENT '商品状态',
  `seller_note` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '商品备注（仅发布者自己可见）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = COMPACT;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES (1, 1, 1, 'Lenovo笔记本', 1000, 3999, '2019-05-19', '2019-05-20', NULL, NULL, '15124680346', '3', '9舍', 13, 'Lenovo笔记本  固态硬盘128', 0, NULL);
INSERT INTO `goods` VALUES (2, 1, 3, 'oppor9s手机', 800, 1399, '2019-05-23', '2019-05-23', NULL, NULL, '13019711506', '3', '学生公寓', 8, 'oppor9s手机，用了一年', 3, NULL);

-- ----------------------------
-- Table structure for image
-- ----------------------------
DROP TABLE IF EXISTS `image`;
CREATE TABLE `image`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '编号 主键',
  `goods_id` int NOT NULL COMMENT '商品id',
  `img_url` longtext CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL COMMENT '图片地址',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = COMPACT;

-- ----------------------------
-- Records of image
-- ----------------------------
INSERT INTO `image` VALUES (1, 1, '14dad59a-4ff8-4ad9-a556-bb92ffecb90b.png');
INSERT INTO `image` VALUES (2, 2, '17f7fb26-e785-4a5b-b82a-6c7d2c8d345f.jpg');

-- ----------------------------
-- Table structure for notice
-- ----------------------------
DROP TABLE IF EXISTS `notice`;
CREATE TABLE `notice`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '新闻公告表主键',
  `user_id` int NULL DEFAULT NULL COMMENT '发布人id ',
  `create_at` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '创建时间',
  `status` tinyint NULL DEFAULT 1 COMMENT '状态：0不显示 1显示',
  `context` longtext CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL COMMENT '内容',
  `img_url` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '新闻公告主图',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = COMPACT;

-- ----------------------------
-- Records of notice
-- ----------------------------

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `order_id` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '订单编号，系统根据订单时间生成',
  `user_id` int NOT NULL COMMENT '购买用户id',
  `seller_id` int NULL DEFAULT NULL COMMENT '卖家用户id',
  `good_id` int NOT NULL COMMENT '商品id',
  `address` varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '交易地址',
  `pay_id` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '支付码',
  `create_at` longtext CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL COMMENT '创建时间',
  `status` tinyint NULL DEFAULT 1 COMMENT '状态：1未完成 买家购买后订单为未完成的状态 \r\n2已完成  卖家在点击确认发货后 订单为已完成的状态',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = COMPACT;

-- ----------------------------
-- Records of orders
-- ----------------------------
INSERT INTO `orders` VALUES (1, '20190528172406559', 1, NULL, 2, '1', '20190528172308624', '2019-05-28', 1);

-- ----------------------------
-- Table structure for posts
-- ----------------------------
DROP TABLE IF EXISTS `posts`;
CREATE TABLE `posts`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `author` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `content` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `thumb_url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL DEFAULT '',
  `type` tinyint NOT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of posts
-- ----------------------------
INSERT INTO `posts` VALUES (1, '修改标题', 'lrrr', '测试内容test', '', 1, '2022-12-12 00:00:00', '2024-09-06 16:22:12');

-- ----------------------------
-- Table structure for purse
-- ----------------------------
DROP TABLE IF EXISTS `purse`;
CREATE TABLE `purse`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '钱包表主键编号',
  `user_id` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '用户id',
  `balance` double(16, 2) NOT NULL COMMENT '余额',
  `state` int NOT NULL DEFAULT 1 COMMENT '状态：1：可用，2：不可用',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of purse
-- ----------------------------

-- ----------------------------
-- Table structure for reply
-- ----------------------------
DROP TABLE IF EXISTS `reply`;
CREATE TABLE `reply`  (
  `id` int NOT NULL,
  `user_id` int NULL DEFAULT NULL,
  `atuser_id` int NULL DEFAULT NULL,
  `commet_id` int NULL DEFAULT NULL,
  `create_at` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `content` longtext CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = COMPACT;

-- ----------------------------
-- Records of reply
-- ----------------------------

-- ----------------------------
-- Table structure for report
-- ----------------------------
DROP TABLE IF EXISTS `report`;
CREATE TABLE `report`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '主键 编号',
  `type` int NOT NULL COMMENT '类型：1投诉，2反馈建议',
  `good_id` int NULL DEFAULT NULL COMMENT '商品id',
  `user_id` int NOT NULL COMMENT '用户id',
  `content` longtext CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL COMMENT '内容',
  `status` tinyint NOT NULL DEFAULT 0 COMMENT '状态：0未处理，1已处理，-1已删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = COMPACT;

-- ----------------------------
-- Records of report
-- ----------------------------

-- ----------------------------
-- Table structure for roles
-- ----------------------------
DROP TABLE IF EXISTS `roles`;
CREATE TABLE `roles`  (
  `id` int NOT NULL COMMENT 'id',
  `role_id` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '角色标识',
  `role_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '角色名称',
  `commet` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '备注',
  `create_date` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `role_id`(`role_id` ASC) USING BTREE COMMENT '角色id唯一'
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of roles
-- ----------------------------
INSERT INTO `roles` VALUES (1, 'STUDENT', '学生用户', '学生角色，用登录学生端系统', '20220222');
INSERT INTO `roles` VALUES (2, 'ADMIN', '系统管理员', '配置学校信息', '20220222');
INSERT INTO `roles` VALUES (3, 'AUDITOR', '审核员', '用户审核学生发布的物品信息', '20220222');
INSERT INTO `roles` VALUES (4, 'SUPERMANAGER', '超级管理员', '具有全部操作权限', '20220222');

-- ----------------------------
-- Table structure for school
-- ----------------------------
DROP TABLE IF EXISTS `school`;
CREATE TABLE `school`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT 'id',
  `school_id` varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '学校编码（系统随机生成8位字符串）',
  `school_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '学校名称',
  `school_location` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '学校位置',
  `create_at` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `school_id`(`school_id` ASC) USING BTREE COMMENT '学校编码唯一'
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of school
-- ----------------------------
INSERT INTO `school` VALUES (1, '00120000', '黑龙江科技大学', NULL, '20220222');
INSERT INTO `school` VALUES (2, '00120001', '哈尔滨工程大学', NULL, '20220222');
INSERT INTO `school` VALUES (3, '00120002', '哈尔滨理工大学', NULL, '20220222');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '主键，自动递增',
  `user_id` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '用户id，唯一标识',
  `phone` varchar(11) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '用户手机号',
  `username` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '用户名',
  `password` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '密码',
  `create_at` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '创建时间',
  `last_login` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '上次登录时间',
  `status` tinyint NULL DEFAULT 1 COMMENT '用户状态',
  `birthday` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '生日',
  `sex` varchar(1) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '性别',
  `img_url` longtext CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL COMMENT '头像',
  `residence` longtext CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL COMMENT '简介',
  `signature` longtext CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL COMMENT '个性签名',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `user_id_indexq`(`user_id` ASC) USING BTREE COMMENT '用户编号唯一'
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = COMPACT;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'aasdds', '15124680346', '测试用户AAA', '900150983CD24FB0D6963F7D28E17F72', '2019-05-19', '2019-06-03', 1, '', '女', 'default.png', '', '');
INSERT INTO `user` VALUES (2, 'werefdsf', '17611056916', '测试用户bbbb', '47BCE5C74F589F4867DBD57E9CA9F808', '2019-05-19', '2020-10-12', 1, '2019-05-19', '男', 'default.png', NULL, NULL);
INSERT INTO `user` VALUES (3, 'fdsdfsd', '13019711506', '西瓜味的小仙', 'E10ADC3949BA59ABBE56E057F20F883E', '2019-05-23', '2019-05-23', 1, '1989-05-26', '男', 'default.png', '黑龙江-哈尔滨市-松北区', '');
INSERT INTO `user` VALUES (4, 'fdsff', '15232103749', 'AlineSerily', 'E10ADC3949BA59ABBE56E057F20F883E', '2020-04-14', '2021-12-05', 1, '1998-04-09', '男', 'default.png', '黑龙江-哈尔滨市-南岗区', '');
INSERT INTO `user` VALUES (5, 'dghfgh', '13703111234', '詹三_审核员', 'E10ADC3949BA59ABBE56E057F20F883E', '2020-12-23', NULL, 1, '1998-07-12', '男', 'default.png', NULL, NULL);
INSERT INTO `user` VALUES (6, 'fghgjgjgu', '17765432111', '张三_系统管理员', 'E10ADC3949BA59ABBE56E057F20F883E', '2020-12-22', NULL, 1, NULL, '男', 'default.png', NULL, NULL);
INSERT INTO `user` VALUES (7, 'fdfrhh', '13207111234', '李四_超级管理员', 'E10ADC3949BA59ABBE56E057F20F883E', '2020-12-23', NULL, 1, NULL, '男', 'default.png', NULL, NULL);

-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT 'id',
  `user_id` varchar(60) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '用户id',
  `role_id` varchar(60) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '角色id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of user_role
-- ----------------------------
INSERT INTO `user_role` VALUES (1, '1', 'STUDENT');
INSERT INTO `user_role` VALUES (2, '2', 'STUDENT');
INSERT INTO `user_role` VALUES (3, '3', 'STUDENT');
INSERT INTO `user_role` VALUES (4, '4', 'STUDENT');

-- ----------------------------
-- Table structure for user_school
-- ----------------------------
DROP TABLE IF EXISTS `user_school`;
CREATE TABLE `user_school`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT 'id',
  `user_id` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT 'user_id',
  `school_id` varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT 'school_id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of user_school
-- ----------------------------
INSERT INTO `user_school` VALUES (1, '1', '00120000');
INSERT INTO `user_school` VALUES (2, '2', '00120000');
INSERT INTO `user_school` VALUES (3, '3', '00120001');
INSERT INTO `user_school` VALUES (4, '4', '00120002');

-- ----------------------------
-- Table structure for wanted
-- ----------------------------
DROP TABLE IF EXISTS `wanted`;
CREATE TABLE `wanted`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '收藏表 主键',
  `user_id` int NULL DEFAULT NULL COMMENT '用户id',
  `good_id` int NULL DEFAULT NULL COMMENT '收藏商品id',
  `create_at` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '创建时间',
  `status` int NULL DEFAULT NULL COMMENT '状态：0取消收藏，1收藏',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = COMPACT;

-- ----------------------------
-- Records of wanted
-- ----------------------------
INSERT INTO `wanted` VALUES (1, 4, 1, '2020-09-20', NULL);

SET FOREIGN_KEY_CHECKS = 1;
