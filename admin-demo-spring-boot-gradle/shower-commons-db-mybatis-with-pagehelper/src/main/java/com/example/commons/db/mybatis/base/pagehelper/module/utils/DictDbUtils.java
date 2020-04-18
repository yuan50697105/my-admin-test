package com.example.commons.db.mybatis.base.pagehelper.module.utils;

import cn.hutool.extra.spring.SpringUtil;
import com.example.commons.db.mybatis.base.pagehelper.module.mapper.SysDictGroupMapper;
import com.example.commons.db.mybatis.base.pagehelper.module.mapper.SysDictMapper;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.SysDict;
import com.example.commons.db.mybatis.base.pagehelper.module.pojo.SysDictGroup;
import com.example.commons.utils.DictUtils;

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
public class DictDbUtils {
    public static void setDict(Class<?>... types) {
        SysDictGroupMapper sysDictGroupMapper = SpringUtil.getBean(SysDictGroupMapper.class);
        SysDictMapper sysDictMapper = SpringUtil.getBean(SysDictMapper.class);
        sysDictGroupMapper.deleteAll();
        sysDictMapper.deleteAll();
        for (Class<?> type : types) {
            Map<String, List<Map<String, String>>> dictList = DictUtils.getDictList(type);
            for (Map.Entry<String, List<Map<String, String>>> entry : dictList.entrySet()) {
                SysDictGroup sysDictGroup = new SysDictGroup();
                sysDictGroup.setKey(entry.getKey());
                sysDictGroup.setValue(entry.getKey());
                sysDictGroupMapper.insert(sysDictGroup);
                for (Map<String, String> map : entry.getValue()) {
                    ArrayList<SysDict> sysDicts = new ArrayList<>();
                    for (Map.Entry<String, String> stringEntry : map.entrySet()) {
                        SysDict sysDict = new SysDict();
                        sysDict.setKey(stringEntry.getKey());
                        sysDict.setValue(stringEntry.getValue());
                        sysDict.setGroupId(sysDictGroup.getId().toString());
                        sysDicts.add(sysDict);
                    }
                    sysDictMapper.batchInsert(sysDicts);
                }
            }
        }
    }

    public static void setDict(Class<?> type) {
        SysDictGroupMapper sysDictGroupMapper = SpringUtil.getBean(SysDictGroupMapper.class);
        SysDictMapper sysDictMapper = SpringUtil.getBean(SysDictMapper.class);
        Map<String, List<Map<String, String>>> dictList = DictUtils.getDictList(type);
        for (Map.Entry<String, List<Map<String, String>>> entry : dictList.entrySet()) {
            SysDictGroup sysDictGroup = new SysDictGroup();
            sysDictGroup.setKey(entry.getKey());
            sysDictGroup.setValue(entry.getKey());
            sysDictGroupMapper.insert(sysDictGroup);
            for (Map<String, String> map : entry.getValue()) {
                ArrayList<SysDict> sysDicts = new ArrayList<>();
                for (Map.Entry<String, String> stringEntry : map.entrySet()) {
                    SysDict sysDict = new SysDict();
                    sysDict.setKey(stringEntry.getKey());
                    sysDict.setValue(stringEntry.getValue());
                    sysDict.setGroupId(sysDictGroup.getId().toString());
                    sysDicts.add(sysDict);
                }
                sysDictMapper.batchInsert(sysDicts);
            }
        }
    }

    public static Map<String, List<Map<String, String>>> getAllDict() {
        SysDictGroupMapper sysDictGroupMapper = SpringUtil.getBean(SysDictGroupMapper.class);
        SysDictMapper sysDictMapper = SpringUtil.getBean(SysDictMapper.class);
        List<SysDictGroup> sysDictGroups = sysDictGroupMapper.selectAll();
        List<SysDict> sysDicts = sysDictMapper.selectAll();
        HashMap<String, List<Map<String, String>>> map = new HashMap<>();
        for (SysDictGroup sysDictGroup : sysDictGroups) {
            String key = sysDictGroup.getKey();
            Long groupId = sysDictGroup.getId();
            Long id = sysDictGroup.getId();
            List<SysDict> dicts = sysDicts.stream().filter(sysDict -> sysDict.getGroupId().equals(groupId.toString())).collect(Collectors.toList());
            ArrayList<Map<String, String>> maps = new ArrayList<>();
            for (SysDict dict : dicts) {
                HashMap<String, String> hashMap = new HashMap<>();
                hashMap.put("key", dict.getKey());
                hashMap.put("value", dict.getValue());
                maps.add(hashMap);
            }
            map.put(key, maps);
        }
        return map;
    }

    public static List<Map<String, String>> getDictListByKey(String key) {
        return getAllDict().get(key);
    }

    public static String getDictValue(String group, String key) {
        String value = "";
        List<Map<String, String>> maps = getDictListByKey(group);
        for (Map<String, String> map : maps) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey().equals(key)) {
                    value = entry.getValue();
                }
            }
        }
        return value;
    }


}