/**  
 * 文件名：TeacherDaoImpl.java  
 *  
 * 版本信息：  
 * 日期：2017年8月10日  
 * Copyright Corporation 2017   
 * 版权所有  
 *  
 */  
    
package com.jxd.dao.impl;

import com.jxd.dao.TeacherDao;

/**  
 * 
 * @Title: TeacherDaoImpl.java     
 * @Package com.jxd.dao.impl
 * @author yuanlin
 * @date 2017年8月10日 下午6:41:33  
 */

public class TeacherDaoImpl implements TeacherDao {

	/**
	 * to do   
	 * @see com.jxd.dao.TeacherDao#StartClazz()  
	 */

	@Override
	public void StartClazz() {
		System.out.println("Class begins");
	}
	/**
	 * 
	 * TODO end class
	 * @author: yuanlin
	 * @date 2017年8月10日 下午6:43:09   
	 * @throws
	 */
	public static void endClazz(){
		System.out.println("下课");
	}
}
