package POM;

import java.time.Duration;

import org.openqa.selenium.By;

import Base.LoginAndStart;

public class Tab6HRRHC extends LoginAndStart {
	public static By PR=By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_UCHealthRecPrgQuestion_dlQuestion_ctl00_rbQuestion");
	public static By nxtbtn    =By.id("ctl00_ctl00_tjcPageNavigation_NextButton");
	
	public static void tab6hrrhcfunction() throws Exception {
		driver.findElement(PR).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(nxtbtn).click();
	}
}
