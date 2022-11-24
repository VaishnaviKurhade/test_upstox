package libraryfile;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POM_DDF_TestNG_BaseClass 
{
		//globally declare
	     public WebDriver driver;
		//auther name=@swapnil
		//base class consist of mandatory code run everytime like open browser
		//
		public void initalizebrowser() throws IOException
		{
			System.setProperty("webdriver.chrome.driver", "D:\\configuration Eclipse\\chromedriver.exe");
		    driver=new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
			driver.manage().window().maximize();
			//go to upstox URL
			//driver.get("https://login-v2.upstox.com/");
			driver.get(POM_DDF_TestNG_UtilityClass.getdatafrompropertiesfile("URL"));
		}
}
