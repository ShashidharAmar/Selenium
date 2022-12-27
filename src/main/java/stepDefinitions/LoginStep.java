package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class LoginStep {
	
	WebDriver driver;
	
	@Given("user Lanch chrome browser")
	public void user_lanch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\CommerceCucumber\\drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
	     
	}

	@When("user opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);
	  
	}

	@When("user enters Email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String username, String password) {
		
		WebElement Username = driver.findElement(By.xpath("//input[@id='Email']"));
		Username.clear();
		Username.sendKeys(username);
		WebElement Password = driver.findElement(By.xpath("//input[@id='Password']"));
		Password.clear();
		Password.sendKeys(password);
	    
	}

	@When("Click on login")
	public void click_on_login() throws InterruptedException {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
	    
	}

	@Then("Homepage title should be {string}")
	public void page_title_should_be(String Hptitle) {
		
		if(Hptitle.equals(driver.getTitle()))
		{
			System.out.println("HomePage Title = "+driver.getTitle());
		}
		else
		{
			System.out.println("Title is not matching");
			driver.close();
		}
	     
	}

	@When("user click on log out link")
	public void user_click_on_log_out_link() {
	
		driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
	     
	}

	@Then("Loginpage should be {string}")
	public void page_should_be(String Lptitle) {
		
		if(driver.getTitle().equalsIgnoreCase(Lptitle))
		{
			System.out.println("LoginPage Title = "+driver.getTitle());
		}
		else
		{
			System.out.println("Login Titleis not matching");
			driver.close();
		}
	    
	}

	@Then("Close the browser")
	public void close_the_browser() {
	    
		driver.quit();
	}


}
