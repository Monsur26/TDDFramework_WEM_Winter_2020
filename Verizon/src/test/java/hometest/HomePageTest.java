package hometest;

import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageTest extends WebAPI {

    static HomePage homePage; // Reference Variable/ object of HomePage

    public static void getInitElements() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test(priority = 1)
    public void testVerizonShop() throws InterruptedException {
        getInitElements();
        homePage.VerizonShop();
    }
    @Test(priority = 2)
    public void testScrollDownVerizonWireless() throws InterruptedException {
        getInitElements();
        homePage.ScrollDownVerizonWireless();
    }
    @Test(priority = 3)
    public void testShopDealsVerizonInHome() throws InterruptedException {
        getInitElements();
        homePage.VerizonInHomeShopDeals();
    }
    @Test(priority = 4)
    public void testFiosTvTestDriverVerizonInHome() throws InterruptedException {
        getInitElements();
        homePage.FiosTvTestDriverSelected();
    }
    @Test(priority = 5)
    public void testwirelessPhonesScrollsVerizonInHome() throws InterruptedException {
        getInitElements();
        homePage.wirelessPhonesScrolldownNUp();
    }
    @Test(priority = 6)
    public void testwirelessPhonesPricing() throws InterruptedException {
        getInitElements();
        homePage.wirelessPhonesPricing();
    }
    @Test(priority = 7)
    public void testwirelessPhonesFilterBrand() throws InterruptedException {
        getInitElements();
        homePage.wirelessPhonesFilterBrand();
    }
    @Test(priority = 8)
    public void testsearchProduct() throws InterruptedException {
        getInitElements();
        homePage.searchProduct();
    }
    @Test(priority = 9)
    public void testVerizonHomeTvGuide() throws InterruptedException {
        getInitElements();
        homePage.VerizoninHomeWatchTVGuide();
    }
    @Test(priority = 10)
    public void testVerizonSignIn() throws InterruptedException {
        getInitElements();
        homePage.VerizonSignIn();
    }

}
