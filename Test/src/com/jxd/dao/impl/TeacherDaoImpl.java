/**  
 * �ļ�����TeacherDaoImpl.java  
 *  
 * �汾��Ϣ��  
 * ���ڣ�2017��8��10��  
 * Copyright Corporation 2017   
 * ��Ȩ����  
 *  
 */  
    
package com.jxd.dao.impl;

import com.jxd.dao.TeacherDao;

/**  
 * 
 * @Title: TeacherDaoImpl.java     
 * @Package com.jxd.dao.impl
 * @author yuanlin
 * @date 2017��8��10�� ����6:41:33  
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
	 * @date 2017��8��10�� ����6:43:09   
	 * @throws
	 */
	public static void endClazz(){
		System.out.println("�¿�");
	}
}
