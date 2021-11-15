package week4.day2.assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Carwalee {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.carwale.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement hover = driver.findElement(By.xpath("//div[text()='USED CARS']"));
		Actions builder = new Actions(driver);
		builder.moveToElement(hover).perform();
		driver.findElement(By.xpath("//div[text()='Find Used cars']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("placesQuery")).sendKeys("Chennai");
		Thread.sleep(1000);
		driver.findElement(By.id("placesQuery")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.findElement(By.id("budgetBtn")).click();
		driver.findElement(By.id("minInput")).sendKeys("8", Keys.ENTER);
		driver.findElement(By.id("maxInput")).sendKeys("12", Keys.ENTER);
	
		driver.findElement(By.id("btnSetBudget")).click();
		driver.findElement(By.xpath("//span[text()='Cars with Photos']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//span[text()=' Hyundai ']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//span[text()='Creta']")).click();
//		driver.findElement(By.xpath("//h3[contains(text(),'Fuel Type')]/span")).click();
//		Thread.sleep(1000);
		WebElement Hyundai = driver.findElement(By.xpath("(//li[@data-manufacture-en='Hyundai']/span)[1]"));
		js.executeScript("arguments[0].click()", Hyundai);
		Thread.sleep(3000);
	    //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement Creta = driver.findElement(By.xpath("//span[text()='Creta']"));
		//wait.until(ExpectedConditions.elementToBeClickable(Creta));
		js.executeScript("arguments[0].click()", Creta);
		WebElement fuelType =driver.findElement(By.xpath("//h3[contains(text(),'Fuel Type')]/span"));
		js.executeScript("arguments[0].click()",fuelType);
		WebElement Petrol = driver.findElement(By.xpath("//span[text()='Petrol']"));
		js.executeScript("arguments[0].click()", Petrol);
		WebElement sort = driver.findElement(By.id("sort"));
		Select select = new Select(sort);
		select.selectByValue("2");
		
		 List<WebElement> list = driver.findElements(By.xpath("//span[@class='slkms vehicle-data__item']"));
		 List<String> beforeSortKM = new ArrayList<String>();
		 for (WebElement webElement : list) {
			 beforeSortKM.add(webElement.getText());
						 		}
		 List<String> afterSort = new ArrayList<String>(beforeSortKM);
		 Collections.sort(beforeSortKM);
		 int count=0;
		for (int i = 0; i <list.size(); i++) {
			if((beforeSortKM.get(i)).equals(afterSort.get(i))) {
				count++;
			}
			else {
				System.out.println(beforeSortKM.get(i));
				System.out.println(afterSort.get(i));
				System.out.println("Creta KM is NOT sorted");break;
			}
		}
		if(count>0) {
			System.out.println("Creta KM is sorted");
		}
		//14.Add the least KM ran car to Wishlist
		Thread.sleep(2000);
		WebElement wishList = driver.findElement(By.xpath("(//span[@class='slkms vehicle-data__item'])[1]/ancestor::div[@class='card-detail-block']/preceding-sibling::div[@class='image-container']//span[2]"));
		wishList.click();
		Thread.sleep(500);	
		//15. Go to Wishlist and Click on More Details
		//builder.contextClick(wishList).perform();-- This for rightclick
		builder.doubleClick(wishList).perform();
		
	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='rightfloat more-detail-link']/a")).click();
		//16.Print all the details under Overview in the same way as displayed in application
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> winList = new ArrayList<String>(windowHandles);
		driver.switchTo().window(winList.get(1));
		
			
		List<WebElement> overviewKey = driver.findElements(By.xpath("//div[@id='overview']//div[@class='equal-width text-light-grey']"));
		List<WebElement> overviewValue = driver.findElements(By.xpath("//div[@id='overview']//div[@class='equal-width dark-text']"));
		
		Map<String,String> map = new LinkedHashMap<String,String>();
		for (int i = 0; i < overviewKey.size(); i++) {
			String mapKey = overviewKey.get(i).getText();
			String mapValue = overviewValue.get(i).getText();
			map.put(mapKey,mapValue);
		}
		System.out.println(map);
		
		for (Entry<String, String> eachEntry : map.entrySet()) {
			System.out.println("Key: "+eachEntry.getKey()+"---->  Value: "+eachEntry.getValue());
		}
		

	}

}

//1.Launching ChromeBrowser
//2.Load the url "https://www.carwale.com"
//3.MouseOver on UsedCars
//4.Click FindUsed
//5.Select the city as Chennai
//6.Click Choose Budget
//7.Select budget min(8L) and max(12L) and click search
//8.Selecting car with photos 'Under Only show car with'
//9.Selecting Hyundai
//10.Selecting Creta
//11. Select Fuel Type as Petrol
//12.Select Best Match as "KM: Low to High"
//13. Validate the Cars are listed with KMs Low to High
//14.Add the least KM ran car to Wishlist
//15. Go to Wishlist and Click on More Details
//16.Print all the details under Overview in the same way as displayed in application
//17.Close the browser.