/**  
 * 文件名：Test.java  
 *  
 * 版本信息：  
 * 日期：2017年8月9日  
 * Copyright Corporation 2017   
 * 版权所有  
 *  
 */  
    
package com.jxd.test;

import java.io.UnsupportedEncodingException;


/**  
 * 
 * @Title: Test.java     
 * @Package com.jxd.test
 * @author yuanlin
 * @date 2017年8月9日 下午6:47:29  
 */

public class Test {
	public static void main(String[] args) {
		String s = "袁林";
		try {
			String ns = new String(s.getBytes("gbk"),"utf-8");
			System.out.println(ns+"::::ss");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		System.out.println("Goals determine what you will be.");
		System.out.println(s);
		try {
			String n2s = new String(s.getBytes("utf-8"),"gbk");
			System.out.println(n2s+"::::s2s");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		for(int i = 0;i < 10;i ++){
			System.out.println("You are the right one！");
		}
		System.out.println("It is you who show me the world beauty.");
	}
}
