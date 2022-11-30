package org.tms.services;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.tms.model.User;
import org.tms.page.InventoryPage;
import org.tms.page.LoginPage;

@Log4j2

public class LoginPageService {

    private static final String LOGIN_PAGE_URL= "https://www.saucedemo.com/";
    protected LoginPage loginPage = new LoginPage();

    @Step ("Log in and open Inventory Page")
    public InventoryPage login (User user){
     //   log.info("INFO: Log in and open Inventory Page");
        loginPage.openPage(LOGIN_PAGE_URL)
                .fillUsername(user.getLogin())
                .fillPassword(user.getPassword())
                .clickOnButton();
        return new InventoryPage();
    }
}
