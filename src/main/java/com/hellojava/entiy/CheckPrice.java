package com.hellojava.entiy;

/**
 * 
 * @ClassName: CheckPrice
 * @Description: ��黯�鵥��ʵ����
 * 
 *
 * @Version: V_1.0
 * @Data: 2018-12-07
 * @author: Victor Woods
 *
 */
public class CheckPrice {
	//˽������
	private int inspId;
	private String inspItem;
	private float price;
	//set��get����
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
