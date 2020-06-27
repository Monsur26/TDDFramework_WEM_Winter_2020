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


//    @Test
//    public void testSearchProduct() throws InterruptedException {
//        getInitElements();
//        homePage.searchProduct();
//
//    }
//    @Test(priority = 2)
//    public void testSearchProduct1() throws InterruptedException {
//        getInitElements();
//        homePage.searchProduct1();
//    }
//    @Test(priority = 3)
//    public void testClickProduct2() throws InterruptedException {
//        getInitElements();
//        homePage.clickProduct3();
//    }

//    @Test(priority = 4)
//    public void testS20Ultra() throws InterruptedException {
//        getInitElements();
//        homePage.Samsung();
//
//    }
    @Test(priority = 5)
    public void testBicycle() throws InterruptedException {
        getInitElements();
        homePage.Bicycle();
    }
//    @Test(priority = 6)
//    public void testOled() throws InterruptedException {
//        getInitElements();
//        homePage.Oled();
//    }
//    @Test(priority = 7)
//    public void testCustomerReturn() throws InterruptedException {
//        getInitElements();
//        homePage.customerRefund();
//    }
//    @Test(priority = 8)
//    public void testGame() throws InterruptedException {
//        getInitElements();
//        homePage.Game();
//    }
//    @Test(priority = 9)
//    public void testFoodItem() throws InterruptedException {
//        getInitElements();
//        homePage.foodItem();
//    }
//    @Test(priority = 10)
//    public void testAmazonLogo() throws InterruptedException {
//        getInitElements();
//        homePage.amazonLogo();
//    }
}
