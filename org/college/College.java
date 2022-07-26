package org.college;

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
            
public class College {

	//Creating collegeName() method
	public void collegeName()
	{
		String collegeName = "Kongu Engineering College";
		System.out.println("College name is : " + collegeName);		
	}
	
	//Creating collegeCode() method
	public void collegeCode()
	{
		String collegeCode = "00ERD112";
		System.out.println("College code is : " + collegeCode);
	}
	
	//Creating collegeRank() method
	public void collegeRank()
	{
		int rank = 1;
		System.out.println("College rank is : " + rank);
	}

}
