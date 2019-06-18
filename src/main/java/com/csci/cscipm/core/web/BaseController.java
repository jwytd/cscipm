package com.csci.cscipm.core.web;

import java.util.Map;

/**
 * @Description TODO
 * @Author wudan
 * @Date 2019-05-10 10:00
 */
public abstract class BaseController {

    private Map<String,String> params;

    protected Map<String, String> getParams() {
        return HttpContext.getParameters();
    }

    protected void setParams(Map<String, String> params) {
        this.params = params;
    }

    protected String getParam(String name){
        return HttpContext.getParam(name);
    }
}
