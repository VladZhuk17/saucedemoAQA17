package org.tms.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourCartPage extends BasePage {

    @FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
    private WebElement inventorySauceLabsBackpack;

    @FindBy(xpath = "//span[@class='title']")
    private WebElement nameOfYourCartPage;

    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement checkoutButton;

    public String getTextOfYourCartPage() {
        waitElement(nameOfYourCartPage).getText();
        return nameOfYourCartPage.getText();
    }

    public String getNameOfInventorySauceLabsBackpack(){
        inventorySauceLabsBackpack.getText();
        return inventorySauceLabsBackpack.getText();
    }

    public void clickCheckoutButton(){
        checkoutButton.click();
    }
}
