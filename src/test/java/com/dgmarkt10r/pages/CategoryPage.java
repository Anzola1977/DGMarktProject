package com.dgmarkt10r.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CategoryPage extends BasePage {

    public CategoryPage() {
    }

    @FindBy(xpath = "//div[@class='inner']/a/img[@title='Cello C4020DVB 40\" LED-backlit LCD TV']")
    public WebElement productImage;

    @FindBy(xpath = "//button[@class='button-cart']")
    public List<WebElement> addToCartIcon;

    @FindBy(xpath = "//div[contains(@class, 'alert-success')]/a[.='shopping cart']")
    public WebElement linkToCart;

    @FindBy(xpath = "//div[contains(@class, 'alert-success')]")
    public WebElement successMessage;
}