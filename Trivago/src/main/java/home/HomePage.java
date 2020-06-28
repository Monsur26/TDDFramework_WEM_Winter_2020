package home;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import webelements.HomePageWebElements;

import static webelements.HomePageWebElements.*;

public class HomePage extends WebAPI {
    @FindBy(how = How.CSS,using = trivagoSearchBoxWebElement) public WebElement tSearchBox;
    @FindBy(how = How.XPATH,using = trivagoSearchSubmitWebElement) public WebElement tSearchSubmit;
    @FindBy(how = How.CSS,using = trivagoMenuWebElement) public WebElement tMenu;
    @FindBy(how = How.CSS,using = trivagoCurrencyWebElement) public WebElement tCurrency;
    @FindBy(how = How.CSS,using = trivagoLoginWebElement) public WebElement tLogin;
    @FindBy(how = How.CSS,using = trivagoLoginWithGWebElement) public WebElement tLoginWithG;
    @FindBy(how = How.XPATH,using = trivagoCheckInWebElement) public WebElement tCheckIn;
    @FindBy(how = How.XPATH,using = trivagoCheckInDateWebElement) public WebElement tCheckInDate;
    @FindBy(how = How.XPATH,using = trivagoCheckOutDateWebElement) public WebElement tCheckOutDate;

//    @FindBy(how = How.CSS,using = trivagoSearchSortWebElement) public WebElement tSearchSort;
    @FindBy(how = How.XPATH,using = trivagoSearchSortWebElement) public WebElement tSearchSort;
    @FindBy(how = How.XPATH,using = trivagoSearchMoreFiltertWebElement) public WebElement tSearchMoreFilter;
    @FindBy(how = How.XPATH,using = moreFiltertCarParkWebElement) public WebElement tFilterCarpark;
    @FindBy(how = How.XPATH,using = moreFiltertHotelfacilityWebElement) public WebElement tFilterHotelFacility;
    @FindBy(how = How.XPATH,using = UKHotelViewDealWebElement) public WebElement UKViewDeal;
    @FindBy(how = How.XPATH,using = UKHotelAccoWebElement) public WebElement UKHotelAcco;
    @FindBy(how = How.CSS,using = UKHotelAccoHotelWebElement) public WebElement UKHotelAccoHotel;

    @FindBy(how = How.XPATH,using = trivagoRoomWebElement) public WebElement tRoom;
    @FindBy(how = How.XPATH,using = trivagoRoomFamilyWebElement) public WebElement tRoomFamily;


    public void trivagoSearch(){
        tSearchBox.sendKeys("Los Angeles, CA");
        tSearchSubmit.click();
    }
    public void trivagoSearchRoomSelect(){
        tSearchBox.sendKeys("Los Angeles, CA");
        tRoom.click();
        tRoomFamily.click();
        tSearchSubmit.click();
    }
//    public void trivagoSearchSort() throws InterruptedException {
//        tSearchBox.sendKeys("Los Angeles, CA");
//        tSearchSubmit.click();
//        sleepFor(5);
//
//    }

    public void trivagoSearchMoreFilter() throws InterruptedException{
        tSearchBox.sendKeys("Los Angeles, CA");
        tSearchSubmit.click();
        deleteAllCookies();
        sleepFor(5);
        mouseHoverByXpath("//*[@id=\"page_wrapper\"]/section/div/div/ul/li[5]/button/span");
        sleepFor(5);


    }
    public void trivagoMenu() throws InterruptedException{
        mouseHoverByCSS("#user-text");
        sleepFor(10);
    }
    public void trivagoCurrency() throws InterruptedException{

        dropDownByCSS("#currency","EUR - Euro");
        sleepFor(10);
    }
    public void trivagoLogin(){
        tLogin.click();
        deleteAllCookies();
        tLoginWithG.click();
    }
    public void trivagoCheckIn(){
        tSearchBox.sendKeys("Los Angeles, CA");
        tCheckIn.click();
        tCheckInDate.click();
    }
    public void trivagoCheckInOut(){
        tSearchBox.sendKeys("Los Angeles, CA");
        tCheckIn.click();
        tCheckInDate.click();
        tCheckOutDate.click();
    }
    public void trivagoCheckInOutSearch(){
        tSearchBox.sendKeys("Los Angeles, CA");
        tCheckIn.click();
        tCheckInDate.click();
        tCheckOutDate.click();
        tSearchSubmit.click();
    }
    public void trivagoSearchHotelSort() throws InterruptedException {
        tSearchBox.sendKeys("Los Angeles, CA");
        tSearchSubmit.click();
//        dropDownXpath("//*[@id=\"mf-select-sortby\"]","Price only");
//        WebElement element=driver.findElement(By.cssSelector(locator));
        Select select=new Select(driver.findElement(By.xpath("//*[@id=\"mf-select-sortby\"]")));
        select.selectByVisibleText("Price only");
        implicitWait(5);
    }
    public void trivagoSearchScroll(){
        trivagoCheckInOutSearch();
        scrollDownVertically();
    }
    public void trivagosearchMoreFilter() throws InterruptedException {
        trivagoCheckInOutSearch();
        tSearchMoreFilter.click();
        tFilterCarpark.click();
        sleepFor(5);
    }
    public void trivagosearchHotelFacility() throws InterruptedException {
        trivagoCheckInOutSearch();
        tSearchMoreFilter.click();
        tFilterHotelFacility.click();
        sleepFor(5);
    }
    public void SearchUKHotelFacility() throws InterruptedException {
        tSearchBox.sendKeys("London, UK");
        tCheckIn.click();
        tCheckInDate.click();
        tSearchSubmit.click();
        sleepFor(5);
        UKHotelAcco.click();
        sleepFor(5);
        UKHotelAccoHotel.click();
        sleepFor(5);
    }
}
