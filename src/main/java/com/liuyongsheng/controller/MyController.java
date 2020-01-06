package com.liuyongsheng.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.management.QueryEval;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageInfo;
import com.liuyongsheng.pojo.Complu;
import com.liuyongsheng.pojo.Querymodel;
import com.liuyongsheng.service.ColService;

@Controller
public class MyController {
	@Resource
	
	private ColService cs;
	
	//接收对象
	@RequestMapping("all")
	public String all(Model model,Querymodel m){
		//全查
		List<Complu> list = cs.all(m);
		//分页
		PageInfo<Complu> page =new PageInfo<Complu>(list);
		//返回分页值
		model.addAttribute("page", page);
		//返回对象
		model.addAttribute("m", m);
		return "list";
	}
}
