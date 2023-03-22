package POM;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.LoginAndStart;

public class Tab6EID extends LoginAndStart {
	public static By Eid  =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_UCEINQuestion_dlQuestion_ctl00_rblYesNoQuestion_0");
	public static By Enum =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_radTextBoxTaxID");
	public static By add  =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_btnEINAdd");
	public static By nxtbtn=By.id("ctl00_ctl00_tjcPageNavigation_NextButton");
	public static By waitimg =By.id("ctl00_ctl00_cphBodyContent_imgLoading");
	
	public static void tab6eidfunction() throws Exception {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement Taxid=driver.findElement(Enum);
		Taxid.click();
		Robot robot=new Robot();
		for(int i=0;i<=9;i++) {
			robot.keyPress(KeyEvent.VK_BACK_SPACE);
			robot.keyRelease(KeyEvent.VK_BACK_SPACE);
		}
		Taxid.sendKeys("123-456789");
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(add).click();
		WebElement img=driver.findElement(waitimg);
		wait.until(ExpectedConditions.invisibilityOf(img));
		driver.findElement(nxtbtn).click();
		
		
	}
}
