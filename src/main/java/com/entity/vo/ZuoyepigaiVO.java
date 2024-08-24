package com.entity.vo;

import com.entity.ZuoyepigaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 作业批改
 * @author 
 * @email 
 * @date 2024-04-19 09:27:10
 */
public class ZuoyepigaiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 学号
	 */
	
	private String xuehao;
		
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
		
	/**
	 * 作业封面
	 */
	
	private String zuoyefengmian;
		
	/**
	 * 批改文件
	 */
	
	private String pigaiwenjian;
		
	/**
	 * 评语
	 */
	
	private String pingyu;
		
	/**
	 * 成绩
	 */
	
	private Integer chengji;
		
	/**
	 * 批改日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date pigairiqi;
		
	/**
	 * 教师工号
	 */
	
	private String jiaoshigonghao;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
		
	/**
	 * 易错题
	 */
	
	private String yicuoti;
				
	
	/**
	 * 设置：学号
	 */
	 
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
				
	
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
	 * 设置：批改文件
	 */
	 
	public void setPigaiwenjian(String pigaiwenjian) {
		this.pigaiwenjian = pigaiwenjian;
	}
	
	/**
	 * 获取：批改文件
	 */
	public String getPigaiwenjian() {
		return pigaiwenjian;
	}
				
	
	/**
	 * 设置：评语
	 */
	 
	public void setPingyu(String pingyu) {
		this.pingyu = pingyu;
	}
	
	/**
	 * 获取：评语
	 */
	public String getPingyu() {
		return pingyu;
	}
				
	
	/**
	 * 设置：成绩
	 */
	 
	public void setChengji(Integer chengji) {
		this.chengji = chengji;
	}
	
	/**
	 * 获取：成绩
	 */
	public Integer getChengji() {
		return chengji;
	}
				
	
	/**
	 * 设置：批改日期
	 */
	 
	public void setPigairiqi(Date pigairiqi) {
		this.pigairiqi = pigairiqi;
	}
	
	/**
	 * 获取：批改日期
	 */
	public Date getPigairiqi() {
		return pigairiqi;
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
	 * 设置：易错题
	 */
	 
	public void setYicuoti(String yicuoti) {
		this.yicuoti = yicuoti;
	}
	
	/**
	 * 获取：易错题
	 */
	public String getYicuoti() {
		return yicuoti;
	}
			
}
