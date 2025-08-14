package testDemo1;


import java.time.Duration;
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
import org.testng.annotations.Test;
public class Annotations {
	WebDriver driver;
	@BeforeSuite
	public void beforeSuite() {
	System.out.println("Start of the suite");
		
	}
	@BeforeTest
	public void beforeTEST() {
	System.out.println("Preparing the test environment");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Launching the browser");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Navigating to orangeHRM login page");
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	@Test (priority=1)
	public void verifypage() {
		System.out.println("Page is displayed");
	}
	@Test(priority=2)
	public void LoginTest() throws InterruptedException {
		System.out.println("performing login");
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='username']"))).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']"));
		String Expectedtitle="OrangeHRM";
		String Actualtitle=driver.getTitle();
		Assert.assertEquals(Actualtitle, Expectedtitle,"title is mismatched");
		Assert.assertTrue(true);
		System.out.println(driver.getTitle());
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("Logout");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
	}
	@AfterClass
	public void afterClass() {
		System.out.println("Closing the browser");
		if (driver!=null) {
			driver.quit();
		}
  }
	@AfterTest
	 public void afterTest() {
		   System.out.println("After test method should work");
	}	
	@AfterSuite
	
	 public void afterSuite() {
		 System.out.println("After suite method should work");
	 }
}

