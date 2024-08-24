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

import com.entity.XuexiziyuanEntity;
import com.entity.view.XuexiziyuanView;

import com.service.XuexiziyuanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.EncryptUtil;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 学习资源
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-19 09:27:10
 */
@RestController
@RequestMapping("/xuexiziyuan")
public class XuexiziyuanController {
    @Autowired
    private XuexiziyuanService xuexiziyuanService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XuexiziyuanEntity xuexiziyuan,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			xuexiziyuan.setJiaoshigonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<XuexiziyuanEntity> ew = new EntityWrapper<XuexiziyuanEntity>();

		PageUtils page = xuexiziyuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xuexiziyuan), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XuexiziyuanEntity xuexiziyuan, 
		HttpServletRequest request){
        EntityWrapper<XuexiziyuanEntity> ew = new EntityWrapper<XuexiziyuanEntity>();

		PageUtils page = xuexiziyuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xuexiziyuan), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XuexiziyuanEntity xuexiziyuan){
       	EntityWrapper<XuexiziyuanEntity> ew = new EntityWrapper<XuexiziyuanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xuexiziyuan, "xuexiziyuan")); 
        return R.ok().put("data", xuexiziyuanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XuexiziyuanEntity xuexiziyuan){
        EntityWrapper< XuexiziyuanEntity> ew = new EntityWrapper< XuexiziyuanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xuexiziyuan, "xuexiziyuan")); 
		XuexiziyuanView xuexiziyuanView =  xuexiziyuanService.selectView(ew);
		return R.ok("查询学习资源成功").put("data", xuexiziyuanView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XuexiziyuanEntity xuexiziyuan = xuexiziyuanService.selectById(id);
        return R.ok().put("data", xuexiziyuan);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XuexiziyuanEntity xuexiziyuan = xuexiziyuanService.selectById(id);
        return R.ok().put("data", xuexiziyuan);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XuexiziyuanEntity xuexiziyuan, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(xuexiziyuan);
        xuexiziyuanService.insert(xuexiziyuan);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XuexiziyuanEntity xuexiziyuan, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(xuexiziyuan);
        xuexiziyuanService.insert(xuexiziyuan);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody XuexiziyuanEntity xuexiziyuan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xuexiziyuan);
        xuexiziyuanService.updateById(xuexiziyuan);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xuexiziyuanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
