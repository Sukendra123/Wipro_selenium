package assigmentDay27;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class AlertBox {
	 WebDriver driver;
	    @BeforeMethod
	    public void setup() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    }
	    @Test
	    public void testAlerts() throws InterruptedException {
	        driver.get("https://demoqa.com/alerts");
	        // 1. Simple Alert
        driver.findElement(By.id("alertButton")).click();
	        Alert simpleAlert = driver.switchTo().alert();
	        System.out.println("Simple Alert Text: " + simpleAlert.getText());
	        simpleAlert.accept();
	        // 2. Timer Alert
	        driver.findElement(By.id("timerAlertButton")).click();
	        Thread.sleep(6000);
	        Alert timerAlert = driver.switchTo().alert();
	        System.out.println("Timer Alert Text: " + timerAlert.getText());
	        timerAlert.accept();
	        // 3. Confirmation Alert
	        driver.findElement(By.id("confirmButton")).click();
	        Alert confirmAlert = driver.switchTo().alert();
	        System.out.println("Confirm Alert Text: " + confirmAlert.getText());
	        confirmAlert.dismiss();
	        // 4. Prompt Alert
	        driver.findElement(By.id("promtButton")).click();
	        Alert promptAlert = driver.switchTo().alert();
	        System.out.println("Prompt Alert Text: " + promptAlert.getText());
	        promptAlert.sendKeys("Tharun Testing");
	        promptAlert.accept();
	    }
	    @AfterMethod
	    public void tearDown() {
	        driver.quit();
	    }
}

