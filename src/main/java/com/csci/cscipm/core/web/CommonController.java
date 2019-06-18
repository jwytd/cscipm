package com.csci.cscipm.core.web;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wd
 * @version V1.0
 * @date 2019/6/4 22:38
 * @description TODO
 */
//@Controller
public class CommonController implements ErrorController {

    @RequestMapping("/error")
    public String errorViewer(){
        return "/system/error.html";
    }

    @Override
    public String getErrorPath() {
        return "/system/error.html";
    }
}
