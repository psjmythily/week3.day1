package org.student;

        /*Package :org.college
          Class :College
          Methods :collegeName(),collegeCode(),collegeRank()

          Package :org.department
          Class :Department
          Methods :deptName()

          Package :org.student
          Class :Student
          Methods :studentName(),studentDept(),studentId()

          Description:
          create above 3 class and call all your class methods into the Student using multilevel inheritance.*/

import org.college.College;
import org.department.Department;

public class Student extends Department{
	
	//Creating a studentName() method
	public void studentName()
	{
		String name = "Aswadhi";
		System.out.println("Student name is : " + name);
		}
	
	//Creating a studentDept() method
	public void studentDept()
	{
		String department = "ECE";
		System.out.println(department);
	}
	
	//Creating a studentId() method
	public void studentId()
	{
		String id = "10ECR059";
		System.out.println("Student id is : " + id);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating an object as details 
		Student details = new Student();
		
		//Calling all the methods of College Class
		details.collegeCode();
		details.collegeName();
		details.collegeRank();
		
		//Calling the method of Department Class
		details.deptName();
		
		////Calling the method of Student Class
		details.studentId();
		details.studentName();
		details.studentDept();
	}

}
