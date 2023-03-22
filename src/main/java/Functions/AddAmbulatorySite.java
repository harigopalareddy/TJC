package Functions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.LoginAndStart;
import POM.Tab3AHC;
import POM.Tab5SD;
import POM.Tab5SDAHC;
import POM.Tab5SDAHCMD;
import POM.Tab5SDAHCsettings;
import POM.Tab6DIST;
import POM.Tab6HRSOPAHC;
import POM.Tab8AM;
import POM.Tab8OLD;
import POM.Tab8SS;

public class AddAmbulatorySite extends LoginAndStart {
	public static By click    =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_lbMissingInfo");
	public static By add      =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_btnSiteAdd");
	public static By AHCCB    =By.id("ctl00_ctl00_cphBodyContent_cphEappBodyContent_cblProgs_0");
	public static By waitimg  =By.id("ctl00_ctl00_cphBodyContent_imgLoading");
	public static By tab9     =By.id("ctl00_ctl00_tjcTopMenu_TopMenuItem8TopMenuLinkCell");
	public static By tab5     =By.id("ctl00_ctl00_tjcTopMenu_TopMenuItem4TopMenuLinkCell");
	public static By tab6     =By.id("ctl00_ctl00_tjcTopMenu_TopMenuItem5TopMenuLinkCell");
	public static By tab3     =By.id("ctl00_ctl00_tjcTopMenu_TopMenuItem2TopMenuLinkCell");
	public static By tab6dist =By.id("ctl00_ctl00_tjcLeftMenu_liListItemLeftRail0_liListSubItemLeftRail6_hylkListSubItemLeftRail");
	public static By tab6HOAMB=By.id("ctl00_ctl00_tjcLeftMenu_liListItemLeftRail0_liListSubItemLeftRail16_liListSub2ItemLeftRail0_hylkListSub2ItemLeftRail");
	public static By tab8     =By.id("ctl00_ctl00_tjcTopMenu_TopMenuItem7TopMenuLinkCell");


	public static void addsiteforambulatoryaftererror() throws Throwable {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(tab5).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(add).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(AHCCB).click();
		WebElement waiting=driver.findElement(waitimg);
		wait.until(ExpectedConditions.invisibilityOf(waiting));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Tab5SD.tab5sdfunction();
		Tab5SDAHC.tab5sdahcfunction();
		Tab5SDAHCsettings.tab5sdahcfunction();
		Tab5SDAHCMD.tab5sdahcmdfunctionS();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(tab9).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(click).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(tab6).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(tab6dist).click();
		Tab6DIST.tab6distfunctionwithambulatorysite();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(tab9).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(click).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(tab6).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(tab6HOAMB).click();
		Tab6HRSOPAHC.tab6hrsopahcfunction();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(tab9).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(click).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(tab3).click();
		Tab3AHC.tab3function();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(tab8).click();
		Tab8AM.tab8amfunction();
		Tab8OLD.tab8oldfunction();
		Tab8SS.programvalidation();
		Tab8SS.tab8ssfunction();
	}
	
	public static void addsiteforambulatory() throws Throwable {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.findElement(tab5).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(add).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(AHCCB).click();
		WebElement waiting=driver.findElement(waitimg);
		wait.until(ExpectedConditions.invisibilityOf(waiting));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Tab5SD.tab5sdfunction();
		Tab5SDAHC.tab5sdahcfunction();
		Tab5SDAHCsettings.tab5sdahcfunction();
		Tab5SDAHCMD.tab5sdahcmdfunctionS();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(tab3).click();
		Tab3AHC.tab3function();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(tab6).click();
		
	}
}



