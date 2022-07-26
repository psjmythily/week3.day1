package week3.day1.homeassignment;

       /*Interface :Language
         Methods :Java()

         Interface :TestTool
         Methods :Selenium()

         AbstractClass :MultipleLangauge
         Methods :python() and un implemented method as ruby()

         Execution class: Automation 
         Implement all the methods of interface and abstract class in Automation class*/

public class Automation extends MultipleLangauge{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating an object
		Automation automationDetails = new Automation();
		
		//Calling all the methods of interface and abstract class in Automation class
		automationDetails.selenium();
		automationDetails.java();
		automationDetails.python();
		automationDetails.ruby();
	}
	
	//Implementing all un-implemented methods in concrete class

	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println("Testing tool is Selenium");
		
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("I dont know Ruby");
	}

	public void java() {
		// TODO Auto-generated method stub
		System.out.println("Iam learning Java");
		
	}

}
