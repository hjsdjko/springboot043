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


import com.dao.WeikechengziyuanDao;
import com.entity.WeikechengziyuanEntity;
import com.service.WeikechengziyuanService;
import com.entity.vo.WeikechengziyuanVO;
import com.entity.view.WeikechengziyuanView;

@Service("weikechengziyuanService")
public class WeikechengziyuanServiceImpl extends ServiceImpl<WeikechengziyuanDao, WeikechengziyuanEntity> implements WeikechengziyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WeikechengziyuanEntity> page = this.selectPage(
                new Query<WeikechengziyuanEntity>(params).getPage(),
                new EntityWrapper<WeikechengziyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WeikechengziyuanEntity> wrapper) {
		  Page<WeikechengziyuanView> page =new Query<WeikechengziyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<WeikechengziyuanVO> selectListVO(Wrapper<WeikechengziyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WeikechengziyuanVO selectVO(Wrapper<WeikechengziyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WeikechengziyuanView> selectListView(Wrapper<WeikechengziyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WeikechengziyuanView selectView(Wrapper<WeikechengziyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
