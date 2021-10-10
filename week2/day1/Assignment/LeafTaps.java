package week2.day2.assignment;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafTaps {

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
		//Thread.sleep(5000);
		driver.findElement(By.linkText("Create Lead")).click();// click on Create lead in Lead page
		// Enter all the text fields in CreateLead page
		// **Note
		// 1. Donot work on Parent Account Field
		// 2. Enter the Birthdate using SendKeys
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Bank of Kailasa");// 1)Enter the Company name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nithi");// 3)Enter the First name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Passw0rd");// 4) Enter the Lastnmae
		//driver.findElement(By.id("createLeadForm_dataSourceId")).sendKeys("LEAD_COLDCALL"); // 5)Enter the source name
		//driver.findElement(By.id("createLeadForm_marketingCampaignId")).sendKeys("9002"); // 6)Enter the Marketing																							// Campaign
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Ananda");// Enter the First Name (Local)
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("ji"); // Enter the Last Name (Local)
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Miss");// Enter the Salutation
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("10/6/21"); // Enter the Birth Date
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Fresher");// Enter the Title
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Department"); // Enter the Department
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("131232");// Annual Revenue
		//driver.findElement(By.id("createLeadForm_currencyUomId")).sendKeys("USD - American Dollar"); // Prefrerred Currency
	    //driver.findElement(By.id("createLeadForm_industryEnumId")).sendKeys("IND_AEROSPACE");// Industry
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("10"); // Number Of Employees
		//	driver.findElement(By.id("createLeadForm_ownershipEnumId")).sendKeys("OWN_PROPRIETOR"); // Ownership
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("123"); // SIC Code
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("123");// Ticker Symbol
		driver.findElement(By.id("createLeadForm_description")).sendKeys("hello");// Description
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("note");// Important Note
		// 8. Enter all the text fields in contact information
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("04144");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("231271");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("123");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Anitha");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("anitha@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https://www.google.com");
		// 9. Enter all the text fields in primary address
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("qwerty1");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("qwerty2");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("qwerty3");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("qwerty4");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("qwerty5");
		//driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("qwerty5");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("qwerty6");
		driver.findElement(By.id("createLeadForm_generalCountryGeoId")).sendKeys("qwerty7");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("qwerty9");
		// 10. Get the Firstname and print it
		String firstnameprint = driver.findElement(By.id("createLeadForm_firstName")).getText();
		System.out.println(firstnameprint+"... is the First name");
		// 11. Click on create Lead Button
		driver.findElement(By.name("submitButton")).click();
		// 12. Get and Verify the Title of the resulting Page(View Lead)
		String verify = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		String verify1="View Lead";
		if(verify.equals(verify1)) {
			System.out.println("..Verified Title..");
		}
    
	}

}
/*
 * 1. Launch URL "http://leaftaps.com/opentaps/control/login" 2. Enter UserName
 * and Password 3. Click on Login Button 4. Click on CRM/SFA Link 5. Click on
 * Leads Button 6. Click on create Lead Button 7. Enter all the text fields in
 * CreateLead page
 ** 
 * Note 1. Donot work on Parent Account Field 2.Enter the Birthdate using
 * SendKeys
 * 
 * 8. Enter all the text fields in contact information 9. Enter all the text
 * fields in primary address 10. Get the Firstname and print it 11. Click on
 * create Lead Button 12. Get and Verify the Title of the resulting Page(View
 * Lead)
 */