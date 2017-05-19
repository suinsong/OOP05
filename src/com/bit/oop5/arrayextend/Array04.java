package com.bit.oop5.arrayextend;

public class Array04 {

	public static void main(String[] args) {

		int[] intArray = new int[100];
		int[] intArray1 = { 1, 2, 3, 4, 5, 1, 2, 3, 4, 5 };

		/*
		 * for (int i = 0; i < intArray1.length; i++) {
		 * System.out.print(intArray[i]+"\t"); if (intArray[i]++%5==0) {
		 * System.out.println(); }
		 * 
		 */

		int intCnt = 0;
		for (int i = 0; i < intArray.length; i++) {

			intCnt++;
			if (intCnt > 5)
				intCnt = 1;
			intArray[i] = intCnt;
						
		}
		for (int i : intArray) {
			System.out.print(i);

			if (intArray[i-1]%5==0) {
				System.out.println();	
				}
		}
	}
}
