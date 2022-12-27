package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.AddCust;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class BaseLogin {
	
	public WebDriver driver;
	public AddCust Addcustomer;
	
	
	
	@Given("user4 Lanch chrome browser")
	public void user_lanch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\CommerceCucumber\\drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		 Addcustomer=new AddCust(driver);
	     
	}
	
	@When("user4 opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);
	  
	}

	@When("user4 enters Email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String username, String password) {
		
		System.out.println(username+"          "+ password);
	
		Addcustomer.txtUsername(username);
		Addcustomer.txtPassword(password);
	    
	}

	@When("Click on login4")
	public void click_on_login() throws InterruptedException {

		Addcustomer.ClickOnLogin();
		Thread.sleep(3000);
	    
	}

	@Then("Homepage4 title should be {string}")
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
	
	
//	Scenario: Add new customers
	
	@Then("click on customer button")
	public void user_click_on_customer_button() throws InterruptedException {
	    Thread.sleep(3000);
	   
		Addcustomer.clickOnCustomer();
	}

	@Then("click on customer sub menu button4")
	public void click_on_customer_sub_menu_button() throws InterruptedException {
		Addcustomer.clickOnSubCust();
	}

	@Then("Click on add new customer4")
	public void click_on_add_new_customer() {
		Addcustomer.addNew();
	}

	@Then("fill all mondatary detail")
	public void fill_all_mondatary_details() {
		Addcustomer.txtEmail();
		Addcustomer.firstname();
		Addcustomer.lastname();
		
	}

	@Then("click on save button4")
	public void click_on_save_button() {
		Addcustomer.clickonSave();
	}

	@Then("Clocse the browser4")
	public void clocse_the_browser() {
		driver.quit();
		
	}


}
