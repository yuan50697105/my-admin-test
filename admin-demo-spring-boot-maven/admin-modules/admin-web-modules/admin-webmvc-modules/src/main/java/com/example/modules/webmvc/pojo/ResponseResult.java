package com.example.modules.webmvc.pojo;

import lombok.*;

/**
 * @program: admin-demo-spring-boot-maven
 * @description:
 * @author: yuane
 * @create: 2020-04-19 13:34
 */
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class ResponseResult<T> {
    @NonNull
    private Integer code;
    @NonNull
    private String message;
    private T data;
}