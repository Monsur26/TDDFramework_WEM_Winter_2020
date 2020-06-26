package home;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.util.List;
import static webelements.HomePageWebElements.*;

public class HomePage extends WebAPI{
    @FindBy(xpath = bookingButtonWebElement) public WebElement bookingButton;
    @FindBy(xpath = flightButtonWebElement) public WebElement flightButton;
    @FindBy(xpath = oneWayRadioButtonWebElement)public WebElement OnewayButton;
    @FindBy(xpath = roundTripRadioButtonWebElement)public WebElement roundTripButton;
    @FindBy(xpath = searchFromAirportWebElement)public WebElement searchFromAirport;
    @FindBy(xpath = searchToAirportWebElement)public WebElement searchToAirport;
    @FindBy(xpath = bluePointCheckBoxWebElement)public WebElement bluePointCHeckBox;
    @FindBy(xpath = travelerInfoMenuWebElement)public WebElement travellerInfoMenu;
    @FindBy(xpath = FacebookPageMenuWebElement)public WebElement FacebookPage;
    @FindBy(xpath = JetBlueLogoMenuWebElement)public WebElement JetBlueLogo;
    @FindBy(xpath = languageChangeMenuWebElement)public WebElement languageChange;
    @FindBy(xpath = myTripMenuWebElement)public WebElement myTripMenu;
    @FindBy(xpath = flightTrackerWebElement)public WebElement flightTracker;
    @FindBy(xpath = checkStatusButtonWebElement)public WebElement checkStatusButton;

    public void bookingButtonClick(){ bookingButton.click(); }
    public void clickFlightButton(){flightButton.click();}
    public void oneWayButtonSelect(){ OnewayButton.click(); }
    public void roundTRipButtonSelect(){ roundTripButton.click(); }
    public void searchFromAirport(String from){ searchFromAirport.click(); }
    public void searchToAirport(String to){
        searchToAirport.click();
    }
    public void checkBox(){
        bluePointCHeckBox.click();
    }
    public void travellerInfoMenu(){
        travellerInfoMenu.click();
    }
    public void FaceBookPage(){ FacebookPage.click(); }
    public void languageChange(){ languageChange.click(); }
    public void myTripMenu(){ myTripMenu.click(); }
    public void flightTracker(){ flightTracker.click(); }
    public void checkStatusButton(){ checkStatusButton.click(); }

    public void doBookingButtonWork() throws InterruptedException {
        bookingButtonClick();
    }
    public void doFlightSelect() throws InterruptedException {
        bookingButtonClick();
        clickFlightButton();
    }
    public void tripTypeSelect() throws InterruptedException {
        oneWayButtonSelect();
        roundTRipButtonSelect();
    }
    public void airportsSelect() throws InterruptedException {
        searchFromAirport("JFK");
        sleepFor(2);
        searchToAirport("QATAR");
    }
    public void bluePointCheckBOX() throws InterruptedException {
        checkBox();
        implicitWait(3);
        checkBox();
    }
    public void travellerInfoMenuSelect(){
        travellerInfoMenu();
    }
    public void JetBlueFBPage(){
        FaceBookPage();
    }
    public void languageSelect(){
        languageChange();
        implicitWait(5);
    }
    public void myTrip(){
        myTripMenu();
        myTripMenu();
    }
    public void scrollDownHomePage(){
        scrollUpDownByHeight();
        implicitWait(5);
    }
    public void myTripStatus(){
        myTripMenu();
        flightTracker();
    }
    public void validateJetBlueLogo(){
        String actual=JetBlueLogo.getText();
        Assert.assertEquals(actual,"","not successful");
    }
    public void validateBookingButton(){
        String actual=bookingButton.getText();
        Assert.assertEquals(actual,"Book","not successful");
    }
    public void validateFlightSelect(){
        String actual=flightButton.getText();
        Assert.assertEquals(actual,"","not successful");
    }
    public void validateTravellerMenu(){
        String actual=travellerInfoMenu.getText();
        Assert.assertEquals(actual,"","not successful");
    }

}
