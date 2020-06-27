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
    public void testSearchBarUnitedHealthInsurance() throws InterruptedException {
        getInitElements();
        homePage.searchBarUnitedHealthInsurance();
    }
    @Test(priority = 2)
    public void testSearchButtonUnitedHealthCareInsurance() throws InterruptedException {
        getInitElements();
        homePage.searchResultUnitedHealthCareInsurance();
    }
    @Test(priority = 3)
    public void testunderstandingCoverageUnitedHealthCare() throws InterruptedException {
        getInitElements();
        homePage.understandingCoverageUnitedHealthCare();
    }
}
