package com.example.application.controller;

import com.example.application.admin.pojo.role.AdminSysRoleSaveRequestBody;
import com.example.application.admin.pojo.role.AdminSysRoleUpdateRequestBody;
import com.example.application.service.AdminSysRoleService;
import com.example.commons.db.mybatis.plus.pagehelper.test.pojo.query.SysRoleQuery;
import com.example.commons.web.controller.BaseController;
import com.example.commons.web.pojo.Result;
import lombok.AllArgsConstructor;
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
@RequestMapping("admin/role")
@Validated
@AllArgsConstructor
public class AdminSysRoleController extends BaseController {
    private AdminSysRoleService adminSysRoleService;

    /**
     * 保存用户信息
     *
     * @param requestBody 请求实体
     * @return 处理结果
     */
    @PostMapping("save")
    public Result save(@RequestBody AdminSysRoleSaveRequestBody requestBody) {
        return adminSysRoleService.save(requestBody);
    }

    /**
     * 修改用户信息
     *
     * @param requestBody 请求实体
     * @return 处理结果
     */
    @PostMapping("update")
    public Result updateInfo(@RequestBody AdminSysRoleUpdateRequestBody requestBody) {
        return adminSysRoleService.update(requestBody);
    }

    /**
     * 删除用户
     *
     * @param id 主键
     * @return 处理结果
     */
    @GetMapping("delete/{id}")
    public Result delete(@PathVariable("id") Long id) {
        return adminSysRoleService.delete(id);
    }

    /**
     * 删除用户
     *
     * @param id 主键
     * @return 处理结果
     */
    @GetMapping("delete")
    public Result delete2(@RequestParam @NotNull Long id) {
        return adminSysRoleService.delete(id);
    }

    /**
     * 主键列表删除
     *
     * @param ids 主键列表
     * @return 处理结果
     */
    @GetMapping(value = "delete", params = "ids")
    public Result delete(@RequestParam @NotNull List<Long> ids) {
        return adminSysRoleService.delete(ids);
    }

    /**
     * 主键查询
     *
     * @param id 主键
     * @return 用户信息
     */
    @GetMapping("get/{id}")
    public Result get(@PathVariable("id") @NotNull Long id) {
        return adminSysRoleService.get(id);
    }

    /**
     * 主键查询
     *
     * @param id 主键
     * @return 用户信息
     */
    @GetMapping("get")
    public Result get2(@RequestParam @NotNull Long id) {
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