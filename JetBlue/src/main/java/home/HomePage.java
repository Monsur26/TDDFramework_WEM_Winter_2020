package home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static webelements.HomePageWebElements.*;

public class HomePage extends WebAPI {
    @FindBy(how = How.XPATH, using = bookWebElements) public WebElement book;
    @FindBy(css = flightWebElements) public WebElement flight;
    @FindBy(xpath = oneWayWebElements) public WebElement oneWay;
    @FindBy(css = whereToWebElements) public WebElement whereTo;
    @FindBy(xpath = browseRegionWebElements) public WebElement browseRegion;
    @FindBy(xpath = exploreWebElements) public WebElement explore;
    @FindBy(xpath = newYorkWebElements) public WebElement newYork;
    @FindBy(xpath = flightTrackerWebElements) public WebElement flightTracker;
    @FindBy(xpath = jetBlueSignInWebElements) public WebElement jetBlueSignIn;
    @FindBy(xpath = jetBlueCompanyWebElements) public WebElement jetBlueCompany;
    @FindBy(xpath = myTripsWebElements) public WebElement myTrips;
    @FindBy(css = checkInWebElements) public WebElement checkIn;
    @FindBy(xpath = flightsHotelWebElements) public WebElement flightsHotel;
    @FindBy(xpath = carsWebElements) public WebElement cars;
    public void book(){
    book.click();
    }

    public void flight(){
        flight.click();
    }

    public void oneWay(){
        oneWay.click();
    }
    public void whereTo(){
        whereTo.click();
    }
    public void whereKarachi(String Keyword){
        whereTo.sendKeys(Keyword);
    }
    public void browseRegion(){
        browseRegion.click();
    }
    public void Explore(){
        explore.click();
    }
    public void NewYork(){
        newYork.click();
    }
    public void flightTracker(){
        flightTracker.click();
    }
    public void signIn(){
        jetBlueSignIn.click();
    }
    public void jetBlueCompany(){
        jetBlueCompany.click();
    }
    public void myTrips(){
        myTrips.click();
    }
    public void checkIn(){
        checkIn.click();
    }
    public void flightsHotel(){
        flightsHotel.click();
    }
    public void cars(){
        cars.click();
    }

    public void bookFlight() throws InterruptedException {
        sleepFor(2);
        driver.manage().window().maximize();
        sleepFor(2);
        book();
        sleepFor(2);
        flight();
        sleepFor(2);
        cleanUp();

    }
    public void jetBlueTicket() throws InterruptedException {
        sleepFor(2);
        driver.manage().window().maximize();
        sleepFor(2);
        book();
        sleepFor(2);
        flight();
        sleepFor(2);
        oneWay();
        sleepFor(2);
        cleanUp();
    }
    public void exploreNewYork() throws InterruptedException {
        sleepFor(2);
        driver.manage().window().maximize();
        sleepFor(2);
        Explore();
        sleepFor(2);
        NewYork();
        sleepFor(2);
        cleanUp();
    }
    public void jetBlueFlightTracker() throws InterruptedException {
        sleepFor(2);
        driver.manage().window().maximize();
        sleepFor(2);
        flightTracker();
        sleepFor(3);
        cleanUp();
    }
    public void jetBlueSignIn() throws InterruptedException {
        sleepFor(2);
        driver.manage().window().maximize();
        sleepFor(2);
        jetBlueSignIn();
        sleepFor(3);
        cleanUp();
    }

    public void jetBlueDestination() throws InterruptedException {
        sleepFor(2);
        driver.manage().window().maximize();
        sleepFor(2);
        whereTo();
        sleepFor(2);
        whereKarachi("Karachi,Pakistan");
        sleepFor(2);
        browseRegion();
        sleepFor(2);
        cleanUp();
    }
    public void jetBlueCompanyCheck() throws InterruptedException {
        sleepFor(2);
        driver.manage().window().maximize();
        sleepFor(2);
        jetBlueCompany();
        sleepFor(2);
        cleanUp();
    }
    public void jetBlueTrip() throws InterruptedException {
        sleepFor(2);
        driver.manage().window().maximize();
        sleepFor(2);
        myTrips();
        sleepFor(2);
        checkIn();
        sleepFor(2);
        cleanUp();
    }
    public void jetBlueFlightsHotel() throws InterruptedException {
        sleepFor(2);
        driver.manage().window().maximize();
        sleepFor(2);
        flightsHotel();
        sleepFor(2);
        cleanUp();
    }
    public void jetBlueCars() throws InterruptedException {
        sleepFor(2);
        driver.manage().window().maximize();
        sleepFor(2);
        cars();
        sleepFor(2);
        cleanUp();
    }

}

