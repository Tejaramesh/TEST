package endtoendprogramming;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findlinks {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		List<WebElement> linkselement = columndriver.findElements(By.tagName("a"));

		for (int i = 1; i < linkselement.size(); i++) {
			String controlclick = Keys.chord(Keys.CONTROL, Keys.ENTER);

			linkselement.get(i).sendKeys(controlclick);
			Thread.sleep(5000L);

		}

		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

	}
}
