package hometest;
import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class JetBlueHomePageTest2 extends WebAPI {

    static HomePage homePage;

    public static void getInitElements() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }
    @Test(priority = 1)
    public void travelWebElement() throws InterruptedException {
        getInitElements();
        homePage.mouseHoverTravel();
    }
    @Test(priority = 2)
    public void travelWebElement1() throws InterruptedException {
        getInitElements();
        homePage.clickTravel();
    }

    @Test(priority = 3)
    public void oneWaylWebElement() throws InterruptedException {
        getInitElements();
        homePage.oneWayRadioButton();
    }
    @Test(priority = 4)
    public void joinWebElement() throws InterruptedException {
        getInitElements();
        homePage.joinIn();
    }
    @Test(priority = 5)
    public void checkBoxWebElement() throws InterruptedException {
        getInitElements();
        homePage.checkBox1();
    }
    @Test(priority = 6)
    public void signInWebElement() throws InterruptedException {
        getInitElements();
        homePage.signIn();
    }
    @Test(priority = 7)
    public void flightTrakerWebElement() throws InterruptedException {
        getInitElements();
        homePage.mouseHoverFligh();
    }
    @Test(priority = 8)
    public void checkInWebElement() throws InterruptedException {
        getInitElements();
        homePage.mouseHoverCheckIn();
    }
    @Test(priority = 9)
    public void checkInWebElement1() throws InterruptedException {
        getInitElements();
        homePage.clickCheckIn();
    }
    @Test(priority = 10)
    public void travelAlertWebElement1() throws InterruptedException {
        getInitElements();
        homePage.mouseHoverTravelAlert();
    }
    @Test(priority = 11)
    public void firtNameWebElement() throws InterruptedException {
        getInitElements();
        homePage.firstName();
    }
    @Test(priority = 12)
    public void lastNameWebElement() throws InterruptedException {
        getInitElements();
        homePage.lastName();
    }
    @Test(priority = 13)
    public void confirmationCodeWebElement() throws InterruptedException {
        getInitElements();
        homePage.putConfirmation();
    }
    @Test(priority = 14)
    public void findFlightsWebElement() throws InterruptedException {
        getInitElements();
        homePage.continueToFindFlights();
    }




}
