package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.LoginAndStart;

public class Tab3RHC extends LoginAndStart{
	public static By FRHC      =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucQuestionDeemedRequest_dlQuestion_ctl00_rblYesNoQuestion_0");
	public static By orglegname=By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_txtCMSLegalName");
	public static By MC        =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucQuestionCCNNumber_dlQuestion_ctl00_rblYesNoQuestion_1");
	public static By nxtbtn=By.id("ctl00_ctl00_tjcPageNavigation_NextButton");

	public static void tab3function() {
		driver.findElement(FRHC).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(orglegname).clear();
		driver.findElement(orglegname).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(orglegname).sendKeys("CMS legal name on 855 for RHC");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(MC).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(nxtbtn).click();
	}


}
