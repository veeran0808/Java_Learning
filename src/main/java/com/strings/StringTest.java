package com.strings;

public class StringTest {

	public static void main(String[] args) {
		
		//String Literals
		String s = "Hello";
		String s1 = "Hello"; //
		String s2 = "hello";
		System.out.println(s==s1);//true
		System.out.println(s1==s2);//false
		//SCP - String constant pool part of "HEAP"
		//Hello is value(in heap) -> refered by s (stack memory)
		//Hello(Duplicate object not created, same value refered by 2 references s,s1)
		//All String literals saved in SCP
		
		//String object
		String st = new String("Java");
		String st1 = new String("Hello");
		//st -> saves in Heap
		System.out.println(s==st1);//false --> checks reference
		System.out.println(s.equals(st1));//true -->checks exact value
		String st2 = new String("Hello"); //st2 new object created --> when us new every time new object created
		
		String test = new String("Selenium"); 
		//1 object created-> Selenium -> Heap memory, test -> stack memory
		//Q:intern()
		test.intern();
		//inten() -> 2.object created ->will do same duplicate value create in SCP with no reference
		String t1="Selenium" ; //0 objecte, the 2nd object reused 
		//**The right way of creating Strings is String literals**//
		String st4 = new String();//object created with empty value
		System.out.println(st4.length());
	}

}
