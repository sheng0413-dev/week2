package com.liuyongsheng.utils;

import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {
	/**
	 * 1.判断源字符串是否有值，空引号和空格也算没值
	 */
	public static boolean isEmpty(String str){
		return str == null || str.trim().length()<=0;
	}
	
	
	/**
	 * 
	 * 2.判断是否为手机号码
	 * @param args
	 */
	
	public static boolean isPhone(String str){
		String reg = "1[3|5|7|8|9]\\d{9}";
		return str.matches(reg);
	}
	/**
	 * 3。判断是否为电子邮箱
	 * 
	 * @param args
	 */
	
	public static boolean isEmail(String str){
		String reg = "\\w+@\\w+(.com|.cn)";
		return str.matches(reg);
	}
	
	/**
	 * 4. 判断是否全部为字母
	 * @return
	 */
	public static boolean isString(String str){
		String reg = "[a-zA-Z]+";
		return str.matches(reg);
	}
	
	/**
	 * 5. 获取n位随机英文字符串
	 * @return
	 */
	public static String randomString(int length){
		String str ="";
		for (int i = 0; i < length; i++) {
			int num=(int) (Math.random()*123);
			if((num>64 && num<91)||(num>96 && num<123)){
				str+=(char)(num);
			}else{
				i--;
			}
		}
		return str;
	}
	
	/**
	 * 6. 判断List、Set之类的对象是否有值，对象为空算没值
	 * @param src
	 * @return
	 */
	public static boolean isEmpty(Collection<?> src){
		return src.isEmpty();
	}
	
	/**
	 * 7. 获取n位随机英文和数字字符串
	 * @param length
	 * @return
	 */
	public static String randomStringAndNumber(int length){
		String str ="";
		for (int i = 0; i < length; i++) {
			int num=(int) (Math.random()*123);
			if((num >47 && num<58)||(num>64 && num<91)||(num>96 && num<123)){
				str+=(char)(num);
			}else{
				i--;
			}
		}
		return str;
	}
	
	/**
	 * 8. 是否是纯数字
	 * @param str
	 * @return
	 */
	public static boolean isNumber(String str){
		boolean blank = StringUtil.isEmpty(str);
		if(!blank){
			Pattern pattern = Pattern.compile("^\\d*$");
			Matcher matcher = pattern.matcher(str);
			if(matcher.matches()){
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
	}
	
	/**
	 * 9. 判断参数是否为数字，包含小数
	 * @param str
	 * @return
	 */
	public static boolean isFloat(String str){
		boolean blank = StringUtil.isEmpty(str);
		if(!blank){
			Pattern pattern = Pattern.compile("^\\d+\\.?\\d*$");
			Matcher matcher = pattern.matcher(str);
			if(matcher.matches()){
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
	}
	
	/**
	 * 10. 获取n个随机中文字符串
	 * @return
	 */
	public static String getAChinese(int length) {
        StringBuilder str = new StringBuilder();
        int hs = 0 ;
        int ls = 0; 
        Random random = new Random();
        for(int i = 0 ; i < length ; i++){
	        hs = (176 + Math.abs(random.nextInt(39))); 
	        ls = (161 + Math.abs(random.nextInt(93)));
	        byte[] b = new byte[2];
	        b[0] = (new Integer(hs).byteValue());
	        b[1] = (new Integer(ls).byteValue());
	        try {
	          str.append(new String(b, "GBk")); 
	        } catch (UnsupportedEncodingException e) {
	          e.printStackTrace();
	        }
        }
        return str.toString();
  }
	
	public static boolean judgeTelephoneIsOk(String src){
		if(StringUtil.isNumber(src) && src.length()==11 && src.startsWith("1")){
			return true;
		}
		return false;
	}

	
}
