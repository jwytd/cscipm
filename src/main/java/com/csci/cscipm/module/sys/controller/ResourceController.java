package com.csci.cscipm.module.sys.controller;


import com.csci.cscipm.core.web.BaseController;
import com.csci.cscipm.module.sys.model.Resource;
import com.csci.cscipm.module.sys.service.IResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 菜单表 前端控制器
 * </p>
 *
 * @author wudan
 * @since 2019-06-01
 */
@RestController
@RequestMapping("/resource")
public class ResourceController extends BaseController {

    @Autowired
    IResourceService resourceService;

    @RequestMapping("/getResourceList")
    public List<Resource> getResourceList(){
        String resourceType = getParam("resourceType");
        return resourceService.getResourceList(resourceType);

    }
}

