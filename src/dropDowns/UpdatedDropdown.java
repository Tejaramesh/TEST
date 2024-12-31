package dropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.reporters.jq.Main;

public class UpdatedDropdown {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://spicejet.com");
		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).click();
		for(int i=1;i<5;i++)
		{
			driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
		}
		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers-done-cta']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).getText());
	}

}
