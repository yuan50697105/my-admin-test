-- auto Generated on 2020-04-06
DROP TABLE IF EXISTS sys_permission;
CREATE TABLE sys_permission(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT '主键',
	create_time DATETIME COMMENT '创建时间',
	update_time TIMESTAMP COMMENT '更新时间',
	`name` VARCHAR (50) COMMENT '权限名称',
	code VARCHAR (50) COMMENT '全新编号',
	enabled VARCHAR (50) COMMENT '启用状态 {@link com.example.commons.db.mybatis.pagehelper.test.constants.EnableConstants}',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'sys_permission';