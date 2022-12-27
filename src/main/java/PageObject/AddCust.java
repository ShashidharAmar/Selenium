package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCust {

	WebDriver driver;

	public AddCust(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@id=\"Email\"]")
	WebElement txtUsername;

	@FindBy(xpath = "//input[@id=\"Password\"]")
	WebElement txtPassword;

	@FindBy(xpath = "//button[@type=\"submit\"]")
	WebElement ClickOnLogin;

	@FindBy(xpath = "//a[@href='#']//p[contains(text(),\"Customers\")]")
	WebElement clickOnCustomer;

	@FindBy(xpath = "//a[@href='/Admin/Customer/List']//p[contains(text(),'Customers')]")
	WebElement clickOnSubCust;

	@FindBy(xpath = "//a[@class=\"btn btn-primary\"]")
	WebElement addNew;

	@FindBy(xpath = "//input[@id=\"Email\"]")
	WebElement txtEmail;

	@FindBy(xpath = "//input[@id=\"FirstName\"]")
	WebElement firstname;

	@FindBy(xpath = "//input[@id='LastName']")
	WebElement lastname;

	@FindBy(xpath = "//button[@name='save']")
	WebElement clickonSave;

	public void txtUsername(String username) {
		txtUsername.clear();
		txtUsername.sendKeys(username);
	}

	public void txtPassword(String password) {
		txtPassword.clear();
		txtPassword.sendKeys(password);
	}

	public void ClickOnLogin() {
		ClickOnLogin.click();
	}

	public void clickOnCustomer() {
		clickOnCustomer.click();

	}

	public void clickOnSubCust() throws InterruptedException {

		Thread.sleep(3000);
		clickOnSubCust.click();
	}

	public void addNew() {
		addNew.click();
	}

	public void txtEmail() {
		txtEmail.sendKeys("shashidhar@gamil.com");
	}

	public void firstname() {
		firstname.sendKeys("shashidhar");
	}

	public void lastname() {
		lastname.sendKeys("Amarannavar");
	}

	public void clickonSave() {
		clickonSave.click();
	}

}
