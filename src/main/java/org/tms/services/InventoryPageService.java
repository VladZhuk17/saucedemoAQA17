package org.tms.services;

import org.tms.model.User;
import org.tms.page.InventoryPage;
import org.tms.page.YourCartPage;

public class InventoryPageService extends LoginPageService{

    private static final String INVENTORY_PAGE_URL = "https://www.saucedemo.com/inventory.html";
    protected InventoryPage inventoryPage = new InventoryPage();

    public YourCartPage addInventoryToCart() {
                inventoryPage.openPage(INVENTORY_PAGE_URL).clickButtonAddToCartBackpack()
                                                  .clickButtonShoppingCartLink();
        return new YourCartPage();
    }
}
