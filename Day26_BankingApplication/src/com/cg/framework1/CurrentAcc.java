package com.cg.framework1;

public abstract class CurrentAcc extends BankAcc
{
	private final float creditLimit;
	public CurrentAcc(int accNo, String accNm, float accBal,float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit=creditLimit;
		}
	public void withdraw(float amount) 
	{
		float accBal=this.getAccBal();
		 if(amount<=creditLimit) 
		 {
			if(amount<accBal) 
			{
				accBal-=amount;
				this.setAccBal(accBal);
				System.out.println("The Account Name is: "+this.getAccNm()+", Withdrawed Amount is : "+amount+", Account Balance is : "+accBal);
				
			}
			else 
			{
				System.out.println("enter the amount less then account balence");
			}
			
		}
		else 
		{
			System.out.println("enter the amount  with in credit limit value");
		}
	}
	@Override
	public String toString() {
		return String.format("CurrentAcc [creditLimit=%s]", creditLimit);
	}

}
