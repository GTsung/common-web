package com.home.common.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum DelFlagEnum {

    PERSISTENT(0, "未删除"),
    DELETED(1, "已删除"),
    ;

    @Getter
    private Integer code;

    @Getter
    private String desc;

}
