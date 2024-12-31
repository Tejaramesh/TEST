package locators;

import static org.testng.Assert.*;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	String name="Teja";
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	String pass=getPassword(driver);
	Thread.sleep(4000);
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.findElement(By.id("inputUsername")).sendKeys(name);
	driver.findElement(By.name("inputPassword")).sendKeys(pass);
	driver.findElement(By.className("signInBtn")).click();
	Thread.sleep(3000);
	System.out.println(driver.findElement(By.tagName("p")).getText());
    Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");	
	Assert.assertEquals(driver.findElement(By.cssSelector("div h2")).getText(), "Hello "+name+",");
	driver.findElement(By.xpath("//button[text()='Log Out']")).click();
	Thread.sleep(1000);
	driver.close();
}
	
public static String getPassword(WebDriver driver) throws InterruptedException
{
	
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.findElement(By.linkText("Forgot your password?")).click();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	String passwordText=driver.findElement(By.cssSelector("form p")).getText();
	//Please use temporary password 'rahulshettyacademy' to Login.
	String[] passwordText1=passwordText.split("'");
	String[] passwordText2=passwordText1[1].split("'");
	String password = passwordText2[0];
	System.out.println(password);
	return password;
	
}
	
	
	
	
	
}