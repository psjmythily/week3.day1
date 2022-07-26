package week3.day1.homeassignment;

          /*Interface :Language
            Methods :Java()

            Interface :TestTool
            Methods :Selenium()

            AbstractClass :MultipleLangauge
            Methods :python() and un implemented method as ruby()

            Execution class: Automation 
            Implement all the methods of interface and abstract class in Automation class*/

public abstract class MultipleLangauge implements TestTool, Language {
	
	//Creating a method for python()
	public void python()
	{
		System.out.println("Selenium can also be automated with python language");
	}
	
	//Creating un-implemented method as ruby() by using keyword abstract
	public abstract void ruby();

}
