package week4.day1.assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceNow {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev71851.service-now.com/navpage.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// frame:
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("Chidambaram@123");
		driver.findElement(By.id("sysverb_login")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@id='filter']")).sendKeys("incident");
		driver.findElement(By.xpath("(//div[text()='All'])[2]")).click();
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.xpath("//button[text()='New']")).click();
		driver.findElement(By.xpath("//span[@class='icon icon-search']")).click();
		driver.switchTo().defaultContent();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> winlist = new ArrayList<String>(windowHandles);
		driver.switchTo().window(winlist.get(1)).manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Abel Tuter']")).click();
		driver.switchTo().window(winlist.get(0));
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.id("incident.short_description")).sendKeys("Typing the description.....");
		String attribute = driver.findElement(By.id("incident.number")).getAttribute("value");
		driver.switchTo().defaultContent();
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.id("sysverb_insert")).click();

		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys(attribute, Keys.ENTER);
		String text = driver.findElement(By.xpath("//a[@class='linked formlink']")).getText();
		driver.switchTo().defaultContent();
		if (attribute.equals(text)) {
			System.out.println("Incident number is: " + text);
		}

	}
}

/*
 * Step1: Load ServiceNow application URL Step2: Enter username (Check for frame
 * before entering the username) Step3: Enter password Step4: Click Login Step5:
 * Search “incident “ Filter Navigator Step6: Click “All” Step7: Click New
 * button Step8: Select a value for Caller and Enter value for short_description
 * Step9: Read the incident number and save it a variable Step10: Click on
 * Submit button Step 11: Search the same incident number in the next search
 * screen as below Step12: Verify the incident is created successful and take
 * snapshot of the created incident.
 */
