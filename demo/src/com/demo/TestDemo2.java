package com.demo;

public class TestDemo2 {
	int value=6657;
	int val=value%10;
	int val1=value/10;
	int val2=val1%10;
	int val3=val1/10;
	int val4=val3%10;
	int val5=val3/10;
	int val6=val5%10;
	
	
	
	void value() {
		System.out.println(value);
		System.out.println("1's -->"+val);
		System.out.println(val1);
		System.out.println("10's -->"+val2);
		System.out.println(val3);
		System.out.println("100's -->"+val4);
		System.out.println(val5);
		System.out.println("1000's -->"+val6);
		
		
	}

	public static void main(String[] args) {
		TestDemo2 t1 =new TestDemo2(); 
		t1.value();
		
	}

}
