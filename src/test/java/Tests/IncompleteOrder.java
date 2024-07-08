package Tests;

import Pages.CartPage;
import Pages.LoginPage;
import Pages.ProductsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IncompleteOrder {

    public WebDriver webDriver;

    @Test
    public void metodaTest(){

        webDriver=new ChromeDriver();
        webDriver.get("https://www.saucedemo.com/");

        LoginPage loginPage= new LoginPage(webDriver);
        loginPage.navigateToProductsPage();

        ProductsPage productsPage= new ProductsPage(webDriver);
        productsPage.addToCartItems();
        productsPage.removeItemsFromProductPage();
        productsPage.addOtherItemToCart();
        productsPage.navigateToCartPage();

        CartPage cartPage= new CartPage(webDriver);
        cartPage.removeOtherItemFromCart();
        cartPage.navigateBackToProductPage();

        ProductsPage productsPage1= new ProductsPage(webDriver);
        productsPage1.openMenu();
        productsPage.logOut();
    }
}
