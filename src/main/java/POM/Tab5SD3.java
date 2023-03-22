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

public class Tab5SD3 extends LoginAndStart{
	    public static By sitename  =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_txtSiteName");
		public static By dobussas  =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_txtDBA");
		public static By SSA       =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucAddress_txtSAddress");
		public static By countrydd =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucAddress_ddlSCountry");
		public static By zipcode   =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucAddress_txtSZipCode");
		public static By citydd    =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucAddress_ddlSCityCd");
		public static By nxtbtn    =By.id("ctl00_ctl00_tjcPageNavigation_NextButton");
		public static By waitimg  =By.id("ctl00_ctl00_cphBodyContent_imgLoading");
		
		public static void tab5sd3fuction() throws Exception {
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
			driver.findElement(sitename).clear();
			driver.findElement(sitename).clear();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(sitename).sendKeys("Test3");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(dobussas).clear();
			driver.findElement(dobussas).clear();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(dobussas).sendKeys("test3");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(SSA).clear();
			driver.findElement(SSA).clear();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(SSA).sendKeys("Third Street");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(zipcode).clear();
			driver.findElement(zipcode).clear();
			driver.findElement(zipcode).sendKeys("60128"+Keys.ENTER);
			WebElement waiting=driver.findElement(waitimg);
			wait.until(ExpectedConditions.invisibilityOf(waiting));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(nxtbtn).click();
		}
}
	
