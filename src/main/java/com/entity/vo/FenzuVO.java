package com.entity.vo;

import com.entity.FenzuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 分组
 * @author 
 * @email 
 * @date 2024-04-19 09:27:10
 */
public class FenzuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
		
	/**
	 * 学生手机
	 */
	
	private String xueshengshouji;
		
	/**
	 * 头像
	 */
	
	private String touxiang;
		
	/**
	 * 组号
	 */
	
	private String zuhao;
		
	/**
	 * 跨表用户id
	 */
	
	private Long crossuserid;
		
	/**
	 * 跨表主键id
	 */
	
	private Long crossrefid;
				
	
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
	 * 设置：学生手机
	 */
	 
	public void setXueshengshouji(String xueshengshouji) {
		this.xueshengshouji = xueshengshouji;
	}
	
	/**
	 * 获取：学生手机
	 */
	public String getXueshengshouji() {
		return xueshengshouji;
	}
				
	
	/**
	 * 设置：头像
	 */
	 
	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
	}
	
	/**
	 * 获取：头像
	 */
	public String getTouxiang() {
		return touxiang;
	}
				
	
	/**
	 * 设置：组号
	 */
	 
	public void setZuhao(String zuhao) {
		this.zuhao = zuhao;
	}
	
	/**
	 * 获取：组号
	 */
	public String getZuhao() {
		return zuhao;
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
