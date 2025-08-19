package assigmentDay27;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class IFrames {
	WebDriver driver;
   @BeforeMethod
   public void setup() {
       driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   }
   @Test
   public void testIframes() {
       driver.get("https://demoqa.com/frames");
       // Frame1
       driver.switchTo().frame("frame1");
       String text1 = driver.findElement(By.id("sampleHeading")).getText();
       System.out.println("Frame1 Text: " + text1);
       driver.switchTo().defaultContent();
       // Frame2
       driver.switchTo().frame("frame2");
       String text2 = driver.findElement(By.id("sampleHeading")).getText();
       System.out.println("Frame2 Text: " + text2);
       driver.switchTo().defaultContent();
   }
   @AfterMethod
   public void tearDown() {
       driver.quit();
   }
}

