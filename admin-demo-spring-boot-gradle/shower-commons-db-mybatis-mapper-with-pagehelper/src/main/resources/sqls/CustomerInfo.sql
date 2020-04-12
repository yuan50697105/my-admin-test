-- auto Generated on 2020-04-11
DROP TABLE IF EXISTS customer_info;
CREATE TABLE customer_info(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT '主键',
	create_time DATETIME COMMENT '创建时间',
	update_time TIMESTAMP COMMENT '更新时间',
	code VARCHAR (50) COMMENT '编号',
	`name` VARCHAR (50) COMMENT '姓名',
	gender VARCHAR (50) COMMENT '性别',
	age INT (11) COMMENT '年龄',
	phone VARCHAR (50) COMMENT '电话',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'customer_info';
