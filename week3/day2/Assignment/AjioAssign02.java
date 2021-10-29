package week3.day2.assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AjioAssign02 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("-disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		// In the search box, type as "bags" and press enter
		driver.findElement(By.name("searchVal")).sendKeys("Bags" + Keys.ENTER);
		// To the left of the screen under " Gender" click the "Men"
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		// Under "Category" click "Fashion Bags"
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("(//div[@class='filter-container']//div)[2]")).getText();
		System.out.println("The count of the Fashion Bags for Men Found:  " + text);
		// wrote this using LIST and findElements
		List<WebElement> brandnames =
				driver.findElements(By.xpath("//div[@class='brand']"));
		System.out.println(" Size :" + brandnames.size());

		for (WebElement forEachToPrint : brandnames) {
			String name = forEachToPrint.getText();
			System.out.println(name);
		}
		// Get the list of names of the bags and print it

		List<WebElement> bagName = driver.findElements(By.xpath("//div[@class='name']"));
		System.out.println(" Size :" + bagName.size());

		for (WebElement forEachToPrint : bagName) {
			String name = forEachToPrint.getText();
			System.out.println(name);
		}
	}
}

// Thread.sleep(50000);
// driver.close();

/*
 * SAMPLE PROGRAM TO IMPLEMENT LIST :
 ***********
 * 
 * NOTE: Java code is attached for your reference.
 * 
 * 1. Launch the URL https://www.ajio.com/ 2. In the search box, type as "bags"
 * and press enter 3. To the left of the screen under " Gender" click the "Men"
 * 4. Under "Category" click "Fashion Bags" 5. Print the count of the items
 * Found. 6. Get the list of brand of the products displayed in the page and
 * print the list. 7. Get the list of names of the bags and print it
 * 
 */
