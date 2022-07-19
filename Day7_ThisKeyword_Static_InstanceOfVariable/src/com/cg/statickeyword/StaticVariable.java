package com.cg.statickeyword;

public class StaticVariable {
	static int a=10;
	public static void main(String[] args) {
		//Changes the value of a//reinitialized
		a=12;
		System.out.println(a);
	}
}
