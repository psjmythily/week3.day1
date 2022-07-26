package week3.day1.homeassignment;

         /*Class: Students
           Methods: getStudentInfo()

           Description: 
           Create multiple getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber*/

public class Students {
	
	//Creating getStudentInfo() method by passing id argument alone
	public void getStudentInfo(String id)
	{
		System.out.println("The Student id is : " + id);
	}
	
	//Creating getStudentInfo() method by passing id & name
	public void getStudentInfo(String id, String name)
	{
		System.out.println("The Student id is : " + id);
		System.out.println("The Student name is : " + name);
	}
	
	//Creating getStudentInfo() method by email & phoneNumber
	public void getStudentInfo(String email, int phoneNumber)
	{
		System.out.println("The Student E-mail id is : " + email);
		System.out.println("The Student Phone number is : " + phoneNumber);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating an object
		Students student = new Students();
		
		//Calling the getStudentInfo() method by passing id alone
		student.getStudentInfo("10ECR059");
		
		//Calling the getStudentInfo() method by passing id and name
		student.getStudentInfo("10ECR059", "Mythily");
		
		//Calling the getStudentInfo() method by passing email & phoneNumber
		student.getStudentInfo("psjmythily@gmail.com", 224466);
		
	}

}
