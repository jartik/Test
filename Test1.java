package com.demo;

class Test1
{
	int a=100;
	int b=200;
	
}


class Test extends Test1
{
	
	int a=10;
	int b=20;
	
  void add()
  {
	  System.out.println(a+b);
	  System.out.println(super.a+super.b);
  }
	public static void main(String[] args) {
		
		Test t=new Test();
		t.add();
	}

}
