package hometest;

import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageTest extends WebAPI {
    static HomePage homePage ;
    public static void getInitElements() { homePage = PageFactory.initElements(driver,HomePage.class); }
   /* @Test
    public void testTopMenu () throws InterruptedException {
        getInitElements();
        homePage.menuTop();
        homePage.validationTopMenu();
    }*/
   /* @Test
    public void testNavigationMenu () throws InterruptedException {
        getInitElements();
        homePage.menuNavigation();
        homePage.validationNavigationMenu();
    }*/
    @Test
    public void testServiceMenu () throws InterruptedException {
        getInitElements();
        homePage.menuService();
        homePage.validationServiceMenu();
    }
    @Test
    public void testTransport() throws InterruptedException {
        getInitElements();
        homePage.transportService();
        homePage.validationTransportService();
    }
    @Test
    public void testQuickService () throws InterruptedException {
        getInitElements();
        homePage.serviceQuick();
        homePage.validationQuickService();
    }
    @Test
    public void testUserAccess () throws InterruptedException {
        getInitElements();
        homePage.accessUser();
        homePage.validationUserAccessLink();
    }
    @Test
    public void checkRadioButton(){
        getInitElements();
        homePage.radioButtonSelectOneWay();
        homePage.validationOneWayRadio();
    }
    @Test
    public void testBlueTrue () throws InterruptedException {
        getInitElements();
        homePage.blueTrue();
        homePage.validationTrueBlue();
    }
    @Test
    public void testTripMy() throws InterruptedException {
        getInitElements();
        homePage.tripMy();
        homePage.validationMyTrip();
    }
    @Test
    public void testTravelInfo() throws InterruptedException {
        getInitElements();
        homePage.infoTravel();
        homePage.validationTravelInfo();
    }

}
