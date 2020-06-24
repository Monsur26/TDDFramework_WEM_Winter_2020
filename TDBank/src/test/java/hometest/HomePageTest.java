package hometest;

import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageTest extends WebAPI {
    static HomePage homepage;
    public static void getInitElements(){
        homepage= PageFactory.initElements(driver, HomePage.class);
    }
    @Test
    public void loginButtonWebElement() throws InterruptedException {
        getInitElements();
        homepage.clickOnLogin();
    }
    @Test
    public void loginclickWebElement() throws InterruptedException {
        getInitElements();
        homepage.clickLoginButton();
    }
    @Test
    public void smallBusinessWebElement() throws InterruptedException {
        getInitElements();
        homepage.clickSmallBusiness();
    }
    @Test
    public void investingWebElement() throws InterruptedException {
        getInitElements();
        homepage.investing();
    }
    @Test
    public void productWebElement() throws InterruptedException {
        getInitElements();
        homepage.clickProduct();
    }
    @Test
    public void findUsWebElement() throws InterruptedException {
        getInitElements();
        homepage.clickFindUs();
    }
    @Test
    public void searchWebElement() throws InterruptedException {
        getInitElements();
        homepage.clickSearch();
    }
//    @Test
//    public void resourcesMHWebElement() throws InterruptedException {
//        getInitElements();
//        homepage.mouseHoverResources();
//    }



}
