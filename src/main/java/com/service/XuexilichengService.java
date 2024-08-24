package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XuexilichengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XuexilichengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XuexilichengView;


/**
 * 学习历程
 *
 * @author 
 * @email 
 * @date 2024-04-19 09:27:10
 */
public interface XuexilichengService extends IService<XuexilichengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XuexilichengVO> selectListVO(Wrapper<XuexilichengEntity> wrapper);
   	
   	XuexilichengVO selectVO(@Param("ew") Wrapper<XuexilichengEntity> wrapper);
   	
   	List<XuexilichengView> selectListView(Wrapper<XuexilichengEntity> wrapper);
   	
   	XuexilichengView selectView(@Param("ew") Wrapper<XuexilichengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XuexilichengEntity> wrapper);

   	

}

