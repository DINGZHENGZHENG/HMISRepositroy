package com.hellojava.entiy;

/**
 * 
 * @ClassName: Department
 * @Description: 科室的实体类
 * 
 *
 * @Version: V_1.0
 * @Data: 2018-12-07
 * @author: Victor Woods
 *
 */
public class Department {
	//设置的私有属性
	private int depId;
	private String depName;
	//定义的set与get方法
	public int getDepId() {
		return depId;
	}
	public void setDepId(int depId) {
		this.depId = depId;
	}
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	
}
