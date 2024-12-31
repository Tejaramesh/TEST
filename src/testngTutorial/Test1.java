package testngTutorial;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class Test1 {

	@AfterSuite
	public void lastsuite()
	{
		System.out.println("I am the last one");
	}
	@AfterTest
	public void lastexecution()
	{
		System.out.println("I will execute last");
	}
	
	@Test
	public void Demo() {
		System.out.println("hello");
		Assert.assertTrue(false);
	}

	@Test
	public void Demo1()
	{
		System.out.println("Bye");
	}

}
