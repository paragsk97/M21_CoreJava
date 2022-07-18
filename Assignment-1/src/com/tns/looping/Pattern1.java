package com.tns.looping;

import java.util.Scanner;

public class Pattern1 {

	static int pattern(int n)
	{
	int i, j;    
	//Outer loop for n value  
	for (i=0; i<n; i++)   
	{  
	//Inner loop for space
	for (j=n-i; j>1; j--)   
	{  
	//prints space between two stars  
	System.out.print(" ");   
	}   
	//inner loop for columns  
	for (j=0; j<=i; j++ )   
	{   
	//Prints star      
	System.out.print("* ");   
	}   
	//New line  
	System.out.println();
	}
	return n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value:");
		int n = s.nextInt();
		System.out.println(pattern(n));
		s.close();
	}
}
