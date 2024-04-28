package com.dgmarkt10r.pages.accountformpages;

import com.dgmarkt10r.pages.AccountPage;
import com.dgmarkt10r.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditAddressAccountPage extends BasePage {

    public AccountPage accountPage;

    public EditAddressAccountPage() {
        accountPage = new AccountPage();
    }
}