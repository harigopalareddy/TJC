package POM;

import java.time.Duration;

import org.openqa.selenium.By;

import Base.LoginAndStart;

public class Tab6SURAMB extends LoginAndStart {
	public static By nxtbtn=By.id("ctl00_ctl00_tjcPageNavigation_NextButton");
	
	public static void tab6surambfunction() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(nxtbtn).click();
	}

}
