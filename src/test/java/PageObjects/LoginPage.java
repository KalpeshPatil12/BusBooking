package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
public WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//*[@class=\"hidden-xs top_menu_top user_top\"]/child::*")
	@CacheLookup
	WebElement txtSignUp;
	
	@FindBy(xpath = "//*[@id=\"textUserIDPage\"]")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(xpath = "//*[@id=\"textPasswordPage\"]")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath = "//*[@id=\"sign-in-login\"]/child::*[1]/child::*[4]/child::*[2]/child::*")
	@CacheLookup
	WebElement txtShowPass;
	
	@FindBy(xpath = "//*[@class=\"col-sm-7 p-0 signin-form mb-5\"]/child::*[2]/child::*/child::*[1]/child::*[7]/child::*")
	@CacheLookup
	WebElement txtLoginButton;
	
	@FindBy(xpath = "//*[@class=\"col-sm-7 p-0 signin-form mb-5\"]/child::*[2]/child::*/child::*[1]/child::*[6]/child::*")
	@CacheLookup
	WebElement txtForgotPass;
	
	@FindBy(xpath = "//*[@id=\"textRetrieveEmailPage\"]")
	@CacheLookup
	WebElement txtReEnterTextField;
	
	@FindBy(xpath = "//*[@id=\"sign-in-login\"]/child::*[2]/child::*[4]/child::*")
	@CacheLookup
	WebElement txtRetrieveButton;
	
	@FindBy(xpath = "//*[@id=\"btn-alert-okay\"]")
	@CacheLookup
	WebElement txtOk;
	
	@FindBy(xpath = "//*[@id=\"sign-in-login\"]/child::*[2]/child::*[5]/child::*")
	@CacheLookup
	WebElement txtBackToButton;
	
	@FindBy(xpath = "//*[@id=\"btnGoogleLoginPage\"]")
	@CacheLookup
	WebElement txtLoginWithGoogle;

	public boolean verifyLoginLink() {
		return txtSignUp.isDisplayed();
		
	}
	
	public void clickLoginLink() {
		txtSignUp.click();
		
	}
	
	public boolean verifyEmailTextField() {
		return txtEmail.isDisplayed();
		
	}
	
	public void enterEmail(String email) {
		txtEmail.sendKeys(email);
		
	}
	
	public boolean verifyPassTextField() {
		return txtPassword.isDisplayed();
		
	}
	
	public void enterPass(String pass) {
		txtPassword.sendKeys(pass);
		
	}
	
	public boolean verifyShowPassButton() {
		return txtShowPass.isDisplayed();
		
	}
	
	public void clickShowPassButton() {
		txtShowPass.click();
		
	}
	
	public boolean verifyLoginButton() {
		return txtLoginButton.isDisplayed();
		
	}
	
	public void clickLoginButton() {
		txtLoginButton.click();
		
	}
	
	public boolean verifyForgotPassLink() {
		return txtForgotPass.isDisplayed();
		
	}
	
	public void clickForgotPassLink() {
		txtForgotPass.click();
		
	}
	
	public boolean verifyReEnterMailTextField() {
		return txtReEnterTextField.isDisplayed();
		
	}
	
	public void reEnterMail(String Email)  {
		txtReEnterTextField.sendKeys(Email);
		
	}
	
	public boolean verifyRetrieveButton() {
		return txtRetrieveButton.isDisplayed();
		
	}
	
	public void clickRetrieveButton() {
		txtRetrieveButton.click();
		
	}
	
	public boolean verifybackToButton() {
		return txtBackToButton.isDisplayed();
		
	}
	
	public void clickOK() {
		txtOk.click();
		
	}
	
	public void clicBackToButton() {
		txtBackToButton.click();
		
	}
	
	public boolean verifyLoginWithGoogleButton() {
		return txtLoginWithGoogle.isDisplayed();
		
	}
	
	public void clicLoginWithGoogleButton() {
		txtLoginWithGoogle.click();
		
	}

	
}


