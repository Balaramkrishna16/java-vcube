package com.demo;

public class task1 {

	task1(){
	String name;
	Integer sal;
	name="king";
	sal=5000;
	Double pf=0.08*sal;
	Double da=0.03*sal;
	Double gst=0.06*sal;
	Double d=sal-pf-gst+da;
	Double yearsal=d*12;
	System.out.println(yearsal);
	}
	
	public static void main(String[] args) {
	task1 t1=new task1();
	

	}

}
