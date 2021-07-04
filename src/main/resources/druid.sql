
CREATE DATABASE  `druid_test` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
use druid_test;


SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;



-- ----------------------------
-- Table structure for news
-- ----------------------------
DROP TABLE IF EXISTS `druid_table_test`;
CREATE TABLE `druid_table_test` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '新闻编号ID',
  `title` varchar(255) NOT NULL COMMENT '新闻标题',
  `cover` varchar(255) NOT NULL COMMENT '新闻封面',
  `publish_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '发布时间',
  `online_status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否上架 0 1',
  `is_top` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否置顶 0 1',
  `content` text COMMENT '新闻内容',
  `link` varchar(255) NOT NULL DEFAULT '' COMMENT '新闻链接',
  `create_by` varchar(255) NOT NULL DEFAULT '' COMMENT '创建人',
  `update_by` varchar(255) NOT NULL DEFAULT ''  COMMENT '更新人',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`),
  KEY `fk_news_id` (`id`) USING BTREE,
  KEY `fk_news_publish_date` (`publish_date`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8mb4 COMMENT='新闻列表';

SET FOREIGN_KEY_CHECKS = 1;