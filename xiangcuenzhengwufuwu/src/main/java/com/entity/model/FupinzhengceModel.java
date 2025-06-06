package com.entity.model;

import com.entity.FupinzhengceEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 扶贫政策
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class FupinzhengceModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 标题
     */
    private String fupinzhengceName;


    /**
     * 封面
     */
    private String fupinzhengcePhoto;


    /**
     * 福利
     */
    private String fupinzhengceFuli;


    /**
     * 详情
     */
    private String fupinzhengceContent;


    /**
     * 创建时间 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：标题
	 */
    public String getFupinzhengceName() {
        return fupinzhengceName;
    }


    /**
	 * 设置：标题
	 */
    public void setFupinzhengceName(String fupinzhengceName) {
        this.fupinzhengceName = fupinzhengceName;
    }
    /**
	 * 获取：封面
	 */
    public String getFupinzhengcePhoto() {
        return fupinzhengcePhoto;
    }


    /**
	 * 设置：封面
	 */
    public void setFupinzhengcePhoto(String fupinzhengcePhoto) {
        this.fupinzhengcePhoto = fupinzhengcePhoto;
    }
    /**
	 * 获取：福利
	 */
    public String getFupinzhengceFuli() {
        return fupinzhengceFuli;
    }


    /**
	 * 设置：福利
	 */
    public void setFupinzhengceFuli(String fupinzhengceFuli) {
        this.fupinzhengceFuli = fupinzhengceFuli;
    }
    /**
	 * 获取：详情
	 */
    public String getFupinzhengceContent() {
        return fupinzhengceContent;
    }


    /**
	 * 设置：详情
	 */
    public void setFupinzhengceContent(String fupinzhengceContent) {
        this.fupinzhengceContent = fupinzhengceContent;
    }
    /**
	 * 获取：创建时间 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
