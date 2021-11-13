package week2.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCart {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.opencart.com/");
		driver.manage().window().maximize();// Maximize the screen)
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//div[contains(@class,'navbar-right')]/a[2]")).click();
		driver.findElement(By.id("input-username")).sendKeys("Nithiya");
		driver.findElement(By.id("input-firstname")).sendKeys("firstnamenithi");
		driver.findElement(By.id("input-lastname")).sendKeys("lastnmaenithi");
		driver.findElement(By.id("input-email")).sendKeys("anithagr@gmail.com");
		driver.findElement(By.id("input-country")).sendKeys("Switzerland");
		driver.findElement(By.id("input-password")).sendKeys("Passw0rd");
		driver.findElement(By.xpath("//button[contains(text(),'Register')][2]")).click();
		
		


		
	}

}
