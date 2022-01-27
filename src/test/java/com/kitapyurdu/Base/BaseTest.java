package com.kitapyurdu.Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {

    public static WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications", "disable-popup-blocking", "disable-translate", "--disable-gpu", "--no-sandbox", "disable-infobars", "disable-plugins", "ignore-certificate-errors", "disable-extensions");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.kitapyurdu.com/");
    }

    @After
    public void TearDown() {
        driver.quit();
    }
}
