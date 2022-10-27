package org.tms.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutYourInformationPage {
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

    public CheckoutYourInformationPage fullFirstName(String personName){
        firstName.clear();
        firstName.sendKeys(personName);
        return this;
    }

    public CheckoutYourInformationPage fullLastName(String personLastName){
        firstName.clear();
        firstName.sendKeys(personLastName);
        return this;
    }

    public CheckoutYourInformationPage fullPostalCode (String zipOrPostalCode){
        postalCode.clear();
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
