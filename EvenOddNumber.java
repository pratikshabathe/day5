package com.bl.day5;
import java.util.Scanner;
public class EvenOddNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check even / odd");
		int num = sc.nextInt();
		sc.close();
		
		if(num % 2 == 0) {
			System.out.println("Number is even");
		}else {
			System.out.println("Number is odd");
		}
	}
}
