package week4.day1.assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundFrameScreenshots {

	public static void main(String[] args) throws IOException {
 WebDriverManager.chromedriver().setup();
 ChromeDriver driver = new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("http://leafground.com/pages/frame.html");
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 
 WebElement frame1 = driver.findElement(By.xpath("//div[@id='wrapframe']/iframe"));
 driver.switchTo().frame(frame1);
 WebElement findElement = driver.findElement(By.xpath("//button[text()='Click Me']"));
 File src = findElement.getScreenshotAs(OutputType.FILE);
 File des = new File("./snap/ElementPic.png");
 FileUtils.copyFile(src, des);
 driver.switchTo().defaultContent();
 List<WebElement> frameCount = driver.findElements(By.tagName("iframe"));
System.out.println("Size of the list: "+ frameCount.size());

 
	}

}

//http://leafground.com/pages/frame.html
//1.Take the the screenshot of the click me button of first frame
//2.Find the number of frames
//  - find the Elements by tagname - iframe
//  - Store it in a list
//  - Get the size of the list. (This gives the count of the frames visible to the main page)