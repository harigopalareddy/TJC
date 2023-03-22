package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.LoginAndStart;

public class Tab5SDRHC extends LoginAndStart {
	public static By SDRHC    =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucQuestionRHCDesc1_dlQuestion_ctl00_rbQuestion");
	public static By nurserv  =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucService1_dlService_ctl00_cbService");
	public static By mobserv  =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucService1_dlService_ctl01_cbService");
	public static By monday   =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucService1_dlService_ctl01_dlAttribute1_ctl01_cbAttribute");
	public static By wednesday=By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucService1_dlService_ctl01_dlAttribute1_ctl03_cbAttribute");
	public static By diagimg  =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucService1_dlService_ctl02_cbService");
	public static By mamograph=By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucService2_dlService_ctl07_cbService");
	public static By visits   =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_tbVolume");
	public static By nxtbtn   =By.id("ctl00_ctl00_tjcPageNavigation_NextButton");
	
	public static void tab5sdrhcfunction() throws Exception {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.findElement(SDRHC).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(nurserv).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(nurserv).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(mobserv).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(mobserv).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(monday).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(wednesday).click();
		wait.until(ExpectedConditions.elementToBeClickable(diagimg));
		driver.findElement(diagimg).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(diagimg));
		driver.findElement(diagimg).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(mamograph));
		driver.findElement(mamograph).click();;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(visits).clear();
		driver.findElement(visits).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(visits).sendKeys("500");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(nxtbtn).click();
	}

}
