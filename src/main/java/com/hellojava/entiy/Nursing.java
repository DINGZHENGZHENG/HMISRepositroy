package com.hellojava.entiy;

/**
 * 
 * @ClassName: Nursing
 * @Description: 护理价格实体类
 * 
 *
 * @Version: V_1.0
 * @Data: 2018-12-07
 * @author: Victor Woods
 *
 */
public class Nursing {
	//私有属性
	private int nurId;
	private float price;
	private String level;
	//set与get方法
	public int getNurId() {
		return nurId;
	}
	public void setNurId(int nurId) {
		this.nurId = nurId;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	

}
