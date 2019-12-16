package com.csi.package1;

import java.util.Scanner;

import com.csi.package2.Address1;

public class Employee extends Address1 {

	public static void main(String[] args) {
		
		int a, b;
		System.out.println("Enter two numbers: ");
		Scanner sc= new Scanner(System.in);
		a= sc.nextInt();
		b= sc.nextInt();
		System.out.println("Addition is: "+(a+b));
		System.out.println("Addition is done successfully");
		
		System.out.println("subtraction is: " +(a-b));
		System.out.println("subtraction is done successfully");
		
		
	}

}
