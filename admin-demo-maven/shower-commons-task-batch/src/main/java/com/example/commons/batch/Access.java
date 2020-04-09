package com.example.commons.batch;

import lombok.Data;

import javax.persistence.*;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-05 17:59
 */
@Data
@Entity
@Table(name = "access")
public class Access {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String username;
    private String shopName;
    private String categoryName;
    private String brandName;
    private String shopId;
    private String omit;
    private String updateTime;
    @Transient
    private Boolean deleteStatus;
    private String createTime;
    private String description;
}