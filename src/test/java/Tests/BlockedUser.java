package Tests;

import Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BlockedUser {

    public WebDriver webDriver;

    @Test
    public void metodaTest(){

        webDriver=new ChromeDriver();
        webDriver.get("https://www.saucedemo.com/");

        LoginPage loginPage= new LoginPage(webDriver);
        loginPage.logInBlockedUser();
    }

}
