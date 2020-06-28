package hometest;
import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Progressive_HomePage_Test extends WebAPI {
    static HomePage homePage;
    public static void getInitElements(){homePage= PageFactory.initElements(driver,HomePage.class); }

    @Test(priority = 1)
    public void autozip(){
        getInitElements();
        homePage.autozip();
    }
    @Test(priority = 2)
    public void explo(){
        getInitElements();
        homePage.explo();
    }
    @Test(priority = 3)
    public void popuphandling(){
        getInitElements();
        homePage.popuphandling();
    }
    @Test(priority = 4)
    public void login(){
        getInitElements();
        homePage.login();
    }
    @Test(priority = 5)
    public void pass(){
        getInitElements();
        homePage.pass();
    }
    @Test(priority = 6)
    public void checkbox()  {
        getInitElements();
        homePage.checkbox();
    }
    @Test(priority = 7)
    public void submit(){
        getInitElements();
        homePage.submitbutton();
    }
    @Test(priority = 8)
    public void callprogressive(){
        getInitElements();
        homePage.callnow();
    }
    @Test(priority = 9)
    public void boat(){
        getInitElements();
        homePage.boat();
    }


}

