package libraryfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class POM_DDF_TestNG_UtilityClass 
{						 //getTD(0,0)
			//auther name=@swapnil
			//getTD takes two argument like 1.rowindex,2.cell index
			//GetTD used to fetch the data from Excel Sheet
	public static String getTD(int rowindex,int cellindex) throws IOException
	{
		FileInputStream file =new FileInputStream("D:\\configuration Eclipse\\sample_POM_DDF_upstox.xlsx");
		 Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		 		String value = sh.getRow(rowindex).getCell(cellindex).getStringCellValue();
		 		return value;	 		
	}
	
	public static void capturescreenshot(WebDriver driver,int TestcaseID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\velocity\\backupeclipse\\eclipse-workspace 26oct22\\selenium5\\ScreenShot1\\TCID"+TestcaseID+".jpeg");
		FileHandler.copy(src, dest);
	}
	
	public static String getdatafrompropertiesfile(String Key) throws IOException
	{
		FileInputStream file=new FileInputStream("D:\\velocity\\backupeclipse\\eclipse-workspace 26oct22\\selenium5\\upstoxpropertiesfile.properties");
		
		Properties p=new Properties();
		p.load(file);
		String value = p.getProperty(Key);
		return value;
	}
}
