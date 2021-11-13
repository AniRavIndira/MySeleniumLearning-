package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SweetAlert {

	public static void main(String[] args) {
		
		
		//Handling Notifications
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search"); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		
		
		//Non-Modal or SweetAlert - This can be inspected like other web Elements
		driver.findElement(By.xpath("//div[@class='text-center col-xs-12']")).click();
		
		
	}

}
