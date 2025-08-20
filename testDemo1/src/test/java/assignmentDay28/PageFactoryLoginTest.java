package assignmentDay28;


//import base.BaseTest;
//import Pages.LoginPage;
//import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageFactoryLoginTest extends PageFactoryBaseTest {

    @Test
    public void verifyValidLogin() {
        // Step 1: Open login page and enter details
    	PageFactoryLoginPage loginPage = new PageFactoryLoginPage(driver);
        loginPage.enterUsername("john");   // Parabank demo user
        loginPage.enterPassword("demo");   // Parabank demo password
        loginPage.clickLogin();

        // Step 2: Navigate to home page and get welcome text
        PageFactoryHomePage homePage = new PageFactoryHomePage(driver);
        String welcomeText = homePage.getWelcomeText();

        // Step 3: Assert that login is successful
        Assert.assertTrue(welcomeText.contains("Welcome"),
            "Login failed - Welcome text not found!");
    }
}

