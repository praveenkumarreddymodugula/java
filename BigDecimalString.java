package com.test.learning;
import java.math.*;
public class BigDecimalString {
  public static void main(String[] args){
	  double d =1115.737;
	  String ds = Double.toString(d);
	 BigDecimal bd = new BigDecimal(ds);
	  System.out.println("The value is" + bd.toString());
  }

}