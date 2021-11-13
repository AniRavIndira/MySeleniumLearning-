package week4.day2;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableActivity {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// step 1 : find the table
		WebElement webTable = driver.findElement(By.id("table_id"));
		//step 2: Get all the rows
		List<WebElement> tableRows = webTable.findElements(By.tagName("tr"));
		//Step 3: Get all the columns( Columns can be reached thr rows)
		//tableRows.findElement(By.id("th"));-- throws error because we are trying to get columns of all the rows

		WebElement firstRow = tableRows.get(0);// we are getting the columns of first row
		List<WebElement> ColOfFirstRow = firstRow.findElements(By.tagName("th"));
		//get the number of rows in the table
		System.out.println("No. Of Rows in the Table: " + tableRows.size());

		//get the number of column		
		System.out.println("No. Of Columns in the Table: " + ColOfFirstRow.size());
		// print all the contents of the table -- Can be done ONLY Through FOREACH loop
		//just looping through each row can give all the columns
		for (WebElement eachRowElement : tableRows) {
			//System.out.println(eachRowElement);// will give only WebElemnt in output
			System.out.println("Print all the content in the table: " + eachRowElement.getText());
		}
		//print the contents of column 2 alone
		for (int i = 1; i < tableRows.size(); i++) {// column 2 has data from all the rows except first row
			WebElement row = tableRows.get(i);
			List<WebElement> colOfEachRow = row.findElements(By.tagName("td"));
			String text = colOfEachRow.get(1).getText();
			System.out.println("Print the content of Column 2: " + text);
		}

	}

}
// WebTable - ClassRoom
// step 1 : find the table
// step 2: Get all the rows
// get the number of rows in the table
// get the number of columns
// print all the contents of the table
// print the contents of column 2 alone
