package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.LoginAndStart;

public class Tab5SDRHC3 extends LoginAndStart  {
	public static By SD     =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucQuestionRHCDesc1_dlQuestion_ctl00_rbQuestion");
	public static By nurserv=By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucService1_dlService_ctl00_cbService");
	public static By visits =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_tbVolume");
	public static By nxtbtn =By.id("ctl00_ctl00_tjcPageNavigation_NextButton");
	
	public static void main(String[] args) throws Exception {
		driver.findElement(SD).click();
		driver.findElement(nurserv).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(nurserv).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(visits).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(visits).sendKeys("50");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(nxtbtn).click();
	}
	
}
