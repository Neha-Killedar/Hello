package com.csi.summation;

import java.util.Scanner;

public class SwapWIthoutVariable {

	public static void main(String[] args) {
		
		System.out.println("Enter two numbers: ");
		Scanner sc= new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println("Before Swap: "+"\n x = "+x+"\n y = "+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After Swap: "+"\n x = "+x+"\n y = "+y);
	}
}
