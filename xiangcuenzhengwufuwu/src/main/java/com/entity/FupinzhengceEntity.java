package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 扶贫政策
 *
 * @author 
 * @email
 */
@TableName("fupinzhengce")
public class FupinzhengceEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public FupinzhengceEntity() {

	}

	public FupinzhengceEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
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
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Fupinzhengce{" +
            "id=" + id +
            ", fupinzhengceName=" + fupinzhengceName +
            ", fupinzhengcePhoto=" + fupinzhengcePhoto +
            ", fupinzhengceFuli=" + fupinzhengceFuli +
            ", fupinzhengceContent=" + fupinzhengceContent +
            ", createTime=" + createTime +
        "}";
    }
}
