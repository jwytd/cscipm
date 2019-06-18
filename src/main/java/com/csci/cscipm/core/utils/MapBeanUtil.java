package com.csci.cscipm.core.utils;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/**
 * @author wd
 * @version V1.0
 * @date 2019/6/1 18:41
 * @description TODO
 */
public class MapBeanUtil {

    public static <T, K, V> T map2Bean(Map<K, V> mp, Class<T> beanCls)
            throws Exception, IllegalArgumentException, InvocationTargetException {
        T t = null;
        try {

            BeanInfo beanInfo = Introspector.getBeanInfo(beanCls);
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();

            t = beanCls.newInstance();

            for (PropertyDescriptor property : propertyDescriptors) {
                String key = property.getName();

                if (mp.containsKey(key)) {
                    Object value = mp.get(key);
                    Method setter = property.getWriteMethod();// Java中提供了用来访问某个属性的
                    // getter/setter方法
                    setter.invoke(t, value);
                }
            }

        } catch (IntrospectionException e) {

            e.printStackTrace();
        }
        return t;
    }
}
