package testngTutorial;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class Test2 {

	@Test(groups={"SmokeTesting"})
	public void Demo3()
	{
		System.out.println("Good");
	}
	@BeforeSuite
	public void firstsuite()
	{
		System.out.println("I am the first one");
	}
	
	@BeforeTest
	public void prerequisite()
	{
		System.out.println("I will execute first");
	}
}
