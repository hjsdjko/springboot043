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


import com.dao.XuexilichengDao;
import com.entity.XuexilichengEntity;
import com.service.XuexilichengService;
import com.entity.vo.XuexilichengVO;
import com.entity.view.XuexilichengView;

@Service("xuexilichengService")
public class XuexilichengServiceImpl extends ServiceImpl<XuexilichengDao, XuexilichengEntity> implements XuexilichengService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XuexilichengEntity> page = this.selectPage(
                new Query<XuexilichengEntity>(params).getPage(),
                new EntityWrapper<XuexilichengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XuexilichengEntity> wrapper) {
		  Page<XuexilichengView> page =new Query<XuexilichengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<XuexilichengVO> selectListVO(Wrapper<XuexilichengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XuexilichengVO selectVO(Wrapper<XuexilichengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XuexilichengView> selectListView(Wrapper<XuexilichengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XuexilichengView selectView(Wrapper<XuexilichengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
