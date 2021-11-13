package week2.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("SFA")).click();
		driver.findElement(By.partialLinkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("crmsfa");
		driver.findElement(By.id("lastNameField")).sendKeys("crm");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("namelocal");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("namelocallast");
		driver.findElement(By.id("createContactForm_birthDate")).sendKeys("10/20/21");
		driver.findElement(By.id("createContactForm_personalTitle")).sendKeys("title");
		driver.findElement(By.id("createContactForm_generalProfTitle")).sendKeys("pROFTITLE");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("department");
		driver.findElement(By.id("createContactForm_description")).sendKeys("description");
		driver.findElement(By.id("createContactForm_preferredCurrencyUomId")).sendKeys("AFA - Afghani");
		driver.findElement(By.id("createContactForm_accountPartyId")).sendKeys("213");
	
		
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("hello@gmail.com");
		WebElement findElement = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select geoid = new Select(findElement);
		geoid.selectByVisibleText("New York"); 
		driver.findElement(By.name("submitButton")).click();
		
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("importnnote");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		String title = driver.getTitle();
		
		System.out.println(title);
		Thread.sleep(50000);
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
			
		
		/*
		 
		 * 
		 * 5. Click on contacts Button
		 * 
		 * 6. Click on Create Contact
		 *  
		 * 7. Enter FirstName Field Using id Locator
		 * 
		 * 8. Enter LastName Field Using id Locator
		 * 
		 * 9. Enter FirstName(Local) Field Using id Locator
		 * 
		 * 10. Enter LastName(Local) Field Using id Locator
		 * 
		 * 11. Enter Department Field Using any Locator of Your Choice
		 * 
		 * 12. Enter Description Field Using any Locator of your choice 
		 * 
		 * 13. Enter your email in the E-mail address Field using the locator of your choice
		 * 
		 * 14. Select State/Province as NewYork Using Visible Text
		 * 
		 * 15. Click on Create Contact
		 * 
		 * 16. Click on edit button 
		 * 
		 * 17. Clear the Description Field using .clear
		 * 
		 * 18. Fill ImportantNote Field with Any text
		 * 
		 * 19. Click on update button using Xpath locator
		 * 
		 * 20. Get the Title of Resulting Page.
         */
		

	}

}
