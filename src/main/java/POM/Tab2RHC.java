package POM;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.LoginAndStart;

public class Tab2RHC extends LoginAndStart {
	public static By YESRHC=By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_rdoPrgRhc_0");
	public static By NORHC =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_rdoPrgRhc_1");
	public static By nxtbtn=By.id("ctl00_ctl00_tjcPageNavigation_NextButton");
	public static By txtbox=By.xpath("//div[@class='ui-dialog-content ui-widget-content']//following::p");
	public static By prgms =By.xpath("//li[@class='tjcLeftSubMenuCellCompleted']");
	public static By tab2  =By.id("ctl00_ctl00_tjcTopMenu_TopMenuItem1TopMenuLinkCell");
	public static By nonprg=By.xpath("//li[@class='tjcLeftSubMenuCellNormal']");
	public static By rurbtn=By.id("ctl00_ctl00_tjcLeftMenu_liListItemLeftRail0_liListSubItemLeftRail9_hylkListSubItemLeftRail");
	public static By okbtn =By.xpath("//span[text()='Ok']");
	public static By tab3  =By.id("ctl00_ctl00_tjcTopMenu_TopMenuItem2TopMenuLinkCell");
	public static By FAHC  =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_ucQuestionAHCNewYorkDOH_dlQuestion_ctl00_rblYesNoQuestion_1");
	
	public static void OPTRHC(){
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(YESRHC).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(nxtbtn).click();
		
	}
	
	
	
	public static void RHCvalidation() {
		driver.findElement(NORHC).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement dialoguebox=driver.findElement(txtbox);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(dialoguebox));
		msginRHCdialougebox=dialoguebox.getText();
		if(msginRHCdialougebox.equalsIgnoreCase(msg)) {
			System.out.println("Rural Heath Clinic cannot be removed.Message Displayed:"+msginRHCdialougebox);
			driver.findElement(okbtn).click();
			}
		else {
			System.out.println("Rural Health Validation failed : ERROR IN TEXT OR NO TEXT" );
			driver.quit();
			}
		
		}
	
	
	public static void selectedpragrammesintab2() throws Throwable {
		driver.findElement(tab2).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(rurbtn).click();
		List<WebElement> nonselectedprogram=driver.findElements(nonprg);
		String text1=nonselectedprogram.get(0).getText();
		if(text1.contains("Ambulatory Health Care")) {
			driver.findElement(tab2).click();
			List<WebElement> progs=driver.findElements(prgms);
			int l=progs.size();
			for(int i=0;i<l;i++ ) {
				programsselectedintab2.add(progs.get(i).getText());
			}
			
		}
		else {
			driver.findElement(tab2).click();
			List<WebElement> nonselectedprograms=driver.findElements(nonprg);
			nonselectedprograms.get(0).click();
			List<WebElement> progs=driver.findElements(prgms);
			int l=progs.size();
			for(int i=0;i<l;i++ ) {
				programsselectedintab2.add(progs.get(i).getText());
			}
			
		}
		
		if(programsselectedintab2.contains("Ambulatory Health Care"+"\n"+"PCMH Certification")) {
			programsselectedintab2.remove("Ambulatory Health Care"+"\n"+"PCMH Certification");
			programsselectedintab2.add("Ambulatory Health Care");
		}
		
		if(programsselectedintab2.contains("Nursing Care Center"+"\n"+"Certification")){
			programsselectedintab2.remove("Nursing Care Center"+"\n"+"Certification");
			programsselectedintab2.add("Nursing Care Center");
		}

		if(programsselectedintab2.contains("Laboratory")) {
			programsselectedintab2.remove("Laboratory");
		}

		if(programsselectedintab2.contains("Behavioral Health Care and Human Services"+"\n"+"Certification")) {
			programsselectedintab2.remove("Behavioral Health Care and Human Services"+"\n"+"Certification");
			programsselectedintab2.add("Behavioral Health Care and Human Services");
		}

		if(programsselectedintab2.contains("Critical Access Hospital"+"\n"+"PCMH Certification")) {
			programsselectedintab2.remove("Critical Access Hospital"+"\n"+"PCMH Certification");
			programsselectedintab2.add("Critical Access Hospital");
		}

		if(programsselectedintab2.contains("Hospital"+"\n"+"PCMH Certification")) {
			programsselectedintab2.remove("Hospital"+"\n"+"PCMH Certification");
			programsselectedintab2.add("Hospital");
		}

		Collections.sort(programsselectedintab2);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(tab3).click();
		}
	}
	

	

	