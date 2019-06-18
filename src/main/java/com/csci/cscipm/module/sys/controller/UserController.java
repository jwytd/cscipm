package com.csci.cscipm.module.sys.controller;


import com.csci.cscipm.core.constant.CsciConstant;
import com.csci.cscipm.core.web.BaseController;
import com.csci.cscipm.module.sys.service.IUserService;
import com.csci.cscipm.module.sys.vo.UserListVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * <p>
 * 管理员表 前端控制器
 * </p>
 *
 * @author wudan
 * @since 2019-05-25
 */
@RequestMapping("/user")
@Controller
public class UserController extends BaseController {

    @Resource
    IUserService userService;

    @RequestMapping("")
    public String userManger() {
        return CsciConstant.SYSTEM_MENU_PREFIX + "member-list.html";
    }

    @ResponseBody
    @RequestMapping("/user")
    public String getHello() {
        return userService.getById(1).toString();
    }

    @ResponseBody
    @RequestMapping("/list")
    public UserListVo getAllUser() {
        return userService.getAllUsers(getParams());
    }
}

