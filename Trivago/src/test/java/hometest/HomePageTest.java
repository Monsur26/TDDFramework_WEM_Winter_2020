package hometest;

import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageTest extends WebAPI {
    static HomePage homePage;
    public static void getInitElements() {homePage= PageFactory.initElements(driver,HomePage.class);
    }
   /* @Test
    public void testlogButton()throws InterruptedException {
        getInitElements();
        homePage.buttonLog();
    }*/
    /*@Test
    public void testMenuButton()throws InterruptedException {
        getInitElements();
        homePage.buttonMenu(); }
     @Test
     public void testPaymentMethod()throws InterruptedException{
         getInitElements();
         homePage.methodPayment();
        }

    @Test
    public void testCurrencyButton()throws InterruptedException {
        getInitElements();
        homePage.buttonCurrency();
    }
    @Test
    public void testLanguageButton()throws InterruptedException {
        getInitElements();
        homePage.buttonLanguage();
    }
    @Test
    public void testSearchBar()throws InterruptedException {
        getInitElements();
        homePage.barSearch();
    }
    @Test
    public void testSearchButton()throws InterruptedException {
        getInitElements();
        homePage.buttonSearch();
    }*/
    @Test
    public void testBottomBar()throws InterruptedException {
        getInitElements();
        homePage.barBottom();
    }
}
