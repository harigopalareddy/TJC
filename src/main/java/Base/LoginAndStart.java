package Base;


import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Base64;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginAndStart {
	public static By username=By.id("MainContent__login_UserName");
	public static By password=By.id("MainContent__login_Password");
	public static By loginbtn=By.id("MainContent__login_LoginButton");
	public static By startbtn=By.id("ctl00_cphContentArea_imgbtnStartApp");
	public static String msginRHCdialougebox;
	public static String msg  ="Please contact your Account Executive. The Rural Health Clinic service option must be removed by your Account Executive due to the Deemed Status selection and information within your application.";
	public static ArrayList<String>  programsselectedintab2=new ArrayList<String>();
	public static ArrayList<String> programsdisplayedinsiteinfo=new ArrayList<String>();
	public static String RuralHealthClinicValidation=null;
	static String path;
	static FileInputStream fs;
	static XSSFWorkbook  wb;
	static XSSFSheet s;
	public static int i,rows;
	public static WebDriver driver;


	public static String data(int r,int c) throws Throwable {
		fs=new FileInputStream(path+"\\utils\\TJCdata.xlsx");
		wb=new XSSFWorkbook(fs);
		s=wb.getSheet("Sheet1");
		rows=s.getLastRowNum();
		XSSFCell cell=s.getRow(r).getCell(c);
		if(cell.getCellType()==cell.CELL_TYPE_NUMERIC) {
			int  num=(int) cell.getNumericCellValue();
			String data=String.valueOf((int)num);
			return data;
		}
		if(c==1) {
			String data1=cell.getStringCellValue();
			byte[] decrypt=Base64.getDecoder().decode(data1);
			String data=new String(decrypt);
			return data;
		}
		String data = s.getRow(r).getCell(c).getStringCellValue();
		return data;
	}

	public static void openapp(String Browser) throws Throwable {
		path=System.getProperty("user.dir");
		if(Browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver","TJC\\utils\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		if(Browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", path+"\\utils\\msedgedriver.exe");
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://uateapp.jointcommission.org/EappWeb/pages/dashboard.aspx?Id=337848");
		driver.findElement(username).sendKeys(data(1,0));
		driver.findElement(password).sendKeys(data(1,1));
		driver.findElement(loginbtn).click();
		driver.findElement(startbtn).click();
	}
}
