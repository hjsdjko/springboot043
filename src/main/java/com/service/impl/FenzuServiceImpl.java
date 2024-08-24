package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.FenzuDao;
import com.entity.FenzuEntity;
import com.service.FenzuService;
import com.entity.vo.FenzuVO;
import com.entity.view.FenzuView;

@Service("fenzuService")
public class FenzuServiceImpl extends ServiceImpl<FenzuDao, FenzuEntity> implements FenzuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FenzuEntity> page = this.selectPage(
                new Query<FenzuEntity>(params).getPage(),
                new EntityWrapper<FenzuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FenzuEntity> wrapper) {
		  Page<FenzuView> page =new Query<FenzuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<FenzuVO> selectListVO(Wrapper<FenzuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FenzuVO selectVO(Wrapper<FenzuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FenzuView> selectListView(Wrapper<FenzuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FenzuView selectView(Wrapper<FenzuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
