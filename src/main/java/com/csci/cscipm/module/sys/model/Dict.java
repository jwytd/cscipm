package com.csci.cscipm.module.sys.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 字典表
 * </p>
 *
 * @author wudan
 * @since 2019-06-08
 */
@TableName("sys_dict")
public class Dict extends Model<Dict> {

private static final long serialVersionUID=1L;

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 排序
     */
    private Integer value;

    /**
     * 父级字典
     */
    private Integer parentId;

    /**
     * 名称
     */
    private String name;

    /**
     * 提示
     */
    private String tips;

    /**
     * 值
     */
    private String code;


    public Integer getId() {
        return id;
    }

    public Dict setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getValue() {
        return value;
    }

    public Dict setValue(Integer value) {
        this.value = value;
        return this;
    }

    public Integer getParentId() {
        return parentId;
    }

    public Dict setParentId(Integer parentId) {
        this.parentId = parentId;
        return this;
    }

    public String getName() {
        return name;
    }

    public Dict setName(String name) {
        this.name = name;
        return this;
    }

    public String getTips() {
        return tips;
    }

    public Dict setTips(String tips) {
        this.tips = tips;
        return this;
    }

    public String getCode() {
        return code;
    }

    public Dict setCode(String code) {
        this.code = code;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Dict{" +
        "id=" + id +
        ", value=" + value +
        ", parentId=" + parentId +
        ", name=" + name +
        ", tips=" + tips +
        ", code=" + code +
        "}";
    }
}
