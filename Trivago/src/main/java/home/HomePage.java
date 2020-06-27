package home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static webelements.HomePageWebElements.*;

public class HomePage extends WebAPI {
    @FindBy(how = How.XPATH, using = searchBarWebElements) public WebElement searchBar;
    @FindBy(xpath = checkInClickWebElements) public WebElement checkInClick;
    @FindBy(className = checkInDateWebElements) public WebElement checkInDate;
    @FindBy(xpath = emailWebElements) public WebElement email;
    @FindBy(xpath = loginWebElements) public WebElement login;
    @FindBy(xpath = loginDataWebElements) public WebElement loginData;
    @FindBy(xpath = menuWebElements) public WebElement menu;
    @FindBy(xpath = menuRecentlyWebElements) public WebElement menuRecently;


    public void searchBar(String Keyword){
        searchBar.sendKeys(Keyword);
    }
    public void checkInClick(){
        checkInClick.click();
    }
    public void checkInDate(){
        checkInDate.click();
    }
    public void email(String Keyword){
        email.sendKeys(Keyword);
    }

    public void login(){
        login.click();
    }
    public void loginData(String Keyword){
        loginData.sendKeys(Keyword);
    }
    public void menu(){
        menu.click();
    }
    public void menuRecently(){
        menuRecently.click();
    }
    public void menuHover(){
//        Actions actions= new Actions(driver);
//        actions.moveToElement(menu).perform();
        menu.click();
    }

    public void searchBarTrivago() throws InterruptedException {
        sleepFor(2);
        searchBar("Alberta, Canada");
        sleepFor(2);
        cleanUp();
    }
    public void checkInInitiateTrivago() throws InterruptedException {
        sleepFor(2);
        searchBar("Alberta, Canada");
        sleepFor(2);
        checkInClick();
        sleepFor(2);
        cleanUp();
    }
    public void checkInDateSelectTrivago() throws InterruptedException {
        sleepFor(2);
        searchBar("Alberta, Canada");
        sleepFor(2);
        checkInClick();
        sleepFor(2);
        checkInDate();
        sleepFor(2);
        cleanUp();
    }
    public void emailTrivago() throws InterruptedException {
        sleepFor(2);
        email("hassaannizam1994@gmail.com");
        sleepFor(2);
        cleanUp();
    }
    public void loginTrivago() throws InterruptedException {
        sleepFor(2);
        login();
        sleepFor(2);
        cleanUp();
    }
    public void loginDataTrivago() throws InterruptedException {
        sleepFor(2);
        login();
        sleepFor(2);
        loginData("Hassaannizam1994@gmail.com");
        sleepFor(2);
        cleanUp();
    }
    public void menuRecentlyTrivago() throws InterruptedException {
        sleepFor(2);
        menuHover();
        sleepFor(2);
        menuRecently();
        sleepFor(2);
        cleanUp();
    }
}
