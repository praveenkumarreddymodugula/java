package com.test.learning;

public class BooleanDemo {

	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println("The value of b1 is " + b1);
		System.out.println("The value of b2 is " + b2);
		
		boolean b3 = !b2;
		System.out.println("The value of b3 is " + b3);
		
		int i = 1;
		boolean b4 = (i != 5);
		System.out.println("The value of b4 is " + b4);
		 int i1 = 10;
		 boolean b5 = (i1 == 10);
		 System.out.println("The value of b5 is " + b5);
		 
		 String s = "true";
		 boolean b6 = Boolean.parseBoolean(s);
		 System.out.println("The value of b6 is " + b6);
		 
		 
		
		

	}

}
