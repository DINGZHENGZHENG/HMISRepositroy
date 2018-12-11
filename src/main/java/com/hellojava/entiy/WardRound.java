package com.hellojava.entiy;

/**
 * 
 * @ClassName: WardRound
 * @Description: 查房表的实体类
 * 
 *
 * @Version: V_1.0
 * @Data: 2018-12-07
 * @author: Victor Woods
 *
 */
public class WardRound {
	//私有属性
	private int waId;
	private float charge;
	//set与get方法
	public int getWaId() {
		return waId;
	}
	public void setWaId(int waId) {
		this.waId = waId;
	}
	public float getCharge() {
		return charge;
	}
	public void setCharge(float charge) {
		this.charge = charge;
	}
	
}
