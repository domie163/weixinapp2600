package com.entity.model;

import com.entity.ZaixianshenbaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 在线申报
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ZaixianshenbaoModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 申报项目
     */
    private Integer zaixianshenbaoTypes;


    /**
     * 申报用户
     */
    private Integer yonghuId;


    /**
     * 申报结果
     */
    private Integer zaixianshenbaoYesnoTypes;


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
	 * 获取：申报项目
	 */
    public Integer getZaixianshenbaoTypes() {
        return zaixianshenbaoTypes;
    }


    /**
	 * 设置：申报项目
	 */
    public void setZaixianshenbaoTypes(Integer zaixianshenbaoTypes) {
        this.zaixianshenbaoTypes = zaixianshenbaoTypes;
    }
    /**
	 * 获取：申报用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：申报用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：申报结果
	 */
    public Integer getZaixianshenbaoYesnoTypes() {
        return zaixianshenbaoYesnoTypes;
    }


    /**
	 * 设置：申报结果
	 */
    public void setZaixianshenbaoYesnoTypes(Integer zaixianshenbaoYesnoTypes) {
        this.zaixianshenbaoYesnoTypes = zaixianshenbaoYesnoTypes;
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
