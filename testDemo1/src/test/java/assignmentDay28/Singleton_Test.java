package assignmentDay28;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class Singleton_Test {
	@BeforeClass
	public void setup() {
		System.out.println("this is before singleton");
		Singleton_Practice.getDriver().get("https://demoqa.com/automation-practice-form");
  
	}
	@Test
	public void testDown() {
		Singleton_Practice.quitDriver();
	}
}

