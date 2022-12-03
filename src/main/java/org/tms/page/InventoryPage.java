package org.tms.page;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2

public class InventoryPage extends BasePage{

    @FindBy(xpath = "//span[@class='title']")
    private WebElement nameOfMainPageSection;

    @FindBy (xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    private WebElement addToCartBackpack;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    private WebElement shoppingCartLinkButton;

    public String getTextOfNameOfMainPageSection() {
        waitElement(nameOfMainPageSection).getText();
        return nameOfMainPageSection.getText();
    }
    public InventoryPage openPage(String url){
        log.info("INFO: open Inventory page");
        driver.get(url);
        return this;
    }

    public InventoryPage clickButtonAddToCartBackpack(){
        log.info("INFO: click on the button Cart Backpack");
        addToCartBackpack.click();
        return this;
    }
    public void clickButtonShoppingCartLink(){
        log.info("INFO: INFO: click on the button shopping cart link");
        shoppingCartLinkButton.click();
    }
}
