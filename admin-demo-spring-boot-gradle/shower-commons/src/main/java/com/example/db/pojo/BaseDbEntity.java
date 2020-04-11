package com.example.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @program: admin-demo
 * @description:
 * @author: yuane
 * @create: 2020-03-26 23:33
 */
@EqualsAndHashCode(callSuper = true)
@Data
public abstract class BaseDbEntity extends com.example.commons.pojo.BaseEntity {
}