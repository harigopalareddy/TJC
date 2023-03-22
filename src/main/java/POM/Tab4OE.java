package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.LoginAndStart;

public class Tab4OE extends LoginAndStart {
	public static By nxtbtn=By.id("ctl00_ctl00_tjcPageNavigation_NextButton");
	
	public static void tab4function() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(nxtbtn).click();
	}
}
