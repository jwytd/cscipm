package com.csci.cscipm.module.sys.vo;

import com.csci.cscipm.core.common.CommonVo;

import java.util.List;

/**
 * @author wd
 * @version V1.0
 * @date 2019/6/1 18:03
 * @description TODO
 */
public class ResourceVo extends CommonVo {

    /**
     * 菜单编号
     */
    private String code;

    /**
     * 菜单父编号
     */
    private String parentCode;

    /**
     * 当前菜单的所有父菜单编号
     */
    private String parentCodes;

    /**
     * 菜单名称
     */
    private String name;

    /**
     * 菜单图标
     */
    private String icon;

    /**
     * url地址
     */
    private String url;

    /**
     * 菜单排序号
     */
    private Integer num;

    /**
     * 菜单层级
     */
    private Integer levels;

    /**
     * 是否是菜单（1：是  0：不是）
     */
    private Integer ismenu;

    /**
     * 备注
     */
    private String tips;

    /**
     * 菜单状态 :  1:启用   0:不启用
     */
    private Integer status;

    /**
     * 是否打开:    1:打开   0:不打开
     */
    private Integer isopen;
    /**
     * 子菜单
     */
    private List<ResourceVo> children;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public String getParentCodes() {
        return parentCodes;
    }

    public void setParentCodes(String parentCodes) {
        this.parentCodes = parentCodes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getLevels() {
        return levels;
    }

    public void setLevels(Integer levels) {
        this.levels = levels;
    }

    public Integer getIsmenu() {
        return ismenu;
    }

    public void setIsmenu(Integer ismenu) {
        this.ismenu = ismenu;
    }

    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIsopen() {
        return isopen;
    }

    public void setIsopen(Integer isopen) {
        this.isopen = isopen;
    }

    public List<ResourceVo> getChildren() {
        return children;
    }

    public void setChildren(List<ResourceVo> children) {
        this.children = children;
    }
}
