package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.LoginAndStart;

public class Tab2CAH extends LoginAndStart {
	public static By CAH=By.id("ctl00_ctl00_tjcLeftMenu_liListItemLeftRail0_liListSubItemLeftRail3_hylkListSubItemLeftRail");
	public static By nxtbtn=By.id("ctl00_ctl00_tjcPageNavigation_NextButton");

	public static void LEAVECAH() {
		driver.findElement(CAH).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(nxtbtn).click();
	}

}
