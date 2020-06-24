package hometest;
import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageTest2 extends WebAPI {
    static HomePage homepage;

    public static void getInitElements() {
        homepage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test
    public void servicesMHWebElement() throws InterruptedException {
        getInitElements();
        homepage.mouseHoverServices();
    }
    @Test
    public void productMHWebElement() throws InterruptedException {
        getInitElements();
        homepage.mouseHoverProduct();
    }
    @Test
    public void logInMHWebElement() throws InterruptedException {
        getInitElements();
        homepage.mouseHoverLogIn();
    }

    @Test
    public void searchMHWebElement() throws InterruptedException {
        getInitElements();
        homepage.mouseHoverSearch();
    }
    @Test
    public void learnMoreMHWebElement() throws InterruptedException {
        getInitElements();
        homepage.mouseHoverLearnMore();
    }
//    @Test
//    public void searchBoxWebElement() throws InterruptedException {
//        getInitElements();
//        homepage.serachBoxcClick();
//    }


    @Test
    public void flgWebElement() throws InterruptedException {
        getInitElements();
        homepage.clickOnFlag();
    }
    @Test
    public void helpWebElement() throws InterruptedException {
        getInitElements();
        homepage.clickHelp();
    }
//    @Test
//    public void dropdownProductWebElement() throws InterruptedException {
//        getInitElements();
//        homepage.dropdown(3);
//    }





}
