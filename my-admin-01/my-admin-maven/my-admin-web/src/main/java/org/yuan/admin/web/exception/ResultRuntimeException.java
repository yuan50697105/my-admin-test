package org.yuan.admin.web.exception;

import lombok.Data;
import org.yuan.admin.web.entity.Result;

/**
 * @program: my-admin-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-19 19:27
 */
@Data
public class ResultRuntimeException extends RuntimeException {
    private Result<?> result;

    public ResultRuntimeException(Result<?> result) {
        this.result = result;
    }

    public ResultRuntimeException(ResultException e) {
        this(e.getResult());
    }
}