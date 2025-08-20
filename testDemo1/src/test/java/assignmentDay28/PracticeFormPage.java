package assignmentDay28;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class PracticeFormPage {
   WebDriver driver;
   WebDriverWait wait;
   public PracticeFormPage(WebDriver driver) {
       this.driver = driver;
       this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
   }
   By firstNameInput = By.id("firstName");
   By lastNameInput = By.id("lastName");
   By emailInput = By.id("userEmail");
   By genderMaleRadio = By.xpath("//label[@for='gender-radio-1']");
   By mobileInput = By.id("userNumber");
   By dateOfBirthInput = By.id("dateOfBirthInput");
   By subjectsInput = By.id("subjectsInput");
   By hobbiesReadingCheckbox = By.xpath("//label[@for='hobbies-checkbox-2']");
   By uploadPictureInput = By.id("uploadPicture");
   By currentAddressInput = By.id("currentAddress");
   By stateDropdownContainer = By.id("state");            // Changed to container div
   By stateDropdownInput = By.id("react-select-3-input");  // input inside dropdown
   By cityDropdownContainer = By.id("city");              // Changed to container div
   By cityDropdownInput = By.id("react-select-4-input");
   By stateDropdown = By.id("react-select-3-input");
   By cityDropdown = By.id("react-select-4-input");
   By submitButton = By.id("submit");
   public void enterFirstName(String firstName) {
       wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameInput)).sendKeys(firstName);
   }
   public void enterLastName(String lastName) {
       wait.until(ExpectedConditions.visibilityOfElementLocated(lastNameInput)).sendKeys(lastName);
   }
   public void enterEmail(String email) {
       wait.until(ExpectedConditions.visibilityOfElementLocated(emailInput)).sendKeys(email);
   }
   public void selectGenderMale() {
       WebElement genderMaleElem = wait.until(ExpectedConditions.elementToBeClickable(genderMaleRadio));
       scrollToElement(genderMaleElem);
       genderMaleElem.click();
   }
   public void enterMobile(String mobile) {
       wait.until(ExpectedConditions.visibilityOfElementLocated(mobileInput)).sendKeys(mobile);
   }
   public void enterDateOfBirth(String date) {
       WebElement dobInput = wait.until(ExpectedConditions.elementToBeClickable(dateOfBirthInput));
       dobInput.click();
       // TODO: Implement selecting the date from the calendar widget if needed
   }
   public void enterSubjects(String subject) {
       WebElement subjectElem = wait.until(ExpectedConditions.visibilityOfElementLocated(subjectsInput));
       subjectElem.sendKeys(subject);
       subjectElem.sendKeys(Keys.ENTER);
   }
   public void selectHobbiesReading() {
       WebElement hobbyCheckbox = wait.until(ExpectedConditions.elementToBeClickable(hobbiesReadingCheckbox));
       scrollToElement(hobbyCheckbox);
       closeDatePickerIfOpen();
       clickElementJS(hobbyCheckbox);
   }
   public void uploadPicture(String filePath) {
       wait.until(ExpectedConditions.presenceOfElementLocated(uploadPictureInput)).sendKeys(filePath);
   }
   public void enterCurrentAddress(String address) {
       wait.until(ExpectedConditions.visibilityOfElementLocated(currentAddressInput)).sendKeys(address);
   }
   public void selectState(String state) {
       driver.findElement(stateDropdown).sendKeys(state);
       driver.findElement(stateDropdown).sendKeys(Keys.ENTER);
   }
   public void selectCity(String city) {
       driver.findElement(cityDropdown).sendKeys(city);
       driver.findElement(cityDropdown).sendKeys(Keys.ENTER);
   }
   public void clickSubmit() {
       WebElement submitBtn = wait.until(ExpectedConditions.elementToBeClickable(submitButton));
       scrollToElement(submitBtn);
       submitBtn.click();
   }
   // Helper methods
   private void scrollToElement(WebElement element) {
       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
   }
   private void clickElementJS(WebElement element) {
       ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
   }
   private void closeDatePickerIfOpen() {
       try {
           WebElement dobInput = driver.findElement(dateOfBirthInput);
           dobInput.sendKeys(Keys.ESCAPE);  // Close date picker overlay if open
       } catch (Exception e) {
           // Ignore if not present
       }
   }
   private void closeAdOverlayIfPresent() {
       try {
           WebElement iframe = driver.findElement(By.cssSelector("iframe[id^='google_ads_iframe']"));
           ((JavascriptExecutor) driver).executeScript("arguments[0].style.display='none';", iframe);
       } catch (Exception e) {
           // If ad iframe not found, ignore
       }
   }
}

