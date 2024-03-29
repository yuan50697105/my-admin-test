-- auto Generated on 2020-04-12
-- DROP TABLE IF EXISTS member_info;
CREATE TABLE member_info(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT '主键',
	create_time DATETIME COMMENT '创建时间',
	update_time TIMESTAMP COMMENT '更新时间',
	code VARCHAR (50) COMMENT '会员编号',
	customer_id BIGINT (15) COMMENT '会员ID',
	customer_name VARCHAR (50) COMMENT '会员姓名',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'member_info';
