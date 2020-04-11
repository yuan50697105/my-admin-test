package com.example.application.controller;

import com.example.application.pojo.admin.permission.AdminSysPermissionSaveRequestBody;
import com.example.application.pojo.admin.permission.AdminSysPermissionUpdateRequestBody;
import com.example.application.service.AdminSysPermissionService;
import com.example.commons.db.mybatis.base.pagehelper.test.pojo.query.SysPermissionQuery;
import com.example.commons.web.controller.BaseController;
import com.example.commons.web.pojo.Result;
import lombok.AllArgsConstructor;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @program: admin-demo-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-09 19:43
 */
@RestController
@RequestMapping(RouteConstants.AdminPermissionRouteConstants.BASE_URL)
@AllArgsConstructor
@Validated
public class AdminSysPermissionController extends BaseController {
    public static final String ID_NOT_NULL = "id not null";
    public static final String IDS_NOT_EMPTY = "ids not empty";
    private AdminSysPermissionService adminSysPermissionService;

    @RequestMapping({"save", ""})
    public Result save(@RequestBody @Validated AdminSysPermissionSaveRequestBody requestBody, BindingResult result) {
        validate(result);
        return adminSysPermissionService.save(requestBody);
    }

    @PostMapping("update")
    public Result update(@RequestBody @Validated AdminSysPermissionUpdateRequestBody requestBody, BindingResult result) {
        validate(result);
        return adminSysPermissionService.update(requestBody);
    }

    @PutMapping
    public Result update2(@RequestBody @Validated AdminSysPermissionUpdateRequestBody requestBody, BindingResult result) {
        validate(result);
        return adminSysPermissionService.update(requestBody);
    }

    @GetMapping(value = "delete", params = "id")
    public Result delete(@NotNull(message = ID_NOT_NULL) Long id) {
        return adminSysPermissionService.delete(id);
    }

    @GetMapping(value = "delete", params = "ids")
    public Result delete(@NotEmpty(message = IDS_NOT_EMPTY) List<Long> ids) {
        return adminSysPermissionService.delete(ids);
    }


    @GetMapping("delete/{id}")
    public Result delete2(@PathVariable("id") @NotNull(message = ID_NOT_NULL) Long id) {
        return adminSysPermissionService.delete(id);
    }

    @DeleteMapping("{id}")
    public Result delete3(@PathVariable("id") @NotNull(message = ID_NOT_NULL) Long id) {
        return adminSysPermissionService.delete(id);
    }

    @GetMapping(value = "get", params = "id")
    public Result get(@NotNull(message = ID_NOT_NULL) Long id) {
        return adminSysPermissionService.get(id);
    }

    @GetMapping({"get/{id}", "{id}"})
    public Result get2(@PathVariable("id") @NotNull(message = ID_NOT_NULL) Long id) {
        return adminSysPermissionService.get(id);
    }

    @GetMapping("data")
    public Result data(SysPermissionQuery query) {
        return adminSysPermissionService.data(query);
    }

    @GetMapping("list")
    public Result list(SysPermissionQuery query) {
        return adminSysPermissionService.list(query);
    }

}