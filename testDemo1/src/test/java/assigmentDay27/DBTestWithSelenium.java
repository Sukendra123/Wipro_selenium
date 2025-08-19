package assigmentDay27;

import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import java.sql.*;
import java.time.Duration;
public class DBTestWithSelenium {
   JdbcUtil jdbcUtil = new JdbcUtil();
   ResultSet resultSet;
   WebDriver driver;
   @BeforeClass
   public void setup() throws ClassNotFoundException, SQLException {
       String dbUrl = "jdbc:mysql://localhost:3307/testdb";
       String user = "root";
       String pass = "Tiger@21";
       jdbcUtil.connect(dbUrl, user, pass);
       driver = new ChromeDriver();
   }
   @Test
   public void readDataAndTest() throws SQLException {
       String query = "SELECT * FROM users WHERE status='active'";
       resultSet = jdbcUtil.executeQuery(query);
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       while (resultSet.next()) {
           String username = resultSet.getString("username");
           String password = resultSet.getString("password");
           driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
           wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_MainContent_username")));
           driver.findElement(By.id("ctl00_MainContent_username")).clear();
           driver.findElement(By.id("ctl00_MainContent_username")).sendKeys(username);
           driver.findElement(By.id("ctl00_MainContent_password")).clear();
           driver.findElement(By.id("ctl00_MainContent_password")).sendKeys(password);
           driver.findElement(By.id("ctl00_MainContent_login_button")).click();
       }
   }
   @AfterClass
   public void tearDown() throws SQLException {
       if (driver != null) driver.quit();
       jdbcUtil.close();
   }
}

