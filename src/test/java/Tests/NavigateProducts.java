package Tests;

import Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigateProducts {
    public WebDriver webDriver;

    @Test
    public void metodaTest(){
        webDriver=new ChromeDriver();
        webDriver.get("https://www.saucedemo.com/");

        LoginPage loginPage= new LoginPage(webDriver);
        loginPage.navigateToProductsPage();

        ProductsPage productsPage= new ProductsPage(webDriver);
        productsPage.navigateToBackpackPage();

        BackPackPage backPackPage= new BackPackPage(webDriver);
        backPackPage.setAddToCartBackpackPage();
        backPackPage.navigateToCartPage();

        CartPage cartPage= new CartPage(webDriver);
        cartPage.navigateBackToProductPage();

        ProductsPage productsPage1= new ProductsPage(webDriver);
        productsPage1.navigateToBikePage();

        BikePage bikePage= new BikePage(webDriver);
        bikePage.setAddToCartBikePage();
        bikePage.navigateToCartPage();

        CartPage cartPage1= new CartPage(webDriver);
        cartPage1.navigateBackToProductPage();

        ProductsPage productsPage2= new ProductsPage(webDriver);
        productsPage2.navigateToBackpackPage();

        BackPackPage backPackPage1= new BackPackPage(webDriver);
        backPackPage1.setRemoveBackpackPage();
        backPackPage1.navigateToProductPage();

        ProductsPage productsPage3= new ProductsPage(webDriver);
        productsPage3.navigateToBikePage();

        BikePage bikePage1= new BikePage(webDriver);
        bikePage1.setRemoveBikePage();
        bikePage1.navigateToProductPage();

        ProductsPage productsPage4= new ProductsPage(webDriver);
        productsPage4.openMenu();
        productsPage4.logOut();








    }
}
