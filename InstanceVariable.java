package com.demo;

public class InstanceVariable {
 
	
	int a= 200;
	int b= 400;
	
	
	void sum()
	{
		System.out.println(a+b);
		
	}
	public InstanceVariable() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceVariable i=new InstanceVariable();
		i.sum();
		
	}

}
