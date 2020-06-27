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
//    @Test
//    public void testNews() throws InterruptedException {
//        getInitElements();
//        homePage.News();
//    }
//    @Test(priority = 2)
//    public void testUS() throws InterruptedException {
//        getInitElements();
//        homePage.summerCNN();
//    }
//    @Test(priority = 3)
//    public void testMedicineCnn() throws InterruptedException {
//        getInitElements();
//        homePage.medicineCnnNews();
//    }
//    @Test(priority = 4)
//    public void testCnnMenuNews() throws InterruptedException {
//        getInitElements();
//        homePage.cnnMenuNews();
//    }
//    @Test(priority = 5)
//    public void testCnnCoronaVirus() throws InterruptedException {
//        getInitElements();
//        homePage.cnnCoronaVirus();
//    }
//    @Test(priority = 6)
//    public void testCnnCoronaVirusPandemic() throws InterruptedException {
//        getInitElements();
//        homePage.cnnCoronaVirusPandemic();
//    }
//    @Test(priority = 7)
//    public void testCnnWorldNews() throws InterruptedException {
//        getInitElements();
//        homePage.cnnWorldNews();
//    }
//    @Test(priority = 8)
//    public void testCnnElection2020() throws InterruptedException {
//        getInitElements();
//        homePage.cnnElection2020();
//    }
//    @Test(priority = 9)
//    public void testCnnBusinessFinal() throws InterruptedException {
//        getInitElements();
//        homePage.cnnBusinessFinal();
//    }
    @Test(priority = 10)
    public void testCnnHealthFinal() throws InterruptedException {
        getInitElements();
        homePage.cnnHealthFinal();
    }
}
