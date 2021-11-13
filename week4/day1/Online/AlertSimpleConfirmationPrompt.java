package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertSimpleConfirmationPrompt {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Alert.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Handle simple Alert:
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		// After getting Simple Alert popup, I am going to transfer the control to Alert
		// Interface
		Alert alert = driver.switchTo().alert();
		// Accept the simple alert
		System.out.println("I am simple alert: " + alert.getText());
		alert.accept();
		
		// Handle Confirmation Alert:
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		System.out.println("I am Confirmation alert : " + alert.getText());
		alert.dismiss();
		System.out.println("You have Pressed : " + driver.findElement(By.id("result")).getText());

		// Handle Prompt Alert:
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		// we send the text using Alert
		alert.sendKeys("Test leaf");
		System.out.println("I am Prompt alert : " + alert.getText());
		alert.accept();
		System.out.println("You have Pressed : " + driver.findElement(By.id("result1")).getText());
	}

}
