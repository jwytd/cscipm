package com.csci.cscipm.module.sys.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 登录记录
 * </p>
 *
 * @author wudan
 * @since 2019-06-08
 */
@TableName("sys_login_log")
public class LoginLog extends Model<LoginLog> {

private static final long serialVersionUID=1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 日志名称
     */
    private String logname;

    /**
     * 管理员id
     */
    private Integer userid;

    /**
     * 创建时间
     */
    private LocalDateTime createtime;

    /**
     * 是否执行成功
     */
    private String succeed;

    /**
     * 具体消息
     */
    private String message;

    /**
     * 登录ip
     */
    private String ip;


    public Integer getId() {
        return id;
    }

    public LoginLog setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getLogname() {
        return logname;
    }

    public LoginLog setLogname(String logname) {
        this.logname = logname;
        return this;
    }

    public Integer getUserid() {
        return userid;
    }

    public LoginLog setUserid(Integer userid) {
        this.userid = userid;
        return this;
    }

    public LocalDateTime getCreatetime() {
        return createtime;
    }

    public LoginLog setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
        return this;
    }

    public String getSucceed() {
        return succeed;
    }

    public LoginLog setSucceed(String succeed) {
        this.succeed = succeed;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public LoginLog setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getIp() {
        return ip;
    }

    public LoginLog setIp(String ip) {
        this.ip = ip;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "LoginLog{" +
        "id=" + id +
        ", logname=" + logname +
        ", userid=" + userid +
        ", createtime=" + createtime +
        ", succeed=" + succeed +
        ", message=" + message +
        ", ip=" + ip +
        "}";
    }
}
