package com.home.backend.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum ResCodeEnum {

    SUCCESS("20000", "成功"),
    ERROR("50000", "内部错误"),
    ERROR_50001("50001", "其他错误"),
    ERROR_50002("50002", "参数错误"),
    ;

    @Getter
    private String code;

    @Getter
    private String message;
}
