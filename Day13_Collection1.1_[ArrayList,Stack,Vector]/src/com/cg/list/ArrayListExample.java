package com.cg.list;

import java.util.List;
import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		//declare arrayList from collection class.
		List<Object>obj = new ArrayList<>();
		obj.add("Parag");
		obj.add(13);
		obj.add(15.30);
		System.out.println("Array Elements are :" +obj);
	}
}
