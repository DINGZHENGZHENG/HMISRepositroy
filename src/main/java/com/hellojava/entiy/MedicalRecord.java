package com.hellojava.entiy;

import java.util.Date;

/**
 * 
 * @ClassName: MedicalRecord
 * @Description: 病历实体类
 * 
 *
 * @Version: V_1.0
 * @Data: 2018-12-07
 * @author: Victor Woods
 *
 */
public class MedicalRecord {
	//私有属性
	private int mRId;
	private int userId;
	private Date date;
	private int empId;
	private String context;
	//set与get方法
	public int getmRId() {
		return mRId;
	}
	public void setmRId(int mRId) {
		this.mRId = mRId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	
	

}
