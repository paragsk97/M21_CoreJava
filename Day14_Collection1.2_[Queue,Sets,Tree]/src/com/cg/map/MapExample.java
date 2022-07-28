package com.cg.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		Map<String,Integer> obj = new HashMap<String,Integer> ();
		obj.put("Siddhi", 2);
		obj.put("Riddhi", 5);
		System.out.println(obj);
	}
}
