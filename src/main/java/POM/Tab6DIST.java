package POM;

import java.time.Duration;

import org.openqa.selenium.By;

import Base.LoginAndStart;

public class Tab6DIST extends LoginAndStart {
	public static By dist     =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_grdViewSurvDetails_ctl00_ctl04_txtBoxMilesFromOrg");
	public static By mainsite =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_grdViewSurvDetails_ctl00_ctl06_btnRadioMainSite");
	public static By mainsite2=By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_grdViewSurvDetails_ctl00_ctl04_btnRadioMainSite");
	public static By nxtbtn=By.id("ctl00_ctl00_tjcPageNavigation_NextButton");
	
	public static void tab6distfunctionwithambulatorysite() {
		driver.findElement(dist).clear();
		driver.findElement(dist).sendKeys("827");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(mainsite).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(nxtbtn).click();
		
	}
	
	public static void tab6distfunctionwithoutambulatorsite() {
		driver.findElement(mainsite2).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(nxtbtn).click();
		
		
		
	}
}
