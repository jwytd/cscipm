package com.csci.cscipm.config.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author wd
 * @version V1.0
 * @date 2019/6/18 21:41
 * @description TODO
 */
@Component
@ConfigurationProperties(prefix = CsciProperties.PREFIX)
public class CsciProperties {

    public static final String PREFIX = "csci";

    private Boolean springSessionOpen = false;

    /**
     * session 失效时间（默认为30分钟 单位：秒）
     */
    private Integer sessionInvalidateTime = 30 * 60 * 60;

    /**
     * session 验证失效时间（默认为15分钟 单位：秒）
     */
    private Integer sessionValidationInterval = 15 * 60 * 60;

    public Boolean getSpringSessionOpen() {
        return springSessionOpen;
    }

    public void setSpringSessionOpen(Boolean springSessionOpen) {
        this.springSessionOpen = springSessionOpen;
    }

    public Integer getSessionInvalidateTime() {
        return sessionInvalidateTime;
    }

    public void setSessionInvalidateTime(Integer sessionInvalidateTime) {
        this.sessionInvalidateTime = sessionInvalidateTime;
    }

    public Integer getSessionValidationInterval() {
        return sessionValidationInterval;
    }

    public void setSessionValidationInterval(Integer sessionValidationInterval) {
        this.sessionValidationInterval = sessionValidationInterval;
    }
}