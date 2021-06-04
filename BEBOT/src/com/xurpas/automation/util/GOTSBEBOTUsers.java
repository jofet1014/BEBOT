package com.xurpas.automation.util;


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
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;




@Test
public class GOTSBEBOTUsers {


    public WebDriver driver ; 
	
	

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");

	}
	
    
	@Test(priority = 1)
	public void SalesAgent() {

		driver = new ChromeDriver();
		System.out.println(("Validate if SalesAgent can login using valid Username and Password"));

		try {
			
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver, 60);

			//Access the portal
			driver.get("https://edo-dev-data-engineering.globe.com.ph/bbsp-admin/");
		    
			//Wait for sign in link
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

			
			//Click Account to display sign in link on the header
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("account-menu"))));
			driver.findElement(By.id("account-menu")).click();
			
			//Click Account to display sign in link on the header
			driver.findElement(By.id("login")).click();
			
			//Print the value of variable in the console
		    System.out.println("baseUrl");
		    
		    //Input value in email address
		  	driver.findElement(By.id("username")).sendKeys("gots_salesagent");

		  	//Input value in password
		  	driver.findElement(By.id("password")).sendKeys("9N,PqH");
		  		
		  	//Click sign in button
		  	driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/jhi-login-modal/div[2]/div/div[2]/form/button")).click();
		  		
		  	//Print the value of variable in the console
		  	System.out.println("baseUrl" );

			// Entities Menu is displayed
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("entity-menu"))));
			Boolean Display = driver.findElement(By.id("entity-menu")).isDisplayed();
			System.out.println("Successful Sign In as Sales Agent:		" + Display);

		}

		catch (Exception e) {

			System.out.print(e.getMessage());
		}
	}
	
	public void CappVerifier() {

		driver = new ChromeDriver();
		System.out.println(("Validate if CappVerifier can login using valid Username and Password"));

		try {
			
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver, 60);

			//Access the portal
			driver.get("https://edo-dev-data-engineering.globe.com.ph/bbsp-admin/");
		    
			//Wait for sign in link
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

			
			//Click Account to display sign in link on the header
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("account-menu"))));
			driver.findElement(By.id("account-menu")).click();
			
			//Click Account to display sign in link on the header
			driver.findElement(By.id("login")).click();
			
			//Print the value of variable in the console
		    System.out.println("baseUrl");
		    
		    //Input value in email address
		  	driver.findElement(By.id("username")).sendKeys("gots_cappverifier");

		  	//Input value in password
		  	driver.findElement(By.id("password")).sendKeys("9N,PqH");
		  		
		  	//Click sign in button
		  	driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/jhi-login-modal/div[2]/div/div[2]/form/button")).click();
		  		
		  	//Print the value of variable in the console
		  	System.out.println("baseUrl" );

			// Entities Menu is displayed
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("entity-menu"))));
			Boolean Display = driver.findElement(By.id("entity-menu")).isDisplayed();
			System.out.println("Successful Sign In as Verifier:		" + Display);

		}

		catch (Exception e) {

			System.out.print(e.getMessage());
		}
	}
	
	public void Approver() {

		driver = new ChromeDriver();
		System.out.println(("Validate if Approver can login using valid Username and Password"));

		try {
			
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver, 60);

			//Access the portal
			driver.get("https://edo-dev-data-engineering.globe.com.ph/bbsp-admin/");
		    
			//Wait for sign in link
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

			
			//Click Account to display sign in link on the header
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("account-menu"))));
			driver.findElement(By.id("account-menu")).click();
			
			//Click Account to display sign in link on the header
			driver.findElement(By.id("login")).click();
			
			//Print the value of variable in the console
		    System.out.println("baseUrl");
		    
		    //Input value in email address
		  	driver.findElement(By.id("username")).sendKeys("gots_approver");

		  	//Input value in password
		  	driver.findElement(By.id("password")).sendKeys("9N,PqH");
		  		
		  	//Click sign in button
		  	driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/jhi-login-modal/div[2]/div/div[2]/form/button")).click();
		  		
		  	//Print the value of variable in the console
		  	System.out.println("baseUrl" );

			// Entities Menu is displayed
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("entity-menu"))));
			Boolean Display = driver.findElement(By.id("entity-menu")).isDisplayed();
			System.out.println("Successful Sign In as Approver:		" + Display);

		}

		catch (Exception e) {

			System.out.print(e.getMessage());
		}
	}
	public void Encoder() {

		driver = new ChromeDriver();
		System.out.println(("Validate if Encoder can login using valid Username and Password"));

		try {
			
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver, 60);

			//Access the portal
			driver.get("https://edo-dev-data-engineering.globe.com.ph/bbsp-admin/");
		    
			//Wait for sign in link
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

			
			//Click Account to display sign in link on the header
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("account-menu"))));
			driver.findElement(By.id("account-menu")).click();
			
			//Click Account to display sign in link on the header
			driver.findElement(By.id("login")).click();
			
			//Print the value of variable in the console
		    System.out.println("baseUrl");
		    
		    //Input value in email address
		  	driver.findElement(By.id("username")).sendKeys("gots_encoder");

		  	//Input value in password
		  	driver.findElement(By.id("password")).sendKeys("9N,PqH");
		  		
		  	//Click sign in button
		  	driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/jhi-login-modal/div[2]/div/div[2]/form/button")).click();
		  		
		  	//Print the value of variable in the console
		  	System.out.println("baseUrl" );

			// Entities Menu is displayed
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("entity-menu"))));
			Boolean Display = driver.findElement(By.id("entity-menu")).isDisplayed();
			System.out.println("Successful Sign In as Encoder:		" + Display);

		}

		catch (Exception e) {

			System.out.print(e.getMessage());
		}
	}
	public void SuperAdmin() {

		driver = new ChromeDriver();
		System.out.println(("Validate if SuperAdmin can login using valid Username and Password"));

		try {
			
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver, 60);

			//Access the portal
			driver.get("https://edo-dev-data-engineering.globe.com.ph/bbsp-admin/");
		    
			//Wait for sign in link
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

			
			//Click Account to display sign in link on the header
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("account-menu"))));
			driver.findElement(By.id("account-menu")).click();
			
			//Click Account to display sign in link on the header
			driver.findElement(By.id("login")).click();
			
			//Print the value of variable in the console
		    System.out.println("baseUrl");
		    
		    //Input value in email address
		  	driver.findElement(By.id("username")).sendKeys("gots_superadmin");

		  	//Input value in password
		  	driver.findElement(By.id("password")).sendKeys("9N,PqH");
		  		
		  	//Click sign in button
		  	driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/jhi-login-modal/div[2]/div/div[2]/form/button")).click();
		  		
		  	//Print the value of variable in the console
		  	System.out.println("baseUrl" );

			// Entities Menu is displayed
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("entity-menu"))));
			Boolean Display = driver.findElement(By.id("entity-menu")).isDisplayed();
			System.out.println("Successful Sign In as SuperAdmin:		" + Display);

		}

		catch (Exception e) {

			System.out.print(e.getMessage());
		}
	}
	public void GCashChecker() {

		driver = new ChromeDriver();
		System.out.println(("Validate if Gcash checker can login using valid Username and Password"));

		try {
			
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver, 60);

			//Access the portal
			driver.get("https://edo-dev-data-engineering.globe.com.ph/bbsp-admin/");
		    
			//Wait for sign in link
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

			
			//Click Account to display sign in link on the header
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("account-menu"))));
			driver.findElement(By.id("account-menu")).click();
			
			//Click Account to display sign in link on the header
			driver.findElement(By.id("login")).click();
			
			//Print the value of variable in the console
		    System.out.println("baseUrl");
		    
		    //Input value in email address
		  	driver.findElement(By.id("username")).sendKeys("gots_gcash_checker");

		  	//Input value in password
		  	driver.findElement(By.id("password")).sendKeys("9N,PqH");
		  		
		  	//Click sign in button
		  	driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/jhi-login-modal/div[2]/div/div[2]/form/button")).click();
		  		
		  	//Print the value of variable in the console
		  	System.out.println("baseUrl" );



		}

		catch (Exception e) {

			System.out.print(e.getMessage());
		}
	}


	public WebDriver getDriver() {

		return driver;

	}
}
