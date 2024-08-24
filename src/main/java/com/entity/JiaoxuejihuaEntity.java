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
 * 教学计划
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-19 09:27:10
 */
@TableName("jiaoxuejihua")
public class JiaoxuejihuaEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiaoxuejihuaEntity() {
		
	}
	
	public JiaoxuejihuaEntity(T t) {
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
	 * 课程名称
	 */
					
	private String kechengmingcheng;
	
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
	 * 设置：课程名称
	 */
	public void setKechengmingcheng(String kechengmingcheng) {
		this.kechengmingcheng = kechengmingcheng;
	}
	/**
	 * 获取：课程名称
	 */
	public String getKechengmingcheng() {
		return kechengmingcheng;
	}
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
