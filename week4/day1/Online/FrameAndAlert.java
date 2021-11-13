package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameAndAlert {

	public static void main(String[] args) {

		// R.C on the element to see View frame source
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Handle Frame to avoid NoSuchElementException
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();

		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		String text = driver.findElement(By.id("demo")).getText();
		
		if(text.contains("OK"))
		{
			System.out.println(" Displayed heree.. "+ text);
		}
		else
		{
			System.out.println(" Displayed heree.. "+ text);
		}

	}

}
