package com.csci.cscipm.core.common;

/**
 * @author wd
 * @version V1.0
 * @date 2019/6/1 18:04
 * @description TODO
 */
public class CommonVo {

    protected String responseCode = "000000";
    protected String responseMsg = "成功";


    public String getResponseMsg() {
        return responseMsg;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public void setResponseMsg(String responseMsg) {
        this.responseMsg = responseMsg;
    }
}
