package org.tms.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryPage extends BasePage{

    @FindBy(xpath = "//span[@class='title']")
    private WebElement nameOfMainPageSection;

    @FindBy (xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    private WebElement addToCartBackpack;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    private WebElement shoppingCartLinkButton;

    public String getTextOfNameOfMainPageSection() {
        nameOfMainPageSection.getText();
        return nameOfMainPageSection.getText();
    }
    public InventoryPage openPage(String url){
        driver.get(url);
        return this;
    }

    public InventoryPage clickButtonAddToCartBackpack(){
        addToCartBackpack.click();
        return this;
    }
    public void clickButtonShoppingCartLink(){
        shoppingCartLinkButton.click();
    }
}
