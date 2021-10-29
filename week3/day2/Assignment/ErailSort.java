package week3.day2.assignment;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailSort {

	public static void main(String[] args) throws InterruptedException {
//Launch the browser
		WebDriverManager.chromedriver().setup();
//Launch the URL - https://erail.in/
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
//Uncheck the check box - sort on date
		Thread.sleep(10000);
		WebElement findElement = driver.findElement(By.id("chkSelectDateOnly"));
		findElement.click();
		findElement.isSelected(); 
		System.out.println("Sort on date is selected ?.... " + findElement.isSelected());
//clear and type in the source station 
		WebElement findElement2 = driver.findElement(By.id("txtStationFrom"));
		findElement2.clear();
		findElement2.sendKeys("Mgr Chennai Central Suburban"+Keys.ARROW_DOWN +Keys.ENTER);
		// clear and type in the destination station
		WebElement findElement3 = driver.findElement(By.id("txtStationTo"));
		findElement3.clear();
		findElement3.sendKeys("Mumbai"+Keys.ARROW_DOWN +Keys.ENTER);
		Thread.sleep(2000);
		
//Find all the train names using xpath and store it in a list
		List<WebElement> list = driver.findElements(By.xpath("//a[@title='Click on train number to View fare and schedule']/following::a[1]"));
		System.out.println("No of Trains are : "+ list.size());
		List<String> list2 = new ArrayList<String>();
		for (WebElement forWE : list) {
			String attribute = forWE.getText();	
		   System.out.println(attribute);
		   list2.add(attribute);
					}		
	Collections.sort(list2);
	
	   System.out.println(list2);
	  for (String string : list2) {
		  System.out.println(string);
		
	}

//Use Java Collections sort to sort it and then print it
	}

}
