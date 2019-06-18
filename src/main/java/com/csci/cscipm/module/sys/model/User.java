package com.csci.cscipm.module.sys.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 管理员表
 * </p>
 *
 * @author wudan
 * @since 2019-06-08
 */
@TableName("sys_user")
public class User extends Model<User> {

private static final long serialVersionUID=1L;

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 账号
     */
    private String account;

    /**
     * 密码
     */
    private String password;

    /**
     * md5密码盐
     */
    private String salt;

    /**
     * 名字
     */
    private String name;

    /**
     * 生日
     */
    private LocalDateTime birthday;

    /**
     * 性别（1：男 2：女）
     */
    private Integer sex;

    /**
     * 电子邮件
     */
    private String email;

    /**
     * 电话
     */
    private String phone;

    /**
     * 角色id
     */
    private String roleIds;

    /**
     * 部门id
     */
    private Integer deptId;

    /**
     * 状态(1：启用  2：冻结  3：删除）
     */
    private Integer status;

    /**
     * 创建时间
     */
    private LocalDateTime createtime;

    /**
     * 保留字段
     */
    private Integer version;


    public Integer getId() {
        return id;
    }

    public User setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getAvatar() {
        return avatar;
    }

    public User setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }

    public String getAccount() {
        return account;
    }

    public User setAccount(String account) {
        this.account = account;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getSalt() {
        return salt;
    }

    public User setSalt(String salt) {
        this.salt = salt;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public User setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
        return this;
    }

    public Integer getSex() {
        return sex;
    }

    public User setSex(Integer sex) {
        this.sex = sex;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public User setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getRoleIds() {
        return roleIds;
    }

    public User setRoleIds(String roleIds) {
        this.roleIds = roleIds;
        return this;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public User setDeptId(Integer deptId) {
        this.deptId = deptId;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public User setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public LocalDateTime getCreatetime() {
        return createtime;
    }

    public User setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
        return this;
    }

    public Integer getVersion() {
        return version;
    }

    public User setVersion(Integer version) {
        this.version = version;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "User{" +
        "id=" + id +
        ", avatar=" + avatar +
        ", account=" + account +
        ", password=" + password +
        ", salt=" + salt +
        ", name=" + name +
        ", birthday=" + birthday +
        ", sex=" + sex +
        ", email=" + email +
        ", phone=" + phone +
        ", roleIds=" + roleIds +
        ", deptId=" + deptId +
        ", status=" + status +
        ", createtime=" + createtime +
        ", version=" + version +
        "}";
    }
}
