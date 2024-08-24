package com.dao;

import com.entity.WeikechengziyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WeikechengziyuanVO;
import com.entity.view.WeikechengziyuanView;


/**
 * 微课程资源
 * 
 * @author 
 * @email 
 * @date 2024-04-19 09:27:10
 */
public interface WeikechengziyuanDao extends BaseMapper<WeikechengziyuanEntity> {
	
	List<WeikechengziyuanVO> selectListVO(@Param("ew") Wrapper<WeikechengziyuanEntity> wrapper);
	
	WeikechengziyuanVO selectVO(@Param("ew") Wrapper<WeikechengziyuanEntity> wrapper);
	
	List<WeikechengziyuanView> selectListView(@Param("ew") Wrapper<WeikechengziyuanEntity> wrapper);

	List<WeikechengziyuanView> selectListView(Pagination page,@Param("ew") Wrapper<WeikechengziyuanEntity> wrapper);

	
	WeikechengziyuanView selectView(@Param("ew") Wrapper<WeikechengziyuanEntity> wrapper);
	

}
