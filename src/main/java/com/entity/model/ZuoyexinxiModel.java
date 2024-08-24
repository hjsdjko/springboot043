package com.entity.model;

import com.entity.ZuoyexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 作业信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-04-19 09:27:10
 */
public class ZuoyexinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 作业名称
	 */
	
	private String zuoyemingcheng;
		
	/**
	 * 作业文件
	 */
	
	private String zuoyewenjian;
		
	/**
	 * 作业封面
	 */
	
	private String zuoyefengmian;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
		
	/**
	 * 教师工号
	 */
	
	private String jiaoshigonghao;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
		
	/**
	 * 作业内容
	 */
	
	private String zuoyeneirong;
		
	/**
	 * 倒计结束时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date reversetime;
				
	
	/**
	 * 设置：作业名称
	 */
	 
	public void setZuoyemingcheng(String zuoyemingcheng) {
		this.zuoyemingcheng = zuoyemingcheng;
	}
	
	/**
	 * 获取：作业名称
	 */
	public String getZuoyemingcheng() {
		return zuoyemingcheng;
	}
				
	
	/**
	 * 设置：作业文件
	 */
	 
	public void setZuoyewenjian(String zuoyewenjian) {
		this.zuoyewenjian = zuoyewenjian;
	}
	
	/**
	 * 获取：作业文件
	 */
	public String getZuoyewenjian() {
		return zuoyewenjian;
	}
				
	
	/**
	 * 设置：作业封面
	 */
	 
	public void setZuoyefengmian(String zuoyefengmian) {
		this.zuoyefengmian = zuoyefengmian;
	}
	
	/**
	 * 获取：作业封面
	 */
	public String getZuoyefengmian() {
		return zuoyefengmian;
	}
				
	
	/**
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
				
	
	/**
	 * 设置：教师工号
	 */
	 
	public void setJiaoshigonghao(String jiaoshigonghao) {
		this.jiaoshigonghao = jiaoshigonghao;
	}
	
	/**
	 * 获取：教师工号
	 */
	public String getJiaoshigonghao() {
		return jiaoshigonghao;
	}
				
	
	/**
	 * 设置：教师姓名
	 */
	 
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
				
	
	/**
	 * 设置：作业内容
	 */
	 
	public void setZuoyeneirong(String zuoyeneirong) {
		this.zuoyeneirong = zuoyeneirong;
	}
	
	/**
	 * 获取：作业内容
	 */
	public String getZuoyeneirong() {
		return zuoyeneirong;
	}
				
	
	/**
	 * 设置：倒计结束时间
	 */
	 
	public void setReversetime(Date reversetime) {
		this.reversetime = reversetime;
	}
	
	/**
	 * 获取：倒计结束时间
	 */
	public Date getReversetime() {
		return reversetime;
	}
			
}
