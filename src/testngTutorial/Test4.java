package testngTutorial;

import org.testng.annotations.Test;

public class Test4 {
	@Test
	public void webLoginCarLoan()
	{
		System.out.println("weblogin car");
	}
	
	@Test(groups={"SmokeTesting"})
	public void mobileLoginCarLoan()
	{
		System.out.println("mobilelogin car");
	}
	@Test
	public void apiLoginCarLoan()
	{
		System.out.println("APIlogin car");
	}
	

}
