-- auto Generated on 2020-04-06
DROP TABLE IF EXISTS sys_user_log;
CREATE TABLE sys_user_log(
	username VARCHAR (50) COMMENT '账户',
	`name` VARCHAR (50) COMMENT '姓名',
	`password` VARCHAR (50) COMMENT '密码',
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT '主键',
	create_time DATETIME COMMENT '创建时间',
	update_time TIMESTAMP COMMENT '更新时间',
	`operation` VARCHAR (50) COMMENT '操作',
	decription VARCHAR (50) COMMENT '描述',
	url VARCHAR (50) COMMENT '请求路径',
	params VARCHAR (50) COMMENT '参数',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'sys_user_log';
