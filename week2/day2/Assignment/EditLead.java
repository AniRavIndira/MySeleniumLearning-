package week2.day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();// WebDriverManager setup
		ChromeDriver driver = new ChromeDriver();// Chromedriver setup
		driver.get("http://leaftaps.com/opentaps");// Launch the web application
		driver.manage().window().maximize();// Maximize the screen
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");// Username
		driver.findElement(By.id("password")).sendKeys("crmsfa");// Password
		driver.findElement(By.className("decorativeSubmit")).click();// Login
		driver.findElement(By.linkText("CRM/SFA")).click();// Click on link of CRM/SFA
		driver.findElement(By.linkText("Leads")).click();// Click on Leads
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Anitha1");
		driver.findElement(By.xpath("(//button[contains(text(),'Leads')])")).click();
		// Click on first resulting lead
		driver.findElement(By.xpath("(//div[@class='x-grid3-body']//a)[1]")).click();
		// Verify title of the page
		String title = driver.getTitle();
		System.out.println("Title of the page :  " + title);
		// Click Edit
		driver.findElement(By.xpath("(//a[@class='subMenuButton'])[3]")).click();
		// Change the company name
		WebElement findElement = driver.findElement(By.id("updateLeadForm_companyName"));
		findElement.clear();
		findElement.sendKeys("hellocompany");
		// Click Update;
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		// Confirm the changed name appears
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		String textsent = "hellocompany";
		if (text.equals(textsent)) {
			System.out.println("Name appreared has been changed");
		} else {
			System.out.println("Name is not  changed");

		}
		Thread.sleep(1000);
		driver.close();
		/*
		 * http://leaftaps.com/opentaps/control/main 1 Launch the browser 2 Enter the
		 * username 3 Enter the password 4 Click Login 5 Click crm/sfa link 6 Click
		 * Leads link 7 Click Find leads 8 Enter first name 9 Click Find leads button 10
		 * Click on first resulting lead 11 Verify title of the page 12 Click Edit 13
		 * Change the company name 14 Click Update 15 Confirm the changed name appears
		 * 16 Close the browser (Do not log out)
		 */
	}

}
