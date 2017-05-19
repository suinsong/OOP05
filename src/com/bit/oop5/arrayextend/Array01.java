package com.bit.oop5.arrayextend;

public class Array01 {

	public static void main(String[] args) {
	
		int[] intArray =new int[10];
		for (int i = 0; i < intArray.length; i++) {
			intArray[i]= (int)(Math.random()*10+1);
			
		}
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(i+":"+intArray[i]);
		}
		
		System.out.println();
		int cnt=0;
		for (int i: intArray) {
			System.out.println(cnt+ ":" +i);
			cnt++;
		}
	}

}
