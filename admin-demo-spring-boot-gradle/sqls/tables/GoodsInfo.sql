-- auto Generated on 2020-04-12
DROP TABLE IF EXISTS goods_info;
CREATE TABLE goods_info(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT '主键',
	create_time DATETIME COMMENT '创建时间',
	update_time TIMESTAMP COMMENT '更新时间',
	type_id BIGINT (15) COMMENT '类型ID',
	code VARCHAR (50) COMMENT '商品编号',
	`name` VARCHAR (50) COMMENT '商品名称',
	price DECIMAL (13,4) COMMENT '价格',
	num INT (11) COMMENT '库存',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'goods_info';
