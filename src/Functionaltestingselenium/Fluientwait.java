package Functionaltestingselenium;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluientwait {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.cssSelector("div button")).click();

		// Wait for the "text" button to become clickable
		Wait<WebDriver> wait = new FluentWait<>(driver)
		        .withTimeout(Duration.ofSeconds(30))
		        .pollingEvery(Duration.ofSeconds(3))
		        .ignoring(NoSuchElementException.class);

		WebElement sendButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='finish'] h4")));
		System.out.println(sendButton.getText());
		
	}

}
