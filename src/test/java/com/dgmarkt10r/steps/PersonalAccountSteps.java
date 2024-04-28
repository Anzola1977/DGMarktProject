package com.dgmarkt10r.steps;

import com.dgmarkt10r.pages.AccountPage;
import com.dgmarkt10r.pages.accountformpages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonalAccountSteps {

    @And("click Continue")
    public void clickContinue() {
        new EditAddressAccountPage().accountPage.buttonContinueEditInformationPage.click();
    }

    @And("goes to the Password")
    public void goesToThePassword() {
        new AccountPage().tableLinksRightComponent.linkPasswordRightTable.click();
    }

    @And("enters the value {string} in the Password field")
    public void entersTheValueInThePasswordField(String password) {
        ChangePasswordAccountPage changePasswordAccountPage = new ChangePasswordAccountPage();
        changePasswordAccountPage.fieldPasswordPagePassword.clear();
        changePasswordAccountPage.fieldPasswordPagePassword.sendKeys(password);
    }

    @And("enters the value {string} in the Password Confirm field")
    public void entersTheValueInThePasswordConfirmField(String confirmPassword) {
        ChangePasswordAccountPage changePasswordAccountPage = new ChangePasswordAccountPage();
        changePasswordAccountPage.fieldPasswordConfirmPagePassword.clear();
        changePasswordAccountPage.fieldPasswordConfirmPagePassword.sendKeys(confirmPassword);
    }

    @Then("under the Password Confirm field {string}")
    public void underThePasswordConfirmField(String errorMessage) {
        assertEquals(errorMessage, new ChangePasswordAccountPage().fieldMessageErrorPagePassword.getText());
    }

    @And("goes to the Edit Account")
    public void goesToTheEditAccount() {
        new AccountPage().tableLinksRightComponent.linkEditAccountRightTable.click();
    }

    @When("user fills in the fields First Name {string}, Last Name {string},  Telephone {string}")
    public void userFillsInTheFieldsFirstNameLastNameTelephone(String firstName, String lastName, String telephone) {
        EditInformationAccountPage editInformationAccountPage = new EditInformationAccountPage();
        editInformationAccountPage.fieldFirstNameEditInformationPage.clear();
        editInformationAccountPage.fieldFirstNameEditInformationPage.sendKeys(firstName);
        editInformationAccountPage.fieldLastNameEditInformationPage.clear();
        editInformationAccountPage.fieldLastNameEditInformationPage.sendKeys(lastName);
        editInformationAccountPage.fieldTelephoneEditInformationPage.clear();
        editInformationAccountPage.fieldTelephoneEditInformationPage.sendKeys(telephone);
    }

    @Then("the centre page will say {string}")
    public void theCentrePageWillSay(String message) {
        assertEquals(message, new AccountPage().messageCenterPageAccountInformation.getText());
    }

    @And("goes to the My Wish List Book")
    public void goesToTheMyWishListBook() {
        new AccountPage().tableLinksRightComponent.linkWishListRightTable.click();
    }

    @Then("in the list of products there is an item with the name {string}")
    public void inTheListOfProductsThereIsAnItemWithTheName(String nameProduct) {
        MyWishListAccountPage myWishListAccountPage = new MyWishListAccountPage();

        for (WebElement nameProductList : myWishListAccountPage.listProductNameMyWishListAccountPage) {
            if (nameProductList.getText().equals(nameProduct)) {
                assertEquals(nameProduct, nameProductList.getText());
                break;
            }
        }
    }

    @When("user goes to the {string}")
    public void userGoesToThe(String linkName) {
        new AccountPage().getWebElementMap().getElement(linkName).click();
    }

    @Then("a page will open up with the name {string}")
    public void aPageWillOpenUpWithTheName(String pageName) {
        assertEquals(pageName, new AccountPage().listTitlePathFormsAccountPage.getLast().getText());
    }

    @When("user goes to the {string} in the table")
    public void userGoesToTheInTheTable(String linkName) {
        new AccountPage().getWebElementTabMap().getElement(linkName).click();
    }

}
