package week2.day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundButton {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[text()='Go to Home Page']")).click();
		driver.findElement(By.xpath("//h5[text()='Button']")).click();
		// GetLocation of a Button:
		WebElement findElement = driver.findElement(By.id("position"));
		System.out.println("Button name: " + findElement.getText());
		System.out.println("Location: " + findElement.getLocation());
		System.out.println("Location of X : " + findElement.getLocation().getX());
		System.out.println("Location of Y : " + findElement.getLocation().getY());
		// Button color
		WebElement findElement3 = driver.findElement(By.id("color"));
		System.out.println("Button name: " + findElement3.getText());
		String cssValue = findElement3.getCssValue("background-color");
		System.out.println("Background-color : " + cssValue);

		WebElement findElement2 = driver.findElement(By.id("size"));
		System.out.println("Button name ..: " + findElement2.getText());
		System.out.println("Size..: " + findElement2.getSize());
		System.out.println("Height.. " + findElement2.getSize().getHeight());
		System.out.println("Width... " + findElement2.getSize().getWidth());

	}

}
