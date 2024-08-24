package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WeikechengziyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WeikechengziyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WeikechengziyuanView;


/**
 * 微课程资源
 *
 * @author 
 * @email 
 * @date 2024-04-19 09:27:10
 */
public interface WeikechengziyuanService extends IService<WeikechengziyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WeikechengziyuanVO> selectListVO(Wrapper<WeikechengziyuanEntity> wrapper);
   	
   	WeikechengziyuanVO selectVO(@Param("ew") Wrapper<WeikechengziyuanEntity> wrapper);
   	
   	List<WeikechengziyuanView> selectListView(Wrapper<WeikechengziyuanEntity> wrapper);
   	
   	WeikechengziyuanView selectView(@Param("ew") Wrapper<WeikechengziyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WeikechengziyuanEntity> wrapper);

   	

}

