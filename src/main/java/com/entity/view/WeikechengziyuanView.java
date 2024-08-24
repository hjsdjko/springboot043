package com.entity.view;

import com.entity.WeikechengziyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 微课程资源
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-19 09:27:10
 */
@TableName("weikechengziyuan")
public class WeikechengziyuanView  extends WeikechengziyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WeikechengziyuanView(){
	}
 
 	public WeikechengziyuanView(WeikechengziyuanEntity weikechengziyuanEntity){
 	try {
			BeanUtils.copyProperties(this, weikechengziyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
