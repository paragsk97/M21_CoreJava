package com.cg.framework1;

public abstract class BankAcc {

	private int accNo;
	private String accNm;
	private float accBal;
	//constructor
	public BankAcc(int accNo, String accNm, float accBal) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}
	//getters and setters method for private variable
	public int getAccNo() {
		return accNo;
	}
	//method withdraw
		abstract public void withdraw(float accBal);
		 public void deposit(float accBal)
		 {
			 System.out.println(accBal);
		 }
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccNm() {
		return accNm;
	}
	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}
	public float getAccBal() {
		return accBal;
	}
	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}
	@Override
	public String toString() {
		return String.format("BankAcc [accNo=%s, accNm=%s, accBal=%s]", accNo, accNm, accBal);
	}
}
	
