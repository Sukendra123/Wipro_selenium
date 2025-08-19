package assigmentDay27;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.*;
import java.time.Duration;
public class SyncExceptionTest {
	private static final Logger logger = LogManager.getLogger(SyncExceptionTest.class);
	
	WebDriver driver;
	WebDriverWait wait;
	@BeforeClass
	public void Logins() {
		logger.info("starting the login");
		System.out.println("Launching the browser");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://parabank.parasoft.com/");
	}
	@Test
	public void testLogin() {
		try {
			WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("sername")));
			username.sendKeys("Siya12");
			WebElement password = driver.findElement(By.name("password"));
			password.sendKeys("Siya12");
			WebElement loginBtn = driver.findElement(By.cssSelector("input[value ='Log In']"));
			loginBtn.click();
			WebElement logoutLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Log Out")));
			Assert.assertTrue(logoutLink.isDisplayed(), "Login failed!");
			System.out.println(" Login successful, Logout link found!");
		} catch (NoSuchElementException e) {
			System.out.println(" Element not found: " + e.getMessage());
			Assert.fail("Test failed due to missing element.");
		} catch (TimeoutException e) {
			System.out.println("  Timeout while waiting: " + e.getMessage());
			Assert.fail("Test failed due to timeout.");
		} catch (Exception e) {
			System.out.println(" Unexpected error: " + e.getMessage());
			Assert.fail("Test failed due to unexpected exception.");
		}
	}
	@AfterClass
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}

