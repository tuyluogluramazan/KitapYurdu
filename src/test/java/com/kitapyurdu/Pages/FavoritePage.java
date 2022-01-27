package com.kitapyurdu.Pages;

import com.kitapyurdu.Base.BaseTest;
import com.kitapyurdu.Methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.kitapyurdu.Constants.Constants.FAVAROİTE_PAGE_LOCATER;

public class FavoritePage {
    WebDriver driver;
    Methods methods;
    Logger logger = LogManager.getLogger(ProductPage.class);

    public FavoritePage() {
        driver = BaseTest.driver;
        methods = new Methods();
    }

    public void switchPage() {
        methods.waitBySeconds(1);
        WebElement element = methods.findElement(By.xpath("//a[.=\'Listelerim\']"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element).perform();
        methods.waitBySeconds(1);
        methods.click(FAVAROİTE_PAGE_LOCATER);
    }

    public void assertFavoritePage() {
        methods.waitBySeconds(3);
        String actualValue = methods.getText(By.cssSelector(".favorite-tag"));
        String expectedValue = "etiketsiz\\\\n4";
        methods.assertPage("Ürün favorilere eklenmemiş", expectedValue, actualValue);
        logger.info("4 ürün favoriye eklendi " + actualValue);
    }


    public void addProductToFavorites() {
        for (int i = 2; i < 6; i++) {
            methods.wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".sprite.display-item")));
            if (methods.iselementToBeClickable(By.cssSelector(".sprite.display-item"))) {
                methods.click(By.xpath("//span[@class='sprite sprite-icon-list']"));
            }
            methods.click(By.className("display-item sprite sprite-icon-list-selected"));
            methods.scrollWithAction(By.xpath("(//div[@class='product-cr']//img)[" + i + "]"));
            methods.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='product-cr']//a[@class='add-to-favorites'])[" + i + "]")));
            methods.click(By.xpath("(//div[@class='product-cr']//a[@class='add-to-favorites'])[" + i + "]"));
        }
    }

    public void favoriteProductDeleteByIndex() {
        methods.wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".sprite.display-item")));
        if (methods.iselementToBeClickable(By.cssSelector(".sprite.display-item"))) {
            methods.click(By.xpath("//span[@class='sprite sprite-icon-list']"));
        }
        methods.click(By.xpath("(//div[@class='product-list']//i[@class='fa fa-heart-o'])[3]"));
        methods.waitBySeconds(2);
    }


}
