package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class upstoxlogin3page 
{
	//regular class i.e main method not present
	//declaration of variable globally
	@FindBy(xpath="//div[text()='No, I’m good']")private WebElement welbtn;
	 
	//setp2:Initialize within a constructor with access level public using pagefactory class 
      public upstoxlogin3page(WebDriver driver)
      {
    	  PageFactory.initElements(driver, this);
      }
    //step3:Utilize within a method with access level public
     public void clickupstoxlogin3pagewelbtn()
     {
    	 welbtn.click();
     }
}
