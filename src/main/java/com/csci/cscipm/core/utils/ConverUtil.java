package com.csci.cscipm.core.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wd
 * @version V1.0
 * @date 2019/6/9 11:12
 * @description TODO
 */
public class ConverUtil {

    public static Map<String, Object> tableData(List<Object> result) {
        Map<String, Object> data = new HashMap<>();
        data.put("data", result);
        return data;
    }
}
