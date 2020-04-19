package org.yuan.admin.web.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.admin.web.entity.Result;

/**
 * @program: my-admin-gradle
 * @description:
 * @author: yuane
 * @create: 2020-04-19 19:26
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ResultException extends Exception{
    private Result<?> result;

    public ResultException(Result<?> result) {
        this.result = result;
    }


}