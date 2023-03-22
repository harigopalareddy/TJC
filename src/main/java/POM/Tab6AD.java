package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.LoginAndStart;

public class Tab6AD extends LoginAndStart {
	public static By AD      =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_rbAttestation_0");
	public static By date1   =By.xpath("//td[@title='Sunday, April 09, 2023']");
	public static By date2   =By.xpath("//td[@title='Monday, April 10, 2023']");
	public static By waitimg =By.id("ctl00_ctl00_cphBodyContent_imgLoading");
	public static By nxtbtn  =By.id("ctl00_ctl00_tjcPageNavigation_NextButton");
	
	public static void tab6adfunction() {
		driver.findElement(AD).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement date9=driver.findElement(date1);
		WebElement img=driver.findElement(waitimg);
		wait.until(ExpectedConditions.elementToBeClickable(date9));
		driver.findElement(date1).click();
		wait.until(ExpectedConditions.invisibilityOf(img));
		driver.findElement(date1).click();
		wait.until(ExpectedConditions.invisibilityOf(img));
		WebElement date10=driver.findElement(date2);
		wait.until(ExpectedConditions.elementToBeClickable(date10));
		wait.until(ExpectedConditions.invisibilityOf(img));
		driver.findElement(date2).click();
		wait.until(ExpectedConditions.invisibilityOf(img));
		driver.findElement(nxtbtn).click();
		

	}

}
