package org.yuan.admin.db.commons.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.admin.commons.entity.ICommonsEntity;

import java.util.Date;

/**
 * @program: my-admin-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-19 18:54
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class CommonsEntity extends ICommonsEntity {
    private Long id;
    private Date createTime;
    private Date updateTime;
}