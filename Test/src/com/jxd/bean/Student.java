/**  
 * �ļ�����Student.java  
 *  
 * �汾��Ϣ��  
 * ���ڣ�2017��8��10��  
 * Copyright Corporation 2017   
 * ��Ȩ����  
 *  
 */  
    
package com.jxd.bean;

/**  
 * 
 * @Title: Student.java     
 * @Package com.jxd.bean
 * @author yuanlin
 * @date 2017��8��10�� ����1:45:27  
 */

public class Student {
	private String stuName;
	private String stuAge;
	private String stuClazz;
	private String stuAddr;
	private String stuTel;
	private String stuEmail;
	
	/**  
	 * ����һ���µ�ʵ�� Student.  
	 *    
	 */  
	    
	public Student() {
	}

	/**  
	 * ����һ���µ�ʵ�� Student.  
	 *  
	 * @param stuName
	 * @param stuAge
	 * @param stuClazz
	 * @param stuAddr
	 * @param stuTel
	 * @param stuEmail  
	 */  
	    
	public Student(String stuName, String stuAge, String stuClazz,
			String stuAddr, String stuTel, String stuEmail) {
		this.stuName = stuName;
		this.stuAge = stuAge;
		this.stuClazz = stuClazz;
		this.stuAddr = stuAddr;
		this.stuTel = stuTel;
		this.stuEmail = stuEmail;
	}

	/**  
	 * stuName  
	 *  
	 * @return  the stuName  
	 * @since   CodingExample Ver(���뷶���鿴) 1.0  
	 */
	
	public String getStuName() {
		return stuName;
	}

	/**  
	 * @param stuName the stuName to set  
	 */
	
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	/**  
	 * stuAge  
	 *  
	 * @return  the stuAge  
	 * @since   CodingExample Ver(���뷶���鿴) 1.0  
	 */
	
	public String getStuAge() {
		return stuAge;
	}

	/**  
	 * @param stuAge the stuAge to set  
	 */
	
	public void setStuAge(String stuAge) {
		this.stuAge = stuAge;
	}

	/**  
	 * stuClazz  
	 *  
	 * @return  the stuClazz  
	 * @since   CodingExample Ver(���뷶���鿴) 1.0  
	 */
	
	public String getStuClazz() {
		return stuClazz;
	}

	/**  
	 * @param stuClazz the stuClazz to set  
	 */
	
	public void setStuClazz(String stuClazz) {
		this.stuClazz = stuClazz;
	}

	/**  
	 * stuAddr  
	 *  
	 * @return  the stuAddr  
	 * @since   CodingExample Ver(���뷶���鿴) 1.0  
	 */
	
	public String getStuAddr() {
		return stuAddr;
	}

	/**  
	 * @param stuAddr the stuAddr to set  
	 */
	
	public void setStuAddr(String stuAddr) {
		this.stuAddr = stuAddr;
	}

	/**  
	 * stuTel  
	 *  
	 * @return  the stuTel  
	 * @since   CodingExample Ver(���뷶���鿴) 1.0  
	 */
	
	public String getStuTel() {
		return stuTel;
	}

	/**  
	 * @param stuTel the stuTel to set  
	 */
	
	public void setStuTel(String stuTel) {
		this.stuTel = stuTel;
	}

	/**  
	 * stuEmail  
	 *  
	 * @return  the stuEmail  
	 * @since   CodingExample Ver(���뷶���鿴) 1.0  
	 */
	
	public String getStuEmail() {
		return stuEmail;
	}

	/**  
	 * @param stuEmail the stuEmail to set  
	 */
	
	public void setStuEmail(String stuEmail) {
		this.stuEmail = stuEmail;
	}

	/**
	 *(non-Javadoc)  
	 * @see java.lang.Object#toString()  
	 */  
	    
	@Override
	public String toString() {
		return "Student [stuName=" + stuName + ", stuAge=" + stuAge
				+ ", stuClazz=" + stuClazz + ", stuAddr=" + stuAddr
				+ ", stuTel=" + stuTel + ", stuEmail=" + stuEmail + "]";
	}
	
}
