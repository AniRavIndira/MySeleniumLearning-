package week4.day2.assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		// 1. Launch https://www.snapdeal.com/
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// 2. Go to Mens Fashion-hover
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("//li[@navindex='6']/a"))).perform();
		// 3. Go to Sports Shoes
		driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
		// 4. Get the count of the sports shoes
		System.out.println("Count of the sports shoes: "
				+ driver.findElement(By.xpath("//span[@class='category-count']")).getText());
		// 5. Click Training shoes
		driver.findElement(By.xpath("(//div[@class='child-cat-name '])[2]")).click();
		// 6. Sort by Low to High
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='sort-label']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//ul[@class='sort-value']/li)[2]")).click();

		// 7. Check if the items displayed are sorted correctly
		List<WebElement> listEle = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
		System.out.println(listEle.size());
		List<Integer> beforeSort = new ArrayList<Integer>();

		for (WebElement webElement : listEle) {
			String text2 = webElement.getAttribute("data-price");
			beforeSort.add(Integer.parseInt(text2));
		}
		System.out.println(beforeSort);
		List<Integer> newList = new ArrayList<Integer>();
		newList.addAll(beforeSort);
		Collections.sort(newList);
		Thread.sleep(1000);
		System.out.println(newList);
		for (int i = 0; i < listEle.size(); i++) {
			if((beforeSort.get(i))!=(newList.get(i))){
			System.out.println("Phew,Not all displayed items are not sorted");
			break;
		      }
// 8.Select the price range (900-1200)
//		WebElement slider = driver.findElement(By.xpath("//a[@class='price-slider-scroll left-handle ui-slider-handle ui-state-default ui-corner-all hashAdded']"));
//		 	        
//	        //To Move jQuery slider by 100 pixel offset using dragAndDropBy method of Actions class.
//	        builder.dragAndDropBy(slider,13,0).build().perform();
//	        Thread.sleep(2000);
//	        WebElement lastslider = driver.findElement(By.xpath("//a[@class='price-slider-scroll right-handle ui-slider-handle ui-state-default ui-corner-all hashAdded']"));
//	        builder.dragAndDropBy(lastslider,0,130).build().perform();
//	       //After 5 seconds, This will Move jQuery slider by 100 pixel offset using the combination of clickAndHold, moveByOffset and release methods of Actions class.
//	       // builder.clickAndHold(slider).moveByOffset(100,0).release().perform();
		WebElement fromValue = driver.findElement(By.name("fromVal"));
		fromValue.clear();
		fromValue.sendKeys("900");

		WebElement totalValue = driver.findElement(By.name("toVal"));
		totalValue.clear();
		totalValue.sendKeys("1200");
		driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
		// 9.Filter with color Navy
		Thread.sleep(2000);
		WebElement color = driver.findElement(By.xpath("//label[@for='Color_s-Red']"));
		color.click();
		String redText = color.getText().replaceAll("\\d", "");
		System.out.println("Filter with color Black: " + redText);

		// 10 verify the all applied filters
		Thread.sleep(2000);
		List<WebElement> appliedFilters = driver.findElements(By.xpath("//div[@class='filters-top-selected']//a"));
		System.out.println("size.."+appliedFilters.size());
		System.out.println("get(0)"+appliedFilters.get(0).getText());
		System.out.println("get(1)"+appliedFilters.get(1).getText());
		
		String text2 = appliedFilters.get(0).getText();
		String text3 = appliedFilters.get(1).getText();
		if ((text2.contains("900")) && (redText.contains(text3))) {
			System.out.println("all  filters are applied");
		}

		// 11. Mouse Hover on first resulting Training shoes
		WebElement firstShoe = driver
				.findElement(By.xpath("//div[@class='col-xs-6  favDp product-tuple-listing js-tuple ']"));
		builder.moveToElement(firstShoe).perform();
		// 12. click QuickView button
		driver.findElement(By.xpath("//div[@class='center quick-view-bar  btn btn-theme-secondary  ']")).click();

		// 13. Print the cost and the discount percentage
		String cost = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText().replaceAll("//d", "");
		String discount = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		System.out.println("The cost is " + cost + "and the discount percentage is" + discount);

		// 14. Take the snapshot of the shoes.

		driver.findElement(By.xpath("//ul[@id='bx-slider-qv-image-panel']"));
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snap/snapdealshoe.png");
		FileUtils.copyFile(src, desc);
		// 15. Close the current window
		driver.findElement(By.xpath("//div[@class='close close1 marR10']")).click();
		// 16. Close the main window
		driver.close();

	}}

}
