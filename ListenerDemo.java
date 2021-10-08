package IListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class ListenerDemo implements ITestListener {
	
	public void onTestStart(ITestResult result) {
		System.out.println("Test Started"+result.getName());
	}
	
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test is sucessful"+result.getName());	
		
	
	}
	public void onTestFailure(ITestResult result) {
		System.out.println("Test is failed"+result.getName());	
		
	
	}
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test is skipped"+result.getName());	
		
	
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	
	}
	
	public void onStart(ITestContext context) {	
		
		
	
	}
	
	public void onFinish(ITestContext context) {
		System.out.println("Test is completed"+context.getName());	
		
	
	}

}
