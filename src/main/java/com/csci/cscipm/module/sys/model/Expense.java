package com.csci.cscipm.module.sys.model;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 报销表
 * </p>
 *
 * @author wudan
 * @since 2019-06-08
 */
@TableName("sys_expense")
public class Expense extends Model<Expense> {

private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 报销金额
     */
    private BigDecimal money;

    /**
     * 描述
     */
    private String desc;

    /**
     * 创建时间
     */
    private LocalDateTime createtime;

    /**
     * 状态: 1.待提交  2:待审核   3.审核通过 4:驳回
     */
    private Integer state;

    /**
     * 用户id
     */
    private Integer userid;

    /**
     * 流程定义id
     */
    @TableField("processId")
    private String processId;


    public Integer getId() {
        return id;
    }

    public Expense setId(Integer id) {
        this.id = id;
        return this;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public Expense setMoney(BigDecimal money) {
        this.money = money;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public Expense setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public LocalDateTime getCreatetime() {
        return createtime;
    }

    public Expense setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
        return this;
    }

    public Integer getState() {
        return state;
    }

    public Expense setState(Integer state) {
        this.state = state;
        return this;
    }

    public Integer getUserid() {
        return userid;
    }

    public Expense setUserid(Integer userid) {
        this.userid = userid;
        return this;
    }

    public String getProcessId() {
        return processId;
    }

    public Expense setProcessId(String processId) {
        this.processId = processId;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Expense{" +
        "id=" + id +
        ", money=" + money +
        ", desc=" + desc +
        ", createtime=" + createtime +
        ", state=" + state +
        ", userid=" + userid +
        ", processId=" + processId +
        "}";
    }
}
