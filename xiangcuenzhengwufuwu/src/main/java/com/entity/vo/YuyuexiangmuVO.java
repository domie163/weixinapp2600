package com.entity.vo;

import com.entity.YuyuexiangmuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 我的预约
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("yuyuexiangmu")
public class YuyuexiangmuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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

}
