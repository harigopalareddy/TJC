package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Base.LoginAndStart;

public class Tab6HRSOPAHC extends LoginAndStart{
	public static By MON1   =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_ddlDefaultOpenMondayHour");
	public static By MON2   =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_ddlDefaultCloseMondayHour");
	public static By TUE1   =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_ddlDefaultOpenTuesdayHour");
	public static By TUE2  =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_ddlDefaultCloseTuesdayHour");
	public static By WED1  =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_ddlDefaultOpenWednesdayHour");
	public static By WED2  =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_ddlDefaultCloseWednesdayHour");
	public static By THU1  =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_ddlDefaultOpenThursdayHour");
	public static By THU2  =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_ddlDefaultCloseThursdayHour");
	public static By FRI1  =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_ddlDefaultOpenFridayHour");
	public static By FRI2  =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_ddlDefaultCloseFridayHour");
	public static By SAT1  =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_ddlDefaultOpenSaturdayHour");
	public static By SAT2  =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_ddlDefaultCloseSaturdayHour");
	public static By SUN1  =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_ddlDefaultOpenSundayHour");
	public static By SUN2  =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_ddlDefaultCloseSundayHour");
	public static By APPLY =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_btnApplyToAll");
	public static By Okbtn =By.xpath("//span[text()='Ok']");
	public static By CB    =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucQuestion_dlQuestion_ctl00_cbQuestion");
	public static By nxtbtn    =By.id("ctl00_ctl00_tjcPageNavigation_NextButton");

	public static void tab6hrsopahcfunction() {
		Select s1=new Select(driver.findElement(MON1));
		Select s2=new Select(driver.findElement(MON2));
		Select s3=new Select(driver.findElement(TUE1));
		Select s4=new Select(driver.findElement(TUE2));
		Select s5=new Select(driver.findElement(WED1));
		Select s6=new Select(driver.findElement(WED2));
		Select s7=new Select(driver.findElement(THU1));
		Select s8=new Select(driver.findElement(THU2));
		Select s9=new Select(driver.findElement(FRI1));
		Select s10=new Select(driver.findElement(FRI2));
		Select s11=new Select(driver.findElement(SAT1));
		Select s12=new Select(driver.findElement(SAT2));
		Select s13=new Select(driver.findElement(SUN1));
		Select s14=new Select(driver.findElement(SUN2));
		s1.selectByVisibleText("9:00 AM");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		s2.selectByVisibleText("10:00 AM");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		s3.selectByVisibleText("9:00 AM");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		s4.selectByVisibleText("10:00 AM");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		s5.selectByVisibleText("9:00 AM");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		s6.selectByVisibleText("10:00 AM");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		s7.selectByVisibleText("9:00 AM");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		s8.selectByVisibleText("10:00 AM");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		s9.selectByVisibleText("9:00 AM");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		s10.selectByVisibleText("10:00 AM");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		s11.selectByVisibleText("9:00 AM");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		s12.selectByVisibleText("10:00 AM");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		s13.selectByVisibleText("9:00 AM");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		s14.selectByVisibleText("10:00 AM");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(APPLY).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(Okbtn).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(CB).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(nxtbtn).click();
	}
}

