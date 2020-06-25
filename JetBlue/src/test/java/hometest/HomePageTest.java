package hometest;

import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageTest extends WebAPI {
    static HomePage homePage;
    public static void getInitElements(){
        homePage= PageFactory.initElements(driver, HomePage.class);
    }

    @Test(priority = 1)
    public void testDoBookingItem() throws InterruptedException {
        getInitElements();
        homePage.doBookingButtonWork();
        homePage.validateBookingButton();
    }
    @Test(priority = 2)
    public void testDoHoverMouse() throws InterruptedException {
        getInitElements();
        homePage.doFlightSelect();
        homePage.validateJetBlueLogo();
    }
    @Test(priority = 3)
    public void testAirportAndOneWaySelect() throws InterruptedException {
        getInitElements();
        homePage.tripTypeSelect();
        homePage.validateJetBlueLogo();
    }
    @Test(priority = 4)
    public void testAirportsSelect() throws InterruptedException {
        getInitElements();
        homePage.airportsSelect();
        homePage.validateFlightSelect();
    }
    @Test(priority = 5)
    public void testBlueCheckBox() throws InterruptedException {
        getInitElements();
        homePage.bluePointCheckBOX();
        homePage.validateJetBlueLogo();
    }
    @Test(priority = 6)
    public void testTravellerMenu() throws InterruptedException {
        getInitElements();
        homePage.travellerInfoMenuSelect();
        homePage.validateTravellerMenu();
    }
    @Test(priority = 7)
    public void testFaceBookPage(){
        getInitElements();
        homePage.JetBlueFBPage();

    }
    @Test(priority = 8)
    public void testLanguageChange(){
        getInitElements();
        homePage.languageSelect();
        homePage.validateJetBlueLogo();
    }
    @Test(priority = 9)
    public void testMyTripMenu(){
        getInitElements();
        homePage.myTrip();
        homePage.validateJetBlueLogo();
    }
    @Test(priority = 10)
    public void testScrolling(){
        getInitElements();
        homePage.scrollDownHomePage();
        homePage.validateJetBlueLogo();
    }
    @Test(priority = 11)
    public void testMyTripStatus(){
        getInitElements();
        homePage.myTripStatus();

    }
}
