package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	
public WebDriver ldriver;	
	
	public SignUpPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//*[@class=\"hidden-xs top_menu_top user_top\"]/child::*")
	@CacheLookup
	WebElement txtSignUp;
	
	@FindBy(xpath = "//*[@class=\"col-sm-7 p-0 signin-form mb-5\"]/child::*[1]/child::*/child::*[2]/child::*")
	@CacheLookup
	WebElement txtSignUp1;
	
	@FindBy(xpath = "//*[@id=\"textCountryCodeS\"]")
	@CacheLookup
	WebElement txtCountryCode;
	
	@FindBy(xpath = "//*[text()=\"India (+91)\"]")
	@CacheLookup
	WebElement txtIndia;
	
	@FindBy(id = "textPhoneNumberS")
	@CacheLookup
	WebElement txtPhoneNumber;
	
	@FindBy(xpath = "//*[@id=\"btnRequestSignupOTP\"]")
	@CacheLookup
	WebElement txtVerifyPhoneNumber;
	
	@FindBy(xpath = "//*[@id=\"txtOTPSignup1\"]")
	@CacheLookup
	WebElement txtEnterOTP1;
	
	@FindBy(xpath = "//*[@id=\"txtOTPSignup2\"]")
	@CacheLookup
	WebElement txtEnterOTP2;
	
	@FindBy(xpath = "//*[@id=\"txtOTPSignup3\"]")
	@CacheLookup
	WebElement txtEnterOTP3;
	
	@FindBy(xpath = "//*[@id=\"txtOTPSignup4\"]")
	@CacheLookup
	WebElement txtEnterOTP4;
	
	@FindBy(xpath = "//*[@id=\"txtOTPSignup5\"]")
	@CacheLookup
	WebElement txtEnterOTP5;
	
	@FindBy(xpath = "//*[@id=\"txtOTPSignup6\"]")
	@CacheLookup
	WebElement txtEnterOTP6;
	
	@FindBy(xpath = "//*[@id=\"btnVerifySignupOTP\"]")
	@CacheLookup
	WebElement txtVerifyOTP;
	
	public boolean verifySignUpLink() {
		return txtSignUp.isDisplayed();
		
	}
	
	public void clickSignUpLink() {
		txtSignUp.click();
		
	}
	
	public void clickSignUpButton() {
		txtSignUp1.click();
		
	}
	
	public boolean verifyCountryCode() {
		return txtCountryCode.isDisplayed();
		
	}
	
	public void enterCountryCode(String country) {
		txtCountryCode.sendKeys(country);
		
	}
	
	public void selectIndiaCode() {
		txtIndia.click();
		
	}
	
	public boolean verifyPhoneNumberTextField() {
		return txtPhoneNumber.isDisplayed();
		
	}
	
	public void enterPhoneNumber(String num) {
		txtPhoneNumber.sendKeys(num);
		
	}
	
	public boolean verifyPhoneNumberbutton() {
		return txtVerifyPhoneNumber.isDisplayed();
		
	}
	
	public void clickVerifyPhoneNumberButton() {
		txtVerifyPhoneNumber.click();
		
	}
	
	public void enterOTP() {
		txtEnterOTP1.sendKeys("1");
		txtEnterOTP2.sendKeys("2");
		txtEnterOTP3.sendKeys("3");
		txtEnterOTP4.sendKeys("4");
		txtEnterOTP5.sendKeys("5");
		txtEnterOTP6.sendKeys("6");
	}
	
	public boolean verifyOTPButton() {
		return txtVerifyOTP.isDisplayed();
		
	}
	
	public void clickVerifyOTPButton() {
		txtVerifyOTP.click();
		
	}

	
	
	

}
