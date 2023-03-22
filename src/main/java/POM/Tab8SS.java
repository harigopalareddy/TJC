package POM;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Base.LoginAndStart;

public class Tab8SS extends LoginAndStart{
public static By nxtbtn =By.id("ctl00_ctl00_tjcPageNavigation_NextButton");
public static By totrows=By.xpath("html/body/form/div[3]/div[5]/div[2]/div[1]/div[6]/div[3]/div[2]/div/table/tbody/tr");	
	public static void tab8ssfunction() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(nxtbtn).click();
	}
	
	public static void programvalidation() {
		List<WebElement> programs=driver.findElements(totrows);
		int rows=programs.size();
		for(int i=2;i<=rows;i++ ) {
			String text=driver.findElement(By.xpath("//*[@id='ctl00_ctl00_cphBodyContent_cphEappBodyContent_gvSites']/tbody/tr["+i+"]/td[4]")).getText();
			if(text.equalsIgnoreCase("Rural Health Clinic")) {
				System.out.println("Rural health care validation successfull");
			}
			if(text.equalsIgnoreCase("Ambulatory Health Care")) {
				System.out.println("Ambulatory Health care validation successfull ");
			}
		}
	
	}

}
