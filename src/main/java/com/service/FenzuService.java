package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FenzuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FenzuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FenzuView;


/**
 * 分组
 *
 * @author 
 * @email 
 * @date 2024-04-19 09:27:10
 */
public interface FenzuService extends IService<FenzuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FenzuVO> selectListVO(Wrapper<FenzuEntity> wrapper);
   	
   	FenzuVO selectVO(@Param("ew") Wrapper<FenzuEntity> wrapper);
   	
   	List<FenzuView> selectListView(Wrapper<FenzuEntity> wrapper);
   	
   	FenzuView selectView(@Param("ew") Wrapper<FenzuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FenzuEntity> wrapper);

   	

}

