package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.LoginAndStart;

public class Tab2OBS extends LoginAndStart {
	public static By OBS=By.id("ctl00_ctl00_tjcLeftMenu_liListItemLeftRail0_liListSubItemLeftRail8_hylkListSubItemLeftRail");
	public static By nxtbtn=By.id("ctl00_ctl00_tjcPageNavigation_NextButton");

	public static void LEAVEOBS() {
		driver.findElement(OBS).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(nxtbtn).click();
	}
}
