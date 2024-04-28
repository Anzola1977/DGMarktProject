package com.dgmarkt10r.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPopupWindow extends BasePage{

    @FindBy(css = "#input-email")
    public WebElement fieldEMailFormLogin;

    @FindBy(css = "#input-password")
    public WebElement fieldPasswordFormLogin;

    @FindBy(xpath = "//span[.='Login']/..")
    public WebElement buttonLoginFormLogin;
}