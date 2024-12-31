package actionspractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Actions a = new Actions(driver);
		WebElement move = driver.findElement(By.cssSelector("#nav-link-accountList"));
		a.moveToElement(move).contextClick().build().perform();
		System.out.println("Testing");
		WebElement move1 = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		a.moveToElement(move1).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
	}

}
