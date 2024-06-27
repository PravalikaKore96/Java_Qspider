
package com.corejava;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExamples {

	public static void main(String[] args) {

		//Map
		//Hashmap - it will not maintain insertion order
		Map<String, Long>  hmp = new HashMap<String, Long>();
		hmp.put("ZBhanu", 3453645364l);
		hmp.put("Navya", 273472364l);
		hmp.put("Ramadevi", 87138121l);
		System.out.println(hmp);
		for(Map.Entry<String, Long> et: hmp.entrySet()){
			System.err.println("HashMap : "+et); 
		}


		//LinkedHashmap - it will maitain insertion order
		Map<String, Long>  hmap1 = new LinkedHashMap<String, Long>();
		hmap1.put("Bhanu", 234234234l);
		hmap1.put("Sai", 92836428634l);
		hmap1.put("Vankat", 982347628734l);
		hmap1.put("Ravi", 9836458763245l);
		hmap1.put("Ravi", 98364587632452l);
		for(Map.Entry<String, Long> et2: hmap1.entrySet()){
			System.err.println("LinkedHashMap : "+et2);
		}


		//TreeMap - Maintain Ascending order
		Map<String, Long>  hmap2 = new TreeMap<String, Long>();
		hmap2.put("Bhanu", 98347628734l);
		hmap2.put("Venkat", 982347628734l);
		hmap2.put("Sai", 92836428634l);
		hmap2.put("Ravi", 9836458763245l);
		hmap2.put("Ravi", 98360000632452l);
		for(Map.Entry<String, Long> et3: hmap2.entrySet()){
			System.err.println("TreeMap : "+et3);
		}

		Map<Character, Long>  hmap3 = new TreeMap<Character, Long>();
		hmap3.put('A', 98347628734l);
		hmap3.put('X', 982347628734l);
		hmap3.put('Z', 92836428634l);
		hmap3.put('Y', 9836458763245l);
		System.out.println(hmap3.containsKey('C'));
		for(Map.Entry<Character, Long> et3: hmap3.entrySet()){
			System.err.println("TreeMap : "+et3);
		}

	}
}