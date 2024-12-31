package dropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.get("http://spicejet.com");
	
	driver.findElement(By.xpath("//div[text()='From']")).click();
	driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-b5h31w r-95jzfe'] //div[text()='Bengaluru']")).click();
	driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-b5h31w r-95jzfe'] //div[text()='Ahmedabad']")).click();
	
	
	
}
}
