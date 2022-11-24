package CucumberStepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Login_Steps {
	WebDriver driver;
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Automation\\2JulyABatchmaven-20221116T110949Z-001\\2JulyABatchmaven\\browser\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://login-v2.upstox.com");
	    System.out.println("login page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		driver.findElement(By.xpath("//input[@name=\"userId\"]")).sendKeys("6WB5CZ");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Vaishnavi@31");
		
	    System.out.println("enter username and password");
	}

	@And("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//button[@id=\"submit-btn\"]")).click();
	   System.out.println("click");
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() throws InterruptedException {
	   System.out.println("home page");
	   Thread.sleep(3000);
	   driver.close();
	}
}
