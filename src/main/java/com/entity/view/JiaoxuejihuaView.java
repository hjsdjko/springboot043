package com.entity.view;

import com.entity.JiaoxuejihuaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 教学计划
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-19 09:27:10
 */
@TableName("jiaoxuejihua")
public class JiaoxuejihuaView  extends JiaoxuejihuaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiaoxuejihuaView(){
	}
 
 	public JiaoxuejihuaView(JiaoxuejihuaEntity jiaoxuejihuaEntity){
 	try {
			BeanUtils.copyProperties(this, jiaoxuejihuaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
