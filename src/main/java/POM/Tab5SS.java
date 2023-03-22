package POM;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.LoginAndStart;

public class Tab5SS extends LoginAndStart  {
	public static By webtable=By.xpath("//*[@id=\"ctl00_ctl00_cphBodyContent_cphEappBodyContent_dlProgs\"]/tbody/tr[1]/td[1]");
	public static By tablerow=By.xpath("//*[@id=\"ctl00_ctl00_cphBodyContent_cphEappBodyContent_dlProgs\"]/tbody/tr");
	public static By tablecol=By.xpath("//*[@id=\"ctl00_ctl00_cphBodyContent_cphEappBodyContent_dlProgs\"]/tbody/tr[1]/td");
	public static By nxtbtn=By.id("ctl00_ctl00_tjcPageNavigation_NextButton");
	public static By check =By.xpath("//input[@checked='checked']//following-sibling::label");



	public static void tab5ssfunction() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(nxtbtn).click();
	}




	public static void programsinsiteinfo() {
		List<WebElement> totalrows=driver.findElements(tablerow);
		int row=totalrows.size();
		List<WebElement> totalcolumns=driver.findElements(tablecol);
		int col=totalcolumns.size();
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=col;j++) {
				if(i==3&&j==3) {
					break;
				}
				else {
					programsdisplayedinsiteinfo.add(driver.findElement(By.xpath("//*[@id=\"ctl00_ctl00_cphBodyContent_cphEappBodyContent_dlProgs\"]/tbody/tr["+i+"]/td["+j+"]")).getText());
				}
			}
		}
		programsdisplayedinsiteinfo.removeAll(Arrays.asList("", null));
		Collections.sort(programsdisplayedinsiteinfo);
	}



	public static void sitedetails() throws Exception {
		List<WebElement> rowsbeforedel=driver.findElements(By.xpath("/html/body/form/div[3]/div[5]/div[2]/div[1]/div[11]/div/div[2]/div[2]/div/table/tbody/tr"));
		int j=rowsbeforedel.size();
		for(int i=0;i<j;i++) {
			List<WebElement> programnames=driver.findElements(By.xpath("//*[@id='ctl00_ctl00_cphBodyContent_cphEappBodyContent_rgSites_ctl00__"+i+"']/td[5]"));
			if(driver.findElement(By.xpath("//*[@id='ctl00_ctl00_cphBodyContent_cphEappBodyContent_rgSites_ctl00__"+i+"']/td[5]")).getText().equalsIgnoreCase(" ")) {
				driver.findElement(By.xpath("//*[@id='ctl00_ctl00_cphBodyContent_cphEappBodyContent_rgSites_ctl00__"+i+"']/td[7]")).click();
				driver.findElement(By.xpath("//span[text()='Yes']")).click();
				programnames.clear();
				i=i-i;
				j=j-1;
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			}
		}
		driver.findElement(nxtbtn).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		for(int i=1;i<=j;i++) {
			List<WebElement> siteprg=driver.findElements(check);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			String siteprogram=siteprg.get(0).getText();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			if(programsdisplayedinsiteinfo.contains(siteprogram)) {
				if(siteprogram.equalsIgnoreCase("Ambulatory Health Care")) {
					Tab5SD.tab5sdfunction();
					Tab5SDAHC.tab5sdahcfunction();
					Tab5SDAHCsettings.tab5sdahcfunction();
					Tab5SDAHCMD.tab5sdahcmdfunctionS();
				}
				if(siteprogram.equalsIgnoreCase("Rural Health Clinic")) {
					Tab5SDRHC2.tab5sdrhcfunction();
					Tab5SDRHC.tab5sdrhcfunction();
				}
				if(siteprogram.equalsIgnoreCase(" Rural Health Clinic")) {
					Tab5SDRHC2.tab5sdrhcfunction();
					Tab5SDRHC.tab5sdrhcfunction();
				}

			}
			else {
				Tab5SD3.tab5sd3fuction();

			}
		}
	}
}
