package com.bl.day5;
import java.util.Scanner;
public class Factors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find prime factors");
		int n = sc.nextInt();
		
		for (int i =3; i <= n; i++) {
			while (n % 2 == 0) {
				n = n/2;
				System.out.println(2 );
			}
			while (n % i == 0) {
				n = n/i;
				System.out.println(i);
			}
		}
	}
}
