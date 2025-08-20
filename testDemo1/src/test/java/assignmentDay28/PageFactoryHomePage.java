package assignmentDay28;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryHomePage {
    WebDriver driver;

    // After login, customer name appears on top right
    @FindBy(css = "p.smallText")
    WebElement welcomeMessage;

    public PageFactoryHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getWelcomeText() {
        return welcomeMessage.getText();
    }
}

