package com.csi.summation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class ArrListSynchronization {

	public static void main(String[] args) {
/*
		List<String> fruitlist = new ArrayList<>();
		fruitlist.add("apple");
		fruitlist.add("mango");

		fruitlist.add("chikku");

		fruitlist.add("peru");
		fruitlist.add("sweet");

		//fruitlist = Collections.synchronizedList(fruitlist);

		Collections.sort(fruitlist);
		System.out.println(fruitlist);*/
		
		Map<Integer, String> m= new HashMap<Integer, String>();
		m.put(1, "TOM");
		m.put(5, "JERRY");
		m.put(8, "NING");
		m.put(2, "MARIA");
		m.put(9, "DEBIA");
		
		TreeMap<Integer, String> tm=new TreeMap<>(m);
		
		System.out.println(tm);
		
		

	}

}
