package com.corejava.staticex;

public class StaticEx 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		s1.getData();
		s2.getData();
		s3.getData();
		
		Student.setSchoolName("CN Vidhyalaya");
		
		System.out.println("---------------------------------");
		
		Student.displaySchoolName();
		
		s1.displayData();
		s2.displayData();
		s3.displayData();
	}
}
