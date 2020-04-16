package com.example.commons.db.mybatis.base.pagehelper.module.utils;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.extra.spring.SpringUtil;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.SysDictGroup;
import com.example.commons.db.mybatis.base.pagehelper.module.service.SysDictGroupService;
import com.example.commons.db.mybatis.base.pagehelper.module.service.SysDictService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @program: admin-demo-spring-boot-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-16 22:39
 */
public class DictUtils {

    public static List<Map<String, String>> getDictList(String group) {
        SysDictGroupService sysDictGroupService = SpringUtil.getBean(SysDictGroupService.class);
        SysDictService sysDictService = SpringUtil.getBean(SysDictService.class);
        SysDictGroup sysDictGroup = sysDictGroupService.getByKey(group);
        if (ObjectUtil.isNotEmpty(sysDictGroup)) {
            Long id = sysDictGroup.getId();
            return sysDictService.listByGroupId(id).stream().map(sysDict -> {
                HashMap<String, String> map = new HashMap<>();
                map.put("key", sysDict.getKey());
                map.put("value", sysDict.getValue());
                return map;
            }).collect(Collectors.toList());
        } else {
            return new ArrayList<>();
        }
    }

    public String getDictKey(String group, String value) {
        List<Map<String, String>> dictList = getDictList(group);
        for (Map<String, String> map : dictList) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getValue().equals(value)) {
                    return entry.getKey();
                }
            }
        }
        return "";
    }

    public String getDictValue(String group, String key) {
        List<Map<String, String>> dictList = getDictList(group);
        for (Map<String, String> map : dictList) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
        }
        return "";
    }

}