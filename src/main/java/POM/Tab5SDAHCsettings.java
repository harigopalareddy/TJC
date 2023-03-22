package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.LoginAndStart;

public class Tab5SDAHCsettings extends LoginAndStart{
	public static By settings=By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucService1_dlService_ctl01_rbService");
	public static By nxtbtn  =By.id("ctl00_ctl00_tjcPageNavigation_NextButton");
	public static void tab5sdahcfunction() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(settings).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(nxtbtn).click();
	}
}
