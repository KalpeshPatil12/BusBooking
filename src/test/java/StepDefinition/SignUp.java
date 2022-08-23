package StepDefinition;


import java.time.Duration;

import org.junit.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.SignUpPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;



public class SignUp {

	WebDriver driver;
	public SignUpPage lp;
	

	   @Given("user enter the url {string}")
	   public void user_enter_the_url (String url) {
			
		   WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			lp = new SignUpPage(driver);
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			  
		}


		@Then("user verify signup link is displayed")
		public void user_verify_signup_link_is_displayed() {
			Assert.assertTrue(lp.verifySignUpLink());
			
		}
		
		@When("user click on signup link")
		public void user_click_on_signup_link() {
		    lp.clickSignUpLink();
			
		}
		
		@When("user clik on signup option")
		public void user_clik_on_signup_option() {
		    lp.clickSignUpButton();
			
		}
		
		@Then("user verify contry code text field is displayed")
		public void user_verify_contry_code_text_field_is_displayed() {
			Assert.assertTrue(lp.verifyCountryCode());
			
		}
		
		@When("user enter the country code {string}")
		public void user_enter_the_country_code(String country) {
			lp.enterCountryCode(country);
			
		}
		
		@And("user select India country code")
		public void user_select_India_country_code() {
			lp.selectIndiaCode();
		}
		
		@Then("user verfy phone number text field is displayed")
		public void user_verfy_phone_number_text_field_is_displayed() {
			Assert.assertTrue(lp.verifyPhoneNumberTextField());
			
		}
		
		@When("user enter the phone number {string}")
		public void user_enter_the_phone_number(String num) {
		    lp.enterPhoneNumber(num);
			
		}
		
		@Then("user verify phone number button is displayed")
		public void user_verify_phone_number_button_is_displayed() {
			Assert.assertTrue(lp.verifyPhoneNumberbutton());
			
		}
		
		@When("user click on phone number button")
		public void user_click_on_phone_number_button() {
			lp.clickVerifyPhoneNumberButton();
			
		}
		
		@When("user enter the otp")
		public void user_enter_the_otp() {
			lp.enterOTP();
			
		}
		
		@Then("user verify the verify OTP button displayed")
		public void user_verify_the_verify_OTP_button_displayed() {
			Assert.assertTrue(lp.verifyOTPButton());
			
		}
		
		@When("user click on verify OTP button")
		public void user_click_on_verify_OTP_button() {
			lp.clickVerifyOTPButton();
			
		}
		
		@When("user click on Ok button")
		public void user_click_on_Ok_button() {
			
		}




	
}
