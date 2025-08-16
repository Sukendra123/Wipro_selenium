package AssignmentProblems;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
public class IgnoreProblems {
	WebDriver driver;
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Started working on Before Suite");
		}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Preparing test environment");
	}
	@BeforeClass
	public void beforeClass() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Navigating to the Home Page");
		driver.get("https://demo.nopcommerce.com/");
	}
	
	


@Ignore       //Method 1         
@Test(priority=1)
public void RegisterPage() throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       // Click register link
       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/register?returnUrl=%2F']"))).click();
       driver.findElement(By.xpath("//input[@value='F']")).click();
       // Fill registration form
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("FirstName"))).sendKeys("Harini");
       driver.findElement(By.id("LastName")).sendKeys("Pandian");
       driver.findElement(By.id("Email")).sendKeys("harini@gmail.com"); // unique email
       driver.findElement(By.id("Password")).sendKeys("Test@123");
       driver.findElement(By.id("ConfirmPassword")).sendKeys("Test@123");
       // Click Register button
       driver.findElement(By.xpath("//button[@type='submit']")).click();
      
    // Wait until alert is present
       WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
       Alert alert = wait1.until(ExpectedConditions.alertIsPresent());
       // Get the alert text
       String alertMessage = alert.getText();
       System.out.println("Alert says: " + alertMessage);
       // Accept or dismiss
       alert.accept(); // or alert.dismiss()
       String ExpectedTitle = "nopCommerce demo store. Register";
       String ActualTitle=driver.getTitle();
       Assert.assertEquals(ActualTitle,ExpectedTitle,"Title is mismatched");
       Thread.sleep(3000);
   }
	
@Test(priority=2,enabled=false)    //Method 2
public void LoginPage() throws InterruptedException {
	driver.get("https://demo.nopcommerce.com/");
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/login?returnUrl=%2F']"))).click();
	wait.until(ExpectedConditions.urlContains("/login?returnUrl=%2F"));
	// Wait for email field
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Email"))).sendKeys("hari@gmail.com");
	driver.findElement(By.id("Email")).sendKeys("harini@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("123456");
	driver.findElement(By.xpath("//button[@type='submit']"));
		
		
	String Expectedtitle="nopCommerce demo store. Login";
	String Actualtitle=driver.getTitle();
	Assert.assertEquals(Actualtitle,Expectedtitle,"Title is Mismatched");
		
	Thread.sleep(3000);
}
	
@Test(priority=3)
	public void searchProducts() throws InterruptedException {
		driver.get("https://demo.nopcommerce.com/");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("small-searchterms"))).sendKeys("Apple iCam");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String ExpectedTitle="nopCommerce demo store. Search";
		String ActualTitle=driver.getTitle();
		Assert.assertEquals(ActualTitle,ExpectedTitle,"Title is mismatched");
		Thread.sleep(3000);
		
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("Returning to Homepage");
		driver.get("https://demo.nopcommerce.com/");
	}
	@AfterClass
	public void afterClass() {
		if(driver!=null) {
			driver.quit();
		}
	}
	@AfterTest
	public void afterTest() {
		System.out.println("Closing the Test Environment");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("Closing After Suite");
	}
}







