package Sumanmaven;

import org.testng.annotations.Test;

public class SumanfirstTest {
	@Test(enabled=true)
	public void TC1()
	{
	System.out.println("welcome to testNG");	
	}
	@Test(enabled=false)
	public void TC2()
	{
	System.out.println("welcome to testNG2");	
	}
	@Test(enabled=true)
	public void TC3()
	{
	System.out.println("welcome to testNG3");	
	}

}



