package hometest;

import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class HomePageTest4 extends WebAPI {

    static HomePage homePage; // Reference Variable/ object of HomePage


    public static void getInitElements(){
        homePage= PageFactory.initElements(driver, HomePage.class);
    }


    @Test
    public void testSearchProduct4() throws InterruptedException {
        getInitElements();
        homePage.searchProduct4();
        //comment
        //
    }



}


