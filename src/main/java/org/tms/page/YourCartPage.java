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
        waitElement(nameOfYourCartPage).getText();
        return nameOfYourCartPage.getText();
    }

    public String getNameOfInventorySauceLabsBackpack(){
        return inventorySauceLabsBackpack.getText();
    }

    public void clickCheckoutButton(){
        log.info("INFO: click on checkout button");
        checkoutButton.click();
    }
}
