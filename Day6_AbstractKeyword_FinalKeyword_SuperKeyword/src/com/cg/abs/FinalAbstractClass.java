package com.cg.abs;

//We cannot make any abstract class as Final in Java
//final abstract class Car
abstract class Car
{
	abstract void display();
}

class Audi extends Car
{
	void display()
	{
		System.out.println("Audi");
	}
}
public class FinalAbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Audi();
		c.display();
	}

}
