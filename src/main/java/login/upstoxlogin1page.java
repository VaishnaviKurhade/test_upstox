package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class upstoxlogin1page
{
	//regular class i.e main method not present
	//declaration of variable globally
	@FindBy(xpath = "//input[@name='userId']") private WebElement UN;//private WebElement UN=driver.findElelent((By.xpath(""));
	@FindBy(xpath="//input[@name='password']")private WebElement PWD;//WebElement PWD=driver.findElelent((By.xpath(""));
	@FindBy(xpath = "//div[text()='Sign into Upstox']") private WebElement sinbtn;//WebElement sinbtn=driver.findElelent((By.xpath(""));
	
	//setp2: Initialize within a constructor with access level public using pagefactory class 
	public upstoxlogin1page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//setp3:Utilize within a method with access level public 
	
	public void setupstoxlogin1pageusernm(String usernm)
	{
		UN.sendKeys(usernm);
	}
	
	public void setupstoxlogin1pagepassword(String Password)
	{
		PWD.sendKeys(Password);
	}
	public void clickupstoxlogin1pagebutton()
	{
		sinbtn.click();
	}
	
}
