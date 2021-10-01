package Testng.listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listen implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("Listner: Test started");
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Listner: Test successful");
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Listner: Test failed");
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Listner: Test skipped");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Listner: Test succes percentage");
		
	}

	public void onStart(ITestContext context) {
		System.out.println("Listner: on start");
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("Listner: on finish");
		
	}

}
