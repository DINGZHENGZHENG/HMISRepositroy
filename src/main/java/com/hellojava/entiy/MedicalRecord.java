package com.hellojava.entiy;

import java.util.Date;

/**
 * 
 * @ClassName: MedicalRecord
 * @Description: ����ʵ����
 * 
 *
 * @Version: V_1.0
 * @Data: 2018-12-07
 * @author: Victor Woods
 *
 */
public class MedicalRecord {
	//˽������
	private int mRId;
	private int userId;
	private Date date;
	private int empId;
	private String context;
	//set��get����
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
