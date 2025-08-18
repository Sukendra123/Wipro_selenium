package Day26;

import org.testng.annotations.DataProvider;
public class SauceDemoDataProvider {
   @DataProvider(name = "loginData")
   public Object[][] getData() {
       return new Object[][]{
           {"standard_user", "secret_sauce", "success"},  // valid
           {"locked_out_user", "secret_sauce", "locked"}, // locked out
           {"performance_glitch_user", "secret_sauce", "success"}, // valid but slow
           {"invalid_user", "wrong_pass", "invalid"}      // invalid
       };
   }
}

