package com.example.exam01.common.api;

public enum ResultCode implements IErrorCode {


    SUCCESS(0),
    FAILED(1),
    VALIDATE_FAILED(404),
    UNAUTHORIZED(401),
    FORBIDDEN(403);
    private long errno;

    private ResultCode(long errno) {
        this.errno = errno;

    }

    public long getErrno() {
        return errno;
    }


}
