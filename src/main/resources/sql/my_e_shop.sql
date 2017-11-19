/*
 Navicat Premium Data Transfer

 Source Server         : mydb
 Source Server Type    : MySQL
 Source Server Version : 50717
 Source Host           : localhost
 Source Database       : e_shop

 Target Server Type    : MySQL
 Target Server Version : 50717
 File Encoding         : utf-8

 Date: 11/19/2017 23:04:51 PM
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `e_shop_address`
-- ----------------------------
DROP TABLE IF EXISTS `e_shop_address`;
CREATE TABLE `e_shop_address` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `user_id` int(6) unsigned NOT NULL COMMENT '用户id',
  `receiver_name` varchar(8) NOT NULL COMMENT '收货人姓名',
  `receiver_phone` char(11) NOT NULL COMMENT '收货人手机号码',
  `province` varchar(8) NOT NULL COMMENT '收获省份',
  `city` varchar(16) NOT NULL COMMENT '城市',
  `district` varchar(16) NOT NULL COMMENT '区县',
  `address` varchar(32) NOT NULL COMMENT '详细地址',
  `postcode` char(6) DEFAULT NULL COMMENT '邮编',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`),
  KEY `user_id_index` (`user_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `e_shop_cart`
-- ----------------------------
DROP TABLE IF EXISTS `e_shop_cart`;
CREATE TABLE `e_shop_cart` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `user_id` int(6) unsigned NOT NULL COMMENT '用户id',
  `product_id` int(6) unsigned DEFAULT NULL COMMENT '商品id',
  `quantity` smallint(4) unsigned DEFAULT NULL COMMENT '数量',
  `checked` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否选择,1=已勾选,0=未勾选',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`),
  KEY `user_id_index` (`user_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `e_shop_category`
-- ----------------------------
DROP TABLE IF EXISTS `e_shop_category`;
CREATE TABLE `e_shop_category` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `parent_id` int(6) unsigned NOT NULL COMMENT '父类别id当id=0时说明是根节点,一级类别',
  `name` varchar(32) DEFAULT NULL COMMENT '类别名称',
  `status` tinyint(1) NOT NULL COMMENT '类别状态1-正常,2-已废弃',
  `sort_order` tinyint(2) unsigned DEFAULT NULL COMMENT '排序编号,同类展示顺序,数值相等则自然排序',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `e_shop_order`
-- ----------------------------
DROP TABLE IF EXISTS `e_shop_order`;
CREATE TABLE `e_shop_order` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `order_no` bigint(18) unsigned NOT NULL COMMENT '订单id',
  `user_id` int(6) unsigned NOT NULL COMMENT '用户id',
  `payment` decimal(8,2) unsigned DEFAULT NULL COMMENT '实际付款金额，单位元，保留两位有效小数',
  `payment_type` tinyint(1) DEFAULT NULL COMMENT '支付类型，0表示在线支付，',
  `postage` tinyint(4) unsigned DEFAULT NULL COMMENT '运费，单位元',
  `status` tinyint(1) unsigned DEFAULT '1' COMMENT '订单状态，0表示已付款，1表示未付款，2表示已取消，3表示已发货，4表示交易成功，5表示交易关闭',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `pay_time` timestamp NULL DEFAULT NULL COMMENT '付款时间',
  `send_time` timestamp NULL DEFAULT NULL COMMENT '发货时间',
  `end_time` timestamp NULL DEFAULT NULL COMMENT '交易完成时间',
  `close_time` timestamp NULL DEFAULT NULL COMMENT '交易关闭时间',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `order_no_index` (`order_no`) USING BTREE,
  KEY `user_id_index` (`user_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `e_shop_order_info`
-- ----------------------------
DROP TABLE IF EXISTS `e_shop_order_info`;
CREATE TABLE `e_shop_order_info` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `order_no` bigint(18) unsigned NOT NULL COMMENT '订单号',
  `user_id` int(6) unsigned NOT NULL COMMENT '用户id',
  `product_id` int(6) unsigned NOT NULL COMMENT '商品id',
  `product_name` varchar(32) DEFAULT NULL COMMENT '商品名称',
  `product_image` varchar(128) DEFAULT NULL COMMENT '商品图片地址url',
  `current_price` decimal(8,2) unsigned DEFAULT NULL COMMENT '生成订单时的商品单价，单位为元，保留两位小数',
  `quantity` smallint(2) unsigned DEFAULT NULL COMMENT '商品数量',
  `total_price` decimal(8,2) unsigned DEFAULT NULL COMMENT '总价，单位为元，保留两位有效小数',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `order_no_user_id_index` (`order_no`,`user_id`) USING BTREE,
  KEY `user_id_index` (`user_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `e_shop_pay`
-- ----------------------------
DROP TABLE IF EXISTS `e_shop_pay`;
CREATE TABLE `e_shop_pay` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `user_id` int(6) unsigned NOT NULL COMMENT '用户id',
  `order_no` bigint(18) unsigned NOT NULL COMMENT '订单号',
  `pay_platform` tinyint(1) unsigned NOT NULL COMMENT '支付平台，0表示支付宝；1表示微信；',
  `pay_no` bigint(18) unsigned NOT NULL COMMENT '支付流水号',
  `pay_status` tinyint(1) NOT NULL COMMENT '支付状态，0表示成功，1表示失败，2表示正在支付，3表示未支付',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`),
  KEY `user_id_index` (`user_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `e_shop_product`
-- ----------------------------
DROP TABLE IF EXISTS `e_shop_product`;
CREATE TABLE `e_shop_product` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `category_id` int(6) unsigned NOT NULL COMMENT '分类id',
  `name` varchar(32) NOT NULL COMMENT '商品名称',
  `subtitle` varchar(64) DEFAULT NULL COMMENT '商品副标题',
  `main_images` varchar(256) DEFAULT NULL COMMENT '产品主图,url相对地址',
  `sub_images` varchar(256) DEFAULT NULL COMMENT '图片副图，url地址',
  `detail` text COMMENT '商品详情',
  `price` decimal(8,2) unsigned DEFAULT NULL COMMENT '商品价格',
  `stock` smallint(4) unsigned DEFAULT NULL COMMENT '库存',
  `status` tinyint(1) unsigned NOT NULL DEFAULT '1' COMMENT '商品状态，1表示在售，2表示下架，3表示无货',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `e_shop_user`
-- ----------------------------
DROP TABLE IF EXISTS `e_shop_user`;
CREATE TABLE `e_shop_user` (
  `id` int(6) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(16) DEFAULT NULL COMMENT '用户名',
  `password` char(32) DEFAULT NULL COMMENT '密码',
  `phone` char(11) NOT NULL COMMENT '手机号，必须有',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `phone_index` (`phone`) USING BTREE,
  KEY `name_index` (`name`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
