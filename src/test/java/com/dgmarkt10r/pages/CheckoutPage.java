package com.dgmarkt10r.pages;

import com.dgmarkt10r.context.CartAndCheckoutFormsData;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.dgmarkt10r.context.TestContext.getWait;

public class CheckoutPage extends BasePage {

    public CheckoutPage() {
    }

    @FindBy(xpath = "//div[@class='container-inner']/h1")
    public WebElement checkout;

    @FindBy(xpath = "//div[@id='collapse-shipping-method']//textarea[@class='form-control']")
    public WebElement deliveryMethodComment;

    @FindBy(css = "#button-shipping-method")
    public WebElement deliveryMethodContinueButton;

    @FindBy(xpath = "//div[@id='collapse-payment-method']//input[@name='payment_method']")
    public WebElement paymentMethodChecked;

    @FindBy(css = "#button-payment-method")
    public WebElement paymentMethodContinueButton;

    @FindBy(xpath = "//div[@class='pull-right']//input[@name='agree']")
    public WebElement paymentMethodTermAgreeCheckbox;

    @FindBy(css = "#button-confirm")
    public WebElement confirmOrderButton;

    @FindBy(xpath = "//div[@class='container']//h1")
    public WebElement checkoutSuccessMessage;

    @FindBy(xpath = "//div[@class='radio']//input[@value='guest']")
    public WebElement guestCheckoutButton;

    @FindBy(css = "#button-account")
    public WebElement guestCheckoutContinueButton;

    @FindBy(css = "#input-payment-firstname")
    public WebElement firstNameInput;

    @FindBy(css = "#input-payment-lastname")
    public WebElement lastNameInput;

    @FindBy(css = "#input-payment-email")
    public WebElement emailInput;

    @FindBy(css = "#input-payment-telephone")
    public WebElement telephoneInput;

    @FindBy(css = "#input-payment-address-1")
    public WebElement addressInput;

    @FindBy(css = "#input-payment-city")
    public WebElement cityInput;

    @FindBy(css = "#input-payment-postcode")
    public WebElement postCodeInput;

    @FindBy(css = "#input-payment-country")
    public WebElement countrySelectGuest;

    @FindBy(css = "#input-payment-zone")
    public WebElement regionSelectGuest;

    @FindBy(css = "#button-guest")
    public WebElement guestBillingContinueButton;

    @FindBy(xpath = "//div[@class='col-sm-6']//legend")
    public WebElement legend;

    @FindBy(xpath = "//div[@class='panel-body']/p")
    public WebElement textDeliveryMethod;

    @FindBy(xpath = "//tfoot//tr[last()]/td[last()]")
    public WebElement totalPriceGuest;

    public void fillData(){
        CheckoutPage checkoutPage = new CheckoutPage();
        getWait().until(ExpectedConditions.visibilityOf(checkoutPage.firstNameInput));
        checkoutPage.firstNameInput.click();
        checkoutPage.firstNameInput.sendKeys(new CartAndCheckoutFormsData().getFirstName());
        checkoutPage.lastNameInput.click();
        checkoutPage.lastNameInput.sendKeys(new CartAndCheckoutFormsData().getLastName());
        checkoutPage.emailInput.click();
        checkoutPage.emailInput.sendKeys(new CartAndCheckoutFormsData().getEmail());
        checkoutPage.telephoneInput.click();
        checkoutPage.telephoneInput.sendKeys(new CartAndCheckoutFormsData().getTelephone());
        checkoutPage.addressInput.click();
        checkoutPage.addressInput.sendKeys(new CartAndCheckoutFormsData().getAddress());
        checkoutPage.cityInput.click();
        checkoutPage.cityInput.sendKeys(new CartAndCheckoutFormsData().getCity());
        checkoutPage.postCodeInput.click();
        checkoutPage.postCodeInput.sendKeys(new CartAndCheckoutFormsData().getPostCode());
        getWait().until(ExpectedConditions.visibilityOf(checkoutPage.countrySelectGuest));
        checkoutPage.countrySelectGuest.click();
        checkoutPage.countrySelectGuest.sendKeys(new CartAndCheckoutFormsData().getCountry());
        checkoutPage.countrySelectGuest.sendKeys(Keys.ENTER);
        checkoutPage.regionSelectGuest.sendKeys(Keys.TAB);
        getWait().until(ExpectedConditions.visibilityOf(checkoutPage.regionSelectGuest));
        checkoutPage.regionSelectGuest.click();
        checkoutPage.regionSelectGuest.sendKeys(new CartAndCheckoutFormsData().getRegion());
        checkoutPage.regionSelectGuest.sendKeys(Keys.ENTER);
        checkoutPage.regionSelectGuest.sendKeys(Keys.TAB);
    }
}
