package org.yuan.adminbase.commons.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.adminbase.commons.entity.ResponseResult;

/**
 * @program: admin-base
 * @description:
 * @author: yuane
 * @create: 2020-04-24 22:32
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ResponseResultRuntimeException extends RuntimeException{
    private ResponseResult<?> result;

    public ResponseResultRuntimeException(ResponseResult<?> result) {
        this.result = result;
    }

    public ResponseResultRuntimeException(ResponseResultException e) {
        this(e.getResult());
    }
}