package hometest;

import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageTest extends WebAPI {
    static HomePage homePage; // Reference Variable/ object of HomePage


    public static void getInitElements(){
        homePage= PageFactory.initElements(driver, HomePage.class);
    }


    @Test
    public void testSearchProduct() throws InterruptedException {
        getInitElements();
        homePage.searchProduct();
    }
    @Test
    public void testAmazonTodaysDeal() throws InterruptedException {
        getInitElements();
        homePage.amazonTodaysDeal();
    }
    @Test
    public void testAmazonBestSellerProducts() throws InterruptedException {
        getInitElements();
        homePage.bestSellerProduct();
    }
    @Test
    public void testAmazonBestSellerBooks() throws InterruptedException {
        getInitElements();
        homePage.checkBestSellerBooks();
    }
    @Test
    public void testAmazonProductSearch() throws InterruptedException {
        getInitElements();
        homePage.productSearch();
    }
    @Test
    public void testAmazonProductAddedToCart() throws InterruptedException {
        getInitElements();
        homePage.productAddedToCart();
    }
    @Test
    public void testAmazonAllDeptDropDown() throws InterruptedException {
        getInitElements();
        homePage.AmazonAlldeptDropDown();
    }
    @Test
    public void testAmazonProductMenu() throws InterruptedException {
        getInitElements();
        homePage.amazonProductMenuBar();
    }
    @Test
    public void testAmazonTryPrime() throws InterruptedException {
        getInitElements();
        homePage.amazonTryPrime();
    }
    @Test
    public static void testNewRelease() throws InterruptedException {
        getInitElements();
        homePage.selectNewReleases();
    }
    @Test
    public void testAmazonAccountAndList() throws InterruptedException {
        getInitElements();
        homePage.AmazonAccountLists();
    }



}
