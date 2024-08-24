package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussweikechengziyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussweikechengziyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussweikechengziyuanView;


/**
 * 微课程资源评论表
 *
 * @author 
 * @email 
 * @date 2024-04-19 09:27:11
 */
public interface DiscussweikechengziyuanService extends IService<DiscussweikechengziyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussweikechengziyuanVO> selectListVO(Wrapper<DiscussweikechengziyuanEntity> wrapper);
   	
   	DiscussweikechengziyuanVO selectVO(@Param("ew") Wrapper<DiscussweikechengziyuanEntity> wrapper);
   	
   	List<DiscussweikechengziyuanView> selectListView(Wrapper<DiscussweikechengziyuanEntity> wrapper);
   	
   	DiscussweikechengziyuanView selectView(@Param("ew") Wrapper<DiscussweikechengziyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussweikechengziyuanEntity> wrapper);

   	

}

