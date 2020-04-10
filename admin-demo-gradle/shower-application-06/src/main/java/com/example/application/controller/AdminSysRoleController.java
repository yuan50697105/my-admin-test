package com.example.application.controller;

import com.example.application.pojo.admin.role.AdminSysPermissionUpdateRequestBody;
import com.example.application.pojo.admin.role.AdminSysRoleSaveRequestBody;
import com.example.application.pojo.admin.role.AdminSysRoleUpdateRequestBody;
import com.example.application.service.AdminSysRoleService;
import com.example.commons.constants.RouteConstants;
import com.example.commons.db.mybatis.mapper.base.sqlhelper.test.pojo.query.SysRoleQuery;
import com.example.commons.web.controller.BaseController;
import com.example.commons.web.pojo.Result;
import lombok.AllArgsConstructor;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-06 13:45
 */
@RestController
@RequestMapping(RouteConstants.AdminRoleRouteConstants.BASE_URL)
@Validated
@AllArgsConstructor
public class AdminSysRoleController extends BaseController {
    public static final String ID_NOT_NULL = "id not null";
    public static final String IDS_NOT_EMPTY = "ids not empty";
    private AdminSysRoleService adminSysRoleService;

    /**
     * 保存用户信息
     *
     * @param requestBody 请求实体
     * @return 处理结果
     */
    @PostMapping({"save", ""})
    public Result save(@RequestBody @Validated AdminSysRoleSaveRequestBody requestBody, BindingResult result) {
        validate(result);
        return adminSysRoleService.save(requestBody);
    }

    /**
     * 修改用户信息
     *
     * @param requestBody 请求实体
     * @return 处理结果
     */
    @PostMapping("update/info")
    public Result updateInfo(@RequestBody @Validated AdminSysRoleUpdateRequestBody requestBody) {
        return adminSysRoleService.updateInfo(requestBody);
    }

    /**
     * 修改用户信息
     *
     * @param requestBody 请求实体
     * @return 处理结果
     */
    @PutMapping("info")
    public Result updateInfo2(@RequestBody @Validated AdminSysRoleUpdateRequestBody requestBody) {
        return adminSysRoleService.updateInfo(requestBody);
    }

    /**
     * 更新权限
     *
     * @param requestBody 请求实体
     * @return 处理结果
     */
    @PostMapping("update/permission")
    public Result updatePermission(@RequestBody @Validated AdminSysPermissionUpdateRequestBody requestBody, BindingResult result) {
        validate(result);
        return adminSysRoleService.updatePermission(requestBody);
    }

    /**
     * 更新权限
     *
     * @param requestBody 请求实体
     * @param result      表单验证结果
     * @return 处理结果
     */
    @PutMapping("permission")
    public Result updatePermission2(@RequestBody @Validated AdminSysPermissionUpdateRequestBody requestBody, BindingResult result) {
        validate(result);
        return adminSysRoleService.updatePermission(requestBody);
    }

    /**
     * 删除用户
     *
     * @param id 主键
     * @return 处理结果
     */
    @GetMapping(value = "delete", params = "id")
    public Result delete(@RequestParam @NotNull(message = ID_NOT_NULL) Long id) {
        return adminSysRoleService.delete(id);
    }

    /**
     * 主键列表删除
     *
     * @param ids 主键列表
     * @return 处理结果
     */
    @GetMapping(value = "delete", params = "ids")
    public Result delete(@RequestParam @NotNull(message = IDS_NOT_EMPTY) List<Long> ids) {
        return adminSysRoleService.delete(ids);
    }

    /**
     * 删除用户
     *
     * @param id 主键
     * @return 处理结果
     */
    @DeleteMapping("{id}")
    public Result delete2(@PathVariable("id") @NotNull(message = ID_NOT_NULL) Long id) {
        return adminSysRoleService.delete(id);
    }

    /**
     * 删除用户
     *
     * @param id 主键
     * @return 处理结果
     */
    @GetMapping("delete/{id}")
    public Result delete3(@PathVariable("id") @NotNull(message = ID_NOT_NULL) Long id) {
        return adminSysRoleService.delete(id);
    }

    /**
     * 主键查询
     *
     * @param id 主键
     * @return 用户信息
     */
    @GetMapping(value = "get", params = "id")
    public Result get(@RequestParam @NotNull(message = ID_NOT_NULL) Long id) {
        return adminSysRoleService.get(id);
    }

    /**
     * 主键查询
     *
     * @param id 主键
     * @return 用户信息
     */
    @GetMapping({"get/{id}", "{id}"})
    public Result get2(@PathVariable("id") @NotNull(message = ID_NOT_NULL) Long id) {
        return adminSysRoleService.get(id);
    }

    /**
     * 分页表格
     *
     * @param query 查询条件
     * @return 分页数据
     */
    @GetMapping("data")
    public Result data(SysRoleQuery query) {
        return adminSysRoleService.data(query);
    }

    /**
     * 列表查询
     *
     * @param query 查询条件
     * @return 数据列表
     */
    @GetMapping("list")
    public Result list(SysRoleQuery query) {
        return adminSysRoleService.list(query);
    }
}