
package testBEBOT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.xurpas.automation.util.GOTSBEBOTUsers;



public class ApplicationEntries {

	public WebDriver driver = null;

	private static GOTSBEBOTUsers util = null;

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
	}

	@Test
	public void AppEntriesSuperAdmin() {

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
				String actualUrl = "https://edo-dev-data-engineering.globe.com.ph/sat/bbsp-admin/application-entry";
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

			// Check if ID is available
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(
					By.xpath("/html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[1]"))));
			Boolean Display1 = driver
					.findElement(By.xpath(
							"/html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[1]"))
					.isDisplayed();
			System.out.println("ID column is available:					" + Display1);

			// Check if Store ID is available
			Boolean Display2 = driver
					.findElement(By.xpath(
							"/html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[2]"))
					.isDisplayed();
			System.out.println("Store ID column is available:			" + Display2);

			// Check if Store Name is available
			Boolean Display3 = driver
					.findElement(By.xpath(
							"/html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[3]"))
					.isDisplayed();
			System.out.println("Store Name column is available:			" + Display3);

			// Check if Date Submitted is available
			Boolean Display4 = driver
					.findElement(By.xpath(
							"//html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[4]"))
					.isDisplayed();
			System.out.println("Date Submitted column is available:		" + Display4);

			// Check if Reference Number is available
			Boolean Display5 = driver
					.findElement(By.xpath(
							"//html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[5]"))
					.isDisplayed();
			System.out.println("Reference Number column is available:	" + Display5);

			// Check if Last Name is available
			Boolean Display6 = driver
					.findElement(By.xpath(
							"/html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[6]"))
					.isDisplayed();
			System.out.println("Last Name column is available:			" + Display6);

			// Check if First Name is available
			Boolean Display7 = driver
					.findElement(By.xpath(
							"/html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[7]"))
					.isDisplayed();
			System.out.println("First Name column is available:			" + Display7);

			// Check if Plan Availed is available
			Boolean Display8 = driver
					.findElement(By.xpath(
							"/html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[8]"))
					.isDisplayed();
			System.out.println("Plan Availed column is available:		" + Display8);

			// Check if Technology is available
			Boolean Display9 = driver
					.findElement(By.xpath(
							"/html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[9]"))
					.isDisplayed();
			System.out.println("Technology column is available:			" + Display9);

			// Check if Remarks is available
			Boolean Display10 = driver
					.findElement(By.xpath(
							"/html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[10]"))
					.isDisplayed();
			System.out.println("Remarks column is available:			" + Display10);

			// Check if Disposition Status is available
			Boolean Display11 = driver
					.findElement(By.xpath(
							"/html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[11]"))
					.isDisplayed();
			System.out.println("Disposition Status column is available:	" + Display11);

			// Check if Actions is available
			Boolean Display12 = driver
					.findElement(By.xpath(
							"/html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[12]"))
					.isDisplayed();
			System.out.println("Actions column is available:			" + Display12);

			

		} catch (Exception e) {
		}
	}

	/*
	@Test(priority = 2)
	public void AppEntriesStoreAdmin() {

		try {

			util = new BebotUsers();
			util.StoreAdmin();
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
				String actualUrl = "https://edo-dev-data-engineering.globe.com.ph/sat/bbsp-admin/application-entry";
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

			// Check if ID is available
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(
					By.xpath("/html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[1]"))));
			Boolean Display1 = driver
					.findElement(By.xpath(
							"/html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[1]"))
					.isDisplayed();
			System.out.println("ID column is available:				" + Display1);

			// Check if Store ID is available
			Boolean Display2 = driver
					.findElement(By.xpath(
							"/html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[2]"))
					.isDisplayed();
			System.out.println("Store ID column is available:			" + Display2);

			// Check if Store Name is available
			Boolean Display3 = driver
					.findElement(By.xpath(
							"/html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[3]"))
					.isDisplayed();
			System.out.println("Store Name column is available:			" + Display3);

			// Check if Date Submitted is available
			Boolean Display4 = driver
					.findElement(By.xpath(
							"//html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[4]"))
					.isDisplayed();
			System.out.println("Date Submitted column is available:		" + Display4);

			// Check if Reference Number is available
			Boolean Display5 = driver
					.findElement(By.xpath(
							"//html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[5]"))
					.isDisplayed();
			System.out.println("Reference Number column is available:		" + Display5);

			// Check if Last Name is available
			Boolean Display6 = driver
					.findElement(By.xpath(
							"/html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[6]"))
					.isDisplayed();
			System.out.println("Last Name column is available:			" + Display6);

			// Check if First Name is available
			Boolean Display7 = driver
					.findElement(By.xpath(
							"/html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[7]"))
					.isDisplayed();
			System.out.println("First Name column is available:			" + Display7);

			// Check if Plan Availed is available
			Boolean Display8 = driver
					.findElement(By.xpath(
							"/html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[8]"))
					.isDisplayed();
			System.out.println("Plan Availed column is available:		" + Display8);

			// Check if Technology is available
			Boolean Display9 = driver
					.findElement(By.xpath(
							"/html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[9]"))
					.isDisplayed();
			System.out.println("Technology column is available:			" + Display9);

			// Check if Remarks is available
			Boolean Display10 = driver
					.findElement(By.xpath(
							"/html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[10]"))
					.isDisplayed();
			System.out.println("Remarks column is available:			" + Display10);

			// Check if Disposition Status is available
			Boolean Display11 = driver
					.findElement(By.xpath(
							"/html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[11]"))
					.isDisplayed();
			System.out.println("Disposition Status column is available:		" + Display11);

			// Check if Actions is available
			Boolean Display12 = driver
					.findElement(By.xpath(
							"/html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[12]"))
					.isDisplayed();
			System.out.println("Actions column is available:			" + Display12);

			// Take Screen Shot of Application Entries Page
			Thread.sleep(2000);
			long timeMillis = System.currentTimeMillis();
			long timeSeconds1 = TimeUnit.MILLISECONDS.toSeconds(timeMillis);
			screenshot.takescreenshot(
					"/Users/xurpas/Desktop/DyanEjurango/Globe/AutomationScreenShot/StoreAdminApplicationEntries_"
							+ timeSeconds1 + ".jpg",
					driver);

			System.out.println(("ScreenShot successfully taken"));

		} catch (Exception e) {
		}
	}

	@Test(priority = 3)
	public void AppEntriesStoreRM() {

		try {

			util = new BebotUsers();
			util.StoreRM();
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
				String actualUrl = "https://edo-dev-data-engineering.globe.com.ph/sat/bbsp-admin/application-entry";
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

			// Check if ID is available
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(
					By.xpath("/html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[1]"))));
			Boolean Display1 = driver
					.findElement(By.xpath(
							"/html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[1]"))
					.isDisplayed();
			System.out.println("ID column is available:				" + Display1);

			// Check if Store ID is available
			Boolean Display2 = driver
					.findElement(By.xpath(
							"/html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[2]"))
					.isDisplayed();
			System.out.println("Store ID column is available:			" + Display2);

			// Check if Store Name is available
			Boolean Display3 = driver
					.findElement(By.xpath(
							"/html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[3]"))
					.isDisplayed();
			System.out.println("Store Name column is available:			" + Display3);

			// Check if Date Submitted is available
			Boolean Display4 = driver
					.findElement(By.xpath(
							"//html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[4]"))
					.isDisplayed();
			System.out.println("Date Submitted column is available:		" + Display4);

			// Check if Reference Number is available
			Boolean Display5 = driver
					.findElement(By.xpath(
							"//html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[5]"))
					.isDisplayed();
			System.out.println("Reference Number column is available:		" + Display5);

			// Check if Last Name is available
			Boolean Display6 = driver
					.findElement(By.xpath(
							"/html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[6]"))
					.isDisplayed();
			System.out.println("Last Name column is available:			" + Display6);

			// Check if First Name is available
			Boolean Display7 = driver
					.findElement(By.xpath(
							"/html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[7]"))
					.isDisplayed();
			System.out.println("First Name column is available:			" + Display7);

			// Check if Plan Availed is available
			Boolean Display8 = driver
					.findElement(By.xpath(
							"/html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[8]"))
					.isDisplayed();
			System.out.println("Plan Availed column is available:		" + Display8);

			// Check if Technology is available
			Boolean Display9 = driver
					.findElement(By.xpath(
							"/html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[9]"))
					.isDisplayed();
			System.out.println("Technology column is available:			" + Display9);

			// Check if Remarks is available
			Boolean Display10 = driver
					.findElement(By.xpath(
							"/html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[10]"))
					.isDisplayed();
			System.out.println("Remarks column is available:			" + Display10);

			// Check if Disposition Status is available
			Boolean Display11 = driver
					.findElement(By.xpath(
							"/html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[11]"))
					.isDisplayed();
			System.out.println("Disposition Status column is available:		" + Display11);

			// Check if Actions is available
			Boolean Display12 = driver
					.findElement(By.xpath(
							"/html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[12]"))
					.isDisplayed();
			System.out.println("Actions column is available:			" + Display12);

			// Take Screen Shot of Application Entries Page
			Thread.sleep(2000);
			long timeMillis = System.currentTimeMillis();
			long timeSeconds1 = TimeUnit.MILLISECONDS.toSeconds(timeMillis);
			screenshot.takescreenshot(
					"/Users/xurpas/Desktop/DyanEjurango/Globe/AutomationScreenShot/StoreRMApplicationEntries_"
							+ timeSeconds1 + ".jpg",
					driver);

			System.out.println(("ScreenShot successfully taken"));

		} catch (Exception e) {
		}
	}

	@Test(priority = 4)
	public void AppEntriesStoreARM() {

		try {

			util = new BebotUsers();
			util.StoreARM();
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
				String actualUrl = "https://edo-dev-data-engineering.globe.com.ph/sat/bbsp-admin/application-entry";
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

			// Check if ID is available
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(
					By.xpath("/html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[1]"))));
			Boolean Display1 = driver
					.findElement(By.xpath(
							"/html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[1]"))
					.isDisplayed();
			System.out.println("ID column is available:				" + Display1);

			// Check if Store ID is available
			Boolean Display2 = driver
					.findElement(By.xpath(
							"/html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[2]"))
					.isDisplayed();
			System.out.println("Store ID column is available:			" + Display2);

			// Check if Store Name is available
			Boolean Display3 = driver
					.findElement(By.xpath(
							"/html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[3]"))
					.isDisplayed();
			System.out.println("Store Name column is available:			" + Display3);

			// Check if Date Submitted is available
			Boolean Display4 = driver
					.findElement(By.xpath(
							"//html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[4]"))
					.isDisplayed();
			System.out.println("Date Submitted column is available:		" + Display4);

			// Check if Reference Number is available
			Boolean Display5 = driver
					.findElement(By.xpath(
							"//html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[5]"))
					.isDisplayed();
			System.out.println("Reference Number column is available:		" + Display5);

			// Check if Last Name is available
			Boolean Display6 = driver
					.findElement(By.xpath(
							"/html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[6]"))
					.isDisplayed();
			System.out.println("Last Name column is available:			" + Display6);

			// Check if First Name is available
			Boolean Display7 = driver
					.findElement(By.xpath(
							"/html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[7]"))
					.isDisplayed();
			System.out.println("First Name column is available:			" + Display7);

			// Check if Plan Availed is available
			Boolean Display8 = driver
					.findElement(By.xpath(
							"/html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[8]"))
					.isDisplayed();
			System.out.println("Plan Availed column is available:		" + Display8);

			// Check if Technology is available
			Boolean Display9 = driver
					.findElement(By.xpath(
							"/html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[9]"))
					.isDisplayed();
			System.out.println("Technology column is available:			" + Display9);

			// Check if Remarks is available
			Boolean Display10 = driver
					.findElement(By.xpath(
							"/html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[10]"))
					.isDisplayed();
			System.out.println("Remarks column is available:			" + Display10);

			// Check if Disposition Status is available
			Boolean Display11 = driver
					.findElement(By.xpath(
							"/html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[11]"))
					.isDisplayed();
			System.out.println("Disposition Status column is available:		" + Display11);

			// Check if Actions is available
			Boolean Display12 = driver
					.findElement(By.xpath(
							"/html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[12]"))
					.isDisplayed();
			System.out.println("Actions column is available:			" + Display12);

			// Take Screen Shot of Application Entries Page
			Thread.sleep(2000);
			long timeMillis = System.currentTimeMillis();
			long timeSeconds1 = TimeUnit.MILLISECONDS.toSeconds(timeMillis);
			screenshot.takescreenshot(
					"/Users/xurpas/Desktop/DyanEjurango/Globe/AutomationScreenShot/StoreARMApplicationEntries_"
							+ timeSeconds1 + ".jpg",
					driver);

			System.out.println(("ScreenShot successfully taken"));

		} catch (Exception e) {
		}
	}

	@Test(priority = 5)
	public void AppEntriesStoreCAPPVerifier() {

		try {

			util = new BebotUsers();
			util.StoreCAPPVerifier();
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
				String actualUrl = "https://edo-dev-data-engineering.globe.com.ph/sat/bbsp-admin/application-entry";
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

			// Check if ID is available
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(
					By.xpath("/html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[1]"))));
			Boolean Display1 = driver
					.findElement(By.xpath(
							"/html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[1]"))
					.isDisplayed();
			System.out.println("ID column is available:				" + Display1);

			// Check if Store ID is available
			Boolean Display2 = driver
					.findElement(By.xpath(
							"/html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[2]"))
					.isDisplayed();
			System.out.println("Store ID column is available:			" + Display2);

			// Check if Store Name is available
			Boolean Display3 = driver
					.findElement(By.xpath(
							"/html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[3]"))
					.isDisplayed();
			System.out.println("Store Name column is available:			" + Display3);

			// Check if Date Submitted is available
			Boolean Display4 = driver
					.findElement(By.xpath(
							"//html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[4]"))
					.isDisplayed();
			System.out.println("Date Submitted column is available:		" + Display4);

			// Check if Reference Number is available
			Boolean Display5 = driver
					.findElement(By.xpath(
							"//html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[5]"))
					.isDisplayed();
			System.out.println("Reference Number column is available:		" + Display5);

			// Check if Last Name is available
			Boolean Display6 = driver
					.findElement(By.xpath(
							"/html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[6]"))
					.isDisplayed();
			System.out.println("Last Name column is available:			" + Display6);

			// Check if First Name is available
			Boolean Display7 = driver
					.findElement(By.xpath(
							"/html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[7]"))
					.isDisplayed();
			System.out.println("First Name column is available:			" + Display7);

			// Check if Plan Availed is available
			Boolean Display8 = driver
					.findElement(By.xpath(
							"/html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[8]"))
					.isDisplayed();
			System.out.println("Plan Availed column is available:		" + Display8);

			// Check if Technology is available
			Boolean Display9 = driver
					.findElement(By.xpath(
							"/html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[9]"))
					.isDisplayed();
			System.out.println("Technology column is available:			" + Display9);

			// Check if Remarks is available
			Boolean Display10 = driver
					.findElement(By.xpath(
							"/html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[10]"))
					.isDisplayed();
			System.out.println("Remarks column is available:			" + Display10);

			// Check if Disposition Status is available
			Boolean Display11 = driver
					.findElement(By.xpath(
							"/html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[11]"))
					.isDisplayed();
			System.out.println("Disposition Status column is available:		" + Display11);

			// Check if Actions is available
			Boolean Display12 = driver
					.findElement(By.xpath(
							"/html/body/jhi-main/div[2]/div/jhi-application-entry/div/form/table/thead/tr/th[12]"))
					.isDisplayed();
			System.out.println("Actions column is available:			" + Display12);

			// Take Screen Shot of Application Entries Page
			Thread.sleep(2000);
			long timeMillis = System.currentTimeMillis();
			long timeSeconds1 = TimeUnit.MILLISECONDS.toSeconds(timeMillis);
			screenshot.takescreenshot(
					"/Users/xurpas/Desktop/DyanEjurango/Globe/AutomationScreenShot/StoreCAPPVerifierApplicationEntries_"
							+ timeSeconds1 + ".jpg",
					driver);

			System.out.println(("ScreenShot successfully taken"));

		} catch (Exception e) {
		}
	}

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
