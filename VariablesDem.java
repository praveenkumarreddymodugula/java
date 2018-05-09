package com.test.learning;

public class VariablesDem {
	
	//Constructor is a special method in java
	// If you won't provide constructor , javac will provice default constructor
	// Constructor will be called while creating object or instance.
	public VariablesDem()
	{
		System.out.println("Constructore calle..!");
	}
	// non static variable declaration with initialization
	int x=10;
	int y=20;
	// static variable without initialization
	static int z;

	public static void main(String[] args) {
		//Creating object for VariablesDem to use non static variable in static method
		VariablesDem variablesDem = new VariablesDem();
		System.out.println("Result of addition is:"+(variablesDem.x+variablesDem.y));
		z=z+10;
		System.out.println("Z value is:"+z);
		variablesDem.firstMethod();
	}

	public void firstMethod() {
		System.out.println("X value is:"+x);
		System.out.println("Y value is:"+y);
		System.out.println("Z value is:"+VariablesDem.z);
	}
}
