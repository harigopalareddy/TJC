package POM;

import java.time.Duration;

import org.openqa.selenium.By;

import Base.LoginAndStart;

public class Tab6TRAINS extends LoginAndStart {
	public static By iss     =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_txtSecurityInst");
	public static By ins     =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_txtParkingInst");
	public static By survs   =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_txtSurveyorAssemInst");
	public static By accoms  =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_txtHotelInst");
	public static By comm    =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_txtHotelInst");
	public static By nxtbtn=By.id("ctl00_ctl00_tjcPageNavigation_NextButton");
	
	public static void tab6trainsfunction() {
		driver.findElement(iss).clear();
		driver.findElement(iss).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(iss).sendKeys("test 1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(ins).clear();
		driver.findElement(ins).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(ins).sendKeys("test 2");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(survs).clear();
		driver.findElement(survs).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(survs).sendKeys("test 3");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(accoms).clear();
		driver.findElement(accoms).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(accoms).sendKeys("test 4");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(comm).clear();
		driver.findElement(comm).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(comm).sendKeys("testing summary");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(nxtbtn).click();
	}

}
