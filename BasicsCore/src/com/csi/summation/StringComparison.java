package com.csi.summation;

import java.util.Scanner;

public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*System.out.println("Enter first string: ");
		Scanner sc= new Scanner(System.in);
		String s1=sc.next();
		System.out.println("Enter Second String: ");
		String s2=sc.next();
		
		if(s1.compareTo(s2)> 0){
			System.out.println("First String is Large");
		}else if(s1.compareTo(s2)<0){
			System.out.println("Second String is Large");
		}else{
			System.out.println("Strings are equal");
		}*/
		String s1= "abc";
		String s2= "def";
		String s3= s1.concat(s2.toUpperCase());
		System.out.println(s1+s2+s3);
		System.out.println(Math.ceil(-4.7));
	}

}
