package com.bit.oop5.arrayextend;

public class Array03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int[] intArray =new int[100];
		
		for (int i = 0; i < intArray.length; i++) {
			intArray[i]=i+1;
			
		}
		int intCnt=0;
		for (int i :intArray) {
			System.out.print(i+"\t");
			if (++intCnt % 5==0) {System.out.println();
				
			}
		}
	}

}
