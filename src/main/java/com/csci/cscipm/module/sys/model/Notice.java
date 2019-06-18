package com.csci.cscipm.module.sys.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 通知表
 * </p>
 *
 * @author wudan
 * @since 2019-06-08
 */
@TableName("sys_notice")
public class Notice extends Model<Notice> {

private static final long serialVersionUID=1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 标题
     */
    private String title;

    /**
     * 类型
     */
    private Integer type;

    /**
     * 内容
     */
    private String content;

    /**
     * 创建时间
     */
    private LocalDateTime createtime;

    /**
     * 创建人
     */
    private Integer creater;


    public Integer getId() {
        return id;
    }

    public Notice setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Notice setTitle(String title) {
        this.title = title;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public Notice setType(Integer type) {
        this.type = type;
        return this;
    }

    public String getContent() {
        return content;
    }

    public Notice setContent(String content) {
        this.content = content;
        return this;
    }

    public LocalDateTime getCreatetime() {
        return createtime;
    }

    public Notice setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
        return this;
    }

    public Integer getCreater() {
        return creater;
    }

    public Notice setCreater(Integer creater) {
        this.creater = creater;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Notice{" +
        "id=" + id +
        ", title=" + title +
        ", type=" + type +
        ", content=" + content +
        ", createtime=" + createtime +
        ", creater=" + creater +
        "}";
    }
}
