package com.cg.list;

import java.util.ArrayList;

public class CloneArrayList {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList obj = new ArrayList();
		obj.add("Parag");
		obj.add(13);
		obj.add(15.3f);
		System.out.println(obj);
		//Shallow copy of Array List.
		Object clonelist;
		clonelist=obj.clone();
		System.out.println(clonelist);
	}
}
