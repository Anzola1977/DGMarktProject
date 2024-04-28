package com.dgmarkt10r.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {

    public ProductPage() {
    }

    @FindBy(xpath = "//div[@id='product']//button[@id='button-cart']")
    public WebElement buttonAddToCart;
}

