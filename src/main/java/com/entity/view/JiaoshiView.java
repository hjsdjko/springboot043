package com.entity.view;

import com.entity.JiaoshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 教师
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-19 09:27:09
 */
@TableName("jiaoshi")
public class JiaoshiView  extends JiaoshiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiaoshiView(){
	}
 
 	public JiaoshiView(JiaoshiEntity jiaoshiEntity){
 	try {
			BeanUtils.copyProperties(this, jiaoshiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}