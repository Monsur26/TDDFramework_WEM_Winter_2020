package hometest;

import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utility.ReadExcelFile;

public class HomePageTest extends WebAPI {

    static HomePage homePage; // Reference Variable/ object of HomePage
    public static void getInitElements(){
        homePage= PageFactory.initElements(driver, home.HomePage.class);
    }

    @Test(priority = 1)
    public void testUSC() throws InterruptedException {
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
    public void testUSCSignIn() throws InterruptedException {
        getInitElements();
        homePage.UHCSignIn();
    }
    @Test(priority = 9)
    public void testUSCSignInWindows() throws InterruptedException {
        getInitElements();
        homePage.UHCSignInWindowsHandle();
    }
    @Test(priority = 10)
    public void testMYUHCFind() throws InterruptedException {
        getInitElements();
        homePage.MyuscFindProvider();
    }
    @Test(dataProvider = "testdata")
    public void testloginWithExcel(String user, String pass){
        getInitElements();
        homePage.loginInWithExcel(user,pass);
//        homePage.validateLoggingIn();
    }
    @DataProvider(name="testdata")
    public Object[][] testDataExample(){
        ReadExcelFile configuration = new ReadExcelFile("Data/UHCdata.xlsx");
        int rows = configuration.getRowCount(0);
        Object[][]signin_credentials = new Object[rows][2];

        for(int i=0;i<rows;i++)
        {
            signin_credentials[i][0] = configuration.getData(0, i, 0);
            signin_credentials[i][1] = configuration.getData(0, i, 1);
        }
        return signin_credentials;
    }

}
