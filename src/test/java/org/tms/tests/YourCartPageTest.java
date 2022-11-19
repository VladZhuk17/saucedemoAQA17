package org.tms.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.tms.model.User;
import org.tms.page.YourCartPage;
import org.tms.services.InventoryPageService;
import org.tms.services.LoginPageService;

public class YourCartPageTest extends BaseTest{

    @Test (description = "Add the inventory to the cart and check it adding")
    public void verifyInventoryInCartTest(){
        YourCartPage yourCartPage = new YourCartPage();
        InventoryPageService inventoryPageService = new InventoryPageService();
        LoginPageService loginPage = new LoginPageService();
        User user = new User();
        loginPage.login(user);
        inventoryPageService.addInventoryToCart();
        String actualTextOfYourCartPage = yourCartPage.getNameOfInventorySauceLabsBackpack();
        String expectedTextOfYourCartPage = "Sauce Labs Backpack";
        Assert.assertEquals(actualTextOfYourCartPage,expectedTextOfYourCartPage,"The actual text of the " +
                "page doesn't match expected");
    }
}
