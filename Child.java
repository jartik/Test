package com.demo;

public class Parent {

	void m1()
	{
		System.out.println("Parent class m1() method");
		
	}
	

}


class child extends Parent
{
	void m1()
	{
		System.out.println("Child class m1() method");
	}
	
	void m2()
	{
		System.out.println("Child class m2() method");
		super.m1();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child c=new Child();
		c.m2();
		
	}
	
}