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


import com.dao.DiscussweikechengziyuanDao;
import com.entity.DiscussweikechengziyuanEntity;
import com.service.DiscussweikechengziyuanService;
import com.entity.vo.DiscussweikechengziyuanVO;
import com.entity.view.DiscussweikechengziyuanView;

@Service("discussweikechengziyuanService")
public class DiscussweikechengziyuanServiceImpl extends ServiceImpl<DiscussweikechengziyuanDao, DiscussweikechengziyuanEntity> implements DiscussweikechengziyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussweikechengziyuanEntity> page = this.selectPage(
                new Query<DiscussweikechengziyuanEntity>(params).getPage(),
                new EntityWrapper<DiscussweikechengziyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussweikechengziyuanEntity> wrapper) {
		  Page<DiscussweikechengziyuanView> page =new Query<DiscussweikechengziyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<DiscussweikechengziyuanVO> selectListVO(Wrapper<DiscussweikechengziyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussweikechengziyuanVO selectVO(Wrapper<DiscussweikechengziyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussweikechengziyuanView> selectListView(Wrapper<DiscussweikechengziyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussweikechengziyuanView selectView(Wrapper<DiscussweikechengziyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
