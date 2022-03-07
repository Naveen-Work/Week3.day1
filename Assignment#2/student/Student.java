package org.student;

import org.college.College;
import org.department.Department;

public class Student extends Department{

	public void studentName() {
		System.out.println("Student Name : Test");
	}
	public void studentDept() {
		System.out.println("Student Department : IT");
	}
	
	public void studentId() {
		System.out.println("Student ID : 101");
	}
	
	public static void main(String[] args) {
		//Access all the class methods using Student class object
		Student obj=new Student();		
		obj.collegeCode();
		obj.collegeName();
		obj.collegeRank();
		obj.deptName();
		obj.studentDept();
		obj.studentId();
		obj.studentName();
		
		//Access all the class methods in College and Department using Department class object
		Department dept=new Department();
		dept.deptName();
		dept.collegeCode();
		dept.collegeName();
		dept.collegeRank();
		
		//Access all the class methods in College using College class object
		//Not access the Student class methods and Department Class methods
		College col=new College();
		col.collegeCode();
		col.collegeName();
		col.collegeRank();
	
		//Access all the class methods in College and Department using Department class object
		//Not access the Student class methods
		Department dept1=new Student();
		dept1.collegeCode();
		dept1.collegeName();
		dept1.collegeRank();
		dept1.deptName();
		
		//Access all the class methods in College using College class object
		//Not access the Student class methods and Department Class methods
		College col1=new Department();
		col1.collegeCode();
		col1.collegeName();
		col1.collegeRank();
		
	}

}
