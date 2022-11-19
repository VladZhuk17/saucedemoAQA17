package org.tms.services;

import io.qameta.allure.Step;
import org.tms.model.User;
import org.tms.page.InventoryPage;
import org.tms.page.LoginPage;

public class LoginPageService {

    private static final String LOGIN_PAGE_URL= "https://www.saucedemo.com/";
    protected LoginPage loginPage = new LoginPage();

    @Step ("Log in and open Inventory Page")
    public InventoryPage login (User user){
        loginPage.openPage(LOGIN_PAGE_URL)
                .fillUsername(user.getLogin())
                .fillPassword(user.getPassword())
                .clickOnButton();
        return new InventoryPage();
    }
}
