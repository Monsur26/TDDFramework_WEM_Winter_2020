package hometest;
import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageTest2 extends WebAPI {
    static HomePage homePage;

    public static void getInitElements() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }
    @Test
    public void travelWebElement() throws InterruptedException {
        getInitElements();
        homePage.mouseHoverTravel();
    }
    @Test
    public void travelWebElement1() throws InterruptedException {
        getInitElements();
        homePage.clickTravel();
    }
//    @Test
//    public void scrollWeb() throws InterruptedException {
//        getInitElements();
//        homePage.scroll();
//    }
    @Test
    public void oneWaylWebElement() throws InterruptedException {
        getInitElements();
        homePage.oneWayRadioButton();
    }
    @Test
    public void joinWebElement() throws InterruptedException {
        getInitElements();
        homePage.joinIn();
    }
    @Test
    public void checkBoxWebElement() throws InterruptedException {
        getInitElements();
        homePage.checkBox1();
    }
    @Test
    public void signInWebElement() throws InterruptedException {
        getInitElements();
        homePage.signIn();
    }
    @Test
    public void flightTrakerWebElement() throws InterruptedException {
        getInitElements();
        homePage.mouseHoverFligh();
    }
    @Test
    public void checkInWebElement() throws InterruptedException {
        getInitElements();
        homePage.mouseHoverCheckIn();
    }
    @Test
    public void checkInWebElement1() throws InterruptedException {
        getInitElements();
        homePage.clickCheckIn();
    }
    @Test
    public void travelAlertWebElement1() throws InterruptedException {
        getInitElements();
        homePage.mouseHoverTravelAlert();
    }
    @Test
    public void firtNameWebElement() throws InterruptedException {
        getInitElements();
        homePage.firstName();
    }
    @Test
    public void lastNameWebElement() throws InterruptedException {
        getInitElements();
        homePage.lastName();
    }
    @Test
    public void confirmationCodeWebElement() throws InterruptedException {
        getInitElements();
        homePage.putConfirmation();
    }
    @Test
    public void findFlightsWebElement() throws InterruptedException {
        getInitElements();
        homePage.continueToFindFlights();
    }



}

