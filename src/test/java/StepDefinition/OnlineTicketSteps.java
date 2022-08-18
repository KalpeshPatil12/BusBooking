package StepDefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.OnlineTicketPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OnlineTicketSteps {

	WebDriver driver;
	public OnlineTicketPage lp;
	
	
		@Given("user enter url {string}")
		public void user_enter_url(String url) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			lp = new OnlineTicketPage(driver);
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
		    
		}
		@Then("user verify the home page title") 
		public void user_verify_the_home_page_title() {
		//	Assert.assertTrue(lp.verifyTitle());
			lp.verifyTitle();
			
		}
		
		@Then("user verify origin text field is displayed")
		public void user_verify_origin_text_field_is_displayed() {
			Assert.assertTrue(lp.verifyOriginPoint());
			
			
		}
		
		@When("user enter origin point in text field")
		public void user_enter_origin_point_in_text_field() {
			
			lp.setOrigin();
			lp.enterOrigin();
			
		}
		
		@Then("user verify destination text field is displayed")
		public void user_verify_destination_text_field_is_displayed() {
			Assert.assertTrue(lp.verifyDestinationPoint());
			
		}
		
		@When("user enter destination point in text field")
		public void user_enter_destination_point_in_text_field() {
			
			lp.setDestination();
			lp.enterDestination();
			
		}
		
		@Then("user verify Depart Date text field is displayed")
		public void user_verify_Depart_Date_text_field_is_displayed() {
			Assert.assertTrue(lp.verifyDepartDate());
			
		}
		
		@When("user select the next month date")
		public void user_select_the_next_moth_date() {
			lp.setDate();
			lp.enterDate();
			
		    
		}
		
		@Then("user verfy search button is displayed")
		public void user_verfy_search_button_is_displayed() {
			Assert.assertTrue(lp.verifySearchButton());
		}
		
		@When("user click on search bus")
		public void user_click_on_search_bus() {
			lp.clickSearchBus();
			
		    
		}
		
		@Then("user verify cheapest button is displayed")
		public void user_verify_cheapest_button_is_displayed() {
			Assert.assertTrue(lp.verifyCheapestButton());
		}
		
		@When("user select cheapest option")
		public void user_select_cheapest_option() {
			lp.clickCheapestOption();
			
		}
		
		@Then("user verify select option is visible")
		public void user_verify_select_option_is_visible() {
			Assert.assertTrue(lp.verifySelectOption());
		}
		
		@When("user click on select option")
		public void user_click_on_select_option() {
			lp.clickSelectOption();
			
			
		}
		
		@Then("user verify seat is available or not")
		public void user_verify_seat_is_available_or_not() {
			Assert.assertTrue(lp.verifySetAvalability());
			
		}
		
		@When("user select one seat")
		public void user_select_one_seat() {
			lp.selectSeat1();
			
		}
		
		@Then("user verify proceed button is displayed")
		public void user_verify_proceed_button_is_displayed() {
			Assert.assertTrue(lp.verifyProceedButton());
		}

	    @When("user click on proceed button")
		public void user_click_on_proceed_button() {
			 lp.clickProceedButton();
			 
		}
	    
	    @Then("user verify full name text field displayed")
	    public void user_verify_full_name_text_field_displayed() {
	    	Assert.assertTrue(lp.verifyNameTextField());
	    	
	    }

	    @When("user enter full name as {string}")
	    public void user_enter_full_name_as (String name) {
	    	  lp.enterName(name);
	    	  
	    }
	    
	    @Then("user verify mobile number text field is displayed")
	    public void user_verify_mobile_number_text_field_is_displayed() {
	    	Assert.assertTrue(lp.verifyMobileNumberTextField());
	    	
	    }

	    @When("user enter mobile number as {string}")
	    public void user_enter_mobile_number_as (String num) {
	    	lp.enterMobileNumber(num);
	    	
	    	    
	    }
	    
	    @Then("user verify email text field is displayed")
	    public void user_verify_email_text_field_is_displayed() {
	    	Assert.assertTrue(lp.verifyEmailTextField());
	    	
	    }
	    
	    @When("user enter email as {string}")
	    public void user_enter_email_as (String email) {
	    	lp.enterEmail(email);
	    	
	    	    
	    }
	    
	    @When("user click on next button")
	    public void user_click_on_next_button() {
	    	lp.clickNextButton();
	    	
	    	    
	    }
	    
	    @When("user select credit cart for payment")
	    public void user_select_credit_cart_for_payment() {
	    	lp.selectPaymentOption();
	    	
	    }
	    
	    @When("user select creditcard paymenet field")
	    public void user_select_creditcard_paymenet_field() {
	    	lp.selectPaymenetField();
	    	
	    }
	    
	    @Then("user verify proceed to payment button is displayed")
	    public void user_verify_proceed_to_payment_button_is_displayed() {
	    	Assert.assertTrue(lp.verifyProceedToButton());
	    	
	    }
	    
	    @When("user click on proceed to payment")
	    public void user_click_on_proceed_to_payment() {
	    	lp.clickProceedToPayment();
	    	
	    	
	    }
	    
	    @Then("user verify pan number text field is displayed")
	    public void user_verify_pan_number_text_field_is_displayed() {
	    	Assert.assertTrue(lp.verifyPanNumberTextField());
	    	
	    }
	    
	    @When("user enter the pan number as {string}")
	    public void user_enter_the_pan_number_as (String pan) {
	    	lp.enterPanNumber(pan);
	    	
	    	
	    }
	    
	    @Then("user verify continue button is displayed")
	    public void user_verify_continue_button_is_displayed() {
	    	Assert.assertTrue(lp.verifyContinuePayment());
	    }
	    
	    @When("user click continue payment")
	    public void user_click_continue_payment() {
	    	lp.clickContinuePayment();
	    	
	    }
	    
   }
		
		
