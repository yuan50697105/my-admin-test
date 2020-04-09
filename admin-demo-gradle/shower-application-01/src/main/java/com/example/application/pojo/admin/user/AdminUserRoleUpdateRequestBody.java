package com.example.application.pojo.admin.user;

import lombok.Data;

import java.util.List;

@Data
public class AdminUserRoleUpdateRequestBody {
    private Long userId;
    private List<Long> roleIds;
}
