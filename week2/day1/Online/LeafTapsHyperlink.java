package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafTapsHyperlink {

	public static void main(String[] args) throws InterruptedException {
  WebDriverManager.chromedriver().setup();
  ChromeDriver driver = new ChromeDriver();
  driver.get("http://leaftaps.com/opentaps");
  driver.manage().window().maximize();
  String text = driver.findElement(By.tagName("h2")).getText();
  System.out.println(text);
  driver.findElement(By.id("username")).sendKeys("Demosalesmanager");//Username
  driver.findElement(By.id("password")).sendKeys("crmsfa");//Password
  driver.findElement(By.className("decorativeSubmit")).click();//Login
  driver.findElement(By.linkText("CRM/SFA")).click();//Click on link of CRM/SFA
  driver.findElement(By.linkText("Leads")).click();// Click on Leads
  Thread.sleep(5000);
  driver.findElement(By.linkText("Create Lead")).click();// click on Create lead in Lead page
  driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nithi");// Enter the First name
  driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Passw0rd");//Enter  the Lastnmae
  driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Bank of Kailasa");//Enter the Company name
  driver.findElement(By.name("submitButton")).click();// Click on the submit of Create lead
 
  
  
  
	}

}
