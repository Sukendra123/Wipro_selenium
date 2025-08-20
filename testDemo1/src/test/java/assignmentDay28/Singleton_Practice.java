package assignmentDay28;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Singleton_Practice {
	private static WebDriver driver;
	
	private Singleton_Practice() {
		
	}
	public static WebDriver getDriver() {
		if(driver ==null) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		return driver;
	}
	public static void quitDriver() {
		if(driver!= null)
		{
			driver.quit();
			driver=null;
			}
		}
}

