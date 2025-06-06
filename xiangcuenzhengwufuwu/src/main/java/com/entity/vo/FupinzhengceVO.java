package com.entity.vo;

import com.entity.FupinzhengceEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 扶贫政策
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("fupinzhengce")
public class FupinzhengceVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 标题
     */

    @TableField(value = "fupinzhengce_name")
    private String fupinzhengceName;


    /**
     * 封面
     */

    @TableField(value = "fupinzhengce_photo")
    private String fupinzhengcePhoto;


    /**
     * 福利
     */

    @TableField(value = "fupinzhengce_fuli")
    private String fupinzhengceFuli;


    /**
     * 详情
     */

    @TableField(value = "fupinzhengce_content")
    private String fupinzhengceContent;


    /**
     * 创建时间 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：标题
	 */
    public String getFupinzhengceName() {
        return fupinzhengceName;
    }


    /**
	 * 获取：标题
	 */

    public void setFupinzhengceName(String fupinzhengceName) {
        this.fupinzhengceName = fupinzhengceName;
    }
    /**
	 * 设置：封面
	 */
    public String getFupinzhengcePhoto() {
        return fupinzhengcePhoto;
    }


    /**
	 * 获取：封面
	 */

    public void setFupinzhengcePhoto(String fupinzhengcePhoto) {
        this.fupinzhengcePhoto = fupinzhengcePhoto;
    }
    /**
	 * 设置：福利
	 */
    public String getFupinzhengceFuli() {
        return fupinzhengceFuli;
    }


    /**
	 * 获取：福利
	 */

    public void setFupinzhengceFuli(String fupinzhengceFuli) {
        this.fupinzhengceFuli = fupinzhengceFuli;
    }
    /**
	 * 设置：详情
	 */
    public String getFupinzhengceContent() {
        return fupinzhengceContent;
    }


    /**
	 * 获取：详情
	 */

    public void setFupinzhengceContent(String fupinzhengceContent) {
        this.fupinzhengceContent = fupinzhengceContent;
    }
    /**
	 * 设置：创建时间 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
