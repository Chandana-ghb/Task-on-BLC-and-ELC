package com.blc.elc;

public class StudentMain {

	public static void main(String[] args) {
		Student sc=new Student();
		sc.setStudentDetails("ABC",101,85.5);
		String result=sc.getStudentDetails();
		System.out.println(result);
	}

}
