package hometest;
import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageTest extends WebAPI {
    static HomePage homePage;
    public static void getInitElements() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }


    @Test
    public void languageWebElement() throws InterruptedException {
        getInitElements();
        homePage.clickLanguage();
    }
    @Test
    public void currencyWebElement() throws InterruptedException {
        getInitElements();
        homePage.clickCurrency();
    }
    @Test
    public void menuWebElement() throws InterruptedException {
        getInitElements();
        homePage.mouseHoverMenu();
    }
    @Test
    public void logInWebElement() throws InterruptedException {
        getInitElements();
        homePage.clickLogIn();
    }
    @Test
    public void searchWebElement() throws InterruptedException {
        getInitElements();
        homePage.searchButton();
    }
    @Test
    public void searchClickWebElement() throws InterruptedException {
        getInitElements();
        homePage.searchClickButton();
    }
    @Test
    public void searchClickWebElemen1() throws InterruptedException {
        getInitElements();
        homePage.searchPlace();
    }
    @Test
    public void checkInWebElement() throws InterruptedException {
        getInitElements();
        homePage.CheckInSelection();
    }
    @Test
    public void checkOutWebElement() throws InterruptedException {
        getInitElements();
        homePage.CheckOutSelection();
    }
    @Test
    public void roomWebElement() throws InterruptedException {
        getInitElements();
        homePage.roomSelection();
    }


}
