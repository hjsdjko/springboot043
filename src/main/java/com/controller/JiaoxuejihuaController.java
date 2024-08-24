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

import com.entity.JiaoxuejihuaEntity;
import com.entity.view.JiaoxuejihuaView;

import com.service.JiaoxuejihuaService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.EncryptUtil;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 教学计划
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-19 09:27:10
 */
@RestController
@RequestMapping("/jiaoxuejihua")
public class JiaoxuejihuaController {
    @Autowired
    private JiaoxuejihuaService jiaoxuejihuaService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JiaoxuejihuaEntity jiaoxuejihua,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			jiaoxuejihua.setJiaoshigonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JiaoxuejihuaEntity> ew = new EntityWrapper<JiaoxuejihuaEntity>();

		PageUtils page = jiaoxuejihuaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiaoxuejihua), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JiaoxuejihuaEntity jiaoxuejihua, 
		HttpServletRequest request){
        EntityWrapper<JiaoxuejihuaEntity> ew = new EntityWrapper<JiaoxuejihuaEntity>();

		PageUtils page = jiaoxuejihuaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiaoxuejihua), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JiaoxuejihuaEntity jiaoxuejihua){
       	EntityWrapper<JiaoxuejihuaEntity> ew = new EntityWrapper<JiaoxuejihuaEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jiaoxuejihua, "jiaoxuejihua")); 
        return R.ok().put("data", jiaoxuejihuaService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JiaoxuejihuaEntity jiaoxuejihua){
        EntityWrapper< JiaoxuejihuaEntity> ew = new EntityWrapper< JiaoxuejihuaEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jiaoxuejihua, "jiaoxuejihua")); 
		JiaoxuejihuaView jiaoxuejihuaView =  jiaoxuejihuaService.selectView(ew);
		return R.ok("查询教学计划成功").put("data", jiaoxuejihuaView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JiaoxuejihuaEntity jiaoxuejihua = jiaoxuejihuaService.selectById(id);
        return R.ok().put("data", jiaoxuejihua);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JiaoxuejihuaEntity jiaoxuejihua = jiaoxuejihuaService.selectById(id);
        return R.ok().put("data", jiaoxuejihua);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JiaoxuejihuaEntity jiaoxuejihua, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(jiaoxuejihua);
        jiaoxuejihuaService.insert(jiaoxuejihua);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JiaoxuejihuaEntity jiaoxuejihua, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(jiaoxuejihua);
        jiaoxuejihuaService.insert(jiaoxuejihua);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JiaoxuejihuaEntity jiaoxuejihua, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiaoxuejihua);
        jiaoxuejihuaService.updateById(jiaoxuejihua);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jiaoxuejihuaService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
