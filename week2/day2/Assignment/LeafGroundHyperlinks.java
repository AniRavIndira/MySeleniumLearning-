package week2.day2.assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundHyperlinks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Go to Home Page")).click();
		driver.findElement(By.linkText("HyperLink")).click();
		String attribute = driver.findElement(By.linkText("Find where am supposed to go without clicking me?"))
				.getAttribute("href");
		System.out.println("Find where am supposed to go without clicking me: " + attribute);
		driver.findElement(By.linkText("Verify am I broken?")).click();
		String title = driver.getTitle();
		if (title.contains("404")) {
			System.out.println("I am broken");
		}
		else {
			System.out.println("Page loads...");
		}
		driver.navigate().back();
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println("How many links are available in this page:  "+list.size());
	}

}
