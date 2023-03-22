package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.LoginAndStart;

public class Tab2BHCH extends LoginAndStart {
	public static By BHCH=By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_rdoPrgBhc_1");
	public static By nxtbtn=By.id("ctl00_ctl00_tjcPageNavigation_NextButton");

	public static void LEAVEBHLC() {
		driver.findElement(BHCH).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(nxtbtn).click();
	}

}
