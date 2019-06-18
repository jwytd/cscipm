package com.csci.cscipm.core.constant;

public interface CsciExceptionConstant {

    //账号冻结
    String EXCEPTION_ACCOUNT_LOCKED_CODE = "100001";
    String EXCEPTION_ACCOUNT_LOCKED_MSG = "账号冻结！";
    //账号密码错误异常
    String EXCEPTION_ACCOUNT_PASSWORD_ERROR_CODE = "100002";
    String EXCEPTION_ACCOUNT_PASSWORD_ERROR_MSG = "账号或密码错误！";
    //无权限访问资源
    String EXCEPTION_UNDECLARED_CODE = "100003";
    String EXCEPTION_UNDECLARED_MSG = "无权限访问！";

}
