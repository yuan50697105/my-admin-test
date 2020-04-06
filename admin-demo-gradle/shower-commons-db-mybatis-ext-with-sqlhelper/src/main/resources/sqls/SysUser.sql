-- auto Generated on 2020-04-06
DROP TABLE IF EXISTS sys_user;
CREATE TABLE sys_user
(
    id          BIGINT(15) NOT NULL AUTO_INCREMENT COMMENT '主键',
    create_time DATETIME COMMENT '创建时间',
    update_time TIMESTAMP COMMENT '更新时间',
    username    VARCHAR(50) COMMENT '账户',
    `name`      VARCHAR(50) COMMENT '姓名',
    `password`  VARCHAR(50) COMMENT '密码',
    PRIMARY KEY (id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4 COMMENT 'sys_user';
