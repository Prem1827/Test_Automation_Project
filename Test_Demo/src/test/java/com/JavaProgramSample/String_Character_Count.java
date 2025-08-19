package com.JavaProgramSample;

import java.util.HashMap;

public class String_Character_Count {
	
	public static void main(String[] args) {
		
		String name = "Boobalan";
		
		String lowerCase = name.toLowerCase();
		
		HashMap<Character, Integer> HM = new HashMap<Character, Integer>();
		
		for(Character c : lowerCase.toCharArray()) {
			if(HM.containsKey(c)) {
				HM.put(c, HM.get(c)+1);
			} else {
				HM.put(c, +1);
			}
		}
		
		System.out.println(HM);
		
	}

}
