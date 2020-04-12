-- auto Generated on 2020-04-12
DROP TABLE IF EXISTS goods_order_item;
CREATE TABLE goods_order_item(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT '主键',
	create_time DATETIME COMMENT '创建时间',
	update_time TIMESTAMP COMMENT '更新时间',
	order_id BIGINT (15) COMMENT '订单ID',
	order_no VARCHAR (50) COMMENT '订单号',
	goods_id BIGINT (15) COMMENT '商品ID',
	goods_code VARCHAR (50) COMMENT '商品编号',
	goods_name VARCHAR (50) COMMENT '商品名称',
	num INT (11) COMMENT '数量',
	price DECIMAL (13,4) COMMENT '价格',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'goods_order_item';
