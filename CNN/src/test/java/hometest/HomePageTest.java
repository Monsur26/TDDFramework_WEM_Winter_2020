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
    public void testCNNUS() throws InterruptedException {
        getInitElements();
        homePage.cnnUS();
    }
    @Test
    public void testCNNEdition() throws InterruptedException {
        getInitElements();
        homePage.cnnEdition();
    }
    @Test
    public void testCNNMenuSearch() throws InterruptedException {
        getInitElements();
        homePage.cnnMenuBar();
    }
    @Test
    public void testCNNBusiness() throws InterruptedException {
        getInitElements();
        homePage.cnnBusiness();
    }
    @Test
    public void testCNNEntertainment() throws InterruptedException {
        getInitElements();
        homePage.cnnEntertainment();
    }
    @Test
    public void testCNNBusinessPerspective() throws InterruptedException {
        getInitElements();
        homePage.cnnBusinessPerspectives();
    }
    @Test
    public void testCNNGoBackHW() throws InterruptedException {
        getInitElements();
        homePage.cnnGoBackHP();
    }
    @Test
    public void testCNNGSubHeaders() throws InterruptedException {
        getInitElements();
        homePage.cnnSubHeaders();
    }
    @Test
    public void testCNNPolitics() throws InterruptedException {
        getInitElements();
        homePage.cnnPolitics();
    }
    @Test
    public void testCNNElectionStates() throws InterruptedException {
        getInitElements();
        homePage.cnnElectionStates();
    }

}
