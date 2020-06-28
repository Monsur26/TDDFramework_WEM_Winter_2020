package home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.yaml.snakeyaml.events.Event;

import static webelements.HomePageWebElements.*;

public class HomePage extends WebAPI {

    @FindBy(xpath = topMenuWebElement) public WebElement topMenu;
    @FindBy(xpath = navigationMenuWebElement) public WebElement navigationMenu;
    @FindBy(css = serviceMenuWebElement) public WebElement serviceMenu;
    @FindBy(className = transportServiceWebElement) public WebElement transportService;
    @FindBy(xpath = quickServiceWebElement) public WebElement quickService;
    @FindBy(xpath = userAccessLinkWebElement) public WebElement userAccessLink;
    @FindBy(xpath = oneWayRadioButtonWebElement) public WebElement oneWayRadio;
    @FindBy(xpath = checkBoxWebElement) public WebElement checkBox;
    @FindBy(xpath = trueBlueWebElement) public WebElement trueBlue;
    @FindBy(xpath = myTripWebElement) public WebElement myTrip;
    @FindBy(xpath = travelInfoWebElement) public WebElement travelInfo;



    //Setup Method
    public void topMenuSet() {
        topMenu.click();
    }
    public void navigationMenuSet() {
        navigationMenu.click();
    }
    public void serviceMenuSet() {
        serviceMenu.click();
    }
    public void transportServiceSet() {
        transportService.click();
    }
    public void quickServiceSet() {
        quickService.click();
    }
    public void userAccessLInkSet() {
        userAccessLink.click();
    }
    public void  radioButtonClick(){
        oneWayRadio.click();
    }
    public void  checkBoxClick(){
    checkBox.click();
    }
    public void  setTrueBlue(){
        trueBlue.click();
    }
    public void setMyTrip() {
        myTrip.click();
    }
    public void setTravelInfo() {
        travelInfo.click();
    }
    //Test Cases
    public void menuTop() throws InterruptedException {
        topMenuSet();
    }

    public void validationTopMenu(){
        String actual=topMenu.getText();
        Assert.assertEquals("","","");
    }

    public void menuNavigation() {
        navigationMenuSet();
    }
    public void validationNavigationMenu(){
        String actual=navigationMenu.getText();
        Assert.assertEquals("","","");
    }
    public void menuService() throws InterruptedException {
        serviceMenuSet();
    }
    public void validationServiceMenu(){
        String actual=serviceMenu.getText();
        Assert.assertEquals("","","");
    }
    public void transportService() throws InterruptedException {
        transportServiceSet();
    }
    public void validationTransportService(){
        String actual=transportService.getText();
        Assert.assertEquals("","","");
    }
    public void serviceQuick() throws InterruptedException {
        quickServiceSet();
    }
    public void validationQuickService(){
        String actual=quickService.getText();
        Assert.assertEquals("","Safety from the ground up.","");
    }




    public void accessUser() throws InterruptedException {
        userAccessLInkSet();
    }
    public void validationUserAccessLink() {
        String actual = "";
        Assert.assertEquals("", "", "");

    }












    public void radioButtonSelectOneWay(){
        radioButtonClick();
    }
    public void validationOneWayRadio(){
        String actual=oneWayRadio.getText();
        Assert.assertEquals("","","");
    }
    public void checkBoxSelect(){
        checkBoxClick();
    }
    public void validationCheckBox(){
        String actual=checkBox.getText();
        Assert.assertEquals("","","");
    }
    public void blueTrue() throws InterruptedException {
        setTrueBlue();
    }
    public void validationTrueBlue(){
        String actual=trueBlue.getText();
        Assert.assertEquals("","","");
    }
    public void tripMy() throws InterruptedException {
        setMyTrip();
    }
    public void validationMyTrip(){
        String actual=myTrip.getText();
        Assert.assertEquals("","","");
    }
    public void infoTravel() throws InterruptedException {
        setTravelInfo();
    }
    public void validationTravelInfo(){
        String actual=travelInfo.getText();
        Assert.assertEquals("","","");
    }
}



