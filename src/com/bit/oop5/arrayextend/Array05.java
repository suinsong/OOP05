package com.bit.oop5.arrayextend;

public class Array05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intArray = new int[100];

		int intCnt = 0;
		int sw = 1;
		for (int i = 0; i < intArray.length; i++) {
			if (i % 5 == 0 && i % 2 != 0) {
				sw = -1;
				intCnt = 6;
			}

			if (i % 5 == 0 && i % 2 == 0) {
				sw = 1;
				intCnt = 0;
			}
			intCnt += sw;
			intArray[i]=intCnt;
			System.out.println(intCnt);
		}
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i]+"\t");
			if ((i+1)%5==0) {
				System.out.println();
				
			}
		}
	}

}
