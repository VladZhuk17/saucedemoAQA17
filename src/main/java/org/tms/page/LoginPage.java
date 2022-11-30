package org.tms.page;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2

public class LoginPage extends BasePage{

    @FindBy(xpath = "//input[@id='user-name']")
    private WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;

    @FindBy(xpath = "//input[@id='login-button']")
    private WebElement loginButton;

    public LoginPage openPage(String url){
        log.info("INFO: open Login page");
        driver.get(url);
        return this;
    }

    public LoginPage fillUsername(String userName){
        log.info("INFO: fill username");
        waitElement(username).clear();
        username.sendKeys(userName);
        return this;
    }
    public LoginPage fillPassword(String keyPassword){
        log.info("INFO: fill password");
        password.clear();
        password.sendKeys(keyPassword);
        return this;
    }

    public void clickOnButton(){
        log.info("INFO: click on login button");
        loginButton.click();
    }

}
