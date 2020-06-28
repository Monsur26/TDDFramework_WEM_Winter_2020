package hometest;

import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utility.ReadExcelFile;

public class HomePageTest extends WebAPI {
    static HomePage homePage;

    public static void getInitElements() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test(priority = 1)
    public void testCovidNotice() {
        getInitElements();
        homePage.covidNotice();
        homePage.validateCovidNotice();
    }

    @Test(priority = 2)
    public void testSearchingItem() {
        getInitElements();
        homePage.searchingItem();
        homePage.validateSearchBox();
    }

    @Test(priority = 3)
    public void testInsuranceButton() {
        getInitElements();
        homePage.insuranceButtonSearch();
        homePage.validateInsuranceButtonSearch();
    }

    @Test(priority = 4)
    public void testMedicareZip() {
        getInitElements();
        homePage.medicareZipSearch();
        homePage.validateMedicareZipSearch();
    }

    @Test(priority = 5)
    public void testsingInfature() {
        getInitElements();
        homePage.signingIn();
        homePage.validateSignIn();
    }

    @Test(priority = 6)
    public void testLanguageSelect() throws InterruptedException {
        getInitElements();
        homePage.languageSelect();
        homePage.validateLanguage();
    }

    @Test(priority = 7)
    public void testUpperLinks() {
        getInitElements();
        homePage.getUpperMenuLinks();
        homePage.validateCovidNotice();
    }

    @Test(priority = 8)
    public void testMemberSignInPage() {
        getInitElements();
        homePage.memberSignIn();
        homePage.validateMemberSignIn();
    }

    @Test(priority = 9)
    public void test() {
        getInitElements();
        homePage.dragAndDropUHCLogo();
        homePage.validateCovidNotice();
    }

    @Test(priority = 10)
    public void testExploreMedDragAndDrop() {
        getInitElements();
        homePage.dragExploreMedicare();
        homePage.validateExploreMedicare();
    }

    @Test(priority = 11)
    public void testCompleteSigIn() {
        getInitElements();
        homePage.loggingIn();
        homePage.validateLoggingIn();
    }

    @Test(dataProvider = "testdata")
    public void testloginWithExcel(String user, String pass) {
        getInitElements();
        homePage.loginInWithExcel(user, pass);
        homePage.validateLoggingIn();
    }

    @DataProvider(name = "testdata")
    public Object[][] testDataExample() {
        ReadExcelFile configuration = new ReadExcelFile("Data/UHCdata.xlsx");
        int rows = configuration.getRowCount(0);
        Object[][] signin_credentials = new Object[rows][2];

        for (int i = 0; i < rows; i++) {
            signin_credentials[i][0] = configuration.getData(0, i, 0);
            signin_credentials[i][1] = configuration.getData(0, i, 1);
        }
        return signin_credentials;
    }
}
