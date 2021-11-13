package week4.day1.assignment;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) throws IOException {
		

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("SFA")).click();
		driver.findElement(By.partialLinkText("Contacts")).click();
		//6. Click on Merge Contacts using Xpath Locator
		driver.findElement(By.xpath("(//ul[@class='shortcuts']//a)[4]")).click();
		//7. Click on Widget of From Contact
		driver.findElement(By.xpath("//img[@id='ext-gen589']")).click();	
		/*
		 * Set<String> windowHandles = driver.getWindowHandles(); List<String> list =
		 * new ArrayList<String>(windowHandles);
		 * driver.switchTo().window(list.get(1)).manage().window().maximize();
		 */
		//8. Click on First Resulting Contact
		
		//9. Click on Widget of To Contact
		 // 10. Click on Second Resulting Contact
		 //11. Click on Merge button using Xpath Locator
		 //12. Accept the Alert
		 //13. Verify the title of the page
	}

}
//Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
/*
 * //Pseudo Code
  * 1. Launch URL "http://leaftaps.com/opentaps/control/login"
 * 2. Enter UserName and Password Using Id Locator
  * 3. Click on Login Button using Class Locator
 * 4. Click on CRM/SFA Link
 * 5. Click on contacts Button
 * 6. Click on Merge Contacts using Xpath Locator
 * 7. Click on Widget of From Contact
 * 8. Click on First Resulting Contact
 * 9. Click on Widget of To Contact
 * 10. Click on Second Resulting Contact
 * 11. Click on Merge button using Xpath Locator
 * 12. Accept the Alert
 * 13. Verify the title of the page
 */