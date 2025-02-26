package com.entity.view;

import com.entity.FenzuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 分组
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-19 09:27:10
 */
@TableName("fenzu")
public class FenzuView  extends FenzuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FenzuView(){
	}
 
 	public FenzuView(FenzuEntity fenzuEntity){
 	try {
			BeanUtils.copyProperties(this, fenzuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
