package com.hellojava.entiy;

/**
 * 
 * @ClassName: Employee
 * @Description: Ա�����ʵ����
 * 
 *
 * @Version: V_1.0
 * @Data: 2018-12-07
 * @author: Victor Woods
 *
 */
public class Employee {
	private int empId;
	private String empName;
	private int depId;
	private String empType;
	private String empSex;
	private String empPhone;
	private String empAddress;
	private String password;
	
	/** ʵ���������Ե�set��get�����������������ȡ�������� */
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getDepId() {
		return depId;
	}
	public void setDepId(int depId) {
		this.depId = depId;
	}
	public String getEmpType() {
		return empType;
	}
	public void setEmpType(String empType) {
		this.empType = empType;
	}
	public String getEmpSex() {
		return empSex;
	}
	public void setEmpSex(String empSex) {
		this.empSex = empSex;
	}
	public String getEmpPhone() {
		return empPhone;
	}
	public void setEmpPhone(String empPhone) {
		this.empPhone = empPhone;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	
}
