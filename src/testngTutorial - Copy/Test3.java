package testngTutorial;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test3 {
	@Parameters({"Testing"})
	@Test
	public void webLoginHomeLoan(String testurl)
	{
		System.out.println("weblogin Home");
		System.out.println(testurl);
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("I will run eachtime before test");
	}
	
	@Test(dataProvider="getData")
	public void mobileLoginHomeLoan(String username,String password)
	{
		System.out.println("mobilelogin Home");
		System.out.println(username);
		System.out.println(password);
	}
	@Test
	public void mobileSigninHomeLoan()
	{
		System.out.println("mobilesignin Home");
	}
	@Test
	public void mobileSignoutHomeLoan()
	{
		System.out.println("mobilesignout Home");
	}
	@Test(groups={"SmokeTesting"})
	public void apiLoginHomeLoan()
	{
		System.out.println("APIlogin Home");
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("I will execute after each test method in Test3");
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[3][2];
		data[0][0]="firstsetusername";
		data[0][1]="firstsetpassword";
		data[1][0]="secondsetusername";
		data[1][1]="secondsetpassword";
		data[2][0]="thirdsetusername";
		data[2][1]="thirdsetpassword";
		return data;
	}

}
