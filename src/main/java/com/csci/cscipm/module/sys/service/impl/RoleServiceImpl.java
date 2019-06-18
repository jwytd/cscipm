package com.csci.cscipm.module.sys.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.csci.cscipm.module.sys.dao.RoleMapper;
import com.csci.cscipm.module.sys.model.Role;
import com.csci.cscipm.module.sys.service.IRoleService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色表 服务实现类
 * </p>
 *
 * @author wudan
 * @since 2019-06-01
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
