package com.home.backend.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum ResCodeEnum {

    SUCCESS("200", "成功"),
    ERROR("500", "内部错误"),
    ;

    @Getter
    private String code;

    @Getter
    private String message;
}
