package home;

import common.WebAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import webelements.HomePageWebElements;

import static webelements.HomePageWebElements.*;

public class HomePage extends WebAPI {
    @FindBy(linkText = topMenuBusinessWebElement) public WebElement topMenuBusiness;
    @FindBy(xpath = myVerizonWebElement) public WebElement myVerizon;
    @FindBy(xpath = movingButtonWebElement) public WebElement movingButton;
    @FindBy(name = searchButtonWebElement) public WebElement searchButton;
    @FindBy(xpath = searchingInputWebElement) public WebElement searchingInput;
    @FindBy(xpath = radioButtonYesWebElement) public WebElement radioButtonYes;
    @FindBy(xpath = radioButtonNoWebElement) public WebElement radioButtonNo;
    @FindBy(xpath = selectedOptDropDownWebElement) public WebElement selectedOptDropDown;
    @FindBy(id = signInButtonWebElement) public WebElement signInButton;
    @FindBy(xpath = registerButtonWebElement) public WebElement registerButton;
    @FindBy(id = locateButtonWebElement) public WebElement locateButton;
    @FindBy(xpath = locateSignInWebElement) public WebElement locateSignIn;
    @FindBy(id = dropDownChangeServiceWebElement) public WebElement dropDownChangeService;
    @FindBy(xpath = checkBoxButtonWebElement) public WebElement checkBoxButton;
    //Setup Method
    public void setTopMenuBusiness(){
        topMenuBusiness.click();
    }
    public void setMyVerizon(){
        mouseHover(myVerizon);
    }
    public void setMovingButton(){
        movingButton.click();
    }
    public void setSearchButton(String keyword){
        searchButton.click();
        searchingInput.sendKeys(keyword);
        searchingInput.sendKeys(Keys.ENTER);
    }
    public void setRadioButtonYes(){
        radioButtonYes.click();
    }
    public void setRadioButtonNo(){
        radioButtonNo.click();
    }
    public void setSelectedOptDropDown(){
     dropDownByValue(selectedOptDropDown,"Business");
    }
    public void setSignInButton(){
        mouseHover(signInButton);
    }
    public void setRegisterButton(){
        registerButton.click();
    }
    public void setLocateButton(){
        locateButton.click();
    }
    public void setLocateSignIn(){
        locateSignIn.click();
    }
    public void setDropDownChangeService(){
        dropDownByValue(dropDownChangeService,"Move service to new address");
    }
    public void setCheckBoxButton(){
       checkBoxButton.click();
    }
    //Test Case
    public void businessTopMenu() throws InterruptedException{
        setTopMenuBusiness();
    }
    public void myVerizonSelect() throws InterruptedException{
        setMyVerizon();
    }
    public void movingButtonSelect() throws InterruptedException{
        setMyVerizon();
        setMovingButton();
    }
    public void searchButtonSelect(){
        setSearchButton("Fast Internet");
        implicitWaitTime(20);

    }
    public void radioButtonYesSelect() throws InterruptedException{
        setSearchButton("Fast Internet");
        implicitWaitTime(20);
        setRadioButtonYes();
        setRadioButtonNo();
    }
    public void dropDownSelectedOpt() throws InterruptedException{
        setSearchButton("Fast Internet");
        implicitWaitTime(20);
        setSelectedOptDropDown();
    }
    public void signInButtonSelect() throws InterruptedException{
        setSignInButton();
    }
    public void registerButtonSelect() throws InterruptedException{
        setSignInButton();
        setRegisterButton();
    }
    public void locateButtonSelect() throws InterruptedException{
        setLocateButton();
    }
    public void locateSignInSelect()throws InterruptedException{
        setLocateButton();
        setLocateSignIn();
    }
    public void dropDownChangeSelect()throws InterruptedException{
        setLocateButton();
        setLocateSignIn();
        setDropDownChangeService();
    }
    public void checkBoxButtonSelect()throws InterruptedException{
        setCheckBoxButton();
    }
}
