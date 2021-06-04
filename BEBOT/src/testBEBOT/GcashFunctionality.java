
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



public class GcashFunctionality {

	public WebDriver driver = null;

	private static GOTSBEBOTUsers util = null;

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
	}

	@Test
	public void Gcash() {

		try {

			util = new GOTSBEBOTUsers();
			util.GCashChecker();
			driver = util.getDriver();
			WebDriverWait wait = new WebDriverWait(driver, 60);

			// Click GCASH Tab
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@routerlink='gcash-verification']"))));
			Boolean Display3 = driver.findElement(By.xpath("//a[@routerlink='gcash-verification']")).isDisplayed();
			System.out.println("Gcash tab is displayed:			" + Display3);
			driver.findElement(By.xpath("//a[@routerlink='gcash-verification']")).click();
			
			// Check if GCASH Verification is displayed
			try {
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("page-heading"))));
				String actualUrl = "https://edo-dev-data-engineering.globe.com.ph/sat/bbsp-admin/gcash-verification";
				String expectedUrl = driver.getCurrentUrl();

				if (actualUrl.equalsIgnoreCase(expectedUrl)) {
					System.out.println("Test Passed: Gcash Verification Page is Available");
				} else {
					System.out.println("Test Failed: Gcash Verification Page is not Available");
				}
				System.out.println(expectedUrl);
			} catch (Exception e) {
				System.out.print(e.getMessage());
			}
			
		} catch (Exception e) {
		}
	}
}