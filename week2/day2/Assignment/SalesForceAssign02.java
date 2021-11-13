package week2.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceAssign02 {

	public static void main(String[] args) throws InterruptedException {
		//SalesForce:
			// Step 1: Download and set the path 
			// Step 2: Launch the chromebrowser
			// Step 3: Load the URL 
	// https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk
			// Step 4: Maximise the window
			// Step 5: Add implicit wait
			// Step 6: Fill in all the text boxes
			// Step 7: Handle all the dropdowns
			// Step 8: Click the check box
			// Step 9: Close the browser
			//*Note: No need click Start my freeTrial
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.name("UserFirstName")).sendKeys("SalesfrceName");
		driver.findElement(By.name("UserLastName")).sendKeys("salesforcelas");
		driver.findElement(By.name("UserEmail")).sendKeys("asdfgef@gm.com");
		driver.findElement(By.name("CompanyName")).sendKeys("asdCompany");
		driver.findElement(By.name("UserPhone")).sendKeys("9977665544");
		
	WebElement comEmp = driver.findElement(By.name("CompanyEmployees"));
	Select obj = new Select(comEmp);
	obj.selectByValue("250");
	
	WebElement comCou = driver.findElement(By.name("CompanyCountry"));
	Select obj2 = new Select(comCou);
	obj2.selectByVisibleText("United States");
	
	
	WebElement comState = driver.findElement(By.name("CompanyState"));
	Select obj3 = new Select(comState);
	obj3.selectByIndex(2);
	
	driver.findElement(By.xpath("//div[@class=\"checkbox-ui\"]")).click();
	Thread.sleep(10000);
	driver.close();
	
	
		
		
		
		
	}

}
