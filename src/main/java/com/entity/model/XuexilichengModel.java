package com.entity.model;

import com.entity.XuexilichengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 学习历程
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-04-19 09:27:10
 */
public class XuexilichengModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
		
	/**
	 * 学习目标
	 */
	
	private String xueximubiao;
		
	/**
	 * 学习进度
	 */
	
	private String xuexijindu;
		
	/**
	 * 学习内容
	 */
	
	private String xuexineirong;
		
	/**
	 * 学习日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date xuexiriqi;
		
	/**
	 * 学习图片
	 */
	
	private String xuexitupian;
				
	
	/**
	 * 设置：学生姓名
	 */
	 
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
				
	
	/**
	 * 设置：学习目标
	 */
	 
	public void setXueximubiao(String xueximubiao) {
		this.xueximubiao = xueximubiao;
	}
	
	/**
	 * 获取：学习目标
	 */
	public String getXueximubiao() {
		return xueximubiao;
	}
				
	
	/**
	 * 设置：学习进度
	 */
	 
	public void setXuexijindu(String xuexijindu) {
		this.xuexijindu = xuexijindu;
	}
	
	/**
	 * 获取：学习进度
	 */
	public String getXuexijindu() {
		return xuexijindu;
	}
				
	
	/**
	 * 设置：学习内容
	 */
	 
	public void setXuexineirong(String xuexineirong) {
		this.xuexineirong = xuexineirong;
	}
	
	/**
	 * 获取：学习内容
	 */
	public String getXuexineirong() {
		return xuexineirong;
	}
				
	
	/**
	 * 设置：学习日期
	 */
	 
	public void setXuexiriqi(Date xuexiriqi) {
		this.xuexiriqi = xuexiriqi;
	}
	
	/**
	 * 获取：学习日期
	 */
	public Date getXuexiriqi() {
		return xuexiriqi;
	}
				
	
	/**
	 * 设置：学习图片
	 */
	 
	public void setXuexitupian(String xuexitupian) {
		this.xuexitupian = xuexitupian;
	}
	
	/**
	 * 获取：学习图片
	 */
	public String getXuexitupian() {
		return xuexitupian;
	}
			
}
