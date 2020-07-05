package hometest;

import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageTest extends WebAPI {
    static HomePage homePage; // Reference Variable/ object of HomePage


    public static void getInitElements() throws InterruptedException {
        homePage= PageFactory.initElements(driver, HomePage.class);
    }
    @Test
    public void testSearchBarUnitedHealthInsurance() throws InterruptedException {
        getInitElements();
        homePage.searchBarUnitedHealthInsurance();
    }
    @Test(priority = 2)
    public void testSearchButtonUnitedHealthCareInsurance() throws InterruptedException {
        getInitElements();
        homePage.searchResultUnitedHealthCareInsurance();
    }
    @Test(priority = 3)
    public void testunderstandingCoverageUnitedHealthCare() throws InterruptedException {
        getInitElements();
        homePage.understandingCoverageUnitedHealthCare();
    }
    @Test(priority = 4)
    public void testInsuraceMediCare() throws InterruptedException {
        getInitElements();
        homePage.insuranceMediCare();
    }
    @Test(priority = 5)
    public void testMemberResourcesNewMemberCheckList() throws InterruptedException {
        getInitElements();
        homePage.memberResourcesNewMemberCheckList();
    }
    @Test(priority = 6)
    public void testHealthAndWellnessFitness() throws InterruptedException {
        getInitElements();
        homePage.healthAndWellnessFitness();
    }
    @Test(priority = 7)
    public void testVacationUnitedHealthCare() throws InterruptedException {
        getInitElements();
        homePage.vacationUnitedHealthCare();
    }
    @Test(priority = 8)
    public void testChooseADoctorUnitedHealthCare() throws InterruptedException {
        getInitElements();
        homePage.chooseADoctorUnitedHealthCare();
    }
    @Test(priority = 9)
    public void testFindYourPlanUnitedHealthCare() throws InterruptedException {
        getInitElements();
        homePage.findYourPlanUnitedHealthCare();
    }
    @Test(priority = 10)
    public void testPrescriptionsUnitedHealthCare() throws InterruptedException {
        getInitElements();
        homePage.prescriptionsUnitedHealthCare();
    }
}
