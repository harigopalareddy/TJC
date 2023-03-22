package POM;

import java.time.Duration;

import org.openqa.selenium.By;

import Base.LoginAndStart;

public class Tab6OHR extends LoginAndStart{
	public static By 	OHR  =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_UCHealthRecQuestion_dlQuestion_ctl00_rblYesNoQuestion_1");
	public static By nxtbtn  =By.id("ctl00_ctl00_tjcPageNavigation_NextButton");
	
	public static void tb6ohrfunction() {
		driver.findElement(OHR).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(nxtbtn).click();
	}

}
