package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.LoginAndStart;

public class Tab2AHC extends LoginAndStart{
	public static By YESAHC=By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_rdoPrgAhc");
	public static By NOAHC =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_rdoPrgAhc_1");
	public static By dental=By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucSelAhcPrgs_dlService_ctl00_cbService");
	public static By pcmh  =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucPCMH_dlQuestion_ctl00_rblYesNoQuestion_1");
	public static By nxtbtn=By.id("ctl00_ctl00_tjcPageNavigation_NextButton");
	public static By nodiag=By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucrblSelNo_dlQuestion_ctl00_lblYesNoQuestionDesc");
	public static By noOFB =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucrblSelNo_dlQuestion_ctl00_rblYesNoQuestion_1");
	public static By Okbtn =By.xpath("//span[text()='Ok']");
	public static By Yesbtn=By.xpath("//span[text()='Yes']");
	public static By err   =By.xpath("//div[@id='divDiscard']");
	public static By cancel=By.xpath("//span[text()='Cancel']");


	public static void OPTAMBULATORY() throws InterruptedException {
		driver.findElement(YESAHC).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(dental).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(pcmh).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(nxtbtn).click();
		if(driver.findElement(err).isDisplayed()) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.findElement(cancel).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.findElement(dental).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.findElement(pcmh).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.findElement(nxtbtn).click();
		}
	}


	public static void LEAVEAMBULATORY(){
		driver.findElement(NOAHC).click();
		WebElement nodialoguebox=driver.findElement(nodiag);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		if(nodialoguebox.isDisplayed()) {
			driver.findElement(noOFB).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(Okbtn).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(Yesbtn).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.findElement(nxtbtn).click();
		}
		else {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(nxtbtn).click();
		}
		
	}
}
