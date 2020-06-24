package home;

import com.mysql.cj.exceptions.CJOperationNotSupportedException;
import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import javax.swing.*;
import java.util.List;
import static webelements.HomePageWebElements.*;
//import static webelements.HomePageWebElements.*;

public class HomePage extends WebAPI {
    @FindBy(how = How.CSS, using = bookWebElement) public WebElement book;
    @FindBy(how = How.XPATH, using = logInWebElement) public WebElement logIn;
    @FindBy(how = How.XPATH, using = myTripsWebElement) public WebElement myTrips;
    @FindBy(how = How.XPATH, using = myTripsClickWebElement) public WebElement myTripsClick;
    @FindBy(how = How.CSS, using = signInEmailWebElement) public WebElement signInEmail;
    @FindBy(how = How.CSS, using = exploreWebElement) public WebElement explore;
    @FindBy(how = How.XPATH, using = travelWebElement) public WebElement travel;
    @FindBy(how = How.XPATH, using = oneWaylWebElement) public WebElement oneWay;
    @FindBy(how = How.XPATH, using = joinWebElement) public WebElement join;
    @FindBy(how = How.XPATH, using = checkBoxWebElement) public WebElement checkBox;
    @FindBy(how = How.XPATH, using = signInWebElement) public WebElement signIn;
    @FindBy(how = How.XPATH, using = flightTrakerWebElement) public WebElement flightTraker;
    @FindBy(how = How.XPATH, using = checkInWebElement) public WebElement checkIn;
    @FindBy(how = How.XPATH, using = travelAlertWebElement) public WebElement travelAlert;
    @FindBy(how = How.XPATH, using = firtNameWebElement) public WebElement firtName;
    @FindBy(how = How.XPATH, using = lastNameWebElement) public WebElement lastName;
    @FindBy(how = How.XPATH, using = confirmationCodeWebElement) public WebElement confirmationCode;
    @FindBy(how = How.XPATH, using = findFlightsWebElement) public WebElement findFlights;
    @FindBy(how = How.XPATH, using = exploreLAWebElement) public WebElement exploreLA;

    public void bookSelection() throws InterruptedException {
        book.click();
        sleepFor(3);
    }
    public void clickLogIn() throws InterruptedException {
        logIn.click();
        sleepFor(3);
    }
    public void mouseHoverMyTrips() throws InterruptedException {
        Actions ac = new Actions(driver);
        ac.moveToElement(myTrips).perform();
        sleepFor(2);
    }
    public void clickMyTrips() throws InterruptedException {
        myTripsClick.click();
        sleepFor(2);
    }
    public void logIn() throws InterruptedException {
        driver.manage().window().maximize();
        clickLogIn();
    }
    public void mouseHoverExplore() throws InterruptedException {
        driver.manage().window().maximize();
        Actions ac1 = new Actions(driver);
        ac1.moveToElement(explore).perform();
        sleepFor(2);
    }
    public void mouseHoverTravel() throws InterruptedException {
        driver.manage().window().maximize();
        Actions ac2 = new Actions(driver);
        ac2.moveToElement(travel).perform();
        sleepFor(2);
    }

    public void clickTravel() throws InterruptedException {
        travel.click();
        sleepFor(2);
    }

    public void oneWayRadioButton() throws InterruptedException {
        oneWay.click();
        sleepFor(2);
    }

    public void joinIn() throws InterruptedException {
        join.click();
        sleepFor(2);
    }

    public void checkBox1() throws InterruptedException {
        checkBox.click();
        sleepFor(2);
    }

    public void signIn() throws InterruptedException {
        signIn.click();
        sleepFor(2);
    }
    public void mouseHoverFligh() throws InterruptedException {
        driver.manage().window().maximize();
        Actions ac = new Actions(driver);
        ac.moveToElement(flightTraker).perform();
        sleepFor(3);
    }
    public void mouseHoverCheckIn() throws InterruptedException {
        driver.manage().window().maximize();
        Actions ac1 = new Actions(driver);
        ac1.moveToElement(checkIn).perform();
        sleepFor(3);
    }
    public void clickCheckIn() throws InterruptedException {
        checkIn.click();
        sleepFor(2);
    }
    public void mouseHoverTravelAlert() throws InterruptedException {
        Actions ac2=new Actions(driver);
        ac2.moveToElement(travelAlert).perform();
        sleepFor(2);
    }

    public void firstName() throws InterruptedException {
       clickCheckIn();
        firtName.click();
        firtName.sendKeys("Farjana");
       sleepFor(2);
    }
    public void lastName() throws InterruptedException {
        clickCheckIn();
        lastName.click();
        lastName.sendKeys("Hossain");
        sleepFor(2);
    }
    public void putConfirmation() throws InterruptedException {
        clickCheckIn();
       confirmationCode.sendKeys("1234");
       sleepFor(2);
    }
    public void continueToFindFlights() throws InterruptedException {
        clickCheckIn();
        findFlights.click();
        sleepFor(2);
    }
    public void checkInInfo() throws InterruptedException {
        clickCheckIn();
        firtName.sendKeys("Farjana");
        lastName.sendKeys("Hossain");
        confirmationCode.sendKeys("1234");
        continueToFindFlights();
        sleepFor(2);
    }
    public void exploreLA() throws InterruptedException {
        explore.click();
        exploreLA.click();
    }


//    public void scroll(){
//        JavascriptExecutor jse= (JavascriptExecutor)driver;
//        jse.executeScript("window.scrollBy()0,250");
//    }



}
