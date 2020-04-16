-- auto Generated on 2020-04-16
DROP TABLE IF EXISTS sys_dict;
CREATE TABLE sys_dict(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT '主键',
	create_time DATETIME COMMENT '创建时间',
	update_time TIMESTAMP COMMENT '更新时间',
	`key` VARCHAR (50) COMMENT 'key',
	`value` VARCHAR (50) COMMENT 'value',
	group_id VARCHAR (50) COMMENT 'groupId',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'sys_dict';
