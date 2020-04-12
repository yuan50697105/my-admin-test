-- auto Generated on 2020-04-11
DROP TABLE IF EXISTS goods_type;
CREATE TABLE goods_type(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT '主键',
	create_time DATETIME COMMENT '创建时间',
	update_time TIMESTAMP COMMENT '更新时间',
	code VARCHAR (50) COMMENT '编号',
	`name` VARCHAR (50) COMMENT '名称',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'goods_type';
