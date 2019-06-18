package com.csci.cscipm.module.sys.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.csci.cscipm.module.sys.dao.UserMapper;
import com.csci.cscipm.module.sys.model.User;
import com.csci.cscipm.module.sys.service.IUserService;
import com.csci.cscipm.module.sys.vo.UserListVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

/**
 * <p>
 * 管理员表 服务实现类
 * </p>
 *
 * @author wudan
 * @since 2019-05-25
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {


    @Resource
    UserMapper userMapper;

    @Override
    public User getUserByAccount(String account) {
        return userMapper.getUserByAccount(account);
    }

    @Override
    public UserListVo getAllUsers(Map<String, String> params) {
        String currentPage = (String) params.get("page");
        String limit = (String) params.get("limit");
        Page<User> page = new Page<User>(Long.valueOf(currentPage),Long.valueOf(limit));
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        System.out.println(JSONObject.toJSON(userMapper.selectPage(page,wrapper)).toString());
        IPage<User> users = userMapper.selectPage(page,wrapper);

        UserListVo userListVo = new UserListVo();
        userListVo.setData(users.getRecords());
        userListVo.setTotal(users.getTotal());
        return userListVo;
    }

}
