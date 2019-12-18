/*
 Navicat Premium Data Transfer

 Source Server         : CentOS1_mysql
 Source Server Type    : MySQL
 Source Server Version : 50728
 Source Host           : 192.168.75.55:3306
 Source Schema         : diandi

 Target Server Type    : MySQL
 Target Server Version : 50728
 File Encoding         : 65001

 Date: 18/12/2019 16:55:57
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `retext` text CHARACTER SET utf8 COLLATE utf8_general_ci COMMENT '评论内容',
  `user_id` int(11) DEFAULT NULL COMMENT '用户id',
  `news_id` int(11) DEFAULT NULL COMMENT '新闻id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of comment
-- ----------------------------
INSERT INTO `comment` VALUES (1, '今天阳光真好，适合晒太阳', 1, 1);
INSERT INTO `comment` VALUES (2, '很多时候哎好烦的撒·', 1, 2);
INSERT INTO `comment` VALUES (3, '发打发的撒多', 2, 3);
INSERT INTO `comment` VALUES (4, ' 似懂非懂仨人反而是', 3, 4);

-- ----------------------------
-- Table structure for images
-- ----------------------------
DROP TABLE IF EXISTS `images`;
CREATE TABLE `images`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `image` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '图片地址',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

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
) ENGINE = InnoDB AUTO_INCREMENT = 17 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of news
-- ----------------------------
INSERT INTO `news` VALUES (1, 'stream启动', 'http://img2.imgtn.bdimg.com/it/u=2617234688,2184487534&fm=26&gp=0.jpg', 2);
INSERT INTO `news` VALUES (2, 'idea关闭', 'http://img2.imgtn.bdimg.com/it/u=2617234688,2184487534&fm=26&gp=0.jpg', 2);
INSERT INTO `news` VALUES (3, '哈哈哈哈哈哈哈哈哈哈或或或或或或或或或或或或或或或或或或或或或或或或或或或或或或或或或或或或或或或或或或或或 ', '', 1);
INSERT INTO `news` VALUES (4, '发达地方撒多 发电风扇', NULL, 2);
INSERT INTO `news` VALUES (5, '我还上课了辅导辅导和 ', '', 1);
INSERT INTO `news` VALUES (6, '  回复第搜啊好地方撒是否啥 ', NULL, 3);
INSERT INTO `news` VALUES (7, '法电风扇啊是范德萨 的', NULL, 4);
INSERT INTO `news` VALUES (8, ' 范德萨发  范德萨范德萨啊', NULL, 4);
INSERT INTO `news` VALUES (15, '会好偶偶偶', NULL, NULL);
INSERT INTO `news` VALUES (16, '大河向东流啊天上的星星次北斗啊', 'http://ww1.sinaimg.cn/large/ceeb653ejw1fb6oq2cekej209f08vt9n.jpg', 4);

-- ----------------------------
-- Table structure for news_function
-- ----------------------------
DROP TABLE IF EXISTS `news_function`;
CREATE TABLE `news_function`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `likes_nums` int(255) DEFAULT NULL COMMENT '喜欢量',
  `collect_nums` int(255) DEFAULT NULL COMMENT '收藏量',
  `tronspond_nums` int(255) DEFAULT NULL COMMENT '转发量',
  `news_id` int(11) DEFAULT NULL COMMENT '新闻',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for theme
-- ----------------------------
DROP TABLE IF EXISTS `theme`;
CREATE TABLE `theme`  (
  `id` int(255) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `type` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '话题类型',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of theme
-- ----------------------------
INSERT INTO `theme` VALUES (1, '无主情话');
INSERT INTO `theme` VALUES (2, '每日趣闻');
INSERT INTO `theme` VALUES (3, '经典语录');
INSERT INTO `theme` VALUES (4, 'hello你好');
INSERT INTO `theme` VALUES (5, '都市激情');
INSERT INTO `theme` VALUES (6, '无聊的日子那么多');

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
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `collects_news_id` int(11) DEFAULT NULL COMMENT '用户关注收藏的文章id',
  `user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for user_like
-- ----------------------------
DROP TABLE IF EXISTS `user_like`;
CREATE TABLE `user_like`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `likes_news` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户喜欢的文章id',
  `user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

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
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `transpond_news` int(255) DEFAULT NULL COMMENT '用户转发的文章id',
  `user_id` int(11) DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
