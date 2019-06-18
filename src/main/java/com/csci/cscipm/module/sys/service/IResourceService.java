package com.csci.cscipm.module.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.csci.cscipm.module.sys.model.Resource;

import java.util.List;

/**
 * <p>
 * 菜单表 服务类
 * </p>
 *
 * @author wudan
 * @since 2019-06-01
 */
public interface IResourceService extends IService<Resource> {

    List<Resource> getResourceList(String resourceType);
}
