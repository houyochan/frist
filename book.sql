CREATE TABLE `book` (
  `id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(32) NOT NULL COMMENT '书名',
  `author` varchar(32) DEFAULT NULL COMMENT '作者',
  `publication_date` datetime DEFAULT NULL COMMENT '出版日期//格式1980-02-27 17:47:08',
  `price` int DEFAULT '0' COMMENT '价格',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=226 DEFAULT CHARSET=utf8mb3

