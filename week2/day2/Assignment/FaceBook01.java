package week2.day2.assignment;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook01 {

	public static void main(String[] args) throws InterruptedException {
		// Step 1: Download and set the path 
		// Step 2: Launch the chromebrowser
		// Step 3: Load the URL https://en-gb.facebook.com/
		// Step 4: Maximise the window
		// Step 5: Add implicit wait
		// Step 6: Click on Create New Account button
		// Step 7: Enter the first name
		// Step 8: Enter the last name
		// Step 9: Enter the mobile number
		// Step 10: Enterthe password
		// Step 11: Handle all the three drop downs
		// Step 12: Select the radio button "Female" 
		            //( A normal click will do for this step) 
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(10000);
		driver.findElement(By.name("firstname")).sendKeys("Nithi");
		driver.findElement(By.name("lastname")).sendKeys("Ananda");
		driver.findElement(By.name("reg_email__")).sendKeys("9876533210");
		driver.findElement(By.id("password_step_input")).sendKeys("Passw0rd");
		//driver.findElement(By.name("birthday_day")).sendKeys("1");
		
	    WebElement dateFindEle = driver.findElement(By.name("birthday_day"));
	    Select selObj1= new Select(dateFindEle);
	    selObj1.selectByIndex(13);
	    	    
	    WebElement dateFindEle2 = driver.findElement(By.name("birthday_month"));
	    Select selObj2= new Select(dateFindEle2);
	    selObj2.selectByValue("11");
	    
	    WebElement dateFindEle3 = driver.findElement(By.name("birthday_year"));
	    Select selObj3= new Select(dateFindEle3);
	    selObj3.selectByVisibleText("1920");
	    
	    driver.findElement(By.xpath("//label[@class=\"_58mt\"]")).click();
	    
	    Thread.sleep(90000);
	    driver.close();
	    	
	    
	    
	    
	    
	    
		
		
		
	}

}
