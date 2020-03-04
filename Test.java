package com.demo;

class Test2
{
 Test2(int i,int j)
 {
  System.out.println(i+"-----"+j);
  System.out.println("2 arg constructor");
 }
};


class Test extends Test2
{
 Test(int i)
 {
  super(100,200);
  System.out.println(i);
  System.out.println("1 arg constructor");
 }
 
}