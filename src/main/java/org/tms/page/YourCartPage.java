package org.tms.page;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2

public class YourCartPage extends BasePage {

    @FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
    private WebElement inventorySauceLabsBackpack;

    @FindBy(xpath = "//span[@class='title']")
    private WebElement nameOfYourCartPage;

    @FindBy(xpath = "//button[@id='checkout']")
    private WebElement checkoutButton;

    public String getTextOfYourCartPage() {
        log.info("INFO: get the text of your cart page");
        waitElement(nameOfYourCartPage).getText();
        return nameOfYourCartPage.getText();
    }

    public String getNameOfInventorySauceLabsBackpack(){
        log.info("INFO: get name of Inventory sauce labs backpack");
        inventorySauceLabsBackpack.getText();
        return inventorySauceLabsBackpack.getText();
    }

    public void clickCheckoutButton(){
        log.info("INFO: click on checkout button");
        checkoutButton.click();
    }
}
