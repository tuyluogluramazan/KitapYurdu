package com.kitapyurdu.Pages;

import com.kitapyurdu.Base.BaseTest;
import com.kitapyurdu.Methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.kitapyurdu.Constants.Constants.HOME_PAGE_LOCATER;

public class HomePage {
    WebDriver driver;
    Methods methods;
    Logger logger = LogManager.getLogger(ProductPage.class);

    public HomePage() {
        methods = new Methods();
        driver = BaseTest.driver;

    }

    public void switchPage() {
        methods.wait.until(ExpectedConditions.visibilityOfElementLocated(HOME_PAGE_LOCATER));
        methods.switchPage(HOME_PAGE_LOCATER);
    }

    public void assertHomePage() {
        String url = methods.getUrl();
        methods.assertPage("Anasayfada değilsin", "https://www.kitapyurdu.com/", url);
        logger.info("Bu sayfaya geçildi " + url);
    }

}
