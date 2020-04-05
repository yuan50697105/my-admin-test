-- auto Generated on 2020-04-05
-- DROP TABLE IF EXISTS `access`;
CREATE TABLE `access`(
	id INT (11) NOT NULL AUTO_INCREMENT COMMENT 'id',
	username VARCHAR (50) COMMENT 'username',
	shop_name VARCHAR (50) COMMENT 'shopName',
	category_name VARCHAR (50) COMMENT 'categoryName',
	brand_name VARCHAR (50) COMMENT 'brandName',
	shop_id VARCHAR (50) COMMENT 'shopId',
	omit VARCHAR (50) COMMENT 'omit',
	update_time VARCHAR (50) COMMENT 'updateTime',
	create_time VARCHAR (50) COMMENT 'createTime',
	description VARCHAR (50) COMMENT 'description',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'access';
