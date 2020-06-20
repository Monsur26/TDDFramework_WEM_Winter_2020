package home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import static webelements.HomePageWebElements.*;

public class HomePage extends WebAPI {
    @FindBy(how = How.LINK_TEXT, using = bookWebElement) public WebElement book;
    @FindBy(how = How.LINK_TEXT, using = bookFlightWebElement) public WebElement bookFlight;
    @FindBy(how = How.CSS, using = fromBoxWebElement) public WebElement fromBox;
    @FindBy(how = How.XPATH, using= browseFromWebElement) public WebElement browseFrom;
    @FindBy(how = How.XPATH, using= roundTripRadioWebElement) public WebElement roundTripRadio;
    @FindBy(how = How.XPATH, using= oneWayRadioWebElement) public WebElement oneWayRadio;
    @FindBy(how = How.XPATH, using= checkBoxUseTBPointWebElement) public WebElement checkBoxUseTBPoint;
    @FindBy(how = How.LINK_TEXT, using=exploreWebElement) public WebElement explore;
    @FindBy(how = How.LINK_TEXT, using=newYorkWebElement) public WebElement newYork;
    @FindBy(how = How.CSS, using = whereWebElement) public WebElement whereBox;
    @FindBy(how = How.CSS, using = browseByRegionElement) public WebElement browseByRegion;
    @FindBy(how = How.CSS, using=flightsNHotelWebElement) public WebElement flightNHotel;
    @FindBy(how = How.XPATH, using=chkBoxBluePointsFNHWebElement) public WebElement checkBoxBluePointsFNH;
    @FindBy(how = How.LINK_TEXT, using=travelInfoWebElement) public WebElement travelInfo;
    @FindBy(how = How.CSS, using=joinUsWebElement) public WebElement joinUs;
    @FindBy(how = How.CSS, using=emailWebElement) public WebElement email;

    public void tryToBookFlight() throws InterruptedException {
        getWindowsMaximize();
        book.click();
        bookFlight.click();
       }
    public void searchflight() throws InterruptedException {
        getWindowsMaximize();
        book.click();
        bookFlight.click();
        fromBox.click();
        browseFrom.click();
    }
    public void tripOption() throws InterruptedException {
        getWindowsMaximize();
        roundTripRadio.click();
        oneWayRadio.click();
    }
    public void setCheckBoxUseTBPoint() throws InterruptedException {
        getWindowsMaximize();
        checkBoxUseTBPoint.click();
    }
    public void setExplore(){
        getWindowsMaximize();
        explore.click();
        newYork.click();
        whereBox.click();
        browseByRegion.click();
    }
    public void setFlightsNHotel() throws InterruptedException {
        getWindowsMaximize();
        flightNHotel.click();
        checkBoxBluePointsFNH.click();
    }
    public void setTravelInfo() throws InterruptedException {
        getWindowsMaximize();
        travelInfo.click();
    }
    public void setJoinUs() throws InterruptedException {
        getWindowsMaximize();
        email.sendKeys("marufabmujib@gmail.com");
    }

}
