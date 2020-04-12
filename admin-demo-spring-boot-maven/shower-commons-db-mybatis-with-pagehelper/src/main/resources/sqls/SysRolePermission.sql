-- auto Generated on 2020-04-09
DROP TABLE IF EXISTS sys_role_permission;
CREATE TABLE sys_role_permission(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT '主键',
	create_time DATETIME COMMENT '创建时间',
	update_time TIMESTAMP COMMENT '更新时间',
	role_id BIGINT (15) COMMENT '角色ID',
	permission_id BIGINT (15) COMMENT '权限ID',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'sys_role_permission';
