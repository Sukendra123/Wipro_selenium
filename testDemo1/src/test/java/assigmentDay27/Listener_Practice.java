package assigmentDay27;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(MyListener.class)
public class Listener_Practice {
	WebDriver driver;
	
	@BeforeClass
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	public void logIn() {
		driver.get("https://demowebshop.tricentis.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/login']"))).click();
		driver.findElement(By.id("Email")).sendKeys("marvel01@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("IronMan");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Log in']"))).click();
	}
	
	@Test(priority=2)
	public void checkTitleName() {
		String expectedName = "Demo Web Shops";
		String actualName = driver.getTitle();
		Assert.assertEquals(actualName, expectedName);
	}
	
	@Test(priority=3)
	public void clickBook() {
		System.out.println("Now testing Books button.");
		driver.findElement(By.xpath("//a[@href='/books']")).click();
		throw new SkipException("Skipping this test.");
	}
}
 






