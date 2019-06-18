package com.csci.cscipm.module.sys.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.csci.cscipm.core.utils.ResourceTreeUtil;
import com.csci.cscipm.module.sys.dao.ResourceMapper;
import com.csci.cscipm.module.sys.model.Resource;
import com.csci.cscipm.module.sys.service.IResourceService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 菜单表 服务实现类
 * </p>
 *
 * @author wudan
 * @since 2019-06-01
 */
@Service
public class ResourceServiceImpl extends ServiceImpl<ResourceMapper, Resource> implements IResourceService {

    @javax.annotation.Resource
    ResourceMapper resourceMapper;

    @Override
    public List<Resource> getResourceList(String resourceType) {
        List<Resource> resourceList = resourceMapper.getResourceList(resourceType);
        System.out.println(JSONObject.toJSON(resourceList).toString());
        return ResourceTreeUtil.listToTree(resourceList);
    }
}
