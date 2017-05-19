package com.bit.oop5.forex;

import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("단 입력>>");
		String input = scanner.nextLine();
		int intDan=0;
		try {
			intDan = Integer.valueOf(input);
			
		} catch (Exception e) {
			System.out.println("숫자만 와야함");
		}
		
		if(intDan >0 && intDan<10){
		
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d x %d = %d\n", intDan, i, intDan*i);
		}
		}else{
			System.out.println("구구단을 표시 할 수 없음");
		}
		

	}

}
