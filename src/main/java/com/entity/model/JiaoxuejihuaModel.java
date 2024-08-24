package com.entity.model;

import com.entity.JiaoxuejihuaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 教学计划
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-04-19 09:27:10
 */
public class JiaoxuejihuaModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 课程分类
	 */
	
	private String kechengfenlei;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 教师工号
	 */
	
	private String jiaoshigonghao;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 课程大纲
	 */
	
	private String kechengdagang;
		
	/**
	 * 课程重点与难点
	 */
	
	private String kechengzhongdianyunandian;
		
	/**
	 * 课程知识模块
	 */
	
	private String kechengzhishimokuai;
		
	/**
	 * 考试大纲
	 */
	
	private String kaoshidagang;
				
	
	/**
	 * 设置：课程分类
	 */
	 
	public void setKechengfenlei(String kechengfenlei) {
		this.kechengfenlei = kechengfenlei;
	}
	
	/**
	 * 获取：课程分类
	 */
	public String getKechengfenlei() {
		return kechengfenlei;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
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
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
				
	
	/**
	 * 设置：课程大纲
	 */
	 
	public void setKechengdagang(String kechengdagang) {
		this.kechengdagang = kechengdagang;
	}
	
	/**
	 * 获取：课程大纲
	 */
	public String getKechengdagang() {
		return kechengdagang;
	}
				
	
	/**
	 * 设置：课程重点与难点
	 */
	 
	public void setKechengzhongdianyunandian(String kechengzhongdianyunandian) {
		this.kechengzhongdianyunandian = kechengzhongdianyunandian;
	}
	
	/**
	 * 获取：课程重点与难点
	 */
	public String getKechengzhongdianyunandian() {
		return kechengzhongdianyunandian;
	}
				
	
	/**
	 * 设置：课程知识模块
	 */
	 
	public void setKechengzhishimokuai(String kechengzhishimokuai) {
		this.kechengzhishimokuai = kechengzhishimokuai;
	}
	
	/**
	 * 获取：课程知识模块
	 */
	public String getKechengzhishimokuai() {
		return kechengzhishimokuai;
	}
				
	
	/**
	 * 设置：考试大纲
	 */
	 
	public void setKaoshidagang(String kaoshidagang) {
		this.kaoshidagang = kaoshidagang;
	}
	
	/**
	 * 获取：考试大纲
	 */
	public String getKaoshidagang() {
		return kaoshidagang;
	}
			
}
