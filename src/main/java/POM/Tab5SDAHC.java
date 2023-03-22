package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.LoginAndStart;

public class Tab5SDAHC extends LoginAndStart {
	public static By SDAHC    =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucQuestionAHCDesc2_dlQuestion_ctl00_rbQuestion");
	public static By avghrs   =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_tbOpenHours");
	public static By Liscprac =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_tbLIP");
	public static By exclscpra=By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucQuestionFTE_dlQuestion_ctl00_tbTBQuestion");
	public static By liscstaff=By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucQuestionLCS_dlQuestion_ctl00_tbTBQuestion");
	public static By procedure=By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucQuestionPA_dlQuestion_ctl00_cbQuestion");
	public static By lfccb    =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucQuestionLSC_dlQuestion_ctl00_dlAttribute1_ctl01_rbAttribute");
	public static By nxtbtn   =By.id("ctl00_ctl00_tjcPageNavigation_NextButton");
	
	public static void tab5sdahcfunction() throws Exception {
		driver.findElement(SDAHC).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(avghrs).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(avghrs).sendKeys("203");
		driver.findElement(Liscprac).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(Liscprac).sendKeys("30");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(exclscpra).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(exclscpra).sendKeys("5");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(liscstaff).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(liscstaff).sendKeys("5");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(procedure).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(procedure).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(lfccb).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(nxtbtn).click();
		
	}
	
}
