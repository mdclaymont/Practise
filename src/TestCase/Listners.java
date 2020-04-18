package TestCase;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import allcommonitem.Function;

public class Listners implements ITestListener {
	public WebDriver driver; 
	public static Function bf=new Function();
	
	@Override
	public void onTestStart(ITestResult result){
		
	}
	
	@Override
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("****Expected Test Case "+result.getName()+" Are Succesfully Passed*****");
	}
	
	@Override
	public void onTestFailure(ITestResult result){
	 
		System.out.println("***** Error "+result.getName()+" test has failed *****");
	    String methodName=result.getName().toString().trim();
		try {
			Function.takeScreenShot(methodName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void onTestSkipped(ITestResult result){
	
		
	}
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result){
	
		
	}
	
	@Override
	public void onStart(ITestContext context){
	
		
	}
	
	@Override
	public void onFinish(ITestContext context){
	
		
	}
}
