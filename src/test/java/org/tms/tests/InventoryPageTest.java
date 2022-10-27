package org.tms.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.tms.model.User;
import org.tms.services.InventoryPageService;
import org.tms.services.LoginPageService;

public class InventoryPageTest extends BaseTest {

    @Test
    public void addToCartTest(){
        InventoryPageService inventoryPageService = new InventoryPageService();
        LoginPageService loginPage = new LoginPageService();
        User user = new User();
        loginPage.login(user);
        String actualTextOfYourCartPage = inventoryPageService.addInventoryToCart().getTextOfYourCartPage();
        String expectedTextOfYourCartPage = "YOUR CART";
        Assert.assertEquals(actualTextOfYourCartPage,expectedTextOfYourCartPage,"The actual text of the " +
                "page doesn't match expected");
    }
}
