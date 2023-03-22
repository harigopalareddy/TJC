package POM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.LoginAndStart;

public class Tab5SD extends LoginAndStart {
	public static By AHCCB    =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_cblProgs_0");
	public static By RHCCB    =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_cblProgs_3");
	public static By sitename =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_txtSiteName");
	public static By dobuss   =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_txtDBA");
	public static By SSA      =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucAddress_txtSAddress");
	public static By countrydd=By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucAddress_ddlSCountry");
	public static By zipcode  =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucAddress_txtSZipCode");
	public static By citydd   =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucAddress_ddlSCityCd");
	public static By HRSA     =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_txtBPHCSiteID");
	public static By urbbtn   =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucQuestionBPHCtype_dlQuestion_ctl00_dlAttribute1_ctl02_rbAttribute");
	public static By ruralbtn =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucQuestionBPHCtype_dlQuestion_ctl00_dlAttribute1_ctl01_rbAttribute");
	public static By nxtbtn   =By.id("ctl00_ctl00_tjcPageNavigation_NextButton");
	public static By waitimg  =By.id("ctl00_ctl00_cphBodyContent_imgLoading");
	
	public static void tab5sdfunction() throws Exception {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement waiting=driver.findElement(waitimg);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(sitename).clear();
		driver.findElement(sitename).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(sitename).sendKeys("AHC Site");
		driver.findElement(dobuss).clear();
		driver.findElement(dobuss).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(dobuss).sendKeys("AHC");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(SSA).clear();
		driver.findElement(SSA).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(SSA).sendKeys("Elm street");
		driver.findElement(zipcode).clear();
		driver.findElement(zipcode).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(zipcode).sendKeys("10012"+Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wait.until(ExpectedConditions.invisibilityOf(waiting));
		driver.findElement(HRSA).clear();
		driver.findElement(HRSA).clear();
		wait.until(ExpectedConditions.elementToBeClickable(HRSA));
		driver.findElement(HRSA).click();
		driver.findElement(HRSA).click();
		Thread.sleep(2000);
		for(int i=0;i<=12;i++) {
		Robot robot=new Robot();	
		robot.keyPress(KeyEvent.VK_BACK_SPACE);
		robot.keyRelease(KeyEvent.VK_BACK_SPACE);
		}
		Thread.sleep(2000);
		for(int i=0;i<=12;i++) {
		driver.findElement(HRSA).sendKeys(Keys.BACK_SPACE);
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(HRSA).sendKeys("BPSH80987654"+Keys.ENTER);
		wait.until(ExpectedConditions.invisibilityOf(waiting));
		driver.findElement(ruralbtn).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(nxtbtn).click();
	}
}

