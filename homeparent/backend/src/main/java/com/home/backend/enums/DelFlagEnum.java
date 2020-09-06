package com.home.backend.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author guxc
 * @date 2020/9/6
 */
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
