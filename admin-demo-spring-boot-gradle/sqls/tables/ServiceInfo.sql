-- auto Generated on 2020-04-12
DROP TABLE IF EXISTS service_info;
CREATE TABLE service_info(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT '主键',
	create_time DATETIME COMMENT '创建时间',
	update_time TIMESTAMP COMMENT '更新时间',
	type_id BIGINT (15) COMMENT '类型ID',
	code VARCHAR (50) COMMENT '编号',
	`name` VARCHAR (50) COMMENT '名称',
	price DECIMAL (13,4) COMMENT '价格',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'service_info';
