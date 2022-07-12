package com.capgemini.intro;

public class MangoTreeProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = 5; // Indicates number of rows
		int c = 5; // Indicates number of colums
		int n = 20; // Indicates number of trees

		if(r*2 == n || r*(c-1) == n)
		{
		System.out.println("It is a mango tree");
		}
		else
		{
		System.out.println("It is not a mango tree");
		}
	}

}
