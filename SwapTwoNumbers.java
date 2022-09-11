package com.bl.day5;
import java.util.Scanner;
public class SwapTwoNumbers {

	public static void main(String[] args) {
		int x ; //x and y are the swap
		int y ;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of x and y");
		x = sc.nextInt();
		y = sc.nextInt();
		
		System.out.println("before swapping number:" +x +" " +y);

		x = y;
		y = x;
		System.out.println("After swapping:" +x +" " +y);
		
		
	}
	
	
		
}
