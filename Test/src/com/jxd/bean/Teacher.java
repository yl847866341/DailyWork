/**  
 * 文件名：Teacher.java  
 *  
 * 版本信息：  
 * 日期：2017年8月10日  
 * Copyright Corporation 2017   
 * 版权所有  
 *  
 */  
    
package com.jxd.bean;

/**  
 * 
 * @Title: Teacher.java     
 * @Package com.jxd.bean
 * @author yuanlin
 * @date 2017年8月10日 下午4:21:01  
 */

public class Teacher {
	private String teacherName;
	private String teacherSubject;
	private String teachClazz;
	private String teacherTel;
	private String teacherAddr;
	private String teacherSex;
	private String teacherAge;
	/**  
	 * 创建一个新的实例 Teacher.  
	 *    
	 */  
	    
	public Teacher() {
		super();
	}
	/**  
	 * 创建一个新的实例 Teacher.  
	 *  
	 * @param teacherName
	 * @param teacherSubject
	 * @param teachClazz
	 * @param teacherTel
	 * @param teacherAddr
	 * @param teacherSex
	 * @param teacherAge  
	 */  
	    
	public Teacher(String teacherName, String teacherSubject,
			String teachClazz, String teacherTel, String teacherAddr,
			String teacherSex, String teacherAge) {
		super();
		this.teacherName = teacherName;
		this.teacherSubject = teacherSubject;
		this.teachClazz = teachClazz;
		this.teacherTel = teacherTel;
		this.teacherAddr = teacherAddr;
		this.teacherSex = teacherSex;
		this.teacherAge = teacherAge;
	}
	/**  
	 * teacherName  
	 *  
	 * @return  the teacherName  
	 * @since   CodingExample Ver(编码范例查看) 1.0  
	 */
	
	public String getTeacherName() {
		return teacherName;
	}
	/**  
	 * @param teacherName the teacherName to set  
	 */
	
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	/**  
	 * teacherSubject  
	 *  
	 * @return  the teacherSubject  
	 * @since   CodingExample Ver(编码范例查看) 1.0  
	 */
	
	public String getTeacherSubject() {
		return teacherSubject;
	}
	/**  
	 * @param teacherSubject the teacherSubject to set  
	 */
	
	public void setTeacherSubject(String teacherSubject) {
		this.teacherSubject = teacherSubject;
	}
	/**  
	 * teachClazz  
	 *  
	 * @return  the teachClazz  
	 * @since   CodingExample Ver(编码范例查看) 1.0  
	 */
	
	public String getTeachClazz() {
		return teachClazz;
	}
	/**  
	 * @param teachClazz the teachClazz to set  
	 */
	
	public void setTeachClazz(String teachClazz) {
		this.teachClazz = teachClazz;
	}
	/**  
	 * teacherTel  
	 *  
	 * @return  the teacherTel  
	 * @since   CodingExample Ver(编码范例查看) 1.0  
	 */
	
	public String getTeacherTel() {
		return teacherTel;
	}
	/**  
	 * @param teacherTel the teacherTel to set  
	 */
	
	public void setTeacherTel(String teacherTel) {
		this.teacherTel = teacherTel;
	}
	/**  
	 * teacherAddr  
	 *  
	 * @return  the teacherAddr  
	 * @since   CodingExample Ver(编码范例查看) 1.0  
	 */
	
	public String getTeacherAddr() {
		return teacherAddr;
	}
	/**  
	 * @param teacherAddr the teacherAddr to set  
	 */
	
	public void setTeacherAddr(String teacherAddr) {
		this.teacherAddr = teacherAddr;
	}
	/**  
	 * teacherSex  
	 *  
	 * @return  the teacherSex  
	 * @since   CodingExample Ver(编码范例查看) 1.0  
	 */
	
	public String getTeacherSex() {
		return teacherSex;
	}
	/**  
	 * @param teacherSex the teacherSex to set  
	 */
	
	public void setTeacherSex(String teacherSex) {
		this.teacherSex = teacherSex;
	}
	/**  
	 * teacherAge  
	 *  
	 * @return  the teacherAge  
	 * @since   CodingExample Ver(编码范例查看) 1.0  
	 */
	
	public String getTeacherAge() {
		return teacherAge;
	}
	/**  
	 * @param teacherAge the teacherAge to set  
	 */
	
	public void setTeacherAge(String teacherAge) {
		this.teacherAge = teacherAge;
	}
	/**
	 *(non-Javadoc)  
	 * @see java.lang.Object#toString()  
	 */  
	    
	@Override
	public String toString() {
		return "Teacher [teacherName=" + teacherName + ", teacherSubject="
				+ teacherSubject + ", teachClazz=" + teachClazz
				+ ", teacherTel=" + teacherTel + ", teacherAddr=" + teacherAddr
				+ ", teacherSex=" + teacherSex + ", teacherAge=" + teacherAge
				+ "]";
	}
	
}
