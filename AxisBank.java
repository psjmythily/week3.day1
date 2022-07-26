package week3.day1.homeassignment;

      /*Class :BankInfo
      Methods :saving(),fixed(),deposit()

        Class :AxisBank
        Methods :deposit()

         Description:
         You have to override the method deposit in AxisBank.*/

public class AxisBank extends BankInfo{
	
	//Creating a method deposit() to override
	public void deposit()
	{
		System.out.println("I got a message for depositing money");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Object creation
		AxisBank customer = new AxisBank();
		
		//Calling methods from BankInfo class
		customer.saving();
		customer.fixed();
		
		//Calling Overrided method deposit()
		customer.deposit();
	}

}
