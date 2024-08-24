package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 学习历程
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-19 09:27:10
 */
@TableName("xuexilicheng")
public class XuexilichengEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XuexilichengEntity() {
		
	}
	
	public XuexilichengEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
    @TableId(type = IdType.AUTO)
    private Long id;
	/**
	 * 学号
	 */
					
	private String xuehao;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date xuexiriqi;
	
	/**
	 * 学习图片
	 */
					
	private String xuexitupian;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
