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
        homePage.validateSearchProduct();
      }
    @Test
    public void testAmazonTodaysDeal() throws InterruptedException {
        getInitElements();
        homePage.amazonTodaysDeal();
        homePage.validateTodaysDeal();
    }
    @Test
    public void testAmazonBestSellerProducts() throws InterruptedException {
        getInitElements();
        homePage.bestSellerProduct();
        homePage.validateBestSellerProduct();
    }
    @Test
    public void testAmazonBestSellerBooks() throws InterruptedException {
        getInitElements();
        homePage.checkBestSellerBooks();
        homePage.validateBestSellerBooks();
    }
    @Test
    public void testAmazonProductSearch() throws InterruptedException {
        getInitElements();
        homePage.productSearch();
        homePage.validateProductSearch();
    }
    @Test
    public void testAmazonProductAddedToCart() throws InterruptedException {
        getInitElements();
        homePage.productAddedToCart();
        homePage.validateProductAddedToCart();
    }
    @Test
    public void testAmazonAllDeptDropDown() throws InterruptedException {
        getInitElements();
        homePage.AmazonAlldeptDropDown();
        homePage.validateDropDown();
    }
    @Test
    public void testAmazonProductMenu() throws InterruptedException {
        getInitElements();
        homePage.amazonProductMenuBar();
        homePage.validateProductMenuBar();
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
        homePage.validateNewReleaseMovieTv();
    }
    @Test
    public void testAmazonAccountAndList() throws InterruptedException {
        getInitElements();
        homePage.AmazonAccountLists();
        homePage.validateAccountLists();
    }
    @Test
    public void testFindAGift() throws InterruptedException {
        getInitElements();
        homePage.findGift();
        homePage.validateFindGift();
    }
    @Test
    public void testDeliveryTo() throws InterruptedException {
        getInitElements();
        homePage.deliveryTo();
        homePage.validateDeliverTo();
    }
    @Test
    public void testCreateAList() throws InterruptedException {
        getInitElements();
        homePage.createAList();
        homePage.validateCreateAList();
    }


}
