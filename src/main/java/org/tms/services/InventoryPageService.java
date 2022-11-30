package org.tms.services;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.tms.page.InventoryPage;
import org.tms.page.YourCartPage;

@Log4j2

public class InventoryPageService extends LoginPageService{

    private static final String INVENTORY_PAGE_URL = "https://www.saucedemo.com/inventory.html";
    protected InventoryPage inventoryPage = new InventoryPage();

    @Step("AddInventoryToCart")
    public YourCartPage addInventoryToCart() {
                log.info("INFO: add Inventory to cart");
                inventoryPage.openPage(INVENTORY_PAGE_URL).clickButtonAddToCartBackpack()
                                                  .clickButtonShoppingCartLink();
        return new YourCartPage();
    }
}
