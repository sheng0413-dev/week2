package com.liuyongsheng.service;

import java.util.List;

import com.liuyongsheng.pojo.Complu;
import com.liuyongsheng.pojo.Querymodel;

public interface ColService {
	//全查
	List<Complu> all(Querymodel m);
}
