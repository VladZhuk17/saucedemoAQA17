package org.tms.page;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2

public class CheckoutYourInformationPage extends BasePage {
    @FindBy(xpath = "//span[@class='title']")
    private WebElement nameOfCheckoutYourInformationPage;

    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement postalCode;

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement continueButton;

    public CheckoutYourInformationPage fillFirstName(String personName) {
        log.info("INFO: fill first name");
        waitElement(firstName).clear();
        firstName.sendKeys(personName);
        return this;
    }

    public CheckoutYourInformationPage fillLastName(String personLastName) {
        log.info("INFO: fill last name");
        waitElement(firstName).clear();
        firstName.sendKeys(personLastName);
        return this;
    }

    public CheckoutYourInformationPage fillPostalCode(String zipOrPostalCode) {
        log.info("INFO: fill postal code");
        waitElement(postalCode).clear();
        postalCode.sendKeys(zipOrPostalCode);
        return this;
    }

    public void clickContinueButton() {
        log.info("INFO: click on continue button");
        continueButton.click();
    }

    public String getTextOfCheckoutYourInformationPage() {
        log.info("INFO: get text from checkout information page");
        nameOfCheckoutYourInformationPage.getText();
        return nameOfCheckoutYourInformationPage.getText();
    }
}
