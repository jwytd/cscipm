package com.csci.cscipm.core.web;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @Description TODO
 * @Author wudan
 * @Date 2019-05-10 10:00
 */
public class HttpContext {


    /**
     * 获取HttpServletRequest
     *
     * @return
     */
    public static HttpServletRequest getRequest() {
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        if (requestAttributes == null) {
            return null;
        } else {
            return requestAttributes.getRequest();
        }
    }

    /**
     * 获取HttpServletResponse
     *
     * @return
     */
    public static HttpServletResponse getResponse() {
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        if (requestAttributes == null) {
            return null;
        } else {
            return requestAttributes.getResponse();
        }
    }

    /**
     * 获取请求参数
     *
     * @return
     */
    public static Map<String, String> getParameters() {
        HashMap<String, String> values = new HashMap<>();
        HttpServletRequest request = HttpContext.getRequest();
        if (request == null) {
            return values;
        }
        Enumeration enums = request.getParameterNames();
        while (enums.hasMoreElements()) {
            String paramName = (String) enums.nextElement();
            String paramValue = request.getParameter(paramName);
            values.put(paramName, paramValue);
        }
        return values;
    }

    /**
     * 获取参数
     * @param name
     * @return
     */
    public static String getParam(String name){
        return Objects.requireNonNull(getRequest()).getParameter(name);
    }

}
