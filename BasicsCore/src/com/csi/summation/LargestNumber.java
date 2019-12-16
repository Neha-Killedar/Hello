package com.csi.summation;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the numbers to be compared: ");
		Scanner sc= new Scanner(System.in);
		int x=sc.nextInt();
		int y= sc.nextInt();
		int z=sc.nextInt();
		
		if(x > y && x > z){
			System.out.println(x+" is the Largest Number");
		}else if(y > x && y > z){
			System.out.println(y+ " is the Largest Number");
		}else if(z > x && z > y){
			System.out.println(z+" is the Largest Number");
		}else{
			System.out.println("Something went wrong");
		}
	}

}
