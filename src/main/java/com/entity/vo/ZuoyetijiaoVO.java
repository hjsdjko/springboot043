package com.entity.vo;

import com.entity.ZuoyetijiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 作业提交
 * @author 
 * @email 
 * @date 2024-04-19 09:27:10
 */
public class ZuoyetijiaoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 教师工号
	 */
	
	private String jiaoshigonghao;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
		
	/**
	 * 作业封面
	 */
	
	private String zuoyefengmian;
		
	/**
	 * 提交作业
	 */
	
	private String tijiaozuoye;
		
	/**
	 * 提交时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tijiaoshijian;
		
	/**
	 * 学号
	 */
	
	private String xuehao;
		
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
		
	/**
	 * 提交备注
	 */
	
	private String tijiaobeizhu;
		
	/**
	 * 批改状态
	 */
	
	private String pigaizhuangtai;
		
	/**
	 * 跨表用户id
	 */
	
	private Long crossuserid;
		
	/**
	 * 跨表主键id
	 */
	
	private Long crossrefid;
				
	
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
	 * 设置：提交作业
	 */
	 
	public void setTijiaozuoye(String tijiaozuoye) {
		this.tijiaozuoye = tijiaozuoye;
	}
	
	/**
	 * 获取：提交作业
	 */
	public String getTijiaozuoye() {
		return tijiaozuoye;
	}
				
	
	/**
	 * 设置：提交时间
	 */
	 
	public void setTijiaoshijian(Date tijiaoshijian) {
		this.tijiaoshijian = tijiaoshijian;
	}
	
	/**
	 * 获取：提交时间
	 */
	public Date getTijiaoshijian() {
		return tijiaoshijian;
	}
				
	
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
	 * 设置：提交备注
	 */
	 
	public void setTijiaobeizhu(String tijiaobeizhu) {
		this.tijiaobeizhu = tijiaobeizhu;
	}
	
	/**
	 * 获取：提交备注
	 */
	public String getTijiaobeizhu() {
		return tijiaobeizhu;
	}
				
	
	/**
	 * 设置：批改状态
	 */
	 
	public void setPigaizhuangtai(String pigaizhuangtai) {
		this.pigaizhuangtai = pigaizhuangtai;
	}
	
	/**
	 * 获取：批改状态
	 */
	public String getPigaizhuangtai() {
		return pigaizhuangtai;
	}
				
	
	/**
	 * 设置：跨表用户id
	 */
	 
	public void setCrossuserid(Long crossuserid) {
		this.crossuserid = crossuserid;
	}
	
	/**
	 * 获取：跨表用户id
	 */
	public Long getCrossuserid() {
		return crossuserid;
	}
				
	
	/**
	 * 设置：跨表主键id
	 */
	 
	public void setCrossrefid(Long crossrefid) {
		this.crossrefid = crossrefid;
	}
	
	/**
	 * 获取：跨表主键id
	 */
	public Long getCrossrefid() {
		return crossrefid;
	}
			
}
