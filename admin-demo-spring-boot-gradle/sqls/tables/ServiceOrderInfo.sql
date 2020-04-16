-- auto Generated on 2020-04-12
DROP TABLE IF EXISTS service_order_info;
CREATE TABLE service_order_info
(
    id            BIGINT(15) NOT NULL AUTO_INCREMENT COMMENT '主键',
    create_time   DATETIME       DEFAULT '1000-01-01 00:00:00' COMMENT '创建时间',
    update_time   TIMESTAMP      DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    order_no      VARCHAR(50)    DEFAULT '' COMMENT '订单号',
    customer_id   BIGINT(15)     DEFAULT -1 COMMENT '客户ID',
    customer_name VARCHAR(50)    DEFAULT '' COMMENT '客户姓名',
    total_price   DECIMAL(13, 4) DEFAULT -1 COMMENT '总价',
    PRIMARY KEY (id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4 COMMENT 'service_order_info';
