package home;
import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

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

    public void bookingButtonClick(){ bookingButton.click(); }
    public void clickFlightButton(){flightButton.click();}
    public void oneWayButtonSelect(){
        OnewayButton.click();
    }
    public void roundTRipButtonSelect(){
        roundTripButton.click();
    }
    public void searchFromAirport(String from){
        searchFromAirport.click();
        /*Actions builder=new Actions(driver);
       Actions seriesofActions=builder.moveToElement(searchFromAirport).click().sendKeys(from);
       seriesofActions.perform();*/
    }
    public void searchToAirport(String to){
        searchToAirport.click();
        /* Actions builder=new Actions(driver);
        Actions seriesofActions=builder.moveToElement(searchFromAirport).click().sendKeys(to);
        seriesofActions.perform();*/
    }
    public void checkBox(){
        bluePointCHeckBox.click();
    }
    public void travellerInfoMenu(){
        travellerInfoMenu.click();
    }




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
        sleepFor(3);
        checkBox();
    }
    public void travellerInfoMenuSelect(){
        travellerInfoMenu();
    }


}
