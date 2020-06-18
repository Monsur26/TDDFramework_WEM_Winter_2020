package hometest;

import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class HomePageTest extends WebAPI {

        static HomePage homePage;

        public static void getInitElements(){
            homePage= PageFactory.initElements(driver, HomePage.class);
        }

        @Test //Nadim test 1
        public void cnnUSVersion() throws InterruptedException, IOException {
            getInitElements();
            driver.manage().window().maximize();
            sleepFor(2);
            homePage.clickCnnUS();
        }

    @Test //Nadim test 2
    public void cnnIntVersion() throws InterruptedException, IOException {
        getInitElements();
        driver.manage().window().maximize();
        sleepFor(2);
        homePage.clickCnnInt();
    }

    @Test //Nadim test 3
    public void cnnSpanishVersion() throws InterruptedException, IOException {
        getInitElements();
        driver.manage().window().maximize();
        sleepFor(2);
        homePage.clickCnnSpan();
    }

    @Test //Nadim test 4
    public void cnnUnitedVersionDropdown() throws InterruptedException, IOException {
        getInitElements();
        driver.manage().window().maximize();
        sleepFor(2);
        homePage.clickCnnUnited();
    }

    @Test //Nadim test 5
    public void cnnArabVersionDropdown() throws InterruptedException, IOException {
        getInitElements();
        driver.manage().window().maximize();
        sleepFor(2);
        homePage.clickCnnArab();
    }

    @Test //Nadim test 6
    public void cnnSpanVersionDropdown() throws InterruptedException, IOException {
        getInitElements();
        driver.manage().window().maximize();
        sleepFor(2);
        homePage.clickCnnSpan();
    }

    @Test //Nadim test 7
    public void cnnEnterZip() throws InterruptedException, IOException {
        getInitElements();
        setUp(true, "", "windows", "", "chrome", "", "https://www.cnn.com");
        driver.manage().window().maximize();
        sleepFor(2);
        homePage.CNNEZipCode();
        sleepFor(1);
        homePage.enterZipCode("11102");
        sleepFor(1);
        homePage.cnnSetLocation();
    }

    @Test //Nadim test 8
    public void cnnStyle() throws InterruptedException, IOException {
        getInitElements();
        setUp(true, "", "windows", "", "chrome", "", "https://www.cnn.com");
        driver.manage().window().maximize();
        sleepFor(2);
        homePage.cnnStyleNews.click();
    }

    @Test //Nadim test 9
    public void cnnWorldFrontPage() throws InterruptedException, IOException {
        getInitElements();
        setUp(true, "", "windows", "", "chrome", "", "https://www.cnn.com");
        driver.manage().window().maximize();
        sleepFor(2);
        homePage.worldCNNEdition();
    }

    @Test //Nadim test 10
    public void cnnUSFrontPage() throws InterruptedException, IOException {
        getInitElements();
        setUp(true, "", "windows", "", "chrome", "", "https://www.cnn.com");
        driver.manage().window().maximize();
        sleepFor(2);
        homePage.usCNNEdition();
    }









}
