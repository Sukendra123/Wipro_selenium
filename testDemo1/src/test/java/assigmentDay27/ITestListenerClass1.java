package assigmentDay27;


import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenerClass1 extends BaseTestScreenshot1 implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getTestContext().getName()+ "_" +result.getMethod().getMethodName());
		captureScreenshot(result.getTestContext().getName()+ "_" +result.getMethod().getMethodName()+".jpg");
	}
	
}
