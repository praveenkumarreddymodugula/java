package com.test.learning;

import java.util.Date;

public class OutStringsDemo {

	public static void main(String[] args) {
		char p = '8';
		boolean bool = true;
		byte b = 127;
		short s = 32000;
		int i = 2000000;
		long l = 10000000L;
		float f = 1234245.435234f;
		double d = 112312312331.34d;
		System.out.println(p);
		System.out.println(bool);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		
		System.out.println(s + " is the value of s");
		System.out.println("The value of s is" + s );
		 
		Date  myDate = new Date();
		System.out.println("The new date is" + myDate);
	

	}
	}
