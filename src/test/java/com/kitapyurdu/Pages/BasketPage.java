package com.kitapyurdu.Pages;

import com.kitapyurdu.Base.BaseTest;
import com.kitapyurdu.Methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasketPage {
    WebDriver driver;
    Methods methods;

    public BasketPage() {
        driver = BaseTest.driver;
        methods = new Methods();
    }

    public void switchBasketPage() {
        methods.click(By.id("cart"));
        methods.waitBySeconds(1);
        methods.click(By.id("js-cart"));
    }

    public void addQuantity(String quantity) {
        methods.clearInputArea(By.name("quantity"));
        methods.sendKeys(By.name("quantity"), quantity);
        methods.sendKeysEnter(By.name("quantity"));
    }

    public void clickBuyProduct() {
        methods.click(By.xpath("//div[@class='right']/a[contains(.,'Satın Al')]"));
    }

    public void buyProduct() {
        methods.click(By.id("button-checkout-continue"));
        methods.sendKeys(By.id("credit-card-owner"), "Ramazan Tüylüoğlu");
        methods.sendKeys(By.id("credit_card_number_1"), "5487");
        methods.sendKeys(By.id("credit_card_number_2"), "9302");
        methods.sendKeys(By.id("credit_card_number_3"), "0228");
        methods.sendKeys(By.id("credit_card_number_4"), "4112");
        methods.selectByText(By.id("credit-card-expire-date-month"), "12");
        methods.wait.until(ExpectedConditions.elementToBeClickable(By.id("credit-card-expire-date-year")));
        methods.selectByText(By.id("credit-card-expire-date-year"), "2026");
        methods.sendKeys(By.id("credit-card-security-code"), "411");
        methods.wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[type=\"checkbox\"]")));
        WebElement basketCheckBox1 = methods.findElement(By.cssSelector("input[type=\"checkbox\"]"));
        basketCheckBox1.click();
        methods.click(By.id("button-checkout-continue"));
        methods.wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[type=\"checkbox\"]")));
        WebElement basketCheckBox = methods.findElement(By.cssSelector("input[type=\"checkbox\"]"));
        basketCheckBox.click();
        methods.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='button']\n")));
        methods.click(By.xpath("//input[@class='button']\n"));
        methods.isElementVisible(By.className("css = .warning\n"));
        String actual = methods.getText(By.className("css = .warning\n"));
        methods.assertPage("Ödeme Alınamadı", "Kart bilgileriniz doğrulanamadı, lütfen tekrar deneyiniz.\n", actual);
    }

    public void createAddress() {
        methods.sendKeys(By.id("address-firstname-companyname"), "Ramazan");
        methods.sendKeys(By.id("address-lastname-title"), "Tüylüoğlu");
        methods.selectByText(By.id("address-zone-id"), "İstanbul");
        methods.selectByText(By.id("address-county-id"), "MALTEPE");
        methods.sendKeys(By.id("address-address-text"), "Fındıklı mah. petrol sok.");
        methods.sendKeys(By.id("address-telephone"), "2163699328");
        methods.sendKeys(By.id("address-mobile-telephone"), "5061485335");
        methods.click(By.id("button-checkout-continue"));
        methods.waitBySeconds(2);
    }

}
