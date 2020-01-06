package com.liuyongsheng.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.liuyongsheng.mapper.CompluMapper;
import com.liuyongsheng.pojo.Complu;
import com.liuyongsheng.pojo.Querymodel;
@Service
public class ColServiceImpl implements ColService{
	
	@Resource
	
	private CompluMapper cm;
	//全查
	public List<Complu> all(Querymodel m) {
		// TODO Auto-generated method stub
		PageHelper.startPage(m.getPageNum(), m.getPageSize());
		return cm.all(m);
	}
	
}
