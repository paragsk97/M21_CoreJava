package com.cg.annotations;

class Animal
{
	Animal()
	{
		System.out.println("Lion");
	}
	public void sound()
	{
		System.out.println("Roars");
	}
}
public class SuppressedWarningsAnnotations {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Animal a = new Animal();
	}
}
