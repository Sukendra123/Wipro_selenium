package assigmentDay27;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class DatePicker {
	WebDriver driver;
   WebDriverWait wait;
   @BeforeMethod
   public void setup() {
       driver = new ChromeDriver();
       driver.manage().window().maximize();
       wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       driver.get("https://demoqa.com/date-picker");
   }
   @Test
   public void testDatePicker() throws InterruptedException {
       //Click on date input
       WebElement dateInput = wait.until(ExpectedConditions.elementToBeClickable(By.id("datePickerMonthYearInput")));
       dateInput.click();
       dateInput.clear();
       //Clear existing value and send new date
       dateInput.sendKeys(Keys.CONTROL + "a");
       dateInput.sendKeys("08/20/2025"); // MM/dd/yyyy format
       dateInput.sendKeys(Keys.ENTER);
       //Date and Time picker example
       WebElement dateTimeInput = driver.findElement(By.id("dateAndTimePickerInput"));
       dateTimeInput.click();
       dateTimeInput.sendKeys(Keys.CONTROL + "a");
       dateTimeInput.sendKeys("August 20, 2025 10:30 AM");
       dateTimeInput.sendKeys(Keys.ENTER);
       Thread.sleep(3000);
   }
   @AfterMethod
   public void tearDown() {
       driver.quit();
   }
}


