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
 * 我的预约
 *
 * @author 
 * @email
 */
@TableName("yuyuexiangmu")
public class YuyuexiangmuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YuyuexiangmuEntity() {

	}

	public YuyuexiangmuEntity(T t) {
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
     * 预约项目
     */
    @TableField(value = "xiangmu_id")

    private Integer xiangmuId;


    /**
     * 预约用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 预约日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat
    @TableField(value = "yuyuexiangmu_time")

    private Date yuyuexiangmuTime;


    /**
     * 预约地点
     */
    @TableField(value = "yuyuexiangmu_address")

    private String yuyuexiangmuAddress;


    /**
     * 预约结果
     */
    @TableField(value = "yuyuexiangmu_yesno_types")

    private Integer yuyuexiangmuYesnoTypes;


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
	 * 设置：预约项目
	 */
    public Integer getXiangmuId() {
        return xiangmuId;
    }


    /**
	 * 获取：预约项目
	 */

    public void setXiangmuId(Integer xiangmuId) {
        this.xiangmuId = xiangmuId;
    }
    /**
	 * 设置：预约用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：预约用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：预约日期
	 */
    public Date getYuyuexiangmuTime() {
        return yuyuexiangmuTime;
    }


    /**
	 * 获取：预约日期
	 */

    public void setYuyuexiangmuTime(Date yuyuexiangmuTime) {
        this.yuyuexiangmuTime = yuyuexiangmuTime;
    }
    /**
	 * 设置：预约地点
	 */
    public String getYuyuexiangmuAddress() {
        return yuyuexiangmuAddress;
    }


    /**
	 * 获取：预约地点
	 */

    public void setYuyuexiangmuAddress(String yuyuexiangmuAddress) {
        this.yuyuexiangmuAddress = yuyuexiangmuAddress;
    }
    /**
	 * 设置：预约结果
	 */
    public Integer getYuyuexiangmuYesnoTypes() {
        return yuyuexiangmuYesnoTypes;
    }


    /**
	 * 获取：预约结果
	 */

    public void setYuyuexiangmuYesnoTypes(Integer yuyuexiangmuYesnoTypes) {
        this.yuyuexiangmuYesnoTypes = yuyuexiangmuYesnoTypes;
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
        return "Yuyuexiangmu{" +
            "id=" + id +
            ", xiangmuId=" + xiangmuId +
            ", yonghuId=" + yonghuId +
            ", yuyuexiangmuTime=" + yuyuexiangmuTime +
            ", yuyuexiangmuAddress=" + yuyuexiangmuAddress +
            ", yuyuexiangmuYesnoTypes=" + yuyuexiangmuYesnoTypes +
            ", createTime=" + createTime +
        "}";
    }
}
