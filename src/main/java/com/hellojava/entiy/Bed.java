package com.hellojava.entiy;


/**
 * 
 * @ClassName: Bed
 * @Description:床位表的实体类bed
 * 
 *
 * @Version: V_1.0
 * @Data: 2018-12-07
 * @author: Victor Woods
 *
 */
public class Bed {
	private int bedId;
	private int bedPrice;
	private String depName;
	private String bedState;
	private String sort;
	/** 实体属性的set与get方法，用于获取与设置属性的值*/
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public int getBedId() {
		return bedId;
	}
	public void setBedId(int bedId) {
		this.bedId = bedId;
	}
	public int getBedPrice() {
		return bedPrice;
	}
	public void setBedPrice(int bedPrice) {
		this.bedPrice = bedPrice;
	}
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	public String getBedState() {
		return bedState;
	}
	public void setBedState(String bedState) {
		this.bedState = bedState;
	}
	

}
