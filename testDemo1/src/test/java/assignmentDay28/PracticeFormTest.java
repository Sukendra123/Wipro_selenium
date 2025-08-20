package assignmentDay28;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class PracticeFormTest {
   WebDriver driver;
   PracticeFormPage formPage;
   @BeforeClass
   public void setup() {
       driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://demoqa.com/automation-practice-form");
       formPage = new PracticeFormPage(driver);
   }
   @Test
   public void fillFormAndSubmit() {
       formPage.enterFirstName("Meehir");
       formPage.enterLastName("Choudhary");
       formPage.enterEmail("meehirchoudhary@example.com");
       formPage.selectGenderMale();
       formPage.enterMobile("1234567890");
       formPage.enterDateOfBirth("01-nov-2002");  // Improve later to select actual date
       formPage.enterSubjects("Maths");
       formPage.selectHobbiesReading();
       formPage.uploadPicture("C:\\Users\\Meehir\\Downloads\\image.jpg");
       formPage.enterCurrentAddress("123 Main Street, City, Country");
       formPage.selectState("NCR");
       formPage.selectCity("Delhi");
       formPage.clickSubmit();
       // Add assertions here to verify submission was successful (optional)
   }
   @AfterClass
   public void teardown() {
       if (driver != null) {
           driver.quit();
       }
   }
}

