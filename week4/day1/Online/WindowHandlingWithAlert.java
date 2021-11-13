package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlingWithAlert {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//div[@class='text-center col-xs-12']")).click();
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();

		Set<String> windowHandles = driver.getWindowHandles();
		List<String> winlist = new ArrayList<String>(windowHandles);
		driver.switchTo().window(winlist.get(1));
		System.out.println(driver.getTitle());
	}

}
