package com.cg.list;

import java.util.ArrayList;

public class ExampleArray {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		ArrayList obj = new ArrayList();
		obj.add("Parag");
		obj.add(13);
		obj.add(15.3f);
		System.out.println(obj);
		System.out.println(obj.size());
		System.out.println(obj.contains(13));
		System.out.println(obj.indexOf(15.3f));
		System.out.println(obj.lastIndexOf('g'));
	}
}
