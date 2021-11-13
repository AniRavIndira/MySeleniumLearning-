package week4.day2.assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		// 1) Go to https://www.nykaa.com/
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// 2) Mouseover on Brands and Search L'Oreal Paris
		Actions builder = new Actions(driver);
		WebElement hover = driver.findElement(By.xpath("//a[text()='brands']"));
		builder.moveToElement(hover).perform();
		driver.findElement(By.id("brandSearchBox")).sendKeys("L'Oreal Paris");
		// 3) Click L'Oreal Paris
		driver.findElement(By.linkText("L'Oreal Paris")).click();
		// 4) Check the title contains L'Oreal Paris(Hint-GetTitle)
		String title = driver.getTitle();
		System.out.println(title);
		if (title.contains("L'Oreal Paris")) {
			System.out.println("Title contains L'Oreal Paris");
		} else {
			System.out.println("Title does not contain L'Oreal Paris");
		}
		// 5) Click sort By and select customer top rated
		driver.findElement(By.xpath("//button[@class=' css-p2rfnw']")).click();
		driver.findElement(By.xpath("(//div[@class='control-indicator radio '])[3]")).click();
		Thread.sleep(1000);
		// 6) Click Category and click Hair->Click haircare->Shampoo
		driver.findElement(By.xpath("//span[text()='Category']")).click();
		driver.findElement(By.xpath("(//span[@class='filter-name '])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='filter-name '])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='control-value']/span)[1]")).click();
		// 7) Click->Concern->Color Protection
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
		// 8)check whether the Filter is applied with Shampoo
		List<WebElement> filtervalue = driver.findElements(By.xpath("//span[@class='filter-value']"));
		for (WebElement webElement : filtervalue) {
			if ((webElement.getText()).contains("Shampoo")) {
				System.out.println("Filter is applied with Shampoo");
				break;
			} else {
				System.out.println("Filter is not applied with Shampoo");
			}
		}
		Thread.sleep(2000);
		// 9) Click on L'Oreal Paris Colour Protect Shampoo
		driver.findElement(By.xpath("//div[contains(text(),'Paris Colour Protect Shampoo')]")).click();
		// 10) GO to the new window and select size as 175ml
		Set<String> winSet = driver.getWindowHandles();
		List<String> winlist = new ArrayList<String>(winSet);
		driver.switchTo().window(winlist.get(1));
		driver.findElement(By.xpath("//option[text()='175ml']")).click();
		// 11) Print the MRP of the product
		String text = driver.findElement(By.xpath("//span[text()='MRP:']/following-sibling::span")).getText();
		System.out.println("Print the MRP of the product: " + text);
		// 12) Click on ADD to BAG
		driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
		// 13) Go to Shopping Bag
		driver.findElement(By.xpath("//button[@class='css-5s18zx eoh7kvv0']")).click();
		// 14) Print the Grand Total amount
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='css-acpm4k']"));
		driver.switchTo().frame(frame1);
		Thread.sleep(3000);
		String total = driver.findElement(By.xpath("(//div[@class='value'])[4]")).getText();
		System.out.println("The Grand Total amount: " + total);
		// 15) Click Proceed
		driver.findElement(By.xpath("//span[text()='Proceed']")).click();
		// 16) Click on Continue as Guest
		driver.findElement(By.xpath("//button[text()='CONTINUE AS GUEST']")).click();
		// 17) Check if this grand total is the same in step 14
		String totalwin3 = driver.findElement(By.xpath("(//div[@class='value']/span)[2]")).getText();
		System.out.println("The Grand Total amount: " + totalwin3);
		if (total.contains(totalwin3)) {
			System.out.println("grand total is the same");
		} else {
			System.out.println("grand total is NOT same");
		}
		// 18) Close all windows
		driver.quit();
	}

}
