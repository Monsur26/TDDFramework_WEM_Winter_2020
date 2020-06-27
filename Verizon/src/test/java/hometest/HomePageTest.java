package hometest;

import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageTest extends WebAPI {
    static HomePage homePage; // Reference Variable/ object of HomePage


    public static void getInitElements() throws InterruptedException {
        homePage= PageFactory.initElements(driver, HomePage.class);
    }
//    @Test(priority = 1)
//    public void testWirelessVerizon() throws InterruptedException {
//        getInitElements();
//        homePage.wirelessVerizon();
//    }
//    @Test(priority = 2)
//    public void testPhonesVerizon() throws InterruptedException {
//        getInitElements();
//        homePage.phonesVerizon();
//    }
//    @Test(priority = 3)
//    public void testAppleIphone11ProMaxVerizon() throws InterruptedException {
//        getInitElements();
//        homePage.appleIphone11ProMaxVerizon();
//    }
//    @Test(priority = 4)
//    public void testColorAppleIphone11ProMaxVerizon() throws InterruptedException {
//        getInitElements();
//        homePage.colorAppleIphone11ProMaxVerizon();
//    }
//    @Test(priority = 5)
//    public void testAddToCartAppleIphone11ProMaxVerizon() throws InterruptedException {
//        getInitElements();
//        homePage.addToCartAppleIphone11ProMaxVerizon();
//    }
//    @Test(priority = 6)
//    public void testZipCodeAppleIphone11ProMaxVerizon() throws InterruptedException {
//        getInitElements();
//        homePage.zipCodeAppleIphone11ProMaxVerizon();
//    }
//    @Test(priority = 7)
//    public void testDealsVerizon() throws InterruptedException {
//        getInitElements();
//        homePage.dealsVerizon();
//    }
//    @Test(priority = 8)
//    public void testSearchVerizon() throws InterruptedException {
//        getInitElements();
//        homePage.searchVerizon();
//    }
//    @Test(priority = 9)
//    public void testSignInVerizon() throws InterruptedException {
//        getInitElements();
//        homePage.signInVerizon();
//    }
    @Test(priority = 10)
    public void testMotorolaEdgePlusVerizon() throws InterruptedException {
        getInitElements();
        homePage.motorolaEdgePlusVerizon();

    }
}
