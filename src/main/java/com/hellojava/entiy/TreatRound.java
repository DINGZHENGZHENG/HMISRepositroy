package com.hellojava.entiy;

/**
 * 
 * @ClassName: TreatRound
 * @Description: 治疗项目的实体类
 * 
 *
 * @Version: V_1.0
 * @Data: 2018-12-07
 * @author: Victor Woods
 *
 */
public class TreatRound {
	//私有属性
	private int treId;
	private String treItems;
	private float trePrice;
	//set与get方法
	public int getTreId() {
		return treId;
	}
	public void setTreId(int treId) {
		this.treId = treId;
	}
	public String getTreItems() {
		return treItems;
	}
	public void setTreItems(String treItems) {
		this.treItems = treItems;
	}
	public float getTrePrice() {
		return trePrice;
	}
	public void setTrePrice(float trePrice) {
		this.trePrice = trePrice;
	}
	
}
