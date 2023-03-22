package POM;

import java.time.Duration;

import org.openqa.selenium.By;

import Base.LoginAndStart;

public class Tab9 extends LoginAndStart {

	public static By click =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_lbMissingInfo");
	public static By text =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_rgMissingInfo_ctl00_ctl04_lblRuleMessage");

	public static void ambulatoryerror() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(click).click();
		String errorinambulatoryservice=driver.findElement(text).getText();
		if(errorinambulatoryservice.contains("Ambulatory Health Care service/program has not been provided")) {
			System.out.println("Error in Ambulatory Service");
		}
	}
}
