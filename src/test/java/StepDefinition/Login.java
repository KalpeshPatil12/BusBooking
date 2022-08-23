package StepDefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Login {

	WebDriver driver;
    public LoginPage lp;
    
    
   @Given("user enter the url {string}")
   public void user_enter_the_url (String url) {
		
	   WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		lp = new LoginPage(driver);
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  
	}



	@Then("user verify login link is displayed")
	public void user_verify_login_link_is_displayed() {
		Assert.assertTrue(lp.verifyLoginLink());
	}


	@When("user click on login link")
	public void user_click_on_login_link() {
		lp.clickLoginLink();
	    
	}
	
	@Then("user verify Email\\/UserID text field is displayed")
	public void user_verify_email_user_id_text_field_is_displayed() {
		Assert.assertTrue(lp.verifyEmailTextField());
		
	}
	
	@When("user enter the Email in text text field as {string}")
	public void user_enter_the_email_in_text_text_field(String email) {
		lp.enterEmail(email);
	    
	}
	
	@Then("user verify password text field is displayed")
	public void user_verify_password_text_field_is_displayed() {
		Assert.assertTrue(lp.verifyPassTextField());
	    
	}
	
	@When("user enter the password in the text field as {string}")
	public void user_enter_the_password_in_the_text_field(String pass) {
		lp.enterPass(pass);
	    
	}
	
	@Then("user verify the password show button is displayed")
	public void user_verify_the_password_show_button_is_displayed() {
		Assert.assertTrue(lp.verifyShowPassButton());
		
	}
	
	@When("user click on show password button")
	public void user_click_on_show_password_button() {
		lp.clickShowPassButton();
		
	}
	
	@Then("user verify the Login button is displayed")
	public void user_verify_the_Login_button_is_displayed() {
		Assert.assertTrue(lp.verifyLoginButton());
		
	}
	
	@When("user click on login button")
	public void user_click_on_login_button() {
		lp.clickLoginButton();
		
	}
	
	@Then("user verify the forgot pass link")
	public void user_verify_the_forgot_pass_link() throws InterruptedException {
		Assert.assertTrue(lp.verifyForgotPassLink());
		Thread.sleep(3000);
		
	}
	
	@When("user click on forgot password link")
	public void user_click_on_forgot_password_link() {
		lp.clickForgotPassLink();
		
	}
	
	@Then("user verify reenter Email text field is displayed")
	public void user_verify_reenter_Email_text_field_is_displayed() {
		Assert.assertTrue(lp.verifyReEnterMailTextField());
		
	}
	
	@When("user reenter the Email as {string}")
	public void user_reenter_the_Email(String Email) {
		lp.reEnterMail(Email);
		
	}
	
	@Then("user verify reenter password button is displayed")
	public void user_verify_reenter_password_button_is_displayed() {
		Assert.assertTrue(lp.verifyRetrieveButton());
		
	}
	
	@When("user click on reenter password button")
	public void user_click_on_reenter_password_button() throws InterruptedException {
		lp.clickRetrieveButton();
		Thread.sleep(2000);
		
	}
	
	@When("user click on Ok option")
	public void user_click_on_Ok_option() {
		lp.clickOK();
		
	}
	
	@Then("user verify back to login button is displayed")
	public void user_verify_back_to_login_button_is_displayed() {
		Assert.assertTrue(lp.verifybackToButton());
		
	}
	
	@When("user click on back to login button")
	public void user_click_on_back_to_login_button() {
		lp.clicBackToButton();
		
	}
	
	@Then("user verify login with google button is displayed")
	public void user_verify_login_with_google_button_is_displayed() {
		Assert.assertTrue(lp.verifyLoginWithGoogleButton());
		
	}
	
	@When("user click on login with google button")
	public void user_click_on_login_with_google_button() {
		lp.clicLoginWithGoogleButton();
		
	}

	
	
}
