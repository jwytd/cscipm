package com.csci.cscipm.module.sys.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 操作日志
 * </p>
 *
 * @author wudan
 * @since 2019-06-08
 */
@TableName("sys_operation_log")
public class OperationLog extends Model<OperationLog> {

private static final long serialVersionUID=1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 日志类型
     */
    private String logtype;

    /**
     * 日志名称
     */
    private String logname;

    /**
     * 用户id
     */
    private Integer userid;

    /**
     * 类名称
     */
    private String classname;

    /**
     * 方法名称
     */
    private String method;

    /**
     * 创建时间
     */
    private LocalDateTime createtime;

    /**
     * 是否成功
     */
    private String succeed;

    /**
     * 备注
     */
    private String message;


    public Integer getId() {
        return id;
    }

    public OperationLog setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getLogtype() {
        return logtype;
    }

    public OperationLog setLogtype(String logtype) {
        this.logtype = logtype;
        return this;
    }

    public String getLogname() {
        return logname;
    }

    public OperationLog setLogname(String logname) {
        this.logname = logname;
        return this;
    }

    public Integer getUserid() {
        return userid;
    }

    public OperationLog setUserid(Integer userid) {
        this.userid = userid;
        return this;
    }

    public String getClassname() {
        return classname;
    }

    public OperationLog setClassname(String classname) {
        this.classname = classname;
        return this;
    }

    public String getMethod() {
        return method;
    }

    public OperationLog setMethod(String method) {
        this.method = method;
        return this;
    }

    public LocalDateTime getCreatetime() {
        return createtime;
    }

    public OperationLog setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
        return this;
    }

    public String getSucceed() {
        return succeed;
    }

    public OperationLog setSucceed(String succeed) {
        this.succeed = succeed;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public OperationLog setMessage(String message) {
        this.message = message;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "OperationLog{" +
        "id=" + id +
        ", logtype=" + logtype +
        ", logname=" + logname +
        ", userid=" + userid +
        ", classname=" + classname +
        ", method=" + method +
        ", createtime=" + createtime +
        ", succeed=" + succeed +
        ", message=" + message +
        "}";
    }
}
