package week4.day2.assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro", Keys.ENTER);

		String price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText().replaceAll("[^1-9]","");
		System.out.println("The price of the first product... " + price);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-star-small a-star-small-4 aok-align-bottom'])[1]"))
				.click();

		String cusRating = driver.findElement(By.xpath("(//table[@id='histogramTable']//tr/td[3]/span[2]/a)[1]"))
				.getText();
		System.out.println("Customer Rating: " + cusRating);

		WebElement hoverStars = driver
				.findElement(By.xpath("(//i[@class='a-icon a-icon-star-small a-star-small-4 aok-align-bottom'])[1]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(hoverStars).perform();
		driver.findElement(By.xpath("(//a[@class='a-link-normal a-text-normal']/span)[1]")).click();

		Set<String> windowHandles = driver.getWindowHandles();
		List<String> winList = new ArrayList<String>(windowHandles);
		String newWindow = winList.get(1);
		driver.switchTo().window(newWindow);

		driver.findElement(By.id("imgTagWrapperId"));
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snap/AmazonFirstpic.png");
		FileUtils.copyFile(src, desc);

		driver.findElement(By.id("add-to-cart-button")).click();
		String cartSubTot = driver.findElement(By.xpath("//span[@class='a-color-price hlb-price a-inline-block a-text-bold']")).getText().replaceAll("[^1-9]","");
		System.out.println(cartSubTot);
		if (price.equals(cartSubTot)) {
			System.out.println("Phone Price and Cart subtotal is same ");
		} else {
			System.out.println("Phone Price and Cart subtotal is NOT same ");
		}

	}
}

//1.Load the uRL https://www.amazon.in/
//2.search as oneplus 9 pro 
//3.Get the price of the first product
//4. Print the number of customer ratings for the first displayed product
//5. Mouse Hover on the stars
//6. Get the percentage of ratings for the 5 star.
//7. Click the first text link of the first image
//8. Take a screen shot of the product displayed
//9. Click 'Add to Cart' button
//10. Get the cart subtotal and verify if it is correct.