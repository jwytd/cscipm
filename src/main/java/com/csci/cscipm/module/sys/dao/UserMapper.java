package com.csci.cscipm.module.sys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.csci.cscipm.module.sys.model.User;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 管理员表 Mapper 接口
 * </p>
 *
 * @author wudan
 * @since 2019-05-25
 */
public interface UserMapper extends BaseMapper<User> {

    User getUserByAccount(String account);
    List<User> selectUsers(Map<String,Object> params);

}
