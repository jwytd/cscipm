package com.csci.cscipm.module.sys.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 角色和菜单关联表
 * </p>
 *
 * @author wudan
 * @since 2019-06-08
 */
@TableName("sys_relation")
public class Relation extends Model<Relation> {

private static final long serialVersionUID=1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 菜单id
     */
    private Long resourceId;

    /**
     * 角色id
     */
    private Integer roleId;


    public Integer getId() {
        return id;
    }

    public Relation setId(Integer id) {
        this.id = id;
        return this;
    }

    public Long getResourceId() {
        return resourceId;
    }

    public Relation setResourceId(Long resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public Relation setRoleId(Integer roleId) {
        this.roleId = roleId;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Relation{" +
        "id=" + id +
        ", resourceId=" + resourceId +
        ", roleId=" + roleId +
        "}";
    }
}
