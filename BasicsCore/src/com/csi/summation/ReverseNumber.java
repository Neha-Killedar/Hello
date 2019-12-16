package com.csi.summation;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\n Enter the number to be reversed: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(), rev = 0;

		while (x != 0) {
			rev = rev * 10;
			rev = rev + x%10;
			x = x/10;
			continue;
		}
		System.out.println("\n Reversing will get " +rev);
	}

}
