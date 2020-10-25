package com.home.common.exception;

import com.home.common.enums.LogLevelEnum;
import com.home.common.enums.ResCodeEnum;
import lombok.Getter;

/**
 * @author GTsung
 * @date 2020/10/24
 */
public class HomeException extends RuntimeException {

    @Getter
    private String code;

    @Getter
    private LogLevelEnum logLevel;

    public HomeException(String message) {
        super(message);
        this.code = ResCodeEnum.ERROR.getCode();
        this.logLevel = LogLevelEnum.INFO;
    }

    public HomeException(String code, String message) {
        super(message);
        this.code = code;
        this.logLevel = LogLevelEnum.INFO;
    }

    public HomeException(String code, String message, LogLevelEnum logLevel) {
        super(message);
        this.code = code;
        this.logLevel = logLevel;
    }
}
