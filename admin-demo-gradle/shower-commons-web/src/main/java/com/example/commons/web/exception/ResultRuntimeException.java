package com.example.commons.web.exception;

import com.example.commons.web.pojo.Result;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @program: admin-demo
 * @description:
 * @author: yuane
 * @create: 2020-03-26 23:22
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ResultRuntimeException extends RuntimeException {
    private Result result;

    public ResultRuntimeException(Result result) {
        this.result = result;
    }

    public ResultRuntimeException(String message, Result result) {
        super(message);
        this.result = result;
    }

    public ResultRuntimeException(String message, Throwable cause, Result result) {
        super(message, cause);
        this.result = result;
    }

    public ResultRuntimeException(Throwable cause, Result result) {
        super(cause);
        this.result = result;
    }

    public ResultRuntimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, Result result) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.result = result;
    }
}