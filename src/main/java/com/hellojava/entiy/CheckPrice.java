package com.hellojava.entiy;

/**
 * 
 * @ClassName: CheckPrice
 * @Description: 检查化验单价实体类
 * 
 *
 * @Version: V_1.0
 * @Data: 2018-12-07
 * @author: Victor Woods
 *
 */
public class CheckPrice {
	//私有属性
	private int inspId;
	private String inspItem;
	private float price;
	//set与get方法
	public int getInspId() {
		return inspId;
	}
	public void setInspId(int inspId) {
		this.inspId = inspId;
	}
	public String getInspItem() {
		return inspItem;
	}
	public void setInspItem(String inspItem) {
		this.inspItem = inspItem;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	

}
