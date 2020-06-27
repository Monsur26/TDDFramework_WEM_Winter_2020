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
    @Test
    public void testAutoProgressive() throws InterruptedException {
        getInitElements();
        homePage.autoProgressive();
    }
    @Test(priority = 2)
    public void testZipCode() throws InterruptedException {
        getInitElements();
        homePage.quoteProgressive();
    }
    @Test(priority = 3)
    public void testHomeProgressive() throws InterruptedException {
        getInitElements();
        homePage.homeProgressive();
    }
    @Test(priority = 4)
    public void testExploreProgressive() throws InterruptedException {
        getInitElements();
        homePage.exploreProgressive();
    }
    @Test(priority = 5)
    public void testAtvProgressive() throws InterruptedException {
        getInitElements();
        homePage.atvProgressive();
    }
    @Test(priority = 6)
    public void testAtvZipCodeProgressive() throws InterruptedException {
        getInitElements();
        homePage.atvZipCodeProgressive();
    }
    @Test(priority = 7)
    public void testGetAQuoteProgressive() throws InterruptedException {
        getInitElements();
        homePage.getAQuoteProgressive();
    }
    @Test(priority = 8)
    public void testDataProgressive() throws InterruptedException {
        getInitElements();
        homePage.dataProgressive();
    }
}
