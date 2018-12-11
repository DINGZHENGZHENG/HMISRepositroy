package com.hellojava.entiy;

/**
 * 
 * @ClassName: Deposit
 * @Description:Ԥ��Ѻ��ʵ����
 * 
 *
 * @Version: V_1.0
 * @Data: 2018-12-07
 * @author: Victor Woods
 *
 */
public class Deposit {
	//˽������
	private int userId;
	private String cardId;
	private float deposit;
	private float account;
	
	//set��get����
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getCardId() {
		return cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public float getDeposit() {
		return deposit;
	}
	public void setDeposit(float deposit) {
		this.deposit = deposit;
	}
	public float getAccount() {
		return account;
	}
	public void setAccount(float account) {
		this.account = account;
	}
	
}
