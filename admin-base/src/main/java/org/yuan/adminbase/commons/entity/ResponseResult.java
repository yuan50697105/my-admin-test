package org.yuan.adminbase.commons.entity;

import lombok.Data;

/**
 * @program: admin-base
 * @description: 控制器与服务层相应结果
 * @author: yuane
 * @create: 2020-04-24 21:53
 */
@Data
public class ResponseResult<T> {
    /**
     * 编号、状态
     */
    private Integer code;
    /**
     * 同时信息
     */
    private String message;
    /**
     * 附带数据
     */
    private T data;

    public ResponseResult() {
    }

    public ResponseResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public ResponseResult(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}