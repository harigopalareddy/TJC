package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.LoginAndStart;

public class Tab3AHC extends LoginAndStart {
	public static By FAHC=By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucQuestionAHCNewYorkDOH_dlQuestion_ctl00_rblYesNoQuestion_1");
	public static By nxtbtn=By.id("ctl00_ctl00_tjcPageNavigation_NextButton");

	public static void tab3function() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(FAHC).click();
		driver.findElement(FAHC).click();
		WebElement AHC=driver.findElement(FAHC);
		wait.until(ExpectedConditions.elementToBeSelected(AHC));
		driver.findElement(FAHC).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(nxtbtn).click();
	}

}
