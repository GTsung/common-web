package com.home.backend.util;

import com.home.backend.enums.ResCodeEnum;
import com.home.backend.exception.HomeException;
import com.home.backend.response.ResultData;
import lombok.extern.slf4j.Slf4j;

/**
 * @author GTsung
 * @date 2020/9/14
 */
@Slf4j
public class ExceptionUtil {

    public static ResultData handleException(Exception e) {
        log.info("出现异常{}", e.getMessage(), e);
        return dealException(e);
    }

    private static ResultData dealException(Exception e) {
        ResultData resultData = new ResultData();
        if (e instanceof HomeException) {
            HomeException exception = (HomeException) e;
            resultData.setCode(exception.getCode());
            resultData.setData(exception.getMessage());
        } else {
            resultData.setCode(ResCodeEnum.ERROR_50001.getCode());
            resultData.setData(ResCodeEnum.ERROR_50001.getMessage());
        }

        return resultData;
    }
}
