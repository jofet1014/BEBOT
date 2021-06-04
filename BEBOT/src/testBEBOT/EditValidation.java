
package testBEBOT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.xurpas.automation.util.GOTSBEBOTUsers;



public class EditValidation {

	public WebDriver driver = null;

	private static GOTSBEBOTUsers util = null;

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
	}

	@Test
	public void EditSalesAgent() {

		try {

			util = new GOTSBEBOTUsers();
			util.SalesAgent();
			driver = util.getDriver();
			WebDriverWait wait = new WebDriverWait(driver, 60);

			// Call the class object for Screenshot


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

			// Check if EDIT is available
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm btn-block mb-1']"))));
			Boolean Display1 = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm btn-block mb-1']")).isDisplayed();
			

			// ClickEdit
			if (driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm btn-block mb-1']")).isDisplayed()) {
				System.out.println("Edit button is present:			" + Display1);
				driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm btn-block mb-1'][1]")).click();}
				else {
					System.out.println("Edit button is not present/No application is for evaluation:			" + Display1);
					driver.quit();
				}

			// Check if able to retrieve the Edit Application Page
			Boolean Display3 = driver.findElement(By.id("field_firstName")).isDisplayed();
			System.out.println("FirstName field is available/editable:			" + Display3);
			driver.findElement(By.id("field_firstName")).sendKeys("Evaluate");
			
			// Select ID Type
			driver.findElement(By.id("field_validIdType")).click();
			// Click first options
			driver.findElement(By.xpath("//option[@ng-reflect-value='Bureau of Internal Revenue ID']")).click();
			
			// Input ID No.
			driver.findElement(By.id("field_validIdNumber")).sendKeys("1014-MN-2021");
			
			// PMI input
			Boolean PMI = driver.findElement(By.id("field_personalMonthlyIncome")).isDisplayed();
			System.out.println("PMI field is available/editable:			" + PMI);
			driver.findElement(By.id("field_personalMonthlyIncome")).sendKeys("1000");
			
			// Click POFC dropdown
			driver.findElement(By.id("field_pofcType")).click();
			// Click first options
			driver.findElement(By.xpath("//option[@ng-reflect-value='3 MSF Pre-payment for Line Onl']")).click();

			// Click Disposition Status dropdown
			driver.findElement(By.id("field_dispositionStatus")).click();
			// Click RTS status
			driver.findElement(By.xpath("//option[@ng-reflect-value='50']")).click();
			
			// Click EncodingPlatform dropdown
			driver.findElement(By.id("field_encodingPlatform")).click();
			// Click For Verification status
			driver.findElement(By.xpath("//*[@id=\"field_encodingPlatform\"]/option[2]")).click();
		
			
			// Click Save button
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			
			
			//Check Confirmation entries
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("modal-basic-title"))));
			Boolean confirm = driver.findElement(By.id("modal-basic-title")).isDisplayed();
			System.out.println("Confirmation entries is displayed" + confirm);
			//Click Confirm Correct
			driver.findElement(By.id("save-entity")).click();

			//Check if able to update to RTS
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//ngb-highlight[@ng-reflect-result='RTS - CUSTOMER COMPLIANCE']"))));
			Boolean RTS = driver.findElement(By.xpath("//ngb-highlight[@ng-reflect-result='RTS - CUSTOMER COMPLIANCE']")).isDisplayed();
			System.out.println("Successfully Updated the Applicationo Entries to RTS-Customer Compliance Status:"     + RTS);
			

			
			
			
			
			
			
			
			
			
			
			// Check if EDIT is available for Cancelled status
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm btn-block mb-1']"))));
			Boolean Display2 = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm btn-block mb-1']")).isDisplayed();
			System.out.println("Edit button is present:			" + Display2);

			// ClickEdit
			driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm btn-block mb-1'][1]")).click();
			

			
			// Select ID Type
			driver.findElement(By.id("field_validIdType")).click();
			// Click first options
			driver.findElement(By.xpath("//option[@ng-reflect-value='Bureau of Internal Revenue ID']")).click();
			
			// Input ID No.
			driver.findElement(By.id("field_validIdNumber")).sendKeys("1014-MN-2021");
			
			// PMI input
			driver.findElement(By.id("field_personalMonthlyIncome")).sendKeys("1000");
			
			// Click POFC dropdown
			driver.findElement(By.id("field_pofcType")).click();
			// Click first options
			driver.findElement(By.xpath("//option[@ng-reflect-value='3 MSF Pre-payment for Line Onl']")).click();

			// Click Disposition Status dropdown
			driver.findElement(By.id("field_dispositionStatus")).click();
			// Click Cancelled status
			driver.findElement(By.xpath("//option[@ng-reflect-value='41']")).click();
			
			// Click EncodingPlatform dropdown
			driver.findElement(By.id("field_encodingPlatform")).click();
			// Click For Verification status
			driver.findElement(By.xpath("//*[@id=\"field_encodingPlatform\"]/option[2]")).click();
		
			
			// Click Save button
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			
			
			//Check Confirmation entries
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("modal-basic-title"))));
			Boolean confirm2 = driver.findElement(By.id("modal-basic-title")).isDisplayed();
			System.out.println("Confirmation entries is displayed" + confirm2);
			//Click Confirm Correct
			driver.findElement(By.id("save-entity")).click();

			//Check if able to update to RTS
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//ngb-highlight[@ng-reflect-result='RTS - CUSTOMER COMPLIANCE']"))));
			Boolean CNCL = driver.findElement(By.xpath("//ngb-highlight[@ng-reflect-result='CANCELLED']")).isDisplayed();
			System.out.println("Successfully Updated the Application Entries to CANCELLED Status:"     + CNCL);
			
			
			
			//Click Account to display log out link on the header
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("account-menu"))));
			driver.findElement(By.id("account-menu")).click();
			
			//Click Account to display sign in link on the header
			driver.findElement(By.xpath("//*[@id=\"logout\"]")).click();

		} catch (Exception e) {
		}
	}

	
	@Test(priority = 2)
	public void EditVerifier() {

		try {

			util = new GOTSBEBOTUsers();
			util.CappVerifier();
			driver = util.getDriver();
			WebDriverWait wait = new WebDriverWait(driver, 60);

			// Call the class object for Screenshot


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

			// Check if EDIT is available
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm btn-block mb-1']"))));
			Boolean Display1 = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm btn-block mb-1']")).isDisplayed();
			

			// ClickEdit
			if (driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm btn-block mb-1']")).isDisplayed()) {
				System.out.println("Edit button is present:			" + Display1);
				driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm btn-block mb-1'][1]")).click();}
				else {
					System.out.println("Edit button is not present/No application is for Verification:			" + Display1);
					driver.quit();
				}

			// Check if able to retrieve the Edit Application Page
			Boolean Display3 = driver.findElement(By.id("field_firstName")).isDisplayed();
			System.out.println("FirstName field is available/editable:			" + Display3);
			driver.findElement(By.id("field_firstName")).sendKeys("Verify");
			
			// Select ID Type
			driver.findElement(By.id("field_validIdType")).click();
			// Click first options
			driver.findElement(By.xpath("//option[@ng-reflect-value='Bureau of Internal Revenue ID']")).click();
			
			// Input ID No.
			driver.findElement(By.id("field_validIdNumber")).sendKeys("1014-MN-2021");
			
			// PMI input
			Boolean PMI = driver.findElement(By.id("field_personalMonthlyIncome")).isDisplayed();
			System.out.println("PMI field is available/editable:			" + PMI);
			driver.findElement(By.id("field_personalMonthlyIncome")).sendKeys("1000");
			
			// Click POFC dropdown
			driver.findElement(By.id("field_pofcType")).click();
			// Click first options
			driver.findElement(By.xpath("//option[@ng-reflect-value='3 MSF Pre-payment for Line Onl']")).click();

			// Click Disposition Status dropdown
			driver.findElement(By.id("field_dispositionStatus")).click();
			// Click RTS status
			driver.findElement(By.xpath("//option[@ng-reflect-value='50']")).click();
			
			// Click EncodingPlatform dropdown
			driver.findElement(By.id("field_encodingPlatform")).click();
			// Click For Verification status
			driver.findElement(By.xpath("//*[@id=\"field_encodingPlatform\"]/option[2]")).click();
		
			
			// Click Save button
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			
			
			//Check Confirmation entries
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("modal-basic-title"))));
			Boolean confirm = driver.findElement(By.id("modal-basic-title")).isDisplayed();
			System.out.println("Confirmation entries is displayed" + confirm);
			//Click Confirm Correct
			driver.findElement(By.id("save-entity")).click();

			//Check if able to update to RTS
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//ngb-highlight[@ng-reflect-result='RTS - CUSTOMER COMPLIANCE']"))));
			Boolean RTS = driver.findElement(By.xpath("//ngb-highlight[@ng-reflect-result='RTS - CUSTOMER COMPLIANCE']")).isDisplayed();
			System.out.println("Successfully Updated the Applicationo Entries to RTS-Customer Compliance Status:"     + RTS);
			

			
			
			
			
			
			
			
			
			
			
			// Check if EDIT is available for Cancelled status
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm btn-block mb-1']"))));
			Boolean Display2 = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm btn-block mb-1']")).isDisplayed();
			System.out.println("Edit button is present:			" + Display2);

			// ClickEdit
			driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm btn-block mb-1'][1]")).click();
			
			
			// Select ID Type
			driver.findElement(By.id("field_validIdType")).click();
			// Click first options
			driver.findElement(By.xpath("//option[@ng-reflect-value='Bureau of Internal Revenue ID']")).click();
			
			// Input ID No.
			driver.findElement(By.id("field_validIdNumber")).sendKeys("1014-MN-2021");
			
			// PMI input
			driver.findElement(By.id("field_personalMonthlyIncome")).sendKeys("1000");
			
			// Click POFC dropdown
			driver.findElement(By.id("field_pofcType")).click();
			// Click first options
			driver.findElement(By.xpath("//option[@ng-reflect-value='3 MSF Pre-payment for Line Onl']")).click();

			// Click Disposition Status dropdown
			driver.findElement(By.id("field_dispositionStatus")).click();
			// Click Cancelled status
			driver.findElement(By.xpath("//option[@ng-reflect-value='41']")).click();
			
			// Click EncodingPlatform dropdown
			driver.findElement(By.id("field_encodingPlatform")).click();
			// Click For Verification status
			driver.findElement(By.xpath("//*[@id=\"field_encodingPlatform\"]/option[2]")).click();
		
			
			// Click Save button
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			
			
			//Check Confirmation entries
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("modal-basic-title"))));
			Boolean confirm2 = driver.findElement(By.id("modal-basic-title")).isDisplayed();
			System.out.println("Confirmation entries is displayed" + confirm2);
			//Click Confirm Correct
			driver.findElement(By.id("save-entity")).click();

			//Check if able to update to RTS
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//ngb-highlight[@ng-reflect-result='RTS - CUSTOMER COMPLIANCE']"))));
			Boolean CNCL = driver.findElement(By.xpath("//ngb-highlight[@ng-reflect-result='CANCELLED']")).isDisplayed();
			System.out.println("Successfully Updated the Application Entries to CANCELLED Status:"     + CNCL);
			
			
			
			//Click Account to display log out link on the header
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("account-menu"))));
			driver.findElement(By.id("account-menu")).click();
			
			//Click Account to display sign in link on the header
			driver.findElement(By.xpath("//*[@id=\"logout\"]")).click();

		} catch (Exception e) {
		}
	}

	@Test(priority = 3)
	public void EditApprover() {
		try {

			util = new GOTSBEBOTUsers();
			util.Approver();
			driver = util.getDriver();
			WebDriverWait wait = new WebDriverWait(driver, 60);

			// Call the class object for Screenshot


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

			// Check if EDIT is available
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm btn-block mb-1']"))));
			Boolean Display1 = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm btn-block mb-1']")).isDisplayed();
			

			// ClickEdit
			if (driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm btn-block mb-1']")).isDisplayed()) {
				System.out.println("Edit button is present:			" + Display1);
				driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm btn-block mb-1'][1]")).click();}
				else {
					System.out.println("Edit button is not present/No application is for Approval:			" + Display1);
					driver.quit();
				}

			// Check if able to retrieve the Edit Application Page
			Boolean Display3 = driver.findElement(By.id("field_firstName")).isDisplayed();
			System.out.println("FirstName field is available/editable:			" + Display3);
			driver.findElement(By.id("field_firstName")).sendKeys("Approve");
			
			// Select ID Type
			driver.findElement(By.id("field_validIdType")).click();
			// Click first options
			driver.findElement(By.xpath("//option[@ng-reflect-value='Bureau of Internal Revenue ID']")).click();
			
			// Input ID No.
			driver.findElement(By.id("field_validIdNumber")).sendKeys("1014-MN-2021");
			
			// PMI input
			Boolean PMI = driver.findElement(By.id("field_personalMonthlyIncome")).isDisplayed();
			System.out.println("PMI field is available/editable:			" + PMI);
			driver.findElement(By.id("field_personalMonthlyIncome")).sendKeys("1000");
			
			// Click POFC dropdown
			driver.findElement(By.id("field_pofcType")).click();
			// Click first options
			driver.findElement(By.xpath("//option[@ng-reflect-value='3 MSF Pre-payment for Line Onl']")).click();

			// Click Disposition Status dropdown
			driver.findElement(By.id("field_dispositionStatus")).click();
			// Click RTS status
			driver.findElement(By.xpath("//option[@ng-reflect-value='50']")).click();
			
			// Click EncodingPlatform dropdown
			driver.findElement(By.id("field_encodingPlatform")).click();
			// Click For Verification status
			driver.findElement(By.xpath("//*[@id=\"field_encodingPlatform\"]/option[2]")).click();
		
			
			// Click Save button
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			
			
			//Check Confirmation entries
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("modal-basic-title"))));
			Boolean confirm = driver.findElement(By.id("modal-basic-title")).isDisplayed();
			System.out.println("Confirmation entries is displayed" + confirm);
			//Click Confirm Correct
			driver.findElement(By.id("save-entity")).click();

			//Check if able to update to RTS
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//ngb-highlight[@ng-reflect-result='RTS - CUSTOMER COMPLIANCE']"))));
			Boolean RTS = driver.findElement(By.xpath("//ngb-highlight[@ng-reflect-result='RTS - CUSTOMER COMPLIANCE']")).isDisplayed();
			System.out.println("Successfully Updated the Applicationo Entries to RTS-Customer Compliance Status:"     + RTS);
			

			
			
			
			
			
			
			
			
			
			
			// Check if EDIT is available for Cancelled status
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm btn-block mb-1']"))));
			Boolean Display2 = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm btn-block mb-1']")).isDisplayed();
			System.out.println("Edit button is present:			" + Display2);

			// ClickEdit
			driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm btn-block mb-1'][1]")).click();
			
			
			// Select ID Type
			driver.findElement(By.id("field_validIdType")).click();
			// Click first options
			driver.findElement(By.xpath("//option[@ng-reflect-value='Bureau of Internal Revenue ID']")).click();
			
			// Input ID No.
			driver.findElement(By.id("field_validIdNumber")).sendKeys("1014-MN-2021");
			
			// PMI input
			driver.findElement(By.id("field_personalMonthlyIncome")).sendKeys("1000");
			
			// Click POFC dropdown
			driver.findElement(By.id("field_pofcType")).click();
			// Click first options
			driver.findElement(By.xpath("//option[@ng-reflect-value='3 MSF Pre-payment for Line Onl']")).click();

			// Click Disposition Status dropdown
			driver.findElement(By.id("field_dispositionStatus")).click();
			// Click Cancelled status
			driver.findElement(By.xpath("//option[@ng-reflect-value='41']")).click();
			
			// Click EncodingPlatform dropdown
			driver.findElement(By.id("field_encodingPlatform")).click();
			// Click For Verification status
			driver.findElement(By.xpath("//*[@id=\"field_encodingPlatform\"]/option[2]")).click();
		
			
			// Click Save button
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			
			
			//Check Confirmation entries
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("modal-basic-title"))));
			Boolean confirm2 = driver.findElement(By.id("modal-basic-title")).isDisplayed();
			System.out.println("Confirmation entries is displayed" + confirm2);
			//Click Confirm Correct
			driver.findElement(By.id("save-entity")).click();

			//Check if able to update to RTS
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//ngb-highlight[@ng-reflect-result='RTS - CUSTOMER COMPLIANCE']"))));
			Boolean CNCL = driver.findElement(By.xpath("//ngb-highlight[@ng-reflect-result='CANCELLED']")).isDisplayed();
			System.out.println("Successfully Updated the Application Entries to CANCELLED Status:"     + CNCL);
			
			
			
			//Click Account to display log out link on the header
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("account-menu"))));
			driver.findElement(By.id("account-menu")).click();
			
			//Click Account to display sign in link on the header
			driver.findElement(By.xpath("//*[@id=\"logout\"]")).click();

		} catch (Exception e) {
		}
		
	}

	
	@Test(priority = 4)
	public void Encoder() {

		try {

			util = new GOTSBEBOTUsers();
			util.Encoder();
			driver = util.getDriver();
			WebDriverWait wait = new WebDriverWait(driver, 60);

			// Call the class object for Screenshot


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

			// Check if EDIT is available
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm btn-block mb-1']"))));
			Boolean Display1 = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm btn-block mb-1']")).isDisplayed();
			

			// ClickEdit
			if (driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm btn-block mb-1']")).isDisplayed()) {
				System.out.println("Edit button is present:			" + Display1);
				driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm btn-block mb-1'][1]")).click();}
				else {
					System.out.println("Edit button is not present/No application is for Encoding:			" + Display1);
					driver.quit();
				}

			// Check if able to retrieve the Edit Application Page
			Boolean Display3 = driver.findElement(By.id("field_firstName")).isDisplayed();
			System.out.println("FirstName field is available/editable:			" + Display3);
			driver.findElement(By.id("field_firstName")).sendKeys("Encode");
			
			// Select ID Type
			driver.findElement(By.id("field_validIdType")).click();
			// Click first options
			driver.findElement(By.xpath("//option[@ng-reflect-value='Bureau of Internal Revenue ID']")).click();
			
			// Input ID No.
			driver.findElement(By.id("field_validIdNumber")).sendKeys("1014-MN-2021");
			
			// PMI input
			Boolean PMI = driver.findElement(By.id("field_personalMonthlyIncome")).isDisplayed();
			System.out.println("PMI field is available/editable:			" + PMI);
			driver.findElement(By.id("field_personalMonthlyIncome")).sendKeys("1000");
			
			// Click POFC dropdown
			driver.findElement(By.id("field_pofcType")).click();
			// Click first options
			driver.findElement(By.xpath("//option[@ng-reflect-value='3 MSF Pre-payment for Line Onl']")).click();

			// Click Disposition Status dropdown
			driver.findElement(By.id("field_dispositionStatus")).click();
			// Click RTS status
			driver.findElement(By.xpath("//option[@ng-reflect-value='50']")).click();
			
			// Click EncodingPlatform dropdown
			driver.findElement(By.id("field_encodingPlatform")).click();
			// Click For Verification status
			driver.findElement(By.xpath("//*[@id=\"field_encodingPlatform\"]/option[2]")).click();
		
			
			// Click Save button
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			
			
			//Check Confirmation entries
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("modal-basic-title"))));
			Boolean confirm = driver.findElement(By.id("modal-basic-title")).isDisplayed();
			System.out.println("Confirmation entries is displayed" + confirm);
			//Click Confirm Correct
			driver.findElement(By.id("save-entity")).click();

			//Check if able to update to RTS
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//ngb-highlight[@ng-reflect-result='RTS - CUSTOMER COMPLIANCE']"))));
			Boolean RTS = driver.findElement(By.xpath("//ngb-highlight[@ng-reflect-result='RTS - CUSTOMER COMPLIANCE']")).isDisplayed();
			System.out.println("Successfully Updated the Applicationo Entries to RTS-Customer Compliance Status:"     + RTS);
			

			
			
			
			
			
			
			
			
			
			
			// Check if EDIT is available for Cancelled status
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm btn-block mb-1']"))));
			Boolean Display2 = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm btn-block mb-1']")).isDisplayed();
			System.out.println("Edit button is present:			" + Display2);

			// ClickEdit
			driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm btn-block mb-1'][1]")).click();
			
			
			// Select ID Type
			driver.findElement(By.id("field_validIdType")).click();
			// Click first options
			driver.findElement(By.xpath("//option[@ng-reflect-value='Bureau of Internal Revenue ID']")).click();
			
			// Input ID No.
			driver.findElement(By.id("field_validIdNumber")).sendKeys("1014-MN-2021");
			
			// PMI input
			driver.findElement(By.id("field_personalMonthlyIncome")).sendKeys("1000");
			
			// Click POFC dropdown
			driver.findElement(By.id("field_pofcType")).click();
			// Click first options
			driver.findElement(By.xpath("//option[@ng-reflect-value='3 MSF Pre-payment for Line Onl']")).click();

			// Click Disposition Status dropdown
			driver.findElement(By.id("field_dispositionStatus")).click();
			// Click Cancelled status
			driver.findElement(By.xpath("//option[@ng-reflect-value='41']")).click();
			
			// Click EncodingPlatform dropdown
			driver.findElement(By.id("field_encodingPlatform")).click();
			// Click For Verification status
			driver.findElement(By.xpath("//*[@id=\"field_encodingPlatform\"]/option[2]")).click();
		
			
			// Click Save button
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			
			
			//Check Confirmation entries
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("modal-basic-title"))));
			Boolean confirm2 = driver.findElement(By.id("modal-basic-title")).isDisplayed();
			System.out.println("Confirmation entries is displayed" + confirm2);
			//Click Confirm Correct
			driver.findElement(By.id("save-entity")).click();

			//Check if able to update to RTS
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//ngb-highlight[@ng-reflect-result='RTS - CUSTOMER COMPLIANCE']"))));
			Boolean CNCL = driver.findElement(By.xpath("//ngb-highlight[@ng-reflect-result='CANCELLED']")).isDisplayed();
			System.out.println("Successfully Updated the Application Entries to CANCELLED Status:"     + CNCL);
			
			
			
			//Click Account to display log out link on the header
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("account-menu"))));
			driver.findElement(By.id("account-menu")).click();
			
			//Click Account to display sign in link on the header
			driver.findElement(By.xpath("//*[@id=\"logout\"]")).click();

		} catch (Exception e) {
		}
	}

@Test(priority = 5)
	public void EditSuperAdmin() {

	try {

		util = new GOTSBEBOTUsers();
		util.SuperAdmin();
		driver = util.getDriver();
		WebDriverWait wait = new WebDriverWait(driver, 60);

		// Call the class object for Screenshot


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

		// Check if EDIT is available
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm btn-block mb-1']"))));
		Boolean Display1 = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm btn-block mb-1']")).isDisplayed();
		

		// ClickEdit
		if (driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm btn-block mb-1']")).isDisplayed()) {
			System.out.println("Edit button is present:			" + Display1);
			driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm btn-block mb-1'][1]")).click();}
			else {
				System.out.println("Edit button is not present			" + Display1);
				driver.quit();
			}

		// Check if able to retrieve the Edit Application Page
		Boolean Display3 = driver.findElement(By.id("field_firstName")).isDisplayed();
		System.out.println("FirstName field is available/editable:			" + Display3);
		driver.findElement(By.id("field_firstName")).sendKeys("Encode");
		
		// Select ID Type
		driver.findElement(By.id("field_validIdType")).click();
		// Click first options
		driver.findElement(By.xpath("//option[@ng-reflect-value='Bureau of Internal Revenue ID']")).click();
		
		// Input ID No.
		driver.findElement(By.id("field_validIdNumber")).sendKeys("1014-MN-2021");
		
		// PMI input
		Boolean PMI = driver.findElement(By.id("field_personalMonthlyIncome")).isDisplayed();
		System.out.println("PMI field is available/editable:			" + PMI);
		driver.findElement(By.id("field_personalMonthlyIncome")).sendKeys("1000");
		
		// Click POFC dropdown
		driver.findElement(By.id("field_pofcType")).click();
		// Click first options
		driver.findElement(By.xpath("//option[@ng-reflect-value='3 MSF Pre-payment for Line Onl']")).click();

		// Click Disposition Status dropdown
		driver.findElement(By.id("field_dispositionStatus")).click();
		// Click RTS status
		driver.findElement(By.xpath("//option[@ng-reflect-value='50']")).click();
		
		// Click EncodingPlatform dropdown
		driver.findElement(By.id("field_encodingPlatform")).click();
		// Click For Verification status
		driver.findElement(By.xpath("//*[@id=\"field_encodingPlatform\"]/option[2]")).click();
	
		
		// Click Save button
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		
		//Check Confirmation entries
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("modal-basic-title"))));
		Boolean confirm = driver.findElement(By.id("modal-basic-title")).isDisplayed();
		System.out.println("Confirmation entries is displayed" + confirm);
		//Click Confirm Correct
		driver.findElement(By.id("save-entity")).click();

		//Check if able to update to RTS
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//ngb-highlight[@ng-reflect-result='RTS - CUSTOMER COMPLIANCE']"))));
		Boolean RTS = driver.findElement(By.xpath("//ngb-highlight[@ng-reflect-result='RTS - CUSTOMER COMPLIANCE']")).isDisplayed();
		System.out.println("Successfully Updated the Applicationo Entries to RTS-Customer Compliance Status:"     + RTS);
		

		
		
		
		
		
		
		
		
		
		
		// Check if EDIT is available for Cancelled status
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm btn-block mb-1']"))));
		Boolean Display2 = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm btn-block mb-1']")).isDisplayed();
		System.out.println("Edit button is present:			" + Display2);

		// ClickEdit
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-sm btn-block mb-1'][1]")).click();
		
		
		// Select ID Type
		driver.findElement(By.id("field_validIdType")).click();
		// Click first options
		driver.findElement(By.xpath("//option[@ng-reflect-value='Bureau of Internal Revenue ID']")).click();
		
		// Input ID No.
		driver.findElement(By.id("field_validIdNumber")).sendKeys("1014-MN-2021");
		
		// PMI input
		driver.findElement(By.id("field_personalMonthlyIncome")).sendKeys("1000");
		
		// Click POFC dropdown
		driver.findElement(By.id("field_pofcType")).click();
		// Click first options
		driver.findElement(By.xpath("//option[@ng-reflect-value='3 MSF Pre-payment for Line Onl']")).click();

		// Click Disposition Status dropdown
		driver.findElement(By.id("field_dispositionStatus")).click();
		// Click Cancelled status
		driver.findElement(By.xpath("//option[@ng-reflect-value='41']")).click();
		
		// Click EncodingPlatform dropdown
		driver.findElement(By.id("field_encodingPlatform")).click();
		// Click For Verification status
		driver.findElement(By.xpath("//*[@id=\"field_encodingPlatform\"]/option[2]")).click();
	
		
		// Click Save button
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		
		//Check Confirmation entries
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("modal-basic-title"))));
		Boolean confirm2 = driver.findElement(By.id("modal-basic-title")).isDisplayed();
		System.out.println("Confirmation entries is displayed" + confirm2);
		//Click Confirm Correct
		driver.findElement(By.id("save-entity")).click();

		//Check if able to update to RTS
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//ngb-highlight[@ng-reflect-result='RTS - CUSTOMER COMPLIANCE']"))));
		Boolean CNCL = driver.findElement(By.xpath("//ngb-highlight[@ng-reflect-result='CANCELLED']")).isDisplayed();
		System.out.println("Successfully Updated the Application Entries to CANCELLED Status:"     + CNCL);
		
		
		
		//Click Account to display log out link on the header
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("account-menu"))));
		driver.findElement(By.id("account-menu")).click();
		
		//Click Account to display sign in link on the header
		driver.findElement(By.xpath("//*[@id=\"logout\"]")).click();

	} catch (Exception e) {
	}

		
	}
/*
	@Test(priority = 6)
	public void AppEntriesStoreShopSpecialist() {

		try {

			util = new BebotUsers();
			util.StoreShopSpecialist();
			driver = util.getDriver();
			WebDriverWait wait = new WebDriverWait(driver, 60);

			// Call the class object for Screenshot
			TakeScreenshot screenshot;
			screenshot = new TakeScreenshot();

			// Click Entities Tab
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("entity-menu"))));
			WebElement element = driver.findElement(By.id("entity-menu"));
			JavascriptExecutor ex = (JavascriptExecutor) driver;
			ex.executeScript("arguments[0].click()", element);

			// Click Application Entries in drow down
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("dropdown-item"))));
			driver.findElement(By.className("dropdown-item")).click();

			// Check if Application Entries is displayed
			try {
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("page-heading"))));
				String actualUrl = "https://edo-dev-data-engineering.globe.com.ph/sat/bbsp-admin/application-entry/search";
				String expectedUrl = driver.getCurrentUrl();

				if (actualUrl.equalsIgnoreCase(expectedUrl)) {
					System.out.println("Test Passed: Application Entries Search Page is Available");
				} else {
					System.out.println("Test Failed: Application Entries Page is not Available");
				}
				System.out.println(expectedUrl);
			} catch (Exception e) {
				System.out.print(e.getMessage());
			}

			// Check if Search Textfield is available
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(
					By.xpath("/html/body/jhi-main/div[2]/div/jhi-application-entry-search/div/form/div/input"))));
			Boolean Display1 = driver
					.findElement(
							By.xpath("/html/body/jhi-main/div[2]/div/jhi-application-entry-search/div/form/div/input"))
					.isDisplayed();
			System.out.println("Search Textfield is available:				" + Display1);

			// Check if Search button is available
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(
					By.xpath("/html/body/jhi-main/div[2]/div/jhi-application-entry-search/div/form/div/button"))));
			Boolean Display2 = driver
					.findElement(
							By.xpath("/html/body/jhi-main/div[2]/div/jhi-application-entry-search/div/form/div/button"))
					.isDisplayed();
			System.out.println("Search button is available:				" + Display2);

			// Take Screen Shot of Application Entries Page
			Thread.sleep(2000);
			long timeMillis = System.currentTimeMillis();
			long timeSeconds1 = TimeUnit.MILLISECONDS.toSeconds(timeMillis);
			screenshot.takescreenshot(
					"/Users/xurpas/Desktop/DyanEjurango/Globe/AutomationScreenShot/StoreShopSpecialistApplicationEntries_"
							+ timeSeconds1 + ".jpg",
					driver);

			System.out.println(("ScreenShot successfully taken"));

		} catch (Exception e) {
		}
	}
*/
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
