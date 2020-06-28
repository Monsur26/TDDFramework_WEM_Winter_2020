package hometest;
import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utility.ReadExcelFile;


public class Trivago_HomePage_Test extends WebAPI {
    static HomePage homePage;

    public static void getInitElements() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test(priority = 1)
    public void testMenuHoverAndSelect() {
        getInitElements();
        homePage.menuHoverAndSelect();
        homePage.validationMenuHoverAndSelect();
    }

    @Test(priority = 2)
    public void testDropDownUSD() throws InterruptedException {
        getInitElements();
        homePage.dropDownUSD();
        homePage.validateUSDDropdown();
    }

    @Test(priority = 3)
    public void testDropDownBottom() {
        getInitElements();
        homePage.dropDownBottom();
        homePage.validateDropdownBottom();
    }


    @Test(priority = 4)
    public void testEmailSubscription() {
        getInitElements();
        homePage.emailSubscription();
        homePage.validateEmailSubscription();
    }

    @Test(priority = 5)
    public void testCheckin() {
        getInitElements();
        homePage.checkin();
        homePage.validateCheckin();
    }

    @Test(priority = 6)
    public void testCheckout() {
        getInitElements();
        homePage.checkout();
        homePage.validateCheckout();
    }

    @Test(priority = 7)
    public void testRoomDetail() {
        getInitElements();
        homePage.roomDetail();
        homePage.validateRoomDetail();
    }

    @Test(priority = 8)
    public void testCompleteSearch() {
        getInitElements();
        homePage.completeBookingSearch();
        homePage.validateCompleteBookingSearch();
    }

    @Test(priority = 9)
    public void testtrivagoenglish() throws InterruptedException {
        getInitElements();
        homePage.trivagoenglish();
        homePage.validateTrivagoenglish();
    }

    @Test(dataProvider = "testdata")
    public void testloginWithExcel(String user, String pass) {
        getInitElements();
        homePage.loginInWithExcel(user, pass);
        homePage.validateLoggingIn();
    }

    @DataProvider(name = "testdata")
    public Object[][] testDataExample() {
        ReadExcelFile configuration = new ReadExcelFile("Data/TRIVAGO_DATABASE.xlsx");
        int rows = configuration.getRowCount(0);
        Object[][] signin_credentials = new Object[rows][2];

        for (int i = 0; i < rows; i++) {
            signin_credentials[i][0] = configuration.getData(0, i, 0);
            signin_credentials[i][1] = configuration.getData(0, i, 1);
        }
        return signin_credentials;
    }
}