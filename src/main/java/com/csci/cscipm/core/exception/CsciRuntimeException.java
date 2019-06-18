package com.csci.cscipm.core.exception;

/**
 * @author wd
 * @version V1.0
 * @date 2019/6/15 22:18
 * @description TODO
 */
public class CsciRuntimeException extends RuntimeException {
    private String responseCode;
    private String responseMsg;

    public CsciRuntimeException(String responseCode, String responseMsg) {
        this.responseCode = responseCode;
        this.responseMsg = responseMsg;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseMsg() {
        return responseMsg;
    }

    public void setResponseMsg(String responseMsg) {
        this.responseMsg = responseMsg;
    }
}
