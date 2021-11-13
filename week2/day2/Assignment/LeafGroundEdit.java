package week2.day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundEdit {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("email")).sendKeys("anithamyofficial@gmail.com");

		WebElement findElement = driver.findElement(By.xpath("(//section[@class='innerblock']//input)[2]"));
		findElement.sendKeys("hello", Keys.TAB);

		String text = driver.findElement(By.xpath("//input[@name='username']")).getAttribute("value");
		System.out.println("Get default text entered is.. " + text);
		driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();
		boolean enabled = driver.findElement(By.xpath("//label[@for='disabled']/following-sibling::input")).isEnabled();
		if (enabled == true) {
			System.out.println("Edit field is enabled ");
		} else {
			System.out.println("Edit field is Disabled ");
		}
	}

}
