/*
 Navicat Premium Data Transfer

 Source Server         : diandi
 Source Server Type    : MySQL
 Source Server Version : 50728
 Source Host           : 47.98.181.240:3307
 Source Schema         : diandi

 Target Server Type    : MySQL
 Target Server Version : 50728
 File Encoding         : 65001

 Date: 14/12/2019 20:25:34
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment`  (
  `id` int(11) NOT NULL,
  `retext` text CHARACTER SET latin1 COLLATE latin1_swedish_ci COMMENT '评论内容',
  `user_id` int(11) DEFAULT NULL COMMENT '用户id',
  `news_id` int(11) DEFAULT NULL COMMENT '新闻id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for images
-- ----------------------------
DROP TABLE IF EXISTS `images`;
CREATE TABLE `images`  (
  `id` int(11) NOT NULL,
  `image` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci DEFAULT NULL COMMENT '图片地址',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for news
-- ----------------------------
DROP TABLE IF EXISTS `news`;
CREATE TABLE `news`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '文章id',
  `content` text CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '文章内容',
  `picture_url` varchar(150) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '图片地址',
  `type_id` int(11) DEFAULT NULL COMMENT '话题类型',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for news_function
-- ----------------------------
DROP TABLE IF EXISTS `news_function`;
CREATE TABLE `news_function`  (
  `id` int(11) NOT NULL,
  `likes_nums` int(255) DEFAULT NULL COMMENT '喜欢量',
  `collect_nums` int(255) DEFAULT NULL COMMENT '收藏量',
  `tronspond_nums` int(255) DEFAULT NULL COMMENT '转发量',
  `news_id` int(11) DEFAULT NULL COMMENT '新闻',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for theme
-- ----------------------------
DROP TABLE IF EXISTS `theme`;
CREATE TABLE `theme`  (
  `id` int(255) DEFAULT NULL COMMENT 'ID',
  `type` varchar(20) CHARACTER SET latin1 COLLATE latin1_swedish_ci DEFAULT NULL COMMENT '话题类型'
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for theme_news
-- ----------------------------
DROP TABLE IF EXISTS `theme_news`;
CREATE TABLE `theme_news`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `theme_id` int(11) DEFAULT NULL COMMENT '话题id',
  `news_id` int(11) DEFAULT NULL COMMENT '新闻id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `username` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '昵称',
  `password` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '密码',
  `icon` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '头像',
  `gender` tinyint(1) DEFAULT NULL COMMENT '性别',
  `tel` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '电话',
  `birthday` date DEFAULT NULL COMMENT '出生年月',
  `address` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '地址',
  `signature` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '签名',
  `fans` int(11) DEFAULT NULL COMMENT '粉丝数量',
  `guanzhu` int(11) DEFAULT NULL COMMENT '关注数量',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `user_table_username_uindex`(`username`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for user_collect
-- ----------------------------
DROP TABLE IF EXISTS `user_collect`;
CREATE TABLE `user_collect`  (
  `id` int(11) NOT NULL,
  `collects_news_id` int(11) DEFAULT NULL COMMENT '用户关注收藏的文章id',
  `user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for user_like
-- ----------------------------
DROP TABLE IF EXISTS `user_like`;
CREATE TABLE `user_like`  (
  `id` int(11) NOT NULL,
  `likes_news` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL COMMENT '用户喜欢的文章id',
  `user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for user_news
-- ----------------------------
DROP TABLE IF EXISTS `user_news`;
CREATE TABLE `user_news`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL COMMENT '用户id',
  `news_id` int(11) DEFAULT NULL COMMENT '新闻id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户文章关联表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for user_transpond
-- ----------------------------
DROP TABLE IF EXISTS `user_transpond`;
CREATE TABLE `user_transpond`  (
  `id` int(11) NOT NULL,
  `transpond_news` int(255) DEFAULT NULL COMMENT '用户转发的文章id',
  `user_id` int(11) DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
