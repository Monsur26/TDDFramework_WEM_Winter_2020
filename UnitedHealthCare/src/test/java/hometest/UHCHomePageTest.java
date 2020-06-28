package hometest;
import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class UHCHomePageTest extends WebAPI {
    static HomePage homePage;
    public static void getInitElements(){
        homePage= PageFactory.initElements(driver, home.HomePage.class);
    }

    @Test(priority = 1)
    public void testUSCSignIn()  {
        getInitElements();
        homePage.UHCHomePage();
    }

    @Test(priority = 2)
    public void testUHCInsurace() throws InterruptedException {
        getInitElements();
        homePage.UHCInsurance();
    }

    @Test(priority = 3)
    public void testUHCInsuraceShopAllPlans() throws InterruptedException {
        getInitElements();
        homePage.UHCInsuranceShopAllPlans();
    }

    @Test(priority = 4)
    public void testUHCMemberResources() throws InterruptedException {
        getInitElements();
        homePage.UHCMemberResources();
    }

    @Test(priority = 5)
    public void testUHVMReUnderstandIn() throws InterruptedException {
        getInitElements();
        homePage.UHVMReUnderstandIn();
    }

    @Test(priority = 6)
    public void testUHCSearch() throws InterruptedException {
        getInitElements();
        homePage.UHCSearch();
    }

    @Test(priority = 7)
    public void testUSCFindADoctor() throws InterruptedException {
        getInitElements();
        homePage.UHCFindADoctor();
    }

    @Test(priority = 8)
    public void testUscSignIn() throws InterruptedException {
        getInitElements();
        homePage.UHCSignIn();
    }

    @Test(priority = 9)
    public void testUSCSignInWindows() throws InterruptedException {
        getInitElements();
        homePage.UHCSignInWindowsHandle();
    }

    @Test(priority = 10)
    public void USCSignIn() throws InterruptedException {
        getInitElements();
        homePage.MyuscFindProvider();
    }
}
