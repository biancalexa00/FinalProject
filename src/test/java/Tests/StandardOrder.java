package Tests;

import Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StandardOrder {

    public WebDriver webDriver;

    @Test
    public void metodaTest(){

        webDriver=new ChromeDriver();
        webDriver.get("https://www.saucedemo.com/");

        LoginPage loginPage= new LoginPage(webDriver);
        loginPage.navigateToProductsPage();

        ProductsPage productsPage= new ProductsPage(webDriver);
        productsPage.addToCartItems();
        productsPage.navigateToCartPage();

        CartPage cartPage= new CartPage(webDriver);
        cartPage.removeFromCart();
        cartPage.navigateToCheckout();

        CheckoutPage checkoutPage= new CheckoutPage(webDriver);
        checkoutPage.fillInformations();
        checkoutPage.navigateToFinalPage();

        FinalPage finalPage= new FinalPage(webDriver);
        finalPage.finishTest();
    }
}
