package com.example.application.pojo.admin.user;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
public class AdminUserRoleUpdateRequestBody {
    public static final String USER_ID_NOT_NULL = "userId not null";
    public static final String ROLE_IDS_NOT_EMPTY = "roleIds not empty";
    @NotNull(message = USER_ID_NOT_NULL)
    private Long userId;
    @NotEmpty(message = ROLE_IDS_NOT_EMPTY)
    private List<Long> roleIds;
}
