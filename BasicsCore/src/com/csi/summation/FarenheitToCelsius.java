package com.csi.summation;

import java.util.Scanner;

public class FarenheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the temperature to be converted: ");
		Scanner sc= new Scanner(System.in);
		float temp=sc.nextFloat();
		temp=(temp-32)*5/9;
		System.out.println("Temperature in Celsius: "+temp);
		
	}

}
