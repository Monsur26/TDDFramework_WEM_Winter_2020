package hometest;

import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AmazonHomePageTest extends WebAPI {
    static HomePage homePage;


    public static void getInitElements(){
        homePage= PageFactory.initElements(driver, HomePage.class);
    }


    @Test(priority = 11)
    public void testSearchProduct() throws InterruptedException {
        getInitElements();
        homePage.searchProduct();
    }
    @Test(priority = 1)
    public void searchButtonWebElement() throws InterruptedException {
        getInitElements();
        homePage.searchButton();
    }


        @Test(priority = 2)
    public void wholeFoodsWebElement() throws InterruptedException {
        getInitElements();
        homePage.searchButton();
    }
    @Test(priority = 3)
    public void homeIconWebElement() throws InterruptedException {
        getInitElements();
        homePage.homeIcon();
    }
    @Test(priority = 4)
    public void bestSellersWebElement() throws InterruptedException {
        getInitElements();
        homePage.bestSellers();

    }
    @Test(priority = 5)
    public void customerServiceWebElement() throws InterruptedException {
        getInitElements();
        homePage.CustomerService();
    }

    @Test(priority = 7)
    public void searchItem() throws InterruptedException {
        getInitElements();
        homePage.searchItem();
    }
    @Test(priority = 8)
    public void accountAndListWebElement() throws InterruptedException {
        getInitElements();
        homePage.accountAndList();
    }



    @Test(priority = 9)
    public void searchItem2() throws InterruptedException {
        getInitElements();
        homePage.searchItem2();
    }

    @Test(priority = 10)
    public static void testNewRelease() throws InterruptedException {
        getInitElements();
        homePage.selectNewReleases();
    }

    @Test(priority = 0)
    public void testAmazonAccountAndList() throws InterruptedException {
        getInitElements();
        homePage.AmazonAccountLists();
    }






}