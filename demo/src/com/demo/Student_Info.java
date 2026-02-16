package com.demo;

public class Student_Info {
	String Student_name;
	char gender;
	int Student_id;
	int Student_age;
	int telugu_marks;
	int hindi_marks;
	int english_marks;
	int maths_marks;
	static int count = 1;

	public static void main(String[] args) {

		Student_Info s1 = new Student_Info();
		s1.Student_name = "Krishna";
		s1.gender = 'M';
		s1.Student_id = 72;
		s1.telugu_marks = 75;
		s1.hindi_marks = 70;
		s1.english_marks = 80;
		s1.maths_marks = 85;
		s1.studentInfo();
		count++;

		

		Student_Info s2 = new Student_Info();
		s2.Student_name = "Rakesh";
		s2.gender = 'M';
		s2.Student_id = 72;
		s2.telugu_marks = 75;
		s2.hindi_marks = 70;
		s2.english_marks = 80;
		s2.maths_marks = 85;
		s2.studentInfo();
		count++;


		Student_Info s3 = new Student_Info();
		s3.Student_name = "Kumar";
		s3.gender = 'M';
		s3.Student_id = 72;
		s3.telugu_marks = 75;
		s3.hindi_marks = 70;
		s3.english_marks = 80;
		s3.maths_marks = 85;
		s3.studentInfo();
		count++;

	}

	void studentInfo() {
		
		System.out.println("Student " + count);
		System.out.println("Student Name: " + Student_name);
		System.out.println("Student Id: " + Student_id);
		System.out.println("Student Gender: " + gender);
		System.out.println("Telugu Marks : " + telugu_marks);
		System.out.println("Hindi Marks : " + hindi_marks);
		System.out.println("English Marks : " + english_marks);
		System.out.println("Maths Marks : " + maths_marks);
		System.out.println("\n");
	}

}
