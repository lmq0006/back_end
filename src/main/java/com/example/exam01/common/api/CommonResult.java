package com.example.exam01.common.api;



/**
 * 通用返回对象
 * Created by macro on 2019/4/19.
 */
public class CommonResult<T> {
    private long errno;

    private T data;
    protected CommonResult() {
    }

    protected CommonResult(long errno, T data) {
        this.errno = errno;
        this.data = data;
    }

    /**
     * 成功返回结果
     @param data 获取的数据
     */
    public static <T> CommonResult<T> success(T data) {
        return new CommonResult<T>(ResultCode.SUCCESS.getErrno(), data);
    }

    /**
     * 失败返回结果
     * @param errorCode 错误码
     */
    public static <T> CommonResult<T> failed(IErrorCode errorCode) {
        return new CommonResult<T>(errorCode.getErrno(), null);
    }

    /**
     * 失败返回结果
     */
    public static <T> CommonResult<T> failed() {
        return failed(ResultCode.FAILED);
    }

    /**
     * 参数验证失败返回结果
     */
    public static <T> CommonResult<T> validateFailed() {
        return failed(ResultCode.VALIDATE_FAILED);
    }



    /**
     * 未登录返回结果
     */
    public static <T> CommonResult<T> unauthorized(T data) {
        return new CommonResult<T>(ResultCode.UNAUTHORIZED.getErrno(), data);
    }

    /**
     * 未授权返回结果
     */
    public static <T> CommonResult<T> forbidden(T data) {
        return new CommonResult<T>(ResultCode.FORBIDDEN.getErrno(), data);
    }

    public long getErrno() {
        return errno;
    }

    public void setErrno(long errno) {
        this.errno = errno;
    }


// public long getCode() {
       // return code;
    //}

   // public void setCode(long errno) {
        //this.code = code;
   // }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
