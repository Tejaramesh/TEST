package assignments;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwaitassignment {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("//span[text()=' User']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='okayBtn']")));
		driver.findElement(By.xpath("//button[@id='okayBtn']")).click();
		WebElement element = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select dropdownoptions = new Select(element);
		dropdownoptions.selectByIndex(2);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.id("signInBtn")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));

		List<WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));

		for (int i = 0; i < products.size(); i++) {
			products.get(i).click();
		}

		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();

	}

}
