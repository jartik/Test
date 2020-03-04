package com.demo;

public class StaticMethods {

	static void usa()
	{
		System.out.println("Welcome to usa");
		
	}
	
	static void canada()
	{
		System.out.println("Welcome to canada");
		
	}
	public StaticMethods() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticMethods s=new StaticMethods();
		s.usa();
		s.canada();
		
		usa();
		canada();
		
		
		StaticMethods.usa();
		StaticMethods.canada();
		
		
	}

}
