package org.tms.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.tms.driver.DriverSingleton;

public abstract class BasePage {

    private final static int WAIT_ELEMENT_SECONDS = 5;
    protected WebDriver driver = DriverSingleton.getDriver();

    protected BasePage() {
        PageFactory.initElements(driver, this);
    }

    protected WebElement waitElement (WebElement element){
        return new WebDriverWait(driver, WAIT_ELEMENT_SECONDS).until(ExpectedConditions.visibilityOf(element));
        }
    }
