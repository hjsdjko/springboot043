package com.dao;

import com.entity.DiscussweikechengziyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussweikechengziyuanVO;
import com.entity.view.DiscussweikechengziyuanView;


/**
 * 微课程资源评论表
 * 
 * @author 
 * @email 
 * @date 2024-04-19 09:27:11
 */
public interface DiscussweikechengziyuanDao extends BaseMapper<DiscussweikechengziyuanEntity> {
	
	List<DiscussweikechengziyuanVO> selectListVO(@Param("ew") Wrapper<DiscussweikechengziyuanEntity> wrapper);
	
	DiscussweikechengziyuanVO selectVO(@Param("ew") Wrapper<DiscussweikechengziyuanEntity> wrapper);
	
	List<DiscussweikechengziyuanView> selectListView(@Param("ew") Wrapper<DiscussweikechengziyuanEntity> wrapper);

	List<DiscussweikechengziyuanView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussweikechengziyuanEntity> wrapper);

	
	DiscussweikechengziyuanView selectView(@Param("ew") Wrapper<DiscussweikechengziyuanEntity> wrapper);
	

}
