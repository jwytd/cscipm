package com.csci.cscipm.config;

import org.beetl.core.GroupTemplate;
import org.beetl.core.resource.ClasspathResourceLoader;
import org.beetl.ext.spring.BeetlGroupUtilConfiguration;
import org.beetl.ext.spring.BeetlSpringViewResolver;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wd
 * @version V1.0
 * @date 2019/5/29 21:19
 * @description TODO
 */
@Configuration
public class BeetlConfig {

    @Bean(initMethod ="init", name ="beetlGroupUtilConfiguration")
    public BeetlGroupUtilConfiguration getBeetlGroupUtilConfiguration() {
        BeetlGroupUtilConfiguration beetlGroupUtilConfiguration = new BeetlGroupUtilConfiguration();
        //获取Spring Boot 的ClassLoader
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        if (loader == null) {
            loader = SpringBootApplication.class.getClassLoader();
        }
//        try {
//            beetlGroupUtilConfiguration.setConfigProperties(PropertiesLoaderUtils.loadAllProperties("beetl.properties"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        ClasspathResourceLoader cploder = new ClasspathResourceLoader(loader, "pages");
        beetlGroupUtilConfiguration.setResourceLoader(cploder);
        beetlGroupUtilConfiguration.init();
        //如果使用了优化编译器，涉及到字节码操作，需要添加ClassLoader
        GroupTemplate groupTemplate = beetlGroupUtilConfiguration.getGroupTemplate();
        groupTemplate.setClassLoader(loader);
        return beetlGroupUtilConfiguration;
    }

    @Bean(name = "beetlViewResolver")
    public BeetlSpringViewResolver getBeetlSpringViewResolver(@Qualifier("beetlGroupUtilConfiguration") BeetlGroupUtilConfiguration beetlGroupUtilConfiguration) {
        BeetlSpringViewResolver beetlSpringViewResolver = new BeetlSpringViewResolver();
        beetlSpringViewResolver.setContentType("text/html;charset=UTF-8");
        beetlSpringViewResolver.setOrder(0);
        beetlSpringViewResolver.setConfig(beetlGroupUtilConfiguration);
        return beetlSpringViewResolver;
    }
}
