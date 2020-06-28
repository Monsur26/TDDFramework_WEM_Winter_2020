package hometest;

import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageTest extends WebAPI {
    static HomePage homePage;
    public static void getInitElements() {homePage= PageFactory.initElements(driver,HomePage.class);
    }
   /* @Test
    public void testBusinessMenu()throws InterruptedException {
        getInitElements();
        homePage.businessTopMenu();
    }
*/
   /* @Test
    public void testmyVerizon()throws InterruptedException {
        getInitElements();
        homePage.myVerizonSelect();
    }
    @Test
    public void testMovingButton()throws InterruptedException {
        getInitElements();
        homePage.movingButtonSelect();
    }*/
   /* @Test
    public void testsearchButton()throws InterruptedException {
        getInitElements();
        homePage.searchButtonSelect();
    }
    @Test
    public void testRadioButton()throws InterruptedException {
        getInitElements();
        homePage.radioButtonYesSelect();
    }

    @Test
    public void testDropDown()throws InterruptedException {
        getInitElements();
        homePage.dropDownSelectedOpt();
    }*/
    /*@Test
    public void testSignInButton()throws InterruptedException {
        getInitElements();
        homePage.signInButtonSelect();
    }
    @Test
    public void testRegisterButton()throws InterruptedException {
        getInitElements();
        homePage.registerButtonSelect();
    }*/
    @Test
    public void testLocateButton()throws InterruptedException {
        getInitElements();
        homePage.locateButtonSelect();
    }
    @Test
    public void testLocateSignIn()throws InterruptedException {
        getInitElements();
        homePage.locateSignInSelect();
    }
    @Test
    public void testDropDownChange()throws InterruptedException {
        getInitElements();
        homePage.dropDownChangeSelect();
    }
    @Test
    public void testCheckBoxButton()throws InterruptedException {
        getInitElements();
        homePage.checkBoxButtonSelect();
    }
}
