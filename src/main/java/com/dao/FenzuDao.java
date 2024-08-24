package com.dao;

import com.entity.FenzuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FenzuVO;
import com.entity.view.FenzuView;


/**
 * 分组
 * 
 * @author 
 * @email 
 * @date 2024-04-19 09:27:10
 */
public interface FenzuDao extends BaseMapper<FenzuEntity> {
	
	List<FenzuVO> selectListVO(@Param("ew") Wrapper<FenzuEntity> wrapper);
	
	FenzuVO selectVO(@Param("ew") Wrapper<FenzuEntity> wrapper);
	
	List<FenzuView> selectListView(@Param("ew") Wrapper<FenzuEntity> wrapper);

	List<FenzuView> selectListView(Pagination page,@Param("ew") Wrapper<FenzuEntity> wrapper);

	
	FenzuView selectView(@Param("ew") Wrapper<FenzuEntity> wrapper);
	

}
