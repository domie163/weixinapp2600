package com.entity.model;

import com.entity.YuyuexiangmuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 我的预约
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class YuyuexiangmuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 预约项目
     */
    private Integer xiangmuId;


    /**
     * 预约用户
     */
    private Integer yonghuId;


    /**
     * 预约日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date yuyuexiangmuTime;


    /**
     * 预约地点
     */
    private String yuyuexiangmuAddress;


    /**
     * 预约结果
     */
    private Integer yuyuexiangmuYesnoTypes;


    /**
     * 创建时间
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
	 * 获取：预约项目
	 */
    public Integer getXiangmuId() {
        return xiangmuId;
    }


    /**
	 * 设置：预约项目
	 */
    public void setXiangmuId(Integer xiangmuId) {
        this.xiangmuId = xiangmuId;
    }
    /**
	 * 获取：预约用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：预约用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：预约日期
	 */
    public Date getYuyuexiangmuTime() {
        return yuyuexiangmuTime;
    }


    /**
	 * 设置：预约日期
	 */
    public void setYuyuexiangmuTime(Date yuyuexiangmuTime) {
        this.yuyuexiangmuTime = yuyuexiangmuTime;
    }
    /**
	 * 获取：预约地点
	 */
    public String getYuyuexiangmuAddress() {
        return yuyuexiangmuAddress;
    }


    /**
	 * 设置：预约地点
	 */
    public void setYuyuexiangmuAddress(String yuyuexiangmuAddress) {
        this.yuyuexiangmuAddress = yuyuexiangmuAddress;
    }
    /**
	 * 获取：预约结果
	 */
    public Integer getYuyuexiangmuYesnoTypes() {
        return yuyuexiangmuYesnoTypes;
    }


    /**
	 * 设置：预约结果
	 */
    public void setYuyuexiangmuYesnoTypes(Integer yuyuexiangmuYesnoTypes) {
        this.yuyuexiangmuYesnoTypes = yuyuexiangmuYesnoTypes;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
