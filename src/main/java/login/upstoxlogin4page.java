package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class upstoxlogin4page
{
	//regular class i.e main method not present
	//declaration of variable globally
	@FindBy(xpath="//span[text()='akshay d.']")private WebElement Usrnm;
	//setp2:Initialize within a constructor with access level public using pagefactory class 
    public upstoxlogin4page(WebDriver driver)
    {
  	  PageFactory.initElements(driver, this);
    }
  //step3:Utilize within a method with access level public
//   public void varifyupstoxlogin4pageusername(String extid)
//   {
//	   String actid=Usrnm.getText();
//		boolean result = actid.equals(extid);
//		System.out.println("Result:"+result);
//		
//		if(result=true)
//		{
//			System.out.println("TC PASS :Valid Usr");
//		}
//		else
//		{
//		System.out.println("TC Fail :inValid Usr");
//		}	
//   }
    public String varifyupstoxlogin4pageusername()
    {
    	String userID = Usrnm.getText();
    	return userID;
    }
}
