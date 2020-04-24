package org.yuan.adminbase.commons.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.adminbase.commons.entity.ResponseResult;

/**
 * @program: admin-base
 * @description:
 * @author: yuane
 * @create: 2020-04-24 22:31
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ResponseResultException extends Exception{
    private ResponseResult<?> result;

    public ResponseResultException(ResponseResult<?> result) {
        this.result = result;
    }
}