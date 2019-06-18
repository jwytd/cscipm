package com.csci.cscipm.module.sys.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 角色表
 * </p>
 *
 * @author wudan
 * @since 2019-06-08
 */
@TableName("sys_role")
public class Role extends Model<Role> {

private static final long serialVersionUID=1L;

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 序号
     */
    private Integer num;

    /**
     * 父角色id
     */
    private Integer parentId;

    /**
     * 角色名称
     */
    private String name;

    /**
     * 部门名称
     */
    private Integer deptId;

    /**
     * 提示
     */
    private String tips;

    /**
     * 保留字段(暂时没用）
     */
    private Integer version;


    public Integer getId() {
        return id;
    }

    public Role setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getNum() {
        return num;
    }

    public Role setNum(Integer num) {
        this.num = num;
        return this;
    }

    public Integer getParentId() {
        return parentId;
    }

    public Role setParentId(Integer parentId) {
        this.parentId = parentId;
        return this;
    }

    public String getName() {
        return name;
    }

    public Role setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public Role setDeptId(Integer deptId) {
        this.deptId = deptId;
        return this;
    }

    public String getTips() {
        return tips;
    }

    public Role setTips(String tips) {
        this.tips = tips;
        return this;
    }

    public Integer getVersion() {
        return version;
    }

    public Role setVersion(Integer version) {
        this.version = version;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Role{" +
        "id=" + id +
        ", num=" + num +
        ", parentId=" + parentId +
        ", name=" + name +
        ", deptId=" + deptId +
        ", tips=" + tips +
        ", version=" + version +
        "}";
    }
}
