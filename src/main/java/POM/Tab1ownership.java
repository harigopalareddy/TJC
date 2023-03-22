package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.LoginAndStart;

public class Tab1ownership extends LoginAndStart {
	public static By nxtbtn=By.id("ctl00_ctl00_tjcPageNavigation_NextButton");
	public static void tab1ownwefunction() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(nxtbtn).click();
	}
}
