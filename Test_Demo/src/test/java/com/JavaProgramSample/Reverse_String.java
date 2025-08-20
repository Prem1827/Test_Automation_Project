package com.JavaProgramSample;

import org.testng.annotations.Test;

public class Reverse_String {
	
	@Test
	public static void main(String[] args) {
		
		String name = "YUVAN";
		
		String rev = "";
		
		for(int i=name.length()-1; i>=0; i--) {
			rev = rev + name.charAt(i);
		}
		
		System.out.println(rev);
		
	}

}
