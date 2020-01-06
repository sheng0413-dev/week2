package com.liuyongsheng.utils;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.liuyongsheng.mapper.CompluMapper;
import com.liuyongsheng.pojo.Checks;
import com.liuyongsheng.pojo.Complu;

public class MyTest {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		CompluMapper co = ctx.getBean(CompluMapper.class);
		List<Object[]> list = IOUtils.readFile("cms.txt","\t");
		
		for (Object[] objects : list) {
			//.id值要使用isNumber()工具方法判断是不是数字
			if(StringUtil.isNumber(objects[0]+"")){
				 //keywords	、description、公司名称、主营产品、地址要使用hasText()方法判断有没有值
				if(StringUtil.isEmpty(objects[1]+"")&&StringUtil.isEmpty(objects[2]+"")&&StringUtil.isEmpty(objects[3]+"")&&StringUtil.isEmpty(objects[4]+"")&&StringUtil.isEmpty(objects[5]+"")){
					//注册资本要使用hasText()方法判断有没有值，并使用isNumber()判断是不是数字
					if(StringUtil.isEmpty(objects[6]+"")&&StringUtil.isNumber(objects[6]+"")){
						// 成立时间要使用hasText()方法判断有没有值
						if(StringUtil.isEmpty(objects[7]+"")){
							//添加数据
							Complu com = new Complu(objects[0]+"",objects[1]+"",objects[2]+"",objects[3]+"",objects[4]+"",objects[5]+"",objects[6]+"",DateUtil.stringToDate(objects[7]+""),objects[8]+"");
							co.save(com);
						}
					}
				}
			}
			//System.out.print(Integer.parseInt(objects[0]+""),objects[1]+"",objects[2]+"",objects[3]+"",objects[4]+"",objects[5]+"",Integer.parseInt(objects[6]+""),objects[7]+"",objects[8]+"",objects[9]+"",objects[10]+"");
		}
		
	}

}
