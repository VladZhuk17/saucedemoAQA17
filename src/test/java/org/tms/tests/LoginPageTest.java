package org.tms.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.tms.model.User;
import org.tms.services.LoginPageService;

public class LoginPageTest extends BaseTest{

    @Test(description = "Log in a user")
    public void loginTest(){
        LoginPageService loginPageService = new LoginPageService();
        User user = new User();
        String actualTextOfInventoryPage = loginPageService.login(user).getTextOfNameOfMainPageSection();
        String expectedTextOfInventoryPage = "PRODUCTS";
        Assert.assertEquals(actualTextOfInventoryPage, expectedTextOfInventoryPage, "The actual text of the " +
                "page doesn't match expected");
    }
}
