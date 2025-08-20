package assignmentDay28;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryLoginPage {
    WebDriver driver;

    // Locators using Page Factory
    @FindBy(name = "username")
    WebElement username;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(xpath = "//input[@value='Log In']")
    WebElement loginButton;

    // Constructor: initializes WebElements
    public PageFactoryLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Actions
    public void enterUsername(String user) {
        username.clear();
        username.sendKeys(user);
    }

    public void enterPassword(String pass) {
        password.clear();
        password.sendKeys(pass);
    }

    public void clickLogin() {
        loginButton.click();
    }
}

