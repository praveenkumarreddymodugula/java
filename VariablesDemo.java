package com.test.learning;

public class VariablesDemo {
	
	//Constructor is a special method in java
	// If you won't provide constructor , javac will provice default constructor
	// Constructor will be called while creating object or instance.
	public VariablesDemo()
	{
		System.out.println("Constructore calle..!");
	}
	// non static variable declaration with initialization
	int x=10;
	int y=20;
	// static variable without initialization
	static int z;

	public static void main(String[] args) {
		//Creating object for VariablesDemo to use non static variable in static method
		VariablesDemo variablesDemo = new VariablesDemo();
		System.out.println("Result of addition is:"+(variablesDemo.x+variablesDemo.y));
		z=z+10;
		System.out.println("Z value is:"+z);
		variablesDemo.firstMethod();
	}

	public void firstMethod() {
		System.out.println("X value is:"+x);
		System.out.println("Y value is:"+y);
		System.out.println("Z value is:"+VariablesDemo.z);
	}
}
