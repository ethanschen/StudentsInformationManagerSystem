/*
Navicat MySQL Data Transfer

Source Server         : Kareza
Source Server Version : 80015
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 80015
File Encoding         : 65001

Date: 2019-03-29 22:10:53
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for stulist
-- ----------------------------
DROP TABLE IF EXISTS `stulist`;
CREATE TABLE `stulist` (
  `id` int(10) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `grade` varchar(255) DEFAULT NULL,
  `introduce` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of stulist
-- ----------------------------
INSERT INTO `stulist` VALUES ('1', '张益达', '男', '19', '大二', '活泼的男生');
INSERT INTO `stulist` VALUES ('2', '戚妍笛', '女', '20', '大二', '漂亮的小姐姐');
INSERT INTO `stulist` VALUES ('3', '王小二', '男', '22', '大四', '文笔非同一般');
INSERT INTO `stulist` VALUES ('4', '亚洲伦', '男', '18', '大一', '很喜欢鼓捣电脑');
INSERT INTO `stulist` VALUES ('5', '段奥娟', '女', '18', '大一', '天籁之音');
INSERT INTO `stulist` VALUES ('6', '赖美云', '女', '19', '大二', '舞蹈很棒');
INSERT INTO `stulist` VALUES ('7', '飞翔', '男', '22', '大四', '吃苦耐劳');
INSERT INTO `stulist` VALUES ('8', '高颖浠', '女', '19', '大一', '跳舞超炫');
