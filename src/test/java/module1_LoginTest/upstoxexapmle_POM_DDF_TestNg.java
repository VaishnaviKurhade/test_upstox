package module1_LoginTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import libraryfile.POM_DDF_TestNG_BaseClass;
import libraryfile.POM_DDF_TestNG_UtilityClass;
import login.upstoxlogin1page;
import login.upstoxlogin2page;
import login.upstoxlogin3page;
import login.upstoxlogin4page;

public class upstoxexapmle_POM_DDF_TestNg extends POM_DDF_TestNG_BaseClass
{
	upstoxlogin1page obj1;
	upstoxlogin2page obj2;
	upstoxlogin3page obj3;
	upstoxlogin4page obj4;
	Sheet sh;
	int TestCaseID;
	@BeforeClass
	public void browseropen() throws IOException 
	{
		//open excel and get data
				FileInputStream file =new FileInputStream("D:\\configuration Eclipse\\sample_POM_DDF_upstox.xlsx");
				 sh = WorkbookFactory.create(file).getSheet("Sheet1");
				 initalizebrowser();
	
					obj1=new upstoxlogin1page(driver);
					obj2=new upstoxlogin2page(driver);
					obj3=new upstoxlogin3page(driver);
					obj4=new upstoxlogin4page(driver);
	}
	
	@BeforeMethod
	public void logintoapp() throws InterruptedException, IOException
	{
		//String UN = sh.getRow(0).getCell(0).getStringCellValue();
		obj1.setupstoxlogin1pageusernm(POM_DDF_TestNG_UtilityClass.getdatafrompropertiesfile("UN"));
		//String passwd = sh.getRow(0).getCell(1).getStringCellValue();
		obj1.setupstoxlogin1pagepassword(POM_DDF_TestNG_UtilityClass.getdatafrompropertiesfile("PWD"));
		obj1.clickupstoxlogin1pagebutton();
		
		//Thread.sleep(3000);
		//String pin = sh.getRow(0).getCell(2).getStringCellValue();
		obj2.setupstoxlogin2pagepin(POM_DDF_TestNG_UtilityClass.getdatafrompropertiesfile("PIN"));
		
		//Thread.sleep(3000);
		obj3.clickupstoxlogin3pagewelbtn();
		
	}
	@Test
	public void verifyUN() throws IOException
	{
		TestCaseID=500;
		//String Vuernm = sh.getRow(0).getCell(3).getStringCellValue();
		//obj4.varifyupstoxlogin4pageusername(Vuernm);
		String actusernm=obj4.varifyupstoxlogin4pageusername();//Akshay D.
		String extusername=POM_DDF_TestNG_UtilityClass.getTD(0, 3);
		Assert.assertEquals(actusernm, extusername,"failed:bez username are differnt");
	}
	@AfterMethod
	public void logouttoapp(ITestResult result) throws IOException
	{
		if(result.getStatus()==result.FAILURE)
		{
			POM_DDF_TestNG_UtilityClass.capturescreenshot(driver, TestCaseID);
		}
	}
	@AfterClass
	public void browserclose()
	{
		//driver.close();
		obj1=null;
		obj2=null;
		obj3=null;
		obj4=null;
		sh=null;
		driver=null;
		
	}
}
