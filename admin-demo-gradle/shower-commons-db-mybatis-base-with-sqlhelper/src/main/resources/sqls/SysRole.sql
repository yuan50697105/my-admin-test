-- auto Generated on 2020-04-06
# DROP TABLE IF EXISTS sys_role;
CREATE TABLE sys_role
(
    id          BIGINT(15) NOT NULL AUTO_INCREMENT COMMENT '主键',
    create_time DATETIME COMMENT '创建时间',
    update_time TIMESTAMP COMMENT '更新时间',
    code        VARCHAR(50) COMMENT '角色编号',
    `name`      VARCHAR(50) COMMENT '角色名称',
    enabled     VARCHAR(50) COMMENT '启用状态',
    PRIMARY KEY (id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4 COMMENT 'sys_role';
