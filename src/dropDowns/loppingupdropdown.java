package dropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loppingupdropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://spicejet.com");
		driver.findElement(By.xpath("//div[text()='Passengers']")).click();
		Thread.sleep(2000);
		for (int i = 0; i < 3; i++) {
			driver.findElement(By.cssSelector("div[data-testid='Adult-testID-plus-one-cta']")).click();
		}
	}

}
