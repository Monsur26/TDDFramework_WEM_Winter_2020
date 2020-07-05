package home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static webelements.HomePageWebElements.*;

public class HomePage extends WebAPI {
    @FindBy(how = How.ID, using = searchBarWebElement) public WebElement searchBar;
    @FindBy(xpath = searchButtonWebElement) public WebElement searchButton;
    @FindBy(xpath = understandingCoverageWebElement) public WebElement understandingCoverage;
    @FindBy(xpath = closeAdWebElement) public WebElement closeAd;
    @FindBy(xpath = insuranceWebElement) public WebElement insurance;
    @FindBy(xpath = medicareWebElement) public WebElement mediCare;
    @FindBy(xpath = memberResourcesWebElement) public WebElement memberResources;
    @FindBy(xpath = newMemberChecklistWebElement) public WebElement newMemberChecklist;
    @FindBy(xpath = healthAndWellnessWebElement) public WebElement healthAndWellness;
    @FindBy(xpath = fitnessWebElement) public WebElement fitness;
    @FindBy(xpath = stayingFitOnVacationWebElement) public WebElement stayingFitOnVacation;
    @FindBy(xpath = chooseADoctorWebElement) public WebElement chooseADoctor;
    @FindBy(xpath = findYourPlanWebElement) public WebElement findYourPlan;

    public void searchBar(String Keyword){
        searchBar.sendKeys(Keyword);
    }
    public void searchButton(){
        searchButton.click();
    }
    public void understandingCoverage(){
        understandingCoverage.click();
    }
    public void closeAd(){
        closeAd.click();
    }
    public void insurance(){
        insurance.click();
    }
    public void mediCare(){
        mediCare.click();
    }
    public void memberResources(){
        memberResources.click();
    }
    public void newMemberCheckList(){
        newMemberChecklist.click();
    }
    public void healthAndWellness(){
        healthAndWellness.click();
    }
    public void fitness(){
        fitness.click();
    }
    public void stayingFitOnVacation(){
        stayingFitOnVacation.click();
    }
    public void chooseADoctor(){
        chooseADoctor.click();
    }
    public void findYourPlan(){
        findYourPlan.click();
    }
    public void searchBarUnitedHealthInsurance() throws InterruptedException {
        sleepFor(2);
        driver.manage().window().maximize();
        sleepFor(2);
        searchBar("Full Coverage");
        sleepFor(2);
        cleanUp();
    }
    public void searchResultUnitedHealthCareInsurance() throws InterruptedException {
        sleepFor(2);
        driver.manage().window().maximize();
        sleepFor(2);
        searchBar("Full Coverage");
        sleepFor(2);
        searchButton();
        sleepFor(2);
        cleanUp();
    }
    public void understandingCoverageUnitedHealthCare() throws InterruptedException {
        sleepFor(2);
        driver.manage().window().maximize();
        sleepFor(2);
        searchBar("Full Coverage");
        sleepFor(2);
        searchButton();
        sleepFor(2);
        understandingCoverage();
        sleepFor(2);
        cleanUp();
    }
    public void insuranceMediCare() throws InterruptedException {
        sleepFor(2);
        driver.manage().window().maximize();
        sleepFor(2);
        insurance();
        sleepFor(2);
        mediCare();
        sleepFor(2);
        cleanUp();
    }
    public void memberResourcesNewMemberCheckList() throws InterruptedException {
        sleepFor(2);
        driver.manage().window().maximize();
        sleepFor(2);
        memberResources();
        sleepFor(2);
        newMemberCheckList();
        sleepFor(2);
        cleanUp();
    }
    public void healthAndWellnessFitness() throws InterruptedException {
        sleepFor(2);
        driver.manage().window().maximize();
        sleepFor(2);
        healthAndWellness();
        sleepFor(2);
        fitness();
        sleepFor(2);
        cleanUp();
    }
    public void vacationUnitedHealthCare() throws InterruptedException {
        sleepFor(2);
        driver.manage().window().maximize();
        sleepFor(2);
        healthAndWellness();
        sleepFor(2);
        fitness();
        sleepFor(2);
        stayingFitOnVacation();
        sleepFor(2);
        cleanUp();
    }
    public void chooseADoctorUnitedHealthCare() throws InterruptedException {
        sleepFor(2);
        driver.manage().window().maximize();
        sleepFor(2);
        memberResources();
        sleepFor(2);
        newMemberCheckList();
        sleepFor(2);
        chooseADoctor();
        sleepFor(2);
        cleanUp();
    }
    public void findYourPlanUnitedHealthCare() throws InterruptedException {
        sleepFor(2);
        driver.manage().window().maximize();
        sleepFor(2);
        findYourPlan();
        sleepFor(2);
        cleanUp();
    }
    public void prescriptionsUnitedHealthCare() throws InterruptedException {
        sleepFor(2);
        driver.manage().window().maximize();
        sleepFor(2);
        searchBar("Prescription");
        sleepFor(2);
        searchButton();
        sleepFor(2);
        cleanUp();
    }
}
