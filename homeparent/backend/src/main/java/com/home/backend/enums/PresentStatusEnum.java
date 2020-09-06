package com.home.backend.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum PresentStatusEnum {

    NO_PRESENT_STATUS(0, "离职"),
    PRESENT_STATUS(1, "在职"),
    ;

    @Getter
    private Integer code;

    @Getter
    private String desc;

    public PresentStatusEnum getByCode(Integer code) {
        for (PresentStatusEnum statusEnum : PresentStatusEnum.values()) {
            if (statusEnum.getCode().equals(code)) {
                return statusEnum;
            }
        }
        return PresentStatusEnum.NO_PRESENT_STATUS;
    }
}
