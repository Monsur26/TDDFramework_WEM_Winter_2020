package home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static webelements.HomePageWebElements.*;

public class HomePage extends WebAPI {
    @FindBy(how = How.XPATH, using = loginButtonWebElements) public WebElement loginButton;
    @FindBy(xpath = onlineBankingWebElements) public WebElement onlineBanking;
    @FindBy(xpath = rememberMeWebElements) public WebElement rememberMe;
    @FindBy(xpath = userNameWebElements) public WebElement userName;
    @FindBy(xpath = searchBarWebElements) public WebElement searchBar;
    @FindBy(xpath = searchButtonWebElement) public WebElement searchButton;
    @FindBy (xpath = searchButtonFinalWebElement) public WebElement searchButtonFinal;
    @FindBy(xpath = productWebElement) public WebElement product;
    @FindBy(xpath = checkingWebElement) public WebElement checking;
    @FindBy(xpath = servicesWebElement) public WebElement services;
    @FindBy(xpath = studentBankingWebElements) public WebElement studentBanking;
    @FindBy(xpath = savingsWebElement) public WebElement savings;
    @FindBy(xpath = stateWebElement) public WebElement state;
    @FindBy(xpath = logInMouseHoverWebElement) public WebElement logInMouseHover;
    @FindBy(xpath = easyWebWebElement) public WebElement easyWeb;
    @FindBy(xpath = foreignExchangeServisesWebElement) public WebElement foreignExchangeServices;
    @FindBy(xpath = passwordWebElement) public WebElement passWord;

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
    public void product(){
        Actions actions=new Actions(driver);
        actions.moveToElement(product).perform();
    }
    public void checking(){
        checking.click();
    }
    public void services(){
        Actions actions=new Actions(driver);
        actions.moveToElement(services).perform();
    }
    public void studentBanking(){
        studentBanking.click();
    }
    public void savings(){
        savings.click();
    }
    public void state(){
        state.click();
    }
    public void logInMouseHover(){
        Actions actions=new Actions(driver);
        actions.moveToElement(logInMouseHover).perform();
    }
    public void easyWeb(){
        easyWeb.click();
    }
    public void foreignExchangeServices(){
        foreignExchangeServices.click();
    }

    public void loginButtonTdBank() throws InterruptedException {
        sleepFor(2);
        driver.manage().window().maximize();
        sleepFor(2);
        loginButton();
        sleepFor(2);
        cleanUp();
    }
    public void userNameTdBank() throws InterruptedException {
        sleepFor(2);
        driver.manage().window().maximize();
        sleepFor(2);
        loginButton();
        userName("Hassaan1994");
        sleepFor(2);
        cleanUp();
    }
    public void passWordTdBank() throws InterruptedException {
        sleepFor(2);
        driver.manage().window().maximize();
        sleepFor(2);
        loginButton();
        sleepFor(2);
        userName("Hassaan1994");
        sleepFor(2);
        passWord.sendKeys("Newyorkusa123");
        sleepFor(2);
        cleanUp();
    }
    public void searchButtonTdBank() throws InterruptedException {
        sleepFor(2);
        driver.manage().window().maximize();
        sleepFor(2);
        searchButton();
        sleepFor(2);
        cleanUp();
    }
    public void productCheckingTdBank() throws InterruptedException {
        sleepFor(2);
        driver.manage().window().maximize();
        sleepFor(2);
        product();
        sleepFor(2);
        checking();
        sleepFor(2);
        cleanUp();
    }
    public void servicesStudentBankingTdBank() throws InterruptedException {
        sleepFor(2);
        driver.manage().window().maximize();
        sleepFor(2);
        services();
        sleepFor(2);
        studentBanking();
        sleepFor(2);
        cleanUp();
    }
    public void productSavingsTdBank() throws InterruptedException {
        sleepFor(2);
        driver.manage().window().maximize();
        sleepFor(2);
        product();
        sleepFor(2);
        savings();
        sleepFor(2);
        cleanUp();
    }
    public void savingsStateTdBank() throws InterruptedException {
        sleepFor(2);
        driver.manage().window().maximize();
        sleepFor(2);
        product();
        sleepFor(2);
        savings();
        sleepFor(2);
        state();
        sleepFor(2);
        cleanUp();

    }
    public void logInEasyWebTdBank() throws InterruptedException {
        sleepFor(2);
        driver.manage().window().maximize();
        sleepFor(2);
        logInMouseHover();
        sleepFor(2);
        easyWeb();
        sleepFor(2);
        cleanUp();
    }
    public void servicesForeignExchangeServices() throws InterruptedException {
        sleepFor(2);
        driver.manage().window().maximize();
        sleepFor(2);
        services();
        sleepFor(2);
        foreignExchangeServices();
        sleepFor(2);
        cleanUp();
    }
}
