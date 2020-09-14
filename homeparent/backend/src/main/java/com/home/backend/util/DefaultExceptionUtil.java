package com.home.backend.util;

import com.home.backend.response.ResultData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author GTsung
 * @date 2020/9/14
 */
@Slf4j
@RestControllerAdvice
public class DefaultExceptionUtil {

    @ExceptionHandler(value = Exception.class)
    public ResultData handlerException(Exception e) {
        return ExceptionUtil.handleException(e);
    }

}
