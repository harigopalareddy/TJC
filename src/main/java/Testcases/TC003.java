package Testcases;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import Base.LoginAndStart;
import Functions.AddAmbulatorySite;
import POM.Tab1Demographic;
import POM.Tab1ownership;
import POM.Tab2AHC;
import POM.Tab2ALC;
import POM.Tab2BHCH;
import POM.Tab2CAH;
import POM.Tab2HC;
import POM.Tab2HOME;
import POM.Tab2HOSP;
import POM.Tab2LAB;
import POM.Tab2NCC;
import POM.Tab2OBS;
import POM.Tab2RHC;
import POM.Tab3AHC;
import POM.Tab3BPHC;
import POM.Tab3RHC;
import POM.Tab4OE;
import POM.Tab4SO;
import POM.Tab4SR;
import POM.Tab5SS;
import POM.Tab6AD;
import POM.Tab6COI;
import POM.Tab6DIST;
import POM.Tab6EID;
import POM.Tab6HRAHC;
import POM.Tab6HRRHC;
import POM.Tab6HRSOPAHC;
import POM.Tab6HRSOPRHC;
import POM.Tab6OBSER;
import POM.Tab6OHR;
import POM.Tab6SURAMB;
import POM.Tab6TRAINS;
import POM.Tab7AM;
import POM.Tab8AM;
import POM.Tab8OLD;
import POM.Tab8SS;
import POM.Tab9;

@Ignore
public class TC003 extends LoginAndStart {
	public static void scenario3() throws Throwable {
	LoginAndStart.openapp("chrome");
	Tab1Demographic.tab1function();
	Tab1ownership.tab1ownwefunction();
	Tab2AHC.OPTAMBULATORY();
	Tab2ALC.LEAVEALC();
	Tab2BHCH.LEAVEBHLC();
	Tab2CAH.LEAVECAH();
	Tab2HC.LEAVEHC();
	Tab2HOME.LEAVEHOME();
	Tab2HOSP.LEAVEHOSP();
	Tab2LAB.LEAVELAB();
	Tab2NCC.LEAVENCC();
	Tab2OBS.LEAVEOBS();
	Tab2RHC.OPTRHC();
	Tab3BPHC.tab3function();
	Tab3RHC.tab3function();
	Tab4OE.tab4function();
	Tab4SO.tab4function();
	Tab4SR.tab4function();
	Tab5SS.sitedetails();
	AddAmbulatorySite.addsiteforambulatory();
	Tab6AD.tab6adfunction();
	Tab6COI.tab6coifunction();
	Tab6EID.tab6eidfunction();
	Tab6DIST.tab6distfunctionwithambulatorysite();
	Tab6OBSER.tab6obserfunction();
	Tab6SURAMB.tab6surambfunction();
	Tab6TRAINS.tab6trainsfunction();
	Tab6OHR.tb6ohrfunction();
	Tab6HRAHC.tab6hrahcfunction();
	Tab6HRRHC.tab6hrrhcfunction();
	Tab6HRSOPAHC.tab6hrsopahcfunction();
	Tab6HRSOPRHC.tab6hrsoprhcfunction();
	Tab7AM.tab7amfunction();
	Tab8AM.tab8amfunction();
	Tab8OLD.tab8oldfunction();
	Tab8SS.programvalidation();
	Tab8SS.tab8ssfunction();
	driver.quit();
	}
}
