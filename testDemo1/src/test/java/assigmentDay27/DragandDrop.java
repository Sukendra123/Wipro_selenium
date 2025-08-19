package assigmentDay27;



import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class DragandDrop {
	WebDriver driver;
   @BeforeMethod
   public void setup() {
       driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.get("https://demoqa.com/droppable");
   }
   @Test
   public void testDragAndDrop() {
       WebElement source = driver.findElement(By.id("draggable"));  // Drag box
       WebElement target = driver.findElement(By.id("droppable"));  // Drop area
       Actions actions = new Actions(driver);
       actions.dragAndDrop(source, target).perform(); // Perform drag & drop
       // Verify the drop worked
       String textAfterDrop = target.getText();
       //assert textAfterDrop.contains("ropped!") : "Drag and drop failed!";
       Assert.assertEquals(textAfterDrop,"Dropped!");
   }
   @AfterMethod
   public void tearDown() {
       driver.quit();
   }
}
