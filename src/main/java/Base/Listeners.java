package Base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class Listeners extends LoginAndStart implements ITestListener {

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getTestClass().getName()+"-->Test Passed ");
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getTestClass().getName()+"-->Test Failed ");
		TakesScreenshot ss =((TakesScreenshot)driver);
		File Src=ss.getScreenshotAs(OutputType.FILE);
		File folder=new File("utils//Screenshot//"+result.getMethod().getMethodName()+"failed.png");
		try {
			FileUtils.copyFile(Src,folder);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getTestClass().getName()+"-->Test Skipped ");
		
	}

}
