package home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static webelements.HomePageWebElements.*;

public class HomePage extends WebAPI {
    @FindBy(how = How.XPATH, using = loginButtonWebElements) public WebElement loginButton;
    @FindBy(xpath = onlineBankingWebElements) public WebElement onlineBanking;
    @FindBy(css = rememberMeWebElements) public WebElement rememberMe;
    @FindBy(xpath = userNameWebElements) public WebElement userName;
    @FindBy(xpath = searchBarWebElements) public WebElement searchBar;
    @FindBy(xpath = searchButtonWebElement) public WebElement searchButton;
    @FindBy (xpath = searchButtonFinalWebElement) public WebElement searchButtonFinal;
    public void loginButton(){
        loginButton.click();
    }
    public void onlineBanking(){
        onlineBanking.click();
    }
    public void rememberMe(){
        rememberMe.click();
    }
    public void userName(String Keyword){
        userName.sendKeys(Keyword);
    }
    public void searchBar(String Keyword){
        searchBar.sendKeys(Keyword);
    }
    public void searchButton(){
        searchButton.click();
    }
    public void searchButtonFinal(){
        searchButtonFinal.click();
    }
    public void loginButtonTdBank() throws InterruptedException {
        sleepFor(2);
        loginButton();
        sleepFor(2);
        cleanUp();
    }
    public void onlineBankingTdBank() throws InterruptedException {
        sleepFor(2);
        loginButton();
        sleepFor(2);
        onlineBanking();
        sleepFor(2);
        cleanUp();
    }
    public void userNameTdBank() throws InterruptedException {
        sleepFor(2);
        loginButton();
        sleepFor(2);
        onlineBanking();
        sleepFor(2);
        userName("Hassaan1994");
        sleepFor(2);
        cleanUp();
    }
    public void searchButtonTdBank() throws InterruptedException {
        sleepFor(2);
        searchButton();
        sleepFor(2);
        cleanUp();
    }
}
