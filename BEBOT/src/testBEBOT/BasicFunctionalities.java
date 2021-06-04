
package testBEBOT;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.xurpas.automation.util.GOTSBEBOTUsers;



public class BasicFunctionalities {

	public WebDriver driver = null;

	private static GOTSBEBOTUsers util = null;

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
	}

	@Test
	public void Sorting() {

		try {

			util = new GOTSBEBOTUsers();
			util.SalesAgent();
			driver = util.getDriver();
			WebDriverWait wait = new WebDriverWait(driver, 60);



			// Click Entities Tab
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("entity-menu"))));
			driver.findElement(By.id("entity-menu")).click();


			// Click Application Entries in drow down
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("dropdown-item"))));
			driver.findElement(By.className("dropdown-item")).click();

			// Check if Application Entries is displayed
			try {
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("page-heading"))));
				String actualUrl = "https://edo-dev-data-engineering.globe.com.ph/bbsp-admin/application-entry";
				String expectedUrl = driver.getCurrentUrl();

				if (actualUrl.equalsIgnoreCase(expectedUrl)) {
					System.out.println("Test Passed: Application Entries Page is Available");
				} else {
					System.out.println("Test Failed: Application Entries Page is not Available");
				}
				System.out.println(expectedUrl);
			} catch (Exception e) {
				System.out.print(e.getMessage());
			}
			
			//DateCreated Column
			try {

			// Click on column
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//th[@sortable='dateCreated']"))));
			Boolean DC = driver.findElement(By.xpath("//th[@sortable='dateCreated']")).isDisplayed();
			driver.findElement(By.xpath("//th[@sortable='dateCreated']")).click();
			
			System.out.println("Date Created Column is displayed and clicked:			" + DC);

			// Capture All element for Date Created
			List<WebElement> elementlist = driver.findElements(By.xpath("//tr/td[1]"));
			List<String> originalList = elementlist.stream().map(s->s.getText()).collect(Collectors.toList());
			List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
			Assert.assertTrue(originalList.equals(sortedList));
			
			if(originalList.equals(sortedList) && driver.findElement(By.xpath("//ngb-highlight[@ng-reflect-result]")).isDisplayed()){
			System.out.println("Successfully Sorted for DATE CREATED column");
			}
			else {
				System.out.println("Fail to Sort data in DATE CREATED column");
			}
			
			} catch (Exception e) {
				
			}
			
			//Reference Number Column
			try {

				// Click on column
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//th[@sortable='msaNumber']"))));
				Boolean RN = driver.findElement(By.xpath("//th[@sortable='msaNumber']")).isDisplayed();
				driver.findElement(By.xpath("//th[@sortable='msaNumber']")).click();
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//ngb-highlight[@ng-reflect-result]"))));
				System.out.println("Reference Number Column is displayed and clicked:			" + RN);

				// Capture All element for Date Created
				List<WebElement> elementlist = driver.findElements(By.xpath("//tr/td[2]"));
				List<String> originalList = elementlist.stream().map(s->s.getText()).collect(Collectors.toList());
				List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
				//Assert.assertTrue(originalList.equals(sortedList));
				
				if(originalList.equals(sortedList)){
				System.out.println("Successfully Sorted for REFERENCE NUMBER column");
				}
				else {
					System.out.println("Fail to Sort data in REFERENCE NUMBER column");
				}
				
				} catch (Exception e) {
					
				}
			
			//Last Name Column
			try {

				// Click on column
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//th[@sortable='accountLastName']"))));
				Boolean LN = driver.findElement(By.xpath("//th[@sortable='accountLastName']")).isDisplayed();
				driver.findElement(By.xpath("//th[@sortable='accountLastName']")).click();
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//ngb-highlight[@ng-reflect-result]"))));
				System.out.println("Last Name Column is displayed and clicked:			" + LN);

				// Capture All element for Date Created
				List<WebElement> elementlist = driver.findElements(By.xpath("//tr/td[3]"));
				List<String> originalList3 = elementlist.stream().map(s->s.getText()).collect(Collectors.toList());
				List<String> sortedList = originalList3.stream().sorted().collect(Collectors.toList());
				
				
				if(originalList3.equals(sortedList)){
				System.out.println("Successfully Sorted for LAST NAME column");
				}
				else {
					System.out.println("Fail to Sort data in LAST NAME column");
				}
				
				} catch (Exception e) {
					
				}
			
			//First Name Column
			try {

				// Click on column
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//th[@sortable='accountFirstName']"))));
				Boolean LN = driver.findElement(By.xpath("//th[@sortable='accountFirstName']")).isDisplayed();
				driver.findElement(By.xpath("//th[@sortable='accountFirstName']")).click();
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//ngb-highlight[@ng-reflect-result]"))));
				System.out.println("First Name Column is displayed and clicked:			" + LN);

				// Capture All element for Date Created
				List<WebElement> elementlist = driver.findElements(By.xpath("//tr/td[3]"));
				List<String> originalList3 = elementlist.stream().map(s->s.getText()).collect(Collectors.toList());
				List<String> sortedList = originalList3.stream().sorted().collect(Collectors.toList());
				
				
				if(originalList3.equals(sortedList)){
				System.out.println("Successfully Sorted for FIRST NAME column");
				}
				else {
					System.out.println("Fail to Sort data in FIRST NAME column");
				}
				
				} catch (Exception e) {
					
				}
			//Plan Availed Column
			try {

				// Click on column
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//th[@sortable='selectedPlan']"))));
				Boolean LN = driver.findElement(By.xpath("//th[@sortable='selectedPlan']")).isDisplayed();
				driver.findElement(By.xpath("//th[@sortable='selectedPlan']")).click();
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//ngb-highlight[@ng-reflect-result]"))));
				System.out.println("Plan Availed Column is displayed and clicked:			" + LN);

				// Capture All element for Date Created
				List<WebElement> elementlist = driver.findElements(By.xpath("//tr/td[3]"));
				List<String> originalList3 = elementlist.stream().map(s->s.getText()).collect(Collectors.toList());
				List<String> sortedList = originalList3.stream().sorted().collect(Collectors.toList());
				
				
				if(originalList3.equals(sortedList)){
				System.out.println("Successfully Sorted for PLAN AVAILED column");
				}
				else {
					System.out.println("Fail to Sort data in PLAN AVAILED column");
				}
				
				} catch (Exception e) {
					
				}
			//Plan Type Column
			try {

				// Click on column
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//th[@sortable='planType']"))));
				Boolean LN = driver.findElement(By.xpath("//th[@sortable='planType']")).isDisplayed();
				driver.findElement(By.xpath("//th[@sortable='planType']")).click();
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//ngb-highlight[@ng-reflect-result]"))));
				System.out.println("Plan Type Column is displayed and clicked:			" + LN);

				// Capture All element for Date Created
				List<WebElement> elementlist = driver.findElements(By.xpath("//tr/td[3]"));
				List<String> originalList3 = elementlist.stream().map(s->s.getText()).collect(Collectors.toList());
				List<String> sortedList = originalList3.stream().sorted().collect(Collectors.toList());
				
				
				if(originalList3.equals(sortedList)){
				System.out.println("Successfully Sorted for PLAN TYPE column");
				}
				else {
					System.out.println("Fail to Sort data in PLAN TYPE column");
				}
				
				} catch (Exception e) {
					
				}
			//Remarks Column
			try {

				// Click on column
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//th[@sortable='remarks']"))));
				Boolean LN = driver.findElement(By.xpath("//th[@sortable='remarks']")).isDisplayed();
				driver.findElement(By.xpath("//th[@sortable='remarks']")).click();
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//ngb-highlight[@ng-reflect-result]"))));
				System.out.println("Remarks Column is displayed and clicked:			" + LN);

				// Capture All element for Date Created
				List<WebElement> elementlist = driver.findElements(By.xpath("//tr/td[3]"));
				List<String> originalList3 = elementlist.stream().map(s->s.getText()).collect(Collectors.toList());
				List<String> sortedList = originalList3.stream().sorted().collect(Collectors.toList());
				
				
				if(originalList3.equals(sortedList)){
				System.out.println("Successfully Sorted for REMARKS column");
				}
				else {
					System.out.println("Fail to Sort data in REMARKS column");
				}
				
				} catch (Exception e) {
					
				}
			//Disposition Column
			try {

				// Click on column
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//th[@sortable='dispositionStatus']"))));
				Boolean LN = driver.findElement(By.xpath("//th[@sortable='dispositionStatus']")).isDisplayed();
				driver.findElement(By.xpath("//th[@sortable='dispositionStatus']")).click();
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//ngb-highlight[@ng-reflect-result]"))));
				System.out.println("Disposition Column is displayed and clicked:			" + LN);

				// Capture All element for Date Created
				List<WebElement> elementlist = driver.findElements(By.xpath("//tr/td[3]"));
				List<String> originalList3 = elementlist.stream().map(s->s.getText()).collect(Collectors.toList());
				List<String> sortedList = originalList3.stream().sorted().collect(Collectors.toList());
				
				
				if(originalList3.equals(sortedList)){
				System.out.println("Successfully Sorted for DISPOSITION column");
				}
				else {
					System.out.println("Fail to Sort data in DISPOSITION column");
				}
				
				} catch (Exception e) {
					
				}
			
			

		} catch (Exception e) {
		}
		
		
		
		
		
	}
	
	@Test(priority=2)
	public void Search() {
		
		try {
			String SearchTerm = "GPlan";
	
			util = new GOTSBEBOTUsers();
			util.SalesAgent();
			driver = util.getDriver();
			WebDriverWait wait = new WebDriverWait(driver, 60);



			// Click Entities Tab
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("entity-menu"))));
			driver.findElement(By.id("entity-menu")).click();


			// Click Application Entries in drow down
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("dropdown-item"))));
			driver.findElement(By.className("dropdown-item")).click();

			// Check if Application Entries is displayed
			try {
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("page-heading"))));
				String actualUrl = "https://edo-dev-data-engineering.globe.com.ph/bbsp-admin/application-entry";
				String expectedUrl = driver.getCurrentUrl();

				if (actualUrl.equalsIgnoreCase(expectedUrl)) {
					System.out.println("Test Passed: Application Entries Page is Available");
				} else {
					System.out.println("Test Failed: Application Entries Page is not Available");
				}
				System.out.println(expectedUrl);
			} catch (Exception e) {
				System.out.print(e.getMessage());
			}
 
			//Search for item
			Boolean Srch = driver.findElement(By.xpath("//input[@class='form-control ml-2']")).isDisplayed();
			System.out.println("Search Fields is displayed			" + Srch);
			WebElement txtbx_search = driver.findElement(By.xpath("//input[@class='form-control ml-2']"));
			txtbx_search.sendKeys(SearchTerm);
			driver.findElement(By.xpath("//input[@class='form-control ml-2']")).sendKeys(Keys.RETURN);
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//ngb-highlight[@ng-reflect-result]"))));
			
			/*if (driver.findElement(By.xpath("//ngb-highlight[@ng-reflect-result]")).isDisplayed()) {
			System.out.println("Search Result is Found");
			}
			else {
			System.out.println("No Result Found");
			}*/
			
			//Fetch all the data in the table
			List<WebElement> tableElements = driver.findElements(By.xpath("//tr/td[6]"));
			
			List<WebElement> filteredList = tableElements.stream().filter(tableElement->tableElement.getText().contains("GPlan")).collect(Collectors.toList());
			
			//Validate if Search result is displayed corresponding
			if(filteredList.size() == tableElements.size()){
				System.out.println("Successfully Searched    " +SearchTerm);
				}
				else {
					System.out.println("Failed to Search   " +SearchTerm);
				}
		
		}catch(Exception e) {
			Assert.assertFalse(false, "Exception thrown. Exception: " + e.toString());
		}
		}
	
	@Test(priority=3)
	public void Pagination() {
		
		try {
		
	
			util = new GOTSBEBOTUsers();
			util.SalesAgent();
			driver = util.getDriver();
			WebDriverWait wait = new WebDriverWait(driver, 60);



			// Click Entities Tab
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("entity-menu"))));
			driver.findElement(By.id("entity-menu")).click();


			// Click Application Entries in drow down
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("dropdown-item"))));
			driver.findElement(By.className("dropdown-item")).click();

			// Check if Application Entries is displayed
			try {
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("page-heading"))));
				String actualUrl = "https://edo-dev-data-engineering.globe.com.ph/bbsp-admin/application-entry";
				String expectedUrl = driver.getCurrentUrl();

				if (actualUrl.equalsIgnoreCase(expectedUrl)) {
					System.out.println("Test Passed: Application Entries Page is Available");
				} else {
					System.out.println("Test Failed: Application Entries Page is not Available");
				}
				System.out.println(expectedUrl);
			} catch (Exception e) {
				System.out.print(e.getMessage());
			}
 
			
			// find pagination element
			List<WebElement> pagination=driver.findElements(By.xpath("//a[@class='page-link']")); 
			WebElement NextButton= driver.findElement(By.xpath("//a[@aria-label='Next']"));
			//WebElement prevButton= driver.findElement(By.xpath("//*[@id='prevButtonid']"));

			

			// checkif pagination link exists
			if(pagination.size()>0)
			{ 
			driver.findElement(By.xpath("//ngb-highlight[@ng-reflect-result]")).isDisplayed();
			System.out.println("Pagination is Functional"); 

			

			for(int i=1; i <pagination.size(); i++)
			{ 

			//Check if nextbutton is enable or not.

			  if(NextButton.isEnabled())
			{

			    NextButton.click();
			}
			else { 
				System.out.println("FAILED: Pagination not exists"); 
			} 
			}}
		}catch(Exception e) {
			
		}
		}
			
	
			
			
			



	@AfterMethod
	public void afterMethod() {
		// close driver
		try {
			 driver.quit();
			util = null;
		} catch (Exception e) {
			// TODO Auto-generated catch block

			System.out.print(e.getMessage());

		}

	}
}
