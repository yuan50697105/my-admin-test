-- auto Generated on 2020-04-19
DROP TABLE IF EXISTS sys_user;
CREATE TABLE sys_user(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
	create_time DATETIME COMMENT 'createTime',
	update_time TIMESTAMP COMMENT 'updateTime',
	username VARCHAR (50) COMMENT 'username',
	`name` VARCHAR (50) COMMENT 'name',
	`password` VARCHAR (50) COMMENT 'password',
	enabled VARCHAR (50) COMMENT 'enabled',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'sys_user';
