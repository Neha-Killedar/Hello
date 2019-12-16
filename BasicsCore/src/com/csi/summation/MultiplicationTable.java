package com.csi.summation;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*	System.out.println("\n Enter the number to be tabled: ");
		Scanner sc= new Scanner(System.in);
		int x=sc.nextInt(),z;

		for(int i=1;i<=10;i++){
			z=x*i;
			System.out.println("\n" +z);
		}*/

		int a, b, c, d;
		System.out.println("Enter range of numbers to print their multiplication table");
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		b = in.nextInt();
		for (c = a; c <= b; c++) {
			System.out.println("Multiplication table of "+c);
			for (d = 1; d <= 10; d++) {
				System.out.println(c+"*"+d+" = "+(c*d));
			}
		}
	}


}


