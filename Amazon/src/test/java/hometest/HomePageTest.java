package hometest;

import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class HomePageTest extends WebAPI {
    static HomePage homePage; // Reference Variable/ object of HomePage


    public static void getInitElements(){
        homePage= PageFactory.initElements(driver, HomePage.class);
    }


    @Test
    public void testSearchProduct() throws InterruptedException {
        getInitElements();
        homePage.searchProduct();
    }

    @Test //Nadim test 1
    public void searchForChips() throws InterruptedException, IOException {
        getInitElements();
        homePage.searchChips();

    }



}
