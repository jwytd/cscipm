package com.csci.cscipm.module.sys.vo;

import com.csci.cscipm.core.common.CommonVo;
import com.csci.cscipm.module.sys.model.User;

import java.util.List;

/**
 * @author wd
 * @version V1.0
 * @date 2019/6/1 18:03
 * @description TODO
 */
public class UserListVo extends CommonVo {

    //private int code = 0;
    private Long total;

    private List<User> data;

    public List<User> getData() {
        return data;
    }

    public void setData(List<User> data) {
        this.data = data;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

//    public int getCode() {
//        return code;
//    }
//
//    public void setCode(int code) {
//        this.code = code;
//    }
}
