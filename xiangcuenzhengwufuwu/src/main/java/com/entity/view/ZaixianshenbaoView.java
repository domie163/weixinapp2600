package com.entity.view;

import com.entity.ZaixianshenbaoEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 在线申报
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("zaixianshenbao")
public class ZaixianshenbaoView extends ZaixianshenbaoEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 申报项目的值
		*/
		private String zaixianshenbaoValue;
		/**
		* 申报结果的值
		*/
		private String zaixianshenbaoYesnoValue;



		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 手机号
			*/
			private String yonghuPhone;
			/**
			* 照片
			*/
			private String yonghuPhoto;
			/**
			* 家庭状况
			*/
			private Integer yonghuTypes;
				/**
				* 家庭状况的值
				*/
				private String yonghuValue;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public ZaixianshenbaoView() {

	}

	public ZaixianshenbaoView(ZaixianshenbaoEntity zaixianshenbaoEntity) {
		try {
			BeanUtils.copyProperties(this, zaixianshenbaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 申报项目的值
			*/
			public String getZaixianshenbaoValue() {
				return zaixianshenbaoValue;
			}
			/**
			* 设置： 申报项目的值
			*/
			public void setZaixianshenbaoValue(String zaixianshenbaoValue) {
				this.zaixianshenbaoValue = zaixianshenbaoValue;
			}
			/**
			* 获取： 申报结果的值
			*/
			public String getZaixianshenbaoYesnoValue() {
				return zaixianshenbaoYesnoValue;
			}
			/**
			* 设置： 申报结果的值
			*/
			public void setZaixianshenbaoYesnoValue(String zaixianshenbaoYesnoValue) {
				this.zaixianshenbaoYesnoValue = zaixianshenbaoYesnoValue;
			}


















				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 照片
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 照片
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 家庭状况
					*/
					public Integer getYonghuTypes() {
						return yonghuTypes;
					}
					/**
					* 设置： 家庭状况
					*/
					public void setYonghuTypes(Integer yonghuTypes) {
						this.yonghuTypes = yonghuTypes;
					}


						/**
						* 获取： 家庭状况的值
						*/
						public String getYonghuValue() {
							return yonghuValue;
						}
						/**
						* 设置： 家庭状况的值
						*/
						public void setYonghuValue(String yonghuValue) {
							this.yonghuValue = yonghuValue;
						}
					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}






}
