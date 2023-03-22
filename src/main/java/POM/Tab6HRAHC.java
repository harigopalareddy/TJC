package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.LoginAndStart;

public class Tab6HRAHC extends LoginAndStart {
	public static By EPR      =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_UCHealthRecPrgQuestion_dlQuestion_ctl01_rbQuestion");
	public static By VN       =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_tbxHealthRecordVendors");
	public static By APPVER   =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_tbxApplication");
	public static By ADD      =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_btnVendorAdd");
	public static By waitimg  =By.id("ctl00_ctl00_cphBodyContent_imgLoading");
	public static By nxtbtn   =By.id("ctl00_ctl00_tjcPageNavigation_NextButton");
	
	public static void tab6hrahcfunction() {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.findElement(EPR).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(VN).sendKeys("hrmsorg");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(APPVER).sendKeys("1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(ADD).click();
		WebElement img=driver.findElement(waitimg);
		wait.until(ExpectedConditions.invisibilityOf(img));
		driver.findElement(nxtbtn).click();
		
		
	}

}
