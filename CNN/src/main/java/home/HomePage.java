package home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static homepagewebelements.HomePageWebElements.*;

public class HomePage extends WebAPI {

    @FindBy(how = How.XPATH, using = cnnSearchBoxWebElement)
    public WebElement cnnSearchBox;
    @FindBy(xpath = coronaVirusPandemicWebElement) public WebElement coronaVirusPandemic;
    @FindBy(xpath = cnnSearchButtonWebElement) public WebElement cnnSearchButton;
    @FindBy(xpath = summerWebElement) public WebElement Summer;
    @FindBy(xpath = medicineCnnWebElement) public WebElement medicineCnn;
    @FindBy(css = cnnMenuWebElement) public WebElement cnnMenu;
    @FindBy(xpath = cnnWorldWebElement) public WebElement cnnWorld;
    @FindBy(xpath = cnnElectionWebElement) public WebElement cnnElection;
    @FindBy(xpath = cnnBusinessWebElement) public WebElement cnnBusiness;
    @FindBy(xpath = cnnHealthWebElement) public WebElement cnnHealth;
    public  void enterKeyWord(String keyword){
        // Enter keyword in search box
        cnnSearchBox.sendKeys(keyword);
    }

    public void cnnSearchBox() {
        cnnSearchBox.click();
    }
    public void coronaVirusPandemic(){
        coronaVirusPandemic.click();
    }
    public void cnnSearchButton(){
        cnnSearchButton.click();
    }
    public void Summer(){
        Summer.click();
    }

    public void medicineCnn(){
        medicineCnn.click();
    }

    public void cnnMenu(){
        cnnMenu.click();
    }
    public void cnnWorld(){
        cnnWorld.click();
    }
    public void cnnElection(){
        cnnElection.click();
    }
    public void cnnBusiness(){
        cnnBusiness.click();
    }
    public void cnnHealth(){
        cnnHealth.click();
    }

    public void News() throws InterruptedException {
        sleepFor(2);
        driver.manage().window().maximize();
        sleepFor(2);
        cnnSearchBox();
        sleepFor(2);
        enterKeyWord("Corona Virus");
        sleepFor(2);
        cnnSearchButton();
        sleepFor(2);
        coronaVirusPandemic();
        sleepFor(2);
        cleanUp();
    }

    public void summerCNN() throws InterruptedException {
        sleepFor(2);
        driver.manage().window().maximize();
        sleepFor(2);
        Summer.click();
        sleepFor(2);
        cleanUp();
    }

    public void medicineCnnNews() throws InterruptedException {
        sleepFor(2);
        driver.manage().window().maximize();
        sleepFor(2);
        medicineCnn();
        sleepFor(2);
        cleanUp();
    }

    public void cnnMenuNews() throws InterruptedException {
        sleepFor(2);
        driver.manage().window().maximize();
        sleepFor(2);
        cnnMenu();
        sleepFor(2);
        cleanUp();
    }
    public void cnnCoronaVirus() throws InterruptedException {
        sleepFor(2);
        driver.manage().window().maximize();
        sleepFor(2);
        cnnMenu();
        sleepFor(2);
        cnnSearchBox();
        sleepFor(2);
        enterKeyWord("Corona Virus");
        sleepFor(2);
        cnnSearchButton();
        sleepFor(2);
        cleanUp();

    }

    public void cnnCoronaVirusPandemic() throws InterruptedException {
        sleepFor(2);
        driver.manage().window().maximize();
        sleepFor(2);
        cnnMenu();
        sleepFor(2);
        cnnSearchBox();
        sleepFor(2);
        enterKeyWord("Corona Virus");
        sleepFor(2);
        cnnSearchButton();
        sleepFor(2);
        coronaVirusPandemic();
        sleepFor(2);
        cleanUp();
    }

    public void cnnWorldNews() throws InterruptedException {
        sleepFor(2);
        driver.manage().window().maximize();
        sleepFor(2);
        cnnMenu();
        sleepFor(2);
        cnnWorld();
        sleepFor(3);
        cleanUp();
    }
    public void cnnElection2020() throws InterruptedException {
        sleepFor(2);
        driver.manage().window().maximize();
        sleepFor(2);
        cnnMenu();
        sleepFor(2);
        cnnElection();
        sleepFor(2);
        cleanUp();
    }
    public void cnnBusinessFinal() throws InterruptedException {
        sleepFor(2);
        driver.manage().window().maximize();
        sleepFor(2);
        cnnBusiness();
        sleepFor(2);
        cleanUp();
    }
    public void cnnHealthFinal() throws InterruptedException {
        sleepFor(2);
        driver.manage().window().maximize();
        sleepFor(2);
        cnnHealth();
        sleepFor(2);
        cleanUp();
    }
}