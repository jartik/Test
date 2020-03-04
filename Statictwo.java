package com.demo;

public class Statictwo {

	static int x=50;
	
	
	public Statictwo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Direct way
		System.out.println(x);
		
		
//Using class name
		System.out.println(Statictwo.x);
		
		
		Statictwo s=new Statictwo();
		System.out.println(s.x);
		
	}

}
