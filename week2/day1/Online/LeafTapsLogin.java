package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafTapsLogin {

	public static void main(String[] args) {
		//To setup Driver which act as intermediator between Selenium and Web Application
		   WebDriverManager.chromedriver().setup();
		   ChromeDriver driver= new ChromeDriver();
		   driver.get("http://leaftaps.com/opentaps");
		   WebElement findElement = driver.findElement(By.name("USERNAME"));
		   WebElement findElement1 = driver.findElement(By.id("password"));
		   WebElement findElement2 = driver.findElement(By.className("decorativeSubmit"));
		   
		   
		   findElement.sendKeys("Demosalesmanager");
		   findElement1.sendKeys("crmsfa");
		   findElement2.click();
		   
   
	}

}
