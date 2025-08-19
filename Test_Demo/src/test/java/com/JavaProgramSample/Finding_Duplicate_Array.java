package com.JavaProgramSample;

public class Finding_Duplicate_Array {
	
	public static void main(String[] args) {
		
		int[] num = {4,9,2,5,9,1,7,3,4};
		
		System.out.println("Duplicate elements in an Array:");
		
		for(int i=0; i<num.length; i++) {
			for(int j=i+1; j<num.length; j++) {
				if(num[i]==num[j]) {
					System.out.println(num[i]);
					break;
				}
			}
		}
		
	}

}
