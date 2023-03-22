package Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.LoginAndStart;

@Test
public class TC004 extends LoginAndStart {
	
	
	public static void Scenario4() throws Throwable {
	LoginAndStart.openapp("chrome");
	Assert.assertTrue(false);
	
	
	}

}
