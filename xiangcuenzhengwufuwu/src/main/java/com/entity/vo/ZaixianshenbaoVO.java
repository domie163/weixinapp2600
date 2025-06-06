package com.entity.vo;

import com.entity.ZaixianshenbaoEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 在线申报
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("zaixianshenbao")
public class ZaixianshenbaoVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
