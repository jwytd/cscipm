package com.csci.cscipm.core.exception;

import com.csci.cscipm.core.constant.CsciExceptionConstant;
import org.apache.shiro.authc.*;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.lang.reflect.UndeclaredThrowableException;

import static com.csci.cscipm.core.web.HttpContext.getParam;

/**
 * @author wd
 * @version V1.0
 * @date 2019/6/15 22:16
 * @description TODO
 */
@ControllerAdvice
public class GlobalExceptionHandler {


    /**
     * 全局业务异常处理
     *
     * @param ex
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = CsciRuntimeException.class)
    public CsciRuntimeException errorHandler(CsciRuntimeException ex) {
        return ex;
    }

    /**
     * 用户未登录异常
     */
    @ExceptionHandler(AuthenticationException.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public String unAuth(AuthenticationException e) {
        return "/login.html";
    }

    /**
     * 账号被冻结异常
     */
    @ExceptionHandler({DisabledAccountException.class, LockedAccountException.class})
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public CsciRuntimeException accountLocked(DisabledAccountException e, Model model) {
        String username = getParam("username");
        return new CsciRuntimeException(CsciExceptionConstant.EXCEPTION_ACCOUNT_LOCKED_CODE,CsciExceptionConstant.EXCEPTION_ACCOUNT_LOCKED_MSG);
    }

    /**
     * 账号密码错误异常
     */
    @ResponseBody
    @ExceptionHandler({CredentialsException.class, UnknownAccountException.class,IncorrectCredentialsException.class})
    //@ResponseStatus(HttpStatus.UNAUTHORIZED)
    public CsciRuntimeException credentials() {
        String username = getParam("username");
        System.out.println(username);
        return new CsciRuntimeException(CsciExceptionConstant.EXCEPTION_ACCOUNT_PASSWORD_ERROR_CODE,CsciExceptionConstant.EXCEPTION_ACCOUNT_PASSWORD_ERROR_MSG);
    }

    /**
     * 验证码错误异常
     */
//    @ExceptionHandler(InvalidKaptchaException.class)
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    public String credentials(InvalidKaptchaException e, Model model) {
//        String username = getRequest().getParameter("username");
//        LogManager.me().executeLog(LogTaskFactory.loginLog(username, "验证码错误", getIp()));
//        model.addAttribute("tips", "验证码错误");
//        return "/login.html";
//    }

    /**
     * 无权访问该资源异常
     */
    @ExceptionHandler(UndeclaredThrowableException.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ResponseBody
    public CsciRuntimeException credentials(UndeclaredThrowableException e) {
        return new CsciRuntimeException(CsciExceptionConstant.EXCEPTION_UNDECLARED_CODE,CsciExceptionConstant.EXCEPTION_UNDECLARED_MSG);
    }
}
