package com.kitapyurdu.Tests;

import com.kitapyurdu.Base.BaseTest;
import com.kitapyurdu.Pages.*;
import org.junit.Test;

public class Tests extends BaseTest {
    @Test
    public void testCases() {
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        SearchPage searchPage = new SearchPage();
        ProductPage productPage = new ProductPage();
        BasketPage basketPage = new BasketPage();
        FavoritePage favoritePage = new FavoritePage();

        //Anasayfa kontrol
        homePage.assertHomePage();
        //Login işlemi
        loginPage.login();
        //Ürün arama
    /*    searchPage.searchProduct();
        //Favorilere Ürün Ekleme
        favoritePage.addProductToFavorites();
        //Favoriler Sayfasına geçiş
        favoritePage.switchPage();
        //Favorilerim sayfası doğrulama
        favoritePage.assertFavoritePage();
        //Anasayfaya geçiş
        homePage.switchPage();
        //Ürün filtreleme
        productPage.selectFilter();
        //Sepete Ürün Ekleme
        productPage.addToBasket();
        //Favorilerim sayfasına geçiş*/
        favoritePage.switchPage();
        //Favoriler Sayfasından ürün silme
        favoritePage.favoriteProductDeleteByIndex();
        //Sepetim sayfasına geçiş
        //basketPage.switchBasketPage();
        //Ürün adeti arttırma
        //basketPage.addQuantity("2");
        //Satın al butonuna basma
        //basketPage.clickBuyProduct();
        //Adres bilgileri girme
        //basketPage.createAddress();
        //Satın alma işlemleri
        //basketPage.buyProduct();
        //Logout işlemi
        //loginPage.logout();
    }
}
