package com.bl.day5;

import java.util.Scanner;

public class PowerOf2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = 0;
		System.out.println("Enter a number (0 - 31)");
		do {
			N = sc.nextInt();
			if (N > 31 || N < 0) {
				System.out.println("this not valid, Enter again");
			}
		} while ( N > 31 || N < 0);
		sc.close();
		
		for(int i = 0; i <= N; i++) {
		System.out.println(2*i);
		}
	}
}