package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class upstoxlogin2page 
{
	//regular class i.e main method not present
	//declaration of variable globally
  @FindBy(xpath="//input[@name='yob']")	private WebElement PIN;//private WebElement PIN=driver.findElement(By.xpath(""));
  
  //setp2:Initialize within a constructor with access level public using pagefactory class 

 public upstoxlogin2page(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }
 //step3:Utilize within a method with access level public
 
 public void setupstoxlogin2pagepin(String passcode)
 {
	 PIN.sendKeys(passcode);
 }
}
