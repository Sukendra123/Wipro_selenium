package assigmentDay27;


import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestClassScreenshot extends BaseTestScreenshot{

	@Test(testName = "TestGoogle")
	public void TestGoogle() throws Exception {
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("AlluArjun", Keys.ENTER);
		String expectedTitle = "AlluArjun - Google Search";
		String actualTitle = driver.getTitle();
		assertEquals(actualTitle, expectedTitle, "Title is mismatched");
	}

	@Test(testName = "TestFacebook")
	public void TestFacebook() throws Exception {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("HYR Tutorials", Keys.ENTER);
		
		SoftAssert softAssert = new SoftAssert();
		//Title Assertion
		String actualTitle = driver.getTitle();
		String expectedTitle = "Log in to Facebook";
		softAssert.assertEquals(actualTitle, expectedTitle, "Title is mismatched");
		
		//URL Assertion
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.facebook.com/";
		softAssert.assertEquals(actualUrl, expectedUrl, "URL is mismatched");
		
		//Text Assertion
		String actualText = driver.findElement(By.name("email")).getAttribute("value");
		String expectedText = "";
		softAssert.assertEquals(actualText, expectedText, "Username text is mismatched");
		
		//Border Assertion
		String actualBorder = driver.findElement(By.name("email")).getCssValue("border");
		String expectedBorder = "1px solid rgb(240, 40, 73)";
		softAssert.assertEquals(actualBorder, expectedBorder, "Username border is mismatched");
		
		//ErrorMessage Assertion
		String actualErrorMessage = driver.findElement(By.xpath("(//div[@id='email_container']/div)[last()]")).getText();
		String expectedErrorMessage = "The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
		softAssert.assertEquals(actualErrorMessage, expectedErrorMessage, "Username error message is mismatched");
		
		softAssert.assertAll();
	}
	
	@Test(testName = "TestOrangeHRM")
	public void TestOrangeHRM() throws Exception {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin1234");
		driver.findElement(By.id("btnLogin")).click();
		Assert.assertTrue(driver.findElement(By.id("welcome")).isDisplayed());
	}
}
