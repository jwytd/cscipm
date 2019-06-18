package com.csci.cscipm.module.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.csci.cscipm.module.sys.model.User;
import com.csci.cscipm.module.sys.vo.UserListVo;

import java.util.Map;

/**
 * <p>
 * 管理员表 服务类
 * </p>
 *
 * @author wudan
 * @since 2019-05-25
 */
public interface IUserService extends IService<User> {

    /**
     * 通过账号获取用户信息
     * @param account
     * @return
     */
    User getUserByAccount(String account);

    UserListVo getAllUsers(Map<String,String> params);

}
