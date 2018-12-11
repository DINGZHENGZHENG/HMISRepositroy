package com.hellojava.entiy;

import java.util.Date;

/**
 * 
 * @ClassName: Dr_Advice
 * @Description: 医嘱实体类
 * 
 *
 * @Version: V_1.0
 * @Data: 2018-12-07
 * @author: Victor Woods
 *
 */
public class Dr_Advice {
	//私有属性
	private int dr_AdviceId;
	private int userId;
	private String sort;
	private Date startTime;
	private String content;
	private Date stopTime;
	private Date exeTime;
	private String signature;
	private String nurse;
	//set与get方法
	public int getDr_AdviceId() {
		return dr_AdviceId;
	}
	public void setDr_AdviceId(int dr_AdviceId) {
		this.dr_AdviceId = dr_AdviceId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getStopTime() {
		return stopTime;
	}
	public void setStopTime(Date stopTime) {
		this.stopTime = stopTime;
	}
	public Date getExeTime() {
		return exeTime;
	}
	public void setExeTime(Date exeTime) {
		this.exeTime = exeTime;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public String getNurse() {
		return nurse;
	}
	public void setNurse(String nurse) {
		this.nurse = nurse;
	}
	
	

}
