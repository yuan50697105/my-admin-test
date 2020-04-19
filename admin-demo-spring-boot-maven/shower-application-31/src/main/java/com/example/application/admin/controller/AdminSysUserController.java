package com.example.application.admin.controller;

import com.example.application.admin.pojo.user.AdminSysUserSaveRequestBody;
import com.example.application.admin.pojo.user.AdminSysUserUpdateRequestBody;
import com.example.application.admin.pojo.user.AdminUserRoleUpdateRequestBody;
import com.example.application.admin.service.AdminSysUserService;
import com.example.commons.db.mybatis.jpa.base.pagehelper.module.constants.EnableConstants;
import com.example.commons.db.mybatis.jpa.base.pagehelper.module.pojo.query.SysUserQuery;
import com.example.commons.web.base.controller.BaseController;
import com.example.commons.web.base.pojo.Result;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-06 13:45
 */
@RestController
@RequestMapping("sys/user")
@Validated
@AllArgsConstructor
public class AdminSysUserController extends BaseController {
    public static final String ID_NOT_NULL = "id not null";
    public static final String IDS_NOT_EMPTY = "ids not empty";
    private final AdminSysUserService adminSysUserService;



    /**
     * 保存用户信息
     *
     * @param requestBody 请求实体
     * @return 处理结果
     */
    @PostMapping({"save", ""})
    public Result save(@RequestBody @Validated AdminSysUserSaveRequestBody requestBody) {
        return adminSysUserService.save(requestBody);
    }

    /**
     * 修改用户信息
     *
     * @param requestBody 请求实体
     * @return 处理结果
     */
    @PostMapping("update/info")
    public Result updateInfo(@RequestBody @Validated AdminSysUserUpdateRequestBody requestBody) {
        return adminSysUserService.updateInfo(requestBody);
    }

    /**
     * 修改用户信息
     *
     * @param requestBody 请求实体
     * @return 处理结果
     */
    @PutMapping("info")
    public Result updateInfo2(@RequestBody @Validated AdminSysUserUpdateRequestBody requestBody) {
        return adminSysUserService.updateInfo(requestBody);
    }

    /**
     * 修改角色信息
     *
     * @param requestBody 请求实体
     * @return 处理结果
     */
    @PostMapping("update/role")
    public Result updateRole(@RequestBody @Validated AdminUserRoleUpdateRequestBody requestBody) {
        return adminSysUserService.updateRole(requestBody);
    }

    /**
     * 修改角色信息
     *
     * @param requestBody 请求实体
     * @return 处理结果
     */
    @PutMapping("role")
    public Result updateRole2(@RequestBody @Validated AdminUserRoleUpdateRequestBody requestBody) {
        return adminSysUserService.updateRole(requestBody);
    }

    /**
     * 删除用户
     *
     * @param id 主键
     * @return 处理结果
     */
    @GetMapping("delete/{id}")
    @DeleteMapping("{id}")
    public Result delete3(@PathVariable("id") @NotNull(message = ID_NOT_NULL) Long id) {
        return adminSysUserService.delete(id);
    }

    /**
     * 删除用户
     *
     * @param id 主键
     * @return 处理结果
     */
    @DeleteMapping("{id}")
    public Result delete2(@PathVariable("id") @NotNull(message = ID_NOT_NULL) Long id) {
        return adminSysUserService.delete(id);
    }

    /**
     * 删除用户
     *
     * @param id 主键
     * @return 处理结果
     */
    @GetMapping(value = "delete", params = "id")
    public Result delete(@RequestParam @NotNull(message = ID_NOT_NULL) Long id) {
        return adminSysUserService.delete(id);
    }

    /**
     * 主键列表删除
     *
     * @param ids 主键列表
     * @return 处理结果
     */
    @GetMapping(value = "delete", params = "ids")
    public Result delete(@RequestParam @NotEmpty(message = IDS_NOT_EMPTY) List<Long> ids) {
        return adminSysUserService.delete(ids);
    }

    /**
     * 主键查询
     *
     * @param id 主键
     * @return 用户信息
     */
    @GetMapping({"get/{id}", "{id}"})
    public Result get2(@PathVariable("id") @NotNull(message = ID_NOT_NULL) Long id) {
        return adminSysUserService.get(id);
    }

    /**
     * 主键查询
     *
     * @param id 主键
     * @return 用户信息
     */
    @GetMapping(value = "get", params = "id")
    public Result get1(@RequestParam @NotNull(message = ID_NOT_NULL) Long id) {
        return adminSysUserService.get(id);
    }

    /**
     * 分页表格
     *
     * @param query 查询条件
     * @return 分页数据
     */
    @GetMapping("data")
    public Result data(SysUserQuery query) {
        return adminSysUserService.data(query);
    }

    /**
     * 列表查询
     *
     * @param query 查询条件
     * @return 数据列表
     */
    @GetMapping("list")
    public Result list(SysUserQuery query) {
        return adminSysUserService.list(query);
    }
}