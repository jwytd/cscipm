package com.csci.cscipm.module.sys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.csci.cscipm.module.sys.model.Resource;

import java.util.List;

/**
 * <p>
 * 菜单表 Mapper 接口
 * </p>
 *
 * @author wudan
 * @since 2019-06-01
 */
public interface ResourceMapper extends BaseMapper<Resource> {

    List<Resource> getResourceList(String resourceType);

}
