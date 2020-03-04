package com.demo;

public class InstanceMethods {
	
	void usa()
	{
		System.out.println("Welcome to USA");
	}
 
	void canada()
	{
		System.out.println("Welcome to canada");
		
	}
	
	public static void main(String args[])
	{
		InstanceMethods n=new InstanceMethods();
		n.usa();
		n.canada();
		
	}
}
