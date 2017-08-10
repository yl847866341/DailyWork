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

import com.jxd.dao.TeacherDao;
import com.jxd.dao.impl.TeacherDaoImpl;

/**
 * 
 * @Title: Test.java
 * @Package com.jxd.test
 * @author yuanlin
 * @date 2017年8月9日 下午6:47:29
 */

public class Test {
	public static void main(String[] args) {
		String s = "yuanlin";
		try {
			String ns = new String(s.getBytes("gbk"), "utf-8");
			System.out.println(ns + "-----ss");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		System.out.println("Goals determine what you will be.");
		System.out.println(s);
		try {
			String n2s = new String(s.getBytes("utf-8"), "gbk");
			System.out.println("sdsf");
			System.out.println(n2s + "2b9s ssdf..sdf 2s");

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("You are the right one！");
		}
		System.out.println("就是这么任性");
		System.out.println("It is Diva who shows me the world's beauty.");
		// 下课
		TeacherDaoImpl.endClazz();
		TeacherDao teacherDaoImpl = new TeacherDaoImpl();
		// 上课
		teacherDaoImpl.StartClazz();
		System.out.println("Today ");
		/** 这是一个冲突测试 */
		System.out.println("Nowadays we have many changes");
	}
}
