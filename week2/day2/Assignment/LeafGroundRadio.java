package week2.day2.assignment;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundRadio {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/radio.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("yes")).click();
		String attribute = driver.findElement(By.xpath("//label[@for='Unchecked']/input")).getAttribute("checked");
		if (attribute == null)
			System.out.println("default selected radio button is checked");
		else
			System.out.println("default selected radio button is Unchecked");

		WebElement findElement = driver
				.findElement(By.xpath("//label[contains(text(),'Select your age group')]/following-sibling::input"));
		if ((findElement.getAttribute("checked")) == "true") {
			System.out.println("Value is already selected");
		} else {
			findElement.click();
		}
	}
}
