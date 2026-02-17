package com.demo;
import java.math.BigInteger;
import java.math.BigDecimal;


public class TestDemo1 {

	public static void main(String[] args) {
		BigInteger bi1=new BigInteger("123456789123456789");
		BigInteger bi2=new BigInteger("987654321987654321");
		BigInteger sum = bi1.add(bi2); 
		BigInteger difference = bi1.subtract(bi2); 
		BigInteger product = bi1.multiply(bi2); 
		BigInteger quotient = bi1.divide(bi2); 
		BigInteger remainder = bi1.remainder(bi2); 


		System.out.println("Sum: " + sum);
		System.out.println("Difference: " + difference);
		System.out.println("Product: " + product);
		System.out.println("Quotient: " + quotient);
		System.out.println("Remainder: " + remainder);
		

	}

}
