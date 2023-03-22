package POM;

import java.time.Duration;

import org.openqa.selenium.By;

import Base.LoginAndStart;

public class Tab7AM extends LoginAndStart{
public static By nxtbtn=By.id("ctl00_ctl00_tjcPageNavigation_NextButton");
public static By rural =By.xpath("//td[@class='gridViewCell']");
public static By click=By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_lbMissingInfo");
public static By text =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_rgMissingInfo_ctl00_ctl04_lblRuleMessage");
	
	public static void tab7amfunction() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(nxtbtn).click();
	}
	
	public static void ruralhealthvalidationwithambsite() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(nxtbtn).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String ruralhealthvalidationtext=driver.findElement(rural).getText();
		if(ruralhealthvalidationtext.contentEquals("Rural Health Clinic")) {
			System.out.println("Rural Health care validation successfull ");
		}
		
		
	}
	
	public static void errorinambulatorysite() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(click).click();
		String errorinambulatoryservice=driver.findElement(text).getText();
		if(errorinambulatoryservice.contains("Ambulatory Health Care service/program has not been provided")) {
			System.out.println("Error in Ambulatory Service");
			
		}
	}

}
