package hometest;
import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.json.JsonException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.lang.reflect.InvocationTargetException;

public class VerizonTest5 extends WebAPI {
    static HomePage homePage; // Reference Variable/ object of HomePage


    public static void getInitElements(){
        homePage= PageFactory.initElements(driver, HomePage.class);
    }


    @Test
    public void testsignin() throws InterruptedException {
        getInitElements();
        homePage.signin();
    }



}

