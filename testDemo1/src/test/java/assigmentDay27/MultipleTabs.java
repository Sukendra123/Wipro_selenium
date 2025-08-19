package assigmentDay27;



import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class MultipleTabs {
	WebDriver driver;
   @BeforeMethod
   public void setup() {
       driver = new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.manage().window().maximize();
       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
   }
   @Test
   public void testMultipleWindows() throws InterruptedException {
       // Store parent window
       String parentWindow = driver.getWindowHandle();
       //System.out.println(parentWindow);
       // Click on "OrangeHRM, Inc" link (bottom of login page)
       WebElement link = driver.findElement(By.linkText("OrangeHRM, Inc"));
       link.click();
       //Switch to child window
       Set<String> allWindows = driver.getWindowHandles();
       for (String win : allWindows) {
           if (!win.equals(parentWindow)) {
               driver.switchTo().window(win);
               break;
           }
       }
       // Get child window title
       System.out.println("Child Window Title: " + driver.getTitle());
       // Close child window
       driver.close();
       // Switch back to parent
       driver.switchTo().window(parentWindow);
       System.out.println("Back to Parent Title: " + driver.getTitle());
   }
   @AfterMethod
   public void tearDown() {
       driver.quit();
   } }

