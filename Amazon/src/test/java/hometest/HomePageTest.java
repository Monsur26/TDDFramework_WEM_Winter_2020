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
    public void searchButtonWebElement() throws InterruptedException {
        getInitElements();
        homePage.searchButton();
    }

//    @Test
//    public void clickItemWebElement() throws InterruptedException {
//        getInitElements();
//        homePage.clickProduct();
//    }
//    @Test
//    public void newReleaseWebElement()throws InterruptedException{
//        getInitElements();
//        homePage.clickNewRelease();
//    }

//    @Test
//    public void wholeFoodsWebElement() throws InterruptedException {
//        getInitElements();
//        homePage.searchButton();
//    }
    @Test
    public void homeIconWebElement(){
        getInitElements();
        homePage.homeIcon();
    }
    @Test
    public void bestSellersWebElement(){
        getInitElements();
        homePage.bestSellers();

    }
    @Test
    public void customerServiceWebElement(){
        getInitElements();
        homePage.CustomerService();
    }
//    @Test
//    public void newReleaseWebElement(){
//        getInitElements();
//        homePage.newRelease();
//    }

   @Test
    public void findGiftWebElement(){
        getInitElements();
       homePage.findGift();
   }
    @Test
    public void searchItem() throws InterruptedException {
        getInitElements();
        homePage.searchItem();
    }
   @Test
    public void accountAndListWebElement(){
        getInitElements();
       homePage.accountAndList();
   }
    @Test
    public void orderWebElement(){
        getInitElements();
        homePage.order();
    }
    @Test
    public void cartWebElement(){
        getInitElements();
        homePage.cart();
    }





}
