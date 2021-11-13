package week2.day2.assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundListboxes {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele = driver.findElement(By.id("dropdown1"));
		Select dropdown = new Select(ele);
		dropdown.selectByIndex(4);
		
		
		WebElement ele1 = driver.findElement(By.name("dropdown2"));
		Select dropdown1 = new Select(ele1);
		dropdown1.selectByValue("3");
		
		WebElement ele2 = driver.findElement(By.id("dropdown3"));
		Select dropdown2 = new Select(ele2);
		dropdown2.selectByVisibleText("Appium");
		List<WebElement> options = dropdown2.getOptions();
		System.out.println(options.size()-1);
		
		driver.findElement(By.xpath("(//div[@class='example']/select)[5]")).sendKeys("Selenium");
	
		
		
	}
}
