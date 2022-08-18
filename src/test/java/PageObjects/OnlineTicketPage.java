package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnlineTicketPage {
	
public WebDriver ldriver;
	
	public OnlineTicketPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//*[@class=\"mobile_menu_trigger hidden-lg hidden-md hidden-sm\"]/child::*[1]/child::*/child::*")
	@CacheLookup
	WebElement txtVerify;

	@FindBy(id = "txtOriginGeneral")
	@CacheLookup
	WebElement txtOrigin;
	
	@FindBy(xpath = "//*[@id=\"divFromList\"]/ul/li[1]/ul/li[1]/div")
	@CacheLookup
	WebElement txtEnterOrigin;
	
	@FindBy(id = "txtDestinationGeneral")
	@CacheLookup
	WebElement txtDestination;
	
	@FindBy(xpath = "//*[@id=\"divToList\"]/ul/li[1]/ul/li[1]/div")
	@CacheLookup
	WebElement txtEnterDestination;
	
	@FindBy(xpath = "//*[@class=\"ui-datepicker-next ui-corner-all\"]")
	@CacheLookup
	WebElement txtSelectDate;
	
	@FindBy(xpath = "//*[text()=\"20\"]")
	@CacheLookup
	WebElement txt20thSept;
	
	@FindBy(id ="btnBusSearchNewGeneral")
	@CacheLookup
	WebElement txtSearchBus;
	
	@FindBy(id = "cheapest")
	@CacheLookup
	WebElement txtSelect;
	
	@FindBy(xpath = "//*[@id=\"subtab1\"]/table/tbody/tr[1]/td[6]/a")
	@CacheLookup
	WebElement txtClick;
	
	@FindBy(xpath = "//*[text()=\"26\"]")
	@CacheLookup
	WebElement txtSeat1;
	
	@FindBy(xpath = "//*[@class=\"seatproceed\"]")
	@CacheLookup
	WebElement txtProceed;
	
	@FindBy(xpath = "//*[@class=\"payment_textName form-control pay-form-control\"]")
	@CacheLookup
	WebElement txtName;
	
	@FindBy(xpath = "//*[@class=\"payment_txtPhoneLogin form-control pay-form-control\"]")
	@CacheLookup
	WebElement txtMobileNumber;
	
	@FindBy(xpath = "//*[@class=\"payment_txtEmail form-control pay-form-control\"]")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(xpath = "//*[@id=\"btnNext\"]")
	@CacheLookup
	WebElement txtNextButton;
	
	@FindBy(xpath = "//*[text()=\" Credit Card \"]")
	@CacheLookup
	WebElement txtPayment;
	
	@FindBy(xpath = "//*[@id=\"rbCreditCard\"]")
	@CacheLookup
	WebElement txtPaymentField;
	
	@FindBy(xpath = "//*[@id=\"payment_btnProceedPayment\"]")
	@CacheLookup
	WebElement txtProceedToPaymenet;
	
	@FindBy(xpath = "//*[@name=\"cardNumber\"]")
	@CacheLookup
	WebElement txtPan;
	
	@FindBy(xpath = "//*[@class=\"btn btn-primary\"]")
	@CacheLookup
	WebElement txtContinuePayment;
	
	
	/*  This method is for verify page title 
	 */
	public void verifyTitle() {
		txtVerify.isDisplayed();
	}
	
	/*  This method is for verify Origin Text field
	 */
	
	public boolean verifyOriginPoint() {
		return txtOrigin.isDisplayed();
	}
	
	/*  This method is enter the origin point
	 */
	
	public void setOrigin() {
		txtOrigin.click();
		
	}
	
	public void enterOrigin() {
		txtEnterOrigin.click();
	}
	
	public boolean verifyDestinationPoint() {
		return txtDestination.isDisplayed();
	}
 	
	
	public void setDestination() {
		txtDestination.click();
	}
	
	public void enterDestination() {
		txtEnterDestination.click();
	}
	
	public boolean verifyDepartDate() {
		return txtSelectDate.isDisplayed();
	}
	
	public void setDate() {
		txtSelectDate.click();
	}
	
	public void enterDate() {
		txt20thSept.click();
	}
	
	public boolean verifySearchButton() {
		return txtSearchBus.isDisplayed();
	}
	
	public void clickSearchBus() {
		txtSearchBus.click();
	}
	
	public boolean verifyCheapestButton() {
		return txtSelect.isDisplayed();
	}
	
	public void clickCheapestOption() {
		txtSelect.click();
	}
	
	public boolean verifySelectOption() {
		return txtClick.isDisplayed();
	}
	
	public void clickSelectOption() {
		txtClick.click();
	}
	
	public boolean verifySetAvalability() {
		return txtSeat1.isDisplayed();
	}
	
	public void selectSeat1() {
		txtSeat1.click();
	}
	
	public boolean verifyProceedButton() {
		return txtProceed.isDisplayed();
	}
	
	public void clickProceedButton() {
		txtProceed.click();
	}
	
	public boolean verifyNameTextField() {
		return txtName.isDisplayed();
	}
	
	public void enterName(String name) {
		txtName.sendKeys(name);
	}

	public boolean verifyMobileNumberTextField() {
		return txtMobileNumber.isDisplayed();
	}
	
	public void enterMobileNumber(String num) {
		txtMobileNumber.sendKeys(num);
	}
	
	public boolean verifyEmailTextField() {
		return txtEmail.isDisplayed();
	}
	
	
	public void enterEmail(String email) {
		txtEmail.sendKeys(email);
	}
	
	public void clickNextButton() {
		txtNextButton.click();
		
	}
	
	public void selectPaymentOption() {
		txtPayment.click();
	}
	
	public void selectPaymenetField() {
		txtPaymentField.click();
	}
	
	public boolean verifyProceedToButton() {
		return txtProceedToPaymenet.isDisplayed();
	}
	
	public void clickProceedToPayment() {
		txtProceedToPaymenet.click();
	}
	
	public boolean verifyPanNumberTextField() {
		return txtPan.isDisplayed();
	}
	
	public void enterPanNumber(String pan) {
		txtPan.sendKeys(pan);
	}
	
	public boolean verifyContinuePayment() {
		return txtContinuePayment.isDisplayed();
	}
	
	public void clickContinuePayment() {
		txtContinuePayment.click();
	}


}
