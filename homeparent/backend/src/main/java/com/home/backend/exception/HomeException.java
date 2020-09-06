package com.home.backend.exception;

import com.home.backend.enums.LogLevelEnum;
import com.home.backend.enums.ResCodeEnum;
import lombok.Getter;

/**
 * @author guxc
 * @date 2020/9/6
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
