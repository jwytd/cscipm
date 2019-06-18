package com.csci.cscipm.module.sys.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 部门表
 * </p>
 *
 * @author wudan
 * @since 2019-06-08
 */
@TableName("sys_dept")
public class Dept extends Model<Dept> {

private static final long serialVersionUID=1L;

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 排序
     */
    private Integer num;

    /**
     * 父部门id
     */
    private Integer parentId;

    /**
     * 父级ids
     */
    private String parentIds;

    /**
     * 简称
     */
    private String simplename;

    /**
     * 全称
     */
    private String fullname;

    /**
     * 提示
     */
    private String tips;

    /**
     * 版本（乐观锁保留字段）
     */
    private Integer version;


    public Integer getId() {
        return id;
    }

    public Dept setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getNum() {
        return num;
    }

    public Dept setNum(Integer num) {
        this.num = num;
        return this;
    }

    public Integer getParentId() {
        return parentId;
    }

    public Dept setParentId(Integer parentId) {
        this.parentId = parentId;
        return this;
    }

    public String getParentIds() {
        return parentIds;
    }

    public Dept setParentIds(String parentIds) {
        this.parentIds = parentIds;
        return this;
    }

    public String getSimplename() {
        return simplename;
    }

    public Dept setSimplename(String simplename) {
        this.simplename = simplename;
        return this;
    }

    public String getFullname() {
        return fullname;
    }

    public Dept setFullname(String fullname) {
        this.fullname = fullname;
        return this;
    }

    public String getTips() {
        return tips;
    }

    public Dept setTips(String tips) {
        this.tips = tips;
        return this;
    }

    public Integer getVersion() {
        return version;
    }

    public Dept setVersion(Integer version) {
        this.version = version;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Dept{" +
        "id=" + id +
        ", num=" + num +
        ", parentId=" + parentId +
        ", parentIds=" + parentIds +
        ", simplename=" + simplename +
        ", fullname=" + fullname +
        ", tips=" + tips +
        ", version=" + version +
        "}";
    }
}
