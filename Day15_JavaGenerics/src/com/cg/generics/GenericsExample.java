package com.cg.generics;

import java.util.LinkedList;
import java.util.List;

public class GenericsExample {

	public static void main(String[] args) {
		List<Integer>obj = new LinkedList<Integer> ();
		obj.add(11);
		obj.add(12);
		//Compile-Time Checking and Type Safe
		//obj.add("13");
		
		System.out.println(obj);
		
		//Type-Casting is not required in Generics
		List<String>obj1 = new LinkedList<String> ();
		//List obj1 = new LinkedList ();
		obj1.add("Ashlesha");
		obj1.add("Siddhi");
		String str = obj1.get(1);
		//type-casting explicitly if there is not an object-type
		//String str1 = (String)obj1.get(1);
		System.out.println(str);
		
	}
}
