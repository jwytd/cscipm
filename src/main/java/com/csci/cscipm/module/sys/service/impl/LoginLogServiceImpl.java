package com.csci.cscipm.module.sys.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.csci.cscipm.module.sys.dao.LoginLogMapper;
import com.csci.cscipm.module.sys.model.LoginLog;
import com.csci.cscipm.module.sys.service.ILoginLogService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 登录记录 服务实现类
 * </p>
 *
 * @author wudan
 * @since 2019-06-01
 */
@Service
public class LoginLogServiceImpl extends ServiceImpl<LoginLogMapper, LoginLog> implements ILoginLogService {

}
