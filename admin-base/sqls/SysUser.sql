-- auto Generated on 2020-04-25
DROP TABLE IF EXISTS sys_user;
CREATE TABLE sys_user(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
	create_user VARCHAR (50) COMMENT 'createUser',
	update_user VARCHAR (50) COMMENT 'updateUser',
	create_time DATETIME COMMENT 'createTime',
	update_time TIMESTAMP COMMENT 'updateTime',
	deleted VARCHAR (50) COMMENT 'deleted',
	username VARCHAR (50) COMMENT '用户名',
	`name` VARCHAR (50) COMMENT '姓名',
	`password` VARCHAR (50) COMMENT '密码',
	enabled VARCHAR (50) COMMENT '启用状态',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'sys_user';
