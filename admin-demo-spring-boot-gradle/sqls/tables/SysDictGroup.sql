-- auto Generated on 2020-04-16
DROP TABLE IF EXISTS sys_dict_group;
CREATE TABLE sys_dict_group(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT '主键',
	create_time DATETIME COMMENT '创建时间',
	update_time TIMESTAMP COMMENT '更新时间',
	`key` VARCHAR (50) COMMENT 'key',
	`value` VARCHAR (50) COMMENT 'value',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'sys_dict_group';
