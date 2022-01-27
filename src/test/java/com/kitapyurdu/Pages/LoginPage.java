package com.kitapyurdu.Pages;

import com.kitapyurdu.Methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage {

    Methods methods;
    Logger logger = LogManager.getLogger(ProductPage.class);

    public LoginPage() {
        methods = new Methods();
    }

    public void login() {
        methods.click(By.linkText("Giriş Yap"));
        methods.sendKeys(By.id("login-email"), "testhesabi211@gmail.com");
        methods.sendKeys(By.id("login-password"), "Test123.");
        methods.sendKeysEnter(By.id("login-password"));
        methods.wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".common-sprite > b")));
        String actual = methods.getText(By.cssSelector(".common-sprite > b"));
        methods.assertPage("Hesaba giriş Yapılmadı", "deneme hesabi", actual);
        logger.info("Hesaba giriş yapıldı " + actual);
    }

    public void logout() {
        methods.selectByText(By.cssSelector(".common-sprite>b"), "Çıkış");
    }
}
