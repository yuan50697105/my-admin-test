package org.yuan.admin.db.modules.entity;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.yuan.admin.db.commons.entity.CommonsEntity;

/**
 * sys_user
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class SysUser extends CommonsEntity {
    /**
     * username
     */
    private String username;

    /**
     * name
     */
    private String name;

    /**
     * password
     */
    private String password;

    /**
     * enabled
     */
    private String enabled;
}