/*
Navicat MySQL Data Transfer
Source Server         : 本地
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : test1
Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001
Date: 2016-11-05 21:17:33
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `users`
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `userName` varchar(32) DEFAULT NULL COMMENT '用户名',
  `passWord` varchar(32) DEFAULT NULL COMMENT '密码',
  `user_sex` varchar(32) DEFAULT NULL,
  `nick_name` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8;

INSERT INTO `users`(`userName`, `passWord`, `user_sex`, `nick_name`) VALUES ( 'ddd', '123222', 'MAN', 'ddddd');
INSERT INTO `users`(`userName`, `passWord`, `user_sex`, `nick_name`) VALUES ('eee', '123456', 'WOMAN', 'eeeee');
INSERT INTO `users`(`userName`, `passWord`, `user_sex`, `nick_name`) VALUES ('aa1', 'a123456', 'MAN', 'neo');
INSERT INTO `users`(`userName`, `passWord`, `user_sex`, `nick_name`) VALUES ('bb1', 'b123456', 'WOMAN', NULL);
INSERT INTO `users`(`userName`, `passWord`, `user_sex`, `nick_name`) VALUES ('cc1', 'b123456', 'WOMAN', NULL);