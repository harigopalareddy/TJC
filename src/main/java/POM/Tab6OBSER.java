package POM;

import java.time.Duration;

import org.openqa.selenium.By;

import Base.LoginAndStart;

public class Tab6OBSER extends LoginAndStart {
	public static By CB2=By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_UCObserversQuestion_dlQuestion_ctl01_cbQuestion");
	public static By CB3=By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_UCObserversQuestion_dlQuestion_ctl02_cbQuestion");
	public static By nxtbtn=By.id("ctl00_ctl00_tjcPageNavigation_NextButton");

	public static void tab6obserfunction() {
		driver.findElement(CB2).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(CB2).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(CB3).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(CB3).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(nxtbtn).click();
		
	}
	
}
