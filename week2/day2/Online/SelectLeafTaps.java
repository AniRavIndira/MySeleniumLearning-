package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectLeafTaps {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();// WebDriverManager setup
		ChromeDriver driver = new ChromeDriver();// Chromedriver setup
		driver.get("http://leaftaps.com/opentaps");// Launch the web application
		driver.manage().window().maximize();// Maximize the screen
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");// Username
		driver.findElement(By.id("password")).sendKeys("crmsfa");// Password
		driver.findElement(By.className("decorativeSubmit")).click();// Login
		driver.findElement(By.linkText("CRM/SFA")).click();// Click on link of CRM/SFA
		driver.findElement(By.linkText("Leads")).click();// Click on Leads
		Thread.sleep(5000);
		driver.findElement(By.linkText("Create Lead")).click();// click on Create lead in Lead page
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Bank of Kailasa");// 1)Enter the Company name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nithi");// 3)Enter the First name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Passw0rd");// 4) Enter the Lastnmae
		/*1. Select the Direct Mail from Source using selectByVisibleText
		2. Select the Health Care from Industry using selectByIndex
		3. Select the Partnership from Ownership using selectByValue
		4. Select Affiliated Sites using sendKeys from Marketing Campaign
		*/
		WebElement selectByVisibleText = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropDown=new Select(selectByVisibleText);
		dropDown.selectByVisibleText("Direct Mail");
		
		WebElement selectByIndex = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dropDown1=new Select(selectByIndex);
		dropDown1.selectByIndex(7);
		
		WebElement selectByValue = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dropDown2=new Select(selectByValue);
		dropDown2.selectByValue("OWN_PARTNERSHIP");
		
	    driver.findElement(By.id("createLeadForm_marketingCampaignId")).sendKeys("Affiliate Sites");
			}
    
	}

