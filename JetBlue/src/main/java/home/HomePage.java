package home;
import common.WebAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.util.List;

import static webelements.HomePageWebElements.*;


public class HomePage extends WebAPI{

    @FindBy(xpath = bookingButtonWebElement) public WebElement bookingButton;
    @FindBy(css = flightButtonWebElement) public WebElement flightButton;
    @FindBy(xpath = oneWayRadioButtonWebElement)public WebElement OnewayButton;
    @FindBy(css = searchFromAirportWebElement)public WebElement searchFromAirport;
    @FindBy(css = searchToAirportWebElement)public WebElement searchToAirport;

    public void bookingButtonClick(){
        bookingButton.click();
    }

    public void hoverMouse(WebElement target){
        Actions actions=new Actions(driver);
        actions.moveToElement(target).perform();
    }

    public void oneWayButtonSelect(){
        OnewayButton.click();
    }

    public void searchFromAirport(String from){
        searchFromAirport.click();
        searchFromAirport.sendKeys(from);
        searchFromAirport.sendKeys(Keys.ENTER);
    }

    public void searchToAirport(String To){
        searchToAirport.click();
        searchToAirport.sendKeys(To);
        searchToAirport.sendKeys(Keys.ENTER);
    }




    public void doBookingButtonWork() throws InterruptedException {
        bookingButtonClick();
        sleepFor(2);

        cleanUp();
    }
    public void doHoverMouse() throws InterruptedException {
        bookingButtonClick();
        sleepFor(2);
        hoverMouse(flightButton);
        sleepFor(2);
        cleanUp();

    }
    public void airportAndOneWaySelect() throws InterruptedException {
        oneWayButtonSelect();
        sleepFor(2);
        searchFromAirport("JFK");
        cleanUp();

    }
    public void airportsSelect() throws InterruptedException {
        searchFromAirport("JFK");
        sleepFor(2);
        searchToAirport("Qatar");
        cleanUp();
    }


}
