package com.cg.enum1;

public class Example5 {
	
	enum EmpType
	{
		Contract,Permanent,Temparory;
	}
	static void print(EmpType e)
	{
		if(e==EmpType.Contract)
		{
			System.out.println("Contract-Based Employee");
		}
		else if(e==EmpType.Permanent)
		{
			System.out.println("Permanent Employee");
		}
		else
		{
			System.out.println("Temparory Employee");
		}
	}

	public static void main(String[] args) {
		EmpType e = EmpType.Permanent;
		print(e);
	}
}
