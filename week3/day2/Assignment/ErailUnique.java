package week3.day2.assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailUnique {

	public static void main(String[] args) throws InterruptedException {
   WebDriverManager.chromedriver().setup();
   ChromeDriver driver = new ChromeDriver();
	driver.get("https://erail.in/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement findElement = driver.findElement(By.id("chkSelectDateOnly"));
	findElement.click();
	findElement.isSelected(); 
	System.out.println("Sort on date is selected ?.... " + findElement.isSelected());
	WebElement findElement2 = driver.findElement(By.id("txtStationFrom"));
	findElement2.clear();
	findElement2.sendKeys("Mgr Chennai Central Suburban"+Keys.ARROW_DOWN +Keys.ENTER);
	WebElement findElement3 = driver.findElement(By.id("txtStationTo"));
	findElement3.clear();
	findElement3.sendKeys("Mumbai"+Keys.ARROW_DOWN +Keys.ENTER);
	Thread.sleep(2000);
	List<WebElement> list = driver.findElements(By.xpath("//a[@title='Click on train number to View fare and schedule']/following::a[1]"));
	System.out.println("No of Trains are : "+ list.size());
	
	List<String> liststr = new ArrayList<String>();
	for (WebElement liststring : list) {
		String text = liststring.getText();
		liststr.add(text);
	}
	
	Set<String> setstr = new HashSet<String>();
	setstr.addAll(liststr);
	System.out.println(setstr);
	System.out.println("No of Trains using SET : "+ list.size());


	

}
}

//Store all the train names in a list

//Get the size of it

//Add the list into a new Set

//And print the size of it
