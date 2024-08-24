package com.dao;

import com.entity.XuexilichengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XuexilichengVO;
import com.entity.view.XuexilichengView;


/**
 * 学习历程
 * 
 * @author 
 * @email 
 * @date 2024-04-19 09:27:10
 */
public interface XuexilichengDao extends BaseMapper<XuexilichengEntity> {
	
	List<XuexilichengVO> selectListVO(@Param("ew") Wrapper<XuexilichengEntity> wrapper);
	
	XuexilichengVO selectVO(@Param("ew") Wrapper<XuexilichengEntity> wrapper);
	
	List<XuexilichengView> selectListView(@Param("ew") Wrapper<XuexilichengEntity> wrapper);

	List<XuexilichengView> selectListView(Pagination page,@Param("ew") Wrapper<XuexilichengEntity> wrapper);

	
	XuexilichengView selectView(@Param("ew") Wrapper<XuexilichengEntity> wrapper);
	

}
