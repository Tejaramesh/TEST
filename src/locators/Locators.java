package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty(" webdriver.chrome.driver", "C:\\Driver\\chromedriver-win64\\chromerdriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("teja");
		driver.findElement(By.name("inputPassword")).sendKeys("Teja@1234");
		driver.findElement(By.className("signInBtn")).click();
	System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
	driver.findElement(By.linkText("Forgot your password?")).click();
	driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("teja");
	driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("TEJARSMESH@GMAIL.COM");
	driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
	driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("tejaramesh2000@gmail.com");
	driver.findElement(By.xpath("//form/input[3]")).sendKeys("Teja@1234");
	driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	System.out.println(driver.findElement(By.cssSelector("form p")).getText());
	driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
	driver.findElement(By.cssSelector("#inputUsername")).sendKeys("tejar");
	driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
	Thread.sleep(1000);
	driver.findElement(By.id("chkboxOne")).click();
	driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
	
	
		
		
	}

}
