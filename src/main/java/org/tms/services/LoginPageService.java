package org.tms.services;

import org.tms.model.User;
import org.tms.page.InventoryPage;
import org.tms.page.LoginPage;

public class LoginPageService {

    private static final String LOGIN_PAGE_URL= "https://www.saucedemo.com/";
    protected LoginPage loginPage = new LoginPage();

    public InventoryPage login (User user){
        loginPage.openPage(LOGIN_PAGE_URL)
                .fillUsername(user.getLogin())
                .fillPassword(user.getPassword())
                .clickOnButton();
        return new InventoryPage();
    }
}
