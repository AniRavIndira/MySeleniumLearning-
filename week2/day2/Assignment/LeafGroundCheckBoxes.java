package week2.day2.assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundCheckBoxes {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//div[text()='Java']/input")).click();

		driver.findElement(By.xpath("//div[text()='SQL']/input")).click();

		boolean selected = driver.findElement(By.xpath("//div[text()='Selenium']/input")).isSelected();
		System.out.println("Confirm Selenium is checked:" + selected);	

		driver.findElement(By.xpath("//div[text()='I am Selected']/input")).click();

		List<WebElement> findElements = driver.findElements(By.xpath("(//div[@class='example'])[4]//input"));
		for (WebElement webElement : findElements) {
			webElement.click();
		}

	}

}
