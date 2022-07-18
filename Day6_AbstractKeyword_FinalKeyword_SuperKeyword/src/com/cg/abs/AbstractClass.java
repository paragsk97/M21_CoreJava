package com.cg.abs;

//program for Abstract Class
abstract class Fruit
{
	//abstract method
	abstract void display();
}

class Apple
{
	//provide implementation for abstract method 
	void display()
	{
		System.out.println("Apple is good for our brain");
	}
}
public class AbstractClass {

	public static void main(String[] args) {
		// We cannot create object for abstract class
		// Fruit f = new Fruit();
		Apple a = new Apple();
		a.display();
	}

}
