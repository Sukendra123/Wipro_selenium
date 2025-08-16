package AssignmentProblems;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SmokeTesting {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Automatically downloads and sets up ChromeDriver
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Give Selenium some patience for page loads
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(5));
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyHomePageLoads() {
        try {
            driver.get("https://demoqa.com");
            Thread.sleep(2000); // small buffer for page load
            System.out.println("Smoke & Regression: Home Page - " + driver.getTitle());
        } catch (Exception e) {
            System.err.println("Error in verifyHomePageLoads: " + e.getMessage());
        }
    }

    @Test(groups = "smoke")
    public void verifyLoginPageLoads() {
        try {
            driver.get("https://demoqa.com/login");
            Thread.sleep(2000);
            System.out.println("Smoke: Login Page - " + driver.getTitle());
        } catch (Exception e) {
            System.err.println("Error in verifyLoginPageLoads: " + e.getMessage());
        }
    }

    @Test(groups = "regression")
    public void verifyProfilePageLoads() {
        try {
            driver.get("https://demoqa.com/profile");
            Thread.sleep(2000);
            System.out.println("Regression: Profile Page - " + driver.getTitle());
        } catch (Exception e) {
            System.err.println("Error in verifyProfilePageLoads: " + e.getMessage());
        }
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

