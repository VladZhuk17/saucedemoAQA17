package org.tms.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutYourInformationPage extends BasePage {
    @FindBy(xpath = "//span[@class='title']")
    private WebElement nameOfCheckoutYourInformationPage;

    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement firstName;

    @FindBy (xpath = "//input[@id='last-name']")
    private WebElement lastName;

    @FindBy (xpath = "//input[@id='postal-code']")
    private WebElement postalCode;

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement continueButton;

    public CheckoutYourInformationPage fillFirstName(String personName){
        waitElement(firstName).clear();
        firstName.sendKeys(personName);
        return this;
    }

    public CheckoutYourInformationPage fillLastName(String personLastName){
        waitElement(firstName).clear();
        firstName.sendKeys(personLastName);
        return this;
    }

    public CheckoutYourInformationPage fillPostalCode (String zipOrPostalCode){
        waitElement(postalCode).clear();
        postalCode.sendKeys(zipOrPostalCode);
        return this;
    }

    public void clickContinueButton(){
        continueButton.click();
    }

    public String getTextOfCheckoutYourInformationPage(){
        nameOfCheckoutYourInformationPage.getText();
        return nameOfCheckoutYourInformationPage.getText();
    }
}
