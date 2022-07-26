package org.department;


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

public class Department extends College{
	
    //Creating deptName() method
	public void deptName()
	{
		String department = "ECE";
		System.out.println("Department is : " + department);
	}

}
