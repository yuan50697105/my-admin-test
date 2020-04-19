package com.example.commons.db.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.MappedSuperclass;

/**
 * @program: admin-demo
 * @description:
 * @author: yuane
 * @create: 2020-03-26 23:33
 */
@EqualsAndHashCode(callSuper = true)
@Data
@MappedSuperclass
public abstract class BaseDbEntity extends com.example.commons.base.pojo.BaseEntity {
}