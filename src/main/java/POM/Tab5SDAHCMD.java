package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.LoginAndStart;

public  class Tab5SDAHCMD extends LoginAndStart {
	public static By dental  =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucQuestionMD_dlQuestion_ctl00_rblYesNoQuestion_0");
	public static By services=By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucService1_dlService_ctl00_cbService");
	public static By visits  =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_tbVolume");
	public static By nxtbtn  =By.id("ctl00_ctl00_tjcPageNavigation_NextButton");
	public static By dialouge=By.id("divDiscard");
	public static By cancel  =By.xpath("//span[text()='Cancel']");
	
	
	public static void tab5sdahcmdfunctionS() throws Exception {
		driver.findElement(dental).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(services).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(services).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(visits).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(visits).sendKeys("50");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(nxtbtn).click();
		WebElement diagbox=driver.findElement(dialouge);
		if(diagbox.isDisplayed()) {
			driver.findElement(cancel).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(services).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(nxtbtn).click();
			
		}
		
	}
	

}
