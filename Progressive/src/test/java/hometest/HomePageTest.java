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
    public void testProgressiveAuto() throws InterruptedException {
        getInitElements();
        homePage.ProgressiveAuto();
    }
    @Test
    public void testProgressiveExploreProducts() throws InterruptedException {
        getInitElements();
        homePage.ProgressiveExploreProducts();
    }
    @Test
    public void testProgressiveExploreAutoInfoPage() throws InterruptedException {
        getInitElements();
        homePage.ProgressiveAutoInfopage();
    }

    @Test
    public void testexploreHomeowner() throws InterruptedException {
        getInitElements();
        homePage.exploreHomeowner();
    }
    @Test
    public void testexploreHomeownersMouseHover() throws InterruptedException {
        getInitElements();
        homePage.exploreHomeownersMouseHover();
    }
    @Test
    public void testexploreHomeownersCoverage() throws InterruptedException {
        getInitElements();
        homePage.exploreHomeownerCoverage();
    }
    @Test
    public void testMoreChoices()  {
        getInitElements();
        homePage.moreChoices();
    }
    @Test
    public void testautoQuote()  {
        getInitElements();
        homePage.autoQuote();
    }
    @Test
    public void testExploreViewAllProduct()  {
        getInitElements();
        homePage.exploreAllProducts();
    }
    @Test
    public void testExploreViewAllProductPageDown()  {
        getInitElements();
        homePage.exploreAllProductsScrollDown();
    }
    @Test
    public void testExploreViewAllProductPageDownNUp() throws InterruptedException {
        getInitElements();
        homePage.exploreAllProductsScrollDownNUp();
    }
}
