package com.cg.enum1;

enum Bike
{
	KTM,Pulsar,R15,Splendour;
}

public class Example3 {

	public static void main(String[] args) {
		Bike b = Bike.KTM;
		switch(b)
		{
		case Pulsar:
			System.out.println("You choose Pulsar");
			break;
		case KTM:
			System.out.println("You choose KTM");
			break;
		case R15:
			System.out.println("You choose R15");
			break;
		case Splendour:
			System.out.println("You choose Splendour");
			break;
			
		default:
			System.out.println("Invalid Case");
		}

	}

}
