package com.csci.cscipm.module.sys.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.csci.cscipm.module.sys.dao.RelationMapper;
import com.csci.cscipm.module.sys.model.Relation;
import com.csci.cscipm.module.sys.service.IRelationService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色和菜单关联表 服务实现类
 * </p>
 *
 * @author wudan
 * @since 2019-06-01
 */
@Service
public class RelationServiceImpl extends ServiceImpl<RelationMapper, Relation> implements IRelationService {

}
