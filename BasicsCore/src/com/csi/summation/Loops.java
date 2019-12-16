package com.csi.summation;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		System.out.println("Enter number: ");
		Scanner sc= new Scanner(System.in);
		int x=sc.nextInt();
		while(x<10){
			System.out.println(x+1);
			x++;
		}
	}
}
