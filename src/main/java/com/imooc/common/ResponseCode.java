package com.imooc.common;

/**
 * Created by IntelliJ IDEA.
 * User: LiHanFei
 * Date_Time: 2019-01-1217:42
 * Package_Name:com.imooc.common
 */
public enum  ResponseCode {
    SUCCESS(0,"SUCCESS"),
    ERROR(1,"ERROR"),
    ILLEGAL_ARGUMENT(2,"ILLEGAL_ARGUMENT");


    private final int code;

    private final String desc;

    ResponseCode(int code,String desc){
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
