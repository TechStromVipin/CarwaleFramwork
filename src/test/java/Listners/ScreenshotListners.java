package Listners;

import org.testng.ITestListener;
import org.testng.ITestResult;


 

public class ScreenshotListners extends BrowserRunner.aftereachtestmethods implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {

		System.out.println(result.getTestContext().getName() + result.getMethod().getMethodName());
		screenshot(result.getTestContext().getName() + result.getMethod().getMethodName() + ".png");

		 	
		
	}

}
