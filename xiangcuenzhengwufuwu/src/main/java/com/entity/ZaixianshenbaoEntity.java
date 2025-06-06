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
 * 在线申报
 *
 * @author 
 * @email
 */
@TableName("zaixianshenbao")
public class ZaixianshenbaoEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ZaixianshenbaoEntity() {

	}

	public ZaixianshenbaoEntity(T t) {
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
     * 申报项目
     */
    @TableField(value = "zaixianshenbao_types")

    private Integer zaixianshenbaoTypes;


    /**
     * 申报用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 申报结果
     */
    @TableField(value = "zaixianshenbao_yesno_types")

    private Integer zaixianshenbaoYesnoTypes;


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
	 * 设置：申报项目
	 */
    public Integer getZaixianshenbaoTypes() {
        return zaixianshenbaoTypes;
    }


    /**
	 * 获取：申报项目
	 */

    public void setZaixianshenbaoTypes(Integer zaixianshenbaoTypes) {
        this.zaixianshenbaoTypes = zaixianshenbaoTypes;
    }
    /**
	 * 设置：申报用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：申报用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：申报结果
	 */
    public Integer getZaixianshenbaoYesnoTypes() {
        return zaixianshenbaoYesnoTypes;
    }


    /**
	 * 获取：申报结果
	 */

    public void setZaixianshenbaoYesnoTypes(Integer zaixianshenbaoYesnoTypes) {
        this.zaixianshenbaoYesnoTypes = zaixianshenbaoYesnoTypes;
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
        return "Zaixianshenbao{" +
            "id=" + id +
            ", zaixianshenbaoTypes=" + zaixianshenbaoTypes +
            ", yonghuId=" + yonghuId +
            ", zaixianshenbaoYesnoTypes=" + zaixianshenbaoYesnoTypes +
            ", createTime=" + createTime +
        "}";
    }
}
