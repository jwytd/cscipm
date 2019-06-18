package com.csci.cscipm.core.utils;

import com.csci.cscipm.module.sys.model.Resource;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wd
 * @version V1.0
 * @date 2019/6/1 18:19
 * @description TODO
 */
public class ResourceTreeUtil {

    //将list集合转成树形结构的list集合
    public static List<Resource> listToTree(List<Resource> list) {
        //用递归找子。
        List<Resource> treeList = new ArrayList<Resource>();
        for (Resource tree : list) {
            if (tree.getParentCode().equals("0")) {
                treeList.add(findChildren(tree, list));
            }
        }
        return treeList;
    }

    //寻找子节点
    private static Resource findChildren(Resource tree, List<Resource> list) {
        for (Resource node : list) {
            if (node.getParentCode().equals(tree.getCode())) {
                if (tree.getChildren() == null) {
                    tree.setChildren(new ArrayList<Resource>());
                }
                tree.getChildren().add(findChildren(node, list));
            }
        }
        return tree;
    }
}
