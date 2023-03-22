package POM;

import java.time.Duration;

import org.openqa.selenium.By;

import Base.LoginAndStart;

public class Tab8OLD extends LoginAndStart {
public static By nxtbtn=By.id("ctl00_ctl00_tjcPageNavigation_NextButton");
	
	public static void tab8oldfunction() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(nxtbtn).click();
	}
	
}
