package home;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import static webelements.Trivago_HomePageWebElements.*;

public class HomePage extends WebAPI {
    @FindBy(xpath = loginWebElement) public WebElement login;
    @FindBy(xpath = createWebElement) public WebElement create;
    @FindBy(xpath = emailWebElement) public WebElement email;
    @FindBy(xpath = passwordWebElement) public WebElement pass;
    @FindBy(xpath = menuHoverWebElement) public WebElement menuHover;
    @FindBy(xpath = bookingOverviewWebElement) public WebElement bookingOverview;
    @FindBy(xpath = nationsDropdownWebElement) public WebElement countryDropDown;
    @FindBy(xpath = USDDropDownWebElement) public WebElement USDDropDown;
    @FindBy(xpath = rightArrowSlideWebElement) public WebElement rightArrowSlide;
    @FindBy(xpath = leftArrowSlideWebElement) public WebElement leftArrowSlide;
    @FindBy(xpath = hotelsInNyWebElement) public WebElement hotelInNY;
    @FindBy(id = emailBoxWebElement) public WebElement emailBox;
    @FindBy(xpath = subscribeButtonWebElement) public WebElement subscribeButton;
    @FindBy(xpath = nycDestinationBoxWebElement) public WebElement destinationBox;
    @FindBy(xpath = checkINBoxWebElement) public WebElement checkinBox;
    @FindBy(xpath = checkinDateWebElement) public WebElement checkinDate;
    @FindBy(xpath = checkoutWebElement) public WebElement checkoutBox;
    @FindBy(xpath = checkoutDateWebElement) public WebElement checkoutDate;
    @FindBy(xpath = roomBoxWebElement) public WebElement roomBox;
    @FindBy(xpath = adultsIncreaseButtonWebElement) public WebElement adultsIncreaseButton;
    @FindBy(xpath = roomIncreaseButtonWebElement) public WebElement roomIncreaseButton;
    @FindBy(xpath = applyButtonWebElement) public WebElement applyButton;
    @FindBy(xpath = RoomBoxValidationWebElement) public WebElement roomValidation;
    @FindBy(xpath = searchButtonWebElement) public WebElement searchButton;
    @FindBy(xpath = sortByTextWebElement) public WebElement sortBy;
    @FindBy(xpath = trivagoenglishWebElement) public WebElement english;




    public void setMenuHover(){ mouseHover(menuHover); }
    public void setBookingOverview(){ bookingOverview.click();}
    public void setUSDDropDown(){ selectDropDownByIndex(USDDropDown,0); }
    public void nationsDropDown(){ selectDropDownByIndex(countryDropDown,0); }
    public void rightArrowSlide(){rightArrowSlide.click();}
    public void leftArrowSlide(){leftArrowSlide.click();}
    public void setEmailBox(String email){emailBox.sendKeys(email);}
    public void setSubscribeButton(){subscribeButton.click();}
    public void setDestinationBox(String destination){
        destinationBox.sendKeys(destination);
        destinationBox.sendKeys(Keys.ARROW_DOWN);
        destinationBox.sendKeys(Keys.ENTER);
    }
    public void checkInBox(){checkinBox.click();}
    public void checkInDate(){checkinDate.click();}
    public void checkoutBox(){checkoutBox.click();}
    public void checkOutDate(){checkoutDate.click();}
    public void roomBox(){roomBox.click();}
    public void adultsIncreaseButton(){adultsIncreaseButton.click();}
    public void roomsIncreaseButton(){roomIncreaseButton.click();}
    public void applyButton(){applyButton.click();}
    public void searchButton(){searchButton.click();}



    public void menuHoverAndSelect(){
        setMenuHover();
        setBookingOverview();
    }
    public void validationMenuHoverAndSelect(){
        String actual=bookingOverview.getText();
        Assert.assertEquals(actual,"Booking overview","Not successful");
    }
    public void dropDownUSD() throws InterruptedException {
        setUSDDropDown();
        sleepFor(5);
    }
    public void validateUSDDropdown(){
        String actual="Euro";
        Assert.assertEquals(actual,"Euro","Not successful");
    }
    public void dropDownBottom(){
        nationsDropDown();
    }
    public void validateDropdownBottom(){
        String actual= "Belgie";
        Assert.assertEquals(actual,"Belgie","not successful");
    }
    public void arrowSlide(){
        rightArrowSlide();
        rightArrowSlide();
        leftArrowSlide();
        leftArrowSlide();
    }
    public void emailSubscription(){
        setEmailBox("mmm@mmm.com");
        setSubscribeButton();
    }
    public void validateEmailSubscription(){
        String actual=emailBox.getText();
        Assert.assertEquals(actual,"","not successful");
    }
    public void destinationBox(){
        setDestinationBox("NYC");
    }
    public void validateDestinationBox(){
        String actual=destinationBox.getText();
        Assert.assertEquals(actual,"","Not successful");
    }
    public void checkin(){
        checkInBox();
        checkInDate();
    }
    public void validateCheckin(){
        String actual=checkinBox.getText();
        Assert.assertEquals(actual,"Check in","not successful");
    }
    public void checkout(){
        checkoutBox();
        checkOutDate();
    }
    public void validateCheckout(){
        String actual=checkoutBox.getText();
        Assert.assertEquals(actual,"Check out","not successful");
    }
    public void roomDetail(){
        roomBox();
        adultsIncreaseButton();
        roomsIncreaseButton();
        applyButton();
    }
    public void validateRoomDetail(){
        String actual=roomValidation.getText();
        Assert.assertEquals(actual,"2 rooms 3 Guest","not successful");
    }

    public void completeBookingSearch(){
        setDestinationBox("NYC");
        checkInDate();
        checkOutDate();
        searchButton();
    }
    public void validateCompleteBookingSearch(){
        String actual=sortBy.getText();
        Assert.assertEquals(actual,"Sort by","not successful");
    }
    public void trivagoenglish() throws InterruptedException {
        english.click();
        sleepFor(5);
    }
    public void validateTrivagoenglish(){
        String actual=english.getText();
        Assert.assertEquals(actual,"EN","not successful");
    }

    public void loginInWithExcel(String user, String account){
        login.click();
        create.click();
        email.click();
        pass.click();
    }
    public void validateLoggingIn(){
        String actual=login.getText();
        Assert.assertEquals(actual,"","created my account");
    }
}