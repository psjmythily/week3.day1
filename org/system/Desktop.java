package org.system;

         /*Package :org.system
           Class :Computer
           Methods :computerModel()

           Class :Desktop
           Methods :desktopSize()

           Description:
           create above 2 class and call all your class methods into the Desktop using single inheritance.*/

public class Desktop extends Computer{
	
	//Creating desktopSize() method 
	public void desktopSize() 
	{
     int size = 32;
     System.out.println("Desktop size is :" + size +"inches");	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating an object
		Desktop obj = new Desktop();
		
		//Calling method of Computer class
		obj.computerModel();
		
		//Calling method of Desktop Class
		obj.desktopSize();
	}

}
