package com.liuyongsheng.mapper;

import java.util.List;


import com.liuyongsheng.pojo.Complu;
import com.liuyongsheng.pojo.Querymodel;

public interface CompluMapper {
	//添加
	void save(Complu com);
	//全查
	List<Complu> all(Querymodel m);
}
