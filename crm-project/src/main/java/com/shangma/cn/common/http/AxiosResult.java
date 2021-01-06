package com.shangma.cn.common.http;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * 开发者：辉哥
 * 特点： 辉哥很帅
 * 开发时间：2021/1/1 12:10
 * 文件说明：
 */
@Data
//转json的时候 只转 值不为null的
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AxiosResult<T> {
    private int status;
    private String message;
    private T data;

    private AxiosResult() {
    }

    /**
     * 成功返回的方法
     *
     * @param <T>
     * @return
     */
    public static <T> AxiosResult<T> success() {
        return setData(AxiosStatus.OK, null);
    }


    /**
     * 成功返回的方法 带数据
     */
    public static <T> AxiosResult<T> success(T data) {
        return setData(AxiosStatus.OK, data);
    }


    /**
     * 成功返回的方法自定义状态吗
     */
    public static <T> AxiosResult<T> success(AxiosStatus axiosStatus) {
        return setData(axiosStatus, null);
    }

    /**
     * 成功返回的方法自定义状态吗
     */
    public static <T> AxiosResult<T> success(AxiosStatus axiosStatus, T data) {
        return setData(axiosStatus, data);
    }


    /**
     * 错误的返回
     */
    public static <T> AxiosResult<T> error() {
        return setData(AxiosStatus.ERROE, null);
    }


    /**
     * 错误的返回自定义状态码
     */
    public static <T> AxiosResult<T> error(AxiosStatus axiosStatus) {
        return setData(axiosStatus, null);
    }


    /**
     * 错误的返回携带数据
     */
    public static <T> AxiosResult<T> error(T data) {
        return setData(AxiosStatus.ERROE, data);
    }

    /**
     * 错误的返回携带数据
     */
    public static <T> AxiosResult<T> error(AxiosStatus axiosStatus, T data) {
        return setData(axiosStatus, data);
    }


    /**
     * 封装数据公共方法
     *
     * @param axiosStatus
     * @param data
     * @param <T>
     * @return
     */
    private static <T> AxiosResult<T> setData(AxiosStatus axiosStatus, T data) {
        AxiosResult<T> axiosResult = new AxiosResult<>();
        axiosResult.setData(data);
        axiosResult.setStatus(axiosStatus.getStatus());
        axiosResult.setMessage(axiosStatus.getMessage());
        return axiosResult;
    }

}
