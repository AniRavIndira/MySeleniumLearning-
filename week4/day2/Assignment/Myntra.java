package week4.day2.assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions builder = new Actions(driver);
		WebElement findEle = driver.findElement(By.xpath("//a[text()='Men']"));
		builder.moveToElement(findEle).perform();
		driver.findElement(By.xpath("//a[text()='Jackets']")).click();
		Thread.sleep(1000);
		String totCount = driver.findElement(By.xpath("//span[@class='title-count']")).getText().replaceAll("\\D", "");

		System.out.println("Total count of item: " + totCount);
		String jacket = driver.findElement(By.xpath("//input[@value='Jackets']/following-sibling::span")).getText();
		String rainJacket = driver.findElement(By.xpath("//input[@value='Rain Jacket']/following-sibling::span"))
				.getText();
		
		int sum = Integer.parseInt(jacket.replaceAll("\\D", "")) + Integer.parseInt(rainJacket.replaceAll("\\D", ""));
		String valueOf = String.valueOf(sum);
		System.out.println("sum of categories count matches: " +valueOf);
		if (valueOf.contains(totCount)) {
			System.out.println("matching");
		} else {
			System.out.println("Not matching");
		}
		driver.findElement(By.xpath("//input[@value='Jackets']/following-sibling::div")).click();
		driver.findElement(By.xpath("//div[@class='brand-more']")).click();
		driver.findElement(By.xpath("//input[@value='Duke']/following-sibling::div")).click();
		driver.findElement(By.xpath("//span[@class='myntraweb-sprite FilterDirectory-close sprites-remove']")).click();
		Thread.sleep(2000);
		List<WebElement> brand1 = driver.findElements(By.xpath("//h3[@class='product-brand']"));
		List<String> listNew = new ArrayList<String>();
		for (WebElement webElement : brand1) {
			listNew.add(webElement.getText());
					}
		if (!listNew.contains("Duke")) {
			System.out.println("Page 1 has not Duke");
		} else {
			System.out.println("Page 1 has Duke");
		}
		driver.findElement(By.xpath("//div[@class='sort-sortBy']")).click();
		driver.findElement(By.xpath("//label[text()='Better Discount']")).click();
		Thread.sleep(1000);
		String replaceAll = driver.findElement(By.xpath("(//span[@class='product-discountedPrice'])[1]")).getText();
		System.out.println("Discount Price... "+replaceAll);
		driver.findElement(By.xpath("//img[@title='Duke Men Olive Brown Solid Bomber Jacket']")).click();
		Set<String> windowHandle = driver.getWindowHandles();
		List<String> newWin = new ArrayList<String>(windowHandle);
		driver.switchTo().window(newWin.get(1));
		driver.findElement(By.xpath("(//div[@class='image-grid-imageContainer']/div)[1]"));
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snap/ss1.png");
		FileUtils.copyFile(src, desc);
		driver.findElement(By.xpath("(//span[@class='desktop-userTitle'])[2]")).click();
		driver.quit();
		
		
	}
		}
	

//Myntra
//1) Open https://www.myntra.com/
//2) Mouse hover on MeN 
//3) Click Jackets 
//4) Find the total count of item 
//5) Validate the sum of categories count matches
//6) Check jackets
//7) Click + More option under BRAND
//8) Type Duke and click checkbox
//9) Close the pop-up x
//10) Confirm all the Coats are of brand Duke
//    Hint : use List 
//11) Sort by Better Discount
//12) Find the price of first displayed item
//Click on the first product
//13) Take a screen shot
//14) Click on WishList Now
//15) Close Browser