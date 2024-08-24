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

import com.entity.XuexilichengEntity;
import com.entity.view.XuexilichengView;

import com.service.XuexilichengService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.EncryptUtil;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 学习历程
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-19 09:27:10
 */
@RestController
@RequestMapping("/xuexilicheng")
public class XuexilichengController {
    @Autowired
    private XuexilichengService xuexilichengService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XuexilichengEntity xuexilicheng,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			xuexilicheng.setXuehao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<XuexilichengEntity> ew = new EntityWrapper<XuexilichengEntity>();

		PageUtils page = xuexilichengService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xuexilicheng), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XuexilichengEntity xuexilicheng, 
		HttpServletRequest request){
        EntityWrapper<XuexilichengEntity> ew = new EntityWrapper<XuexilichengEntity>();

		PageUtils page = xuexilichengService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xuexilicheng), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XuexilichengEntity xuexilicheng){
       	EntityWrapper<XuexilichengEntity> ew = new EntityWrapper<XuexilichengEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xuexilicheng, "xuexilicheng")); 
        return R.ok().put("data", xuexilichengService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XuexilichengEntity xuexilicheng){
        EntityWrapper< XuexilichengEntity> ew = new EntityWrapper< XuexilichengEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xuexilicheng, "xuexilicheng")); 
		XuexilichengView xuexilichengView =  xuexilichengService.selectView(ew);
		return R.ok("查询学习历程成功").put("data", xuexilichengView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XuexilichengEntity xuexilicheng = xuexilichengService.selectById(id);
        return R.ok().put("data", xuexilicheng);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XuexilichengEntity xuexilicheng = xuexilichengService.selectById(id);
        return R.ok().put("data", xuexilicheng);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XuexilichengEntity xuexilicheng, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(xuexilicheng);
        xuexilichengService.insert(xuexilicheng);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XuexilichengEntity xuexilicheng, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(xuexilicheng);
        xuexilichengService.insert(xuexilicheng);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody XuexilichengEntity xuexilicheng, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xuexilicheng);
        xuexilichengService.updateById(xuexilicheng);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xuexilichengService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
