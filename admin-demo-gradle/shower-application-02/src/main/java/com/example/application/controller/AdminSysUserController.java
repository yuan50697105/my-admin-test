package com.example.application.controller;

import com.example.application.pojo.admin.user.AdminSysUserSaveRequestBody;
import com.example.application.pojo.admin.user.AdminSysUserUpdateRequestBody;
import com.example.application.service.AdminSysUserService;
import com.example.commons.constants.RouteConstants;
import com.example.commons.db.mybatis.base.sqlhelper.test.pojo.query.SysUserQuery;
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
@RequestMapping(RouteConstants.AdminUserRouteConstants.BASE_URL)
@Validated
@AllArgsConstructor
public class AdminSysUserController extends BaseController {
    private AdminSysUserService adminSysUserService;

    /**
     * 保存用户信息
     *
     * @param requestBody 请求实体
     * @return 处理结果
     */
    @PostMapping("save")
    public Result save(@RequestBody AdminSysUserSaveRequestBody requestBody) {
        return adminSysUserService.save(requestBody);
    }

    /**
     * 修改用户信息
     *
     * @param requestBody 请求实体
     * @return 处理结果
     */
    @PostMapping("update/info")
    public Result updateInfo(@RequestBody AdminSysUserUpdateRequestBody requestBody) {
        return adminSysUserService.updateInfo(requestBody);
    }

    /**
     * 删除用户
     *
     * @param id 主键
     * @return 处理结果
     */
    @GetMapping("delete/{id}")
    public Result delete(@PathVariable("id") Long id) {
        return adminSysUserService.delete(id);
    }

    /**
     * 删除用户
     *
     * @param id 主键
     * @return 处理结果
     */
    @GetMapping("delete")
    public Result delete2(@RequestParam @NotNull Long id) {
        return adminSysUserService.delete(id);
    }

    /**
     * 主键列表删除
     *
     * @param ids 主键列表
     * @return 处理结果
     */
    @GetMapping(value = "delete", params = "ids")
    public Result delete(@RequestParam @NotNull List<Long> ids) {
        return adminSysUserService.delete(ids);
    }

    /**
     * 主键查询
     *
     * @param id 主键
     * @return 用户信息
     */
    @GetMapping("get/{id}")
    public Result get(@PathVariable("id") @NotNull Long id) {
        return adminSysUserService.get(id);
    }

    /**
     * 主键查询
     *
     * @param id 主键
     * @return 用户信息
     */
    @GetMapping(value = "get",params = "id")
    public Result get2(@RequestParam @NotNull Long id) {
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