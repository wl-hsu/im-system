package com.wlh.im.common;


import com.wlh.im.common.exception.ApplicationExceptionEnum;


public enum BaseErrorCode implements ApplicationExceptionEnum {

    SUCCESS(200,"success"),
    SYSTEM_ERROR(90000,"Server Error"),
    PARAMETER_ERROR(90001,"Parameters Error");

    private int code;
    private String error;

    BaseErrorCode(int code, String error){
        this.code = code;
        this.error = error;
    }
    public int getCode() {
        return this.code;
    }

    public String getError() {
        return this.error;
    }

}
