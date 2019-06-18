package com.csci.cscipm.module.sys.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.csci.cscipm.module.sys.dao.DictMapper;
import com.csci.cscipm.module.sys.model.Dict;
import com.csci.cscipm.module.sys.service.IDictService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 字典表 服务实现类
 * </p>
 *
 * @author wudan
 * @since 2019-06-01
 */
@Service
public class DictServiceImpl extends ServiceImpl<DictMapper, Dict> implements IDictService {

}
