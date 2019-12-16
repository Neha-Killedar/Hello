package com.csi.package3;

class A{
	void add(int a, float b){
		System.out.println(a);
	}
}

class B extends A{
	public final void add(int a, float b){
		System.out.println(a+b);
	}
}
public class Main {

	public static void main(String[] args) {
		
	}

}
