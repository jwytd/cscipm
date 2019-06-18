package com.csci.cscipm.module.sys.controller;

import com.csci.cscipm.core.constant.CsciConstant;
import com.csci.cscipm.core.web.BaseController;
import com.csci.cscipm.module.sys.vo.LoginVo;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController extends BaseController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return CsciConstant.SYSTEM_MENU_PREFIX + "login.html";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public LoginVo loginByPassword() {
        String username = super.getParam("username").trim();
        String password = super.getParam("password").trim();
        String remember = super.getParam("remember");

        Subject currentUser = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username, password.toCharArray());

        if ("on".equals(remember)) {
            token.setRememberMe(true);
        } else {
            token.setRememberMe(false);
        }

        currentUser.login(token);
        return new LoginVo();
    }

    @RequestMapping("/")
    public String index() {
        return CsciConstant.SYSTEM_MENU_PREFIX + "index.html";
    }

    @RequestMapping("/welcome")
    public String welcome() {
        return CsciConstant.SYSTEM_MENU_PREFIX + "welcome.html";
    }
}
