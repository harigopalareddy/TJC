package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.LoginAndStart;

public class Tab3BPHC extends LoginAndStart {
	public static By HRSA=By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_txtHRSANo");
	public static By nxtbtn=By.id("ctl00_ctl00_tjcPageNavigation_NextButton");

	public static void tab3function() {
		driver.findElement(HRSA).clear();
		driver.findElement(HRSA).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(HRSA).sendKeys("H80CS46567");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(nxtbtn).click();
	}

}
