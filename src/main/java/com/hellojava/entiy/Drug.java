package com.hellojava.entiy;

/**
 * 
 * @ClassName: Drug
 * @Description: ҩƷ��ʵ����
 * 
 *
 * @Version: V_1.0
 * @Data: 2018-12-07
 * @author: Victor Woods
 *
 */
public class Drug {
	//˽������
	private int drugCode;
	private String name;
	private float price;
	private String sPEC;
	private String type;
	//set��get����
	public int getDrugCode() {
		return drugCode;
	}
	public void setDrugCode(int drugCode) {
		this.drugCode = drugCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getsPEC() {
		return sPEC;
	}
	public void setsPEC(String sPEC) {
		this.sPEC = sPEC;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	

}
