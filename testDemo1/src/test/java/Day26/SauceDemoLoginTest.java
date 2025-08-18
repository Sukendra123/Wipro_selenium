package Day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;


public class SauceDemoLoginTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000); // just to see result clearly in demo
        driver.quit();
    }


// “Before each data row, we launch a fresh Chrome and open the login page.”


// “After each run, we close the browser. This keeps tests independent.”


    @Test(dataProvider = "loginData", dataProviderClass = SauceDemoDataProvider.class)
    public void loginTest(String username, String password, String expected) {
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();

        if (expected.equals("success")) {
            // On successful login, URL changes to /inventory.html
            String currentUrl = driver.getCurrentUrl();
            Assert.assertTrue(currentUrl.contains("inventory"), 
                              "Login failed for valid user: " + username);
            System.out.println("Login successful for user: " + username);

        } else if (expected.equals("locked")) {
            // Locked out user gets a specific error
            String errorMsg = driver.findElement(By.cssSelector("h3[data-test='error']")).getText();
            Assert.assertTrue(errorMsg.contains("locked out"),
                              "Expected locked out error but got: " + errorMsg);
            System.out.println("User locked out: " + username);

        } else if (expected.equals("invalid")) {
            // Invalid credentials show invalid username/password error
            String errorMsg = driver.findElement(By.cssSelector("h3[data-test='error']")).getText();
            Assert.assertTrue(errorMsg.contains("Username and password do not match") 
                           || errorMsg.contains("do not match"), 
                           "Expected invalid login error but got: " + errorMsg);
            System.out.println("Invalid login for user: " + username);

        }
    }
}

