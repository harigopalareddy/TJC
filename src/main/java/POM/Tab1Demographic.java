package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.LoginAndStart;

public class Tab1Demographic extends LoginAndStart {
	
	public static By Orgname          =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_txtOrgName");
	public static By orgstreertadress =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_OrgAddress_txtSAddress");
	public static By dobussas         =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_txtDBA");
	public static By countrydd        =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_OrgAddress_ddlSCountry");
	public static By zipcode          =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_OrgAddress_txtSZipCode");
	public static By citydd           =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_OrgAddress_ddlSCityCd");
	public static By mailcb           =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_OrgAddress_chkSameAsAbove");
	public static By orgphonenum      =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_OrgAddress_radMainPhoneNumber");
	public static By orgwebsite       =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_OrgAddress_txtWebSite");
	public static By nxtbtn           =By.id("ctl00_ctl00_tjcPageNavigation_NextButton");
	public static By waitimg          =By.id("ctl00_ctl00_cphBodyContent_imgLoading");
	public static By tyxtele          =By.xpath("//p[text()='Please wait while we are processing your request...']");
	

	public static void tab1function() throws Throwable {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement img=driver.findElement(waitimg);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(Orgname).clear();
		driver.findElement(Orgname).sendKeys(data(1,2));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(orgstreertadress).clear();
		driver.findElement(orgstreertadress).sendKeys(data(1,3));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(dobussas).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(dobussas).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(dobussas).sendKeys(data(1,6));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(zipcode).clear();
		driver.findElement(zipcode).sendKeys(data(1,4));
		WebElement mailadd=driver.findElement(mailcb);
		driver.findElement(mailcb).click();
		driver.findElement(mailcb).click();
		wait.until(ExpectedConditions.elementToBeSelected(mailadd));
		wait.until(ExpectedConditions.invisibilityOfElementWithText(tyxtele,"Please wait while we are processing your request..."));
		wait.until(ExpectedConditions.invisibilityOf(img));
		driver.findElement(orgphonenum).clear();
		driver.findElement(orgphonenum).sendKeys("9987654321");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(orgwebsite).clear();
		driver.findElement(orgwebsite).sendKeys(data(1,5));
		WebElement orgsite=driver.findElement(orgwebsite);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(nxtbtn).click();

	}

}
