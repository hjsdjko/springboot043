package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.WeikechengziyuanEntity;
import com.entity.view.WeikechengziyuanView;

import com.service.WeikechengziyuanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.EncryptUtil;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 微课程资源
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-19 09:27:10
 */
@RestController
@RequestMapping("/weikechengziyuan")
public class WeikechengziyuanController {
    @Autowired
    private WeikechengziyuanService weikechengziyuanService;

    @Autowired
    private StoreupService storeupService;



    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,WeikechengziyuanEntity weikechengziyuan,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			weikechengziyuan.setJiaoshigonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<WeikechengziyuanEntity> ew = new EntityWrapper<WeikechengziyuanEntity>();

		PageUtils page = weikechengziyuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, weikechengziyuan), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,WeikechengziyuanEntity weikechengziyuan, 
		HttpServletRequest request){
        EntityWrapper<WeikechengziyuanEntity> ew = new EntityWrapper<WeikechengziyuanEntity>();

		PageUtils page = weikechengziyuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, weikechengziyuan), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( WeikechengziyuanEntity weikechengziyuan){
       	EntityWrapper<WeikechengziyuanEntity> ew = new EntityWrapper<WeikechengziyuanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( weikechengziyuan, "weikechengziyuan")); 
        return R.ok().put("data", weikechengziyuanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(WeikechengziyuanEntity weikechengziyuan){
        EntityWrapper< WeikechengziyuanEntity> ew = new EntityWrapper< WeikechengziyuanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( weikechengziyuan, "weikechengziyuan")); 
		WeikechengziyuanView weikechengziyuanView =  weikechengziyuanService.selectView(ew);
		return R.ok("查询微课程资源成功").put("data", weikechengziyuanView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        WeikechengziyuanEntity weikechengziyuan = weikechengziyuanService.selectById(id);
        return R.ok().put("data", weikechengziyuan);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        WeikechengziyuanEntity weikechengziyuan = weikechengziyuanService.selectById(id);
        return R.ok().put("data", weikechengziyuan);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody WeikechengziyuanEntity weikechengziyuan, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(weikechengziyuan);
        weikechengziyuanService.insert(weikechengziyuan);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody WeikechengziyuanEntity weikechengziyuan, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(weikechengziyuan);
        weikechengziyuanService.insert(weikechengziyuan);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody WeikechengziyuanEntity weikechengziyuan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(weikechengziyuan);
        weikechengziyuanService.updateById(weikechengziyuan);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        weikechengziyuanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
