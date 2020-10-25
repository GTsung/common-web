package com.home.common.response;

import com.home.common.enums.ResCodeEnum;
import lombok.Data;

/**
 * @author GTsung
 * @date 2020/9/14
 */
@Data
public class ResultData<T> {

    private int total;
    private String code;
    private T data;

    public ResultData() {}

    public ResultData(int total, T data) {
        this.total = total;
        this.data = data;
    }

    public ResultData(int total, String code, T data) {
        this.total = total;
        this.code = code;
        this.data = data;
    }

    public ResultData(String code, T data) {
        this.code = code;
        this.data = data;
    }

    public static ResultData success() {
        return new ResultData(ResCodeEnum.SUCCESS.getCode(), ResCodeEnum.SUCCESS.getMessage());
    }

    public static <T> ResultData success(T data) {
        return new ResultData(ResCodeEnum.SUCCESS.getCode(), data);
    }

    public static <T> ResultData success(int total, T data) {
        return new ResultData(total, ResCodeEnum.SUCCESS.getCode(), data);
    }

    public static ResultData error() {
        return new ResultData(ResCodeEnum.ERROR.getCode(), ResCodeEnum.ERROR.getMessage());
    }

    public static ResultData error(ResCodeEnum codeEnum) {
        return new ResultData(codeEnum.getCode(), codeEnum.getMessage());
    }

}
