package com.cg.abs;

abstract class A
{
	void display()
	{
		System.out.println("Non Abstraction Method");
	}
}

class B extends A
{
	//As B is inherited it will use the properties of A and print the statement
}
public class NonAbstractMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new B();
		a.display();
	}

}
