package home;

import common.WebAPI;
import okio.Timeout;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import static webelements.HomePageWebElements.*;

public class HomePage extends WebAPI {
    @FindBy(xpath = regionSelectWebElement) public WebElement regionSelect;
    @FindBy(xpath = selectCanadaRegionWebElement) public WebElement canadaSelect;
    @FindBy(xpath = loginDropDownWebElement) public WebElement loginDropDown;
    @FindBy(xpath = onlineBankingWebElement) public WebElement onlineBankingLInk;
    @FindBy(xpath = productsDropDownWebElement) public WebElement productsDropDown;
    @FindBy(xpath = CDsWebElement) public WebElement CDs;
    @FindBy(xpath = commercialLinkWebElement) public WebElement commercialLInk;
    @FindBy(css = industriesDropDownWebElement) public WebElement industriesDD;
    @FindBy(id = questionSearchBoxWebElement) public WebElement questionsSB;
    @FindBy(xpath = askNowButtonWebElement) public WebElement askNowButton;
    @FindBy(xpath = popularQuestionWebElement) public WebElement popularQuestionsMenu;
    @FindBy(xpath = openBankAccWebElement) public WebElement openingBankAcc;
    @FindBy(xpath = rightArrowSlideWebElements) public WebElement rightArrowSlide;
    @FindBy(xpath = leftArrowSlideWebElements) public WebElement leftArrowSlide;
    @FindBy(xpath = userNameWebElement) public WebElement userName;
    @FindBy(xpath = passwordWebElement) public WebElement password;
    @FindBy(xpath = rememberCheckBoxWebElement) public WebElement rememberMECHkBox;
    @FindBy(xpath = loginButtonWebElement) public WebElement loginButton;

    public void region(){
        regionSelect.click();
    }
    public void regionCanada(){canadaSelect.click();}
    public void loginDD(){
        Actions actions=new Actions(driver);
        actions.moveToElement(loginDropDown).perform();
    }
    public void onlineBankingLink(){ onlineBankingLInk.click();
    }
    public void proDD(){
        Actions ac=new Actions(driver);
        ac.moveToElement(productsDropDown).perform();}
    public void CDs(){CDs.click();}
    public void commercialLInk(){commercialLInk.click();}
    public void industriesDD(){
        Actions a=new Actions(driver);
        a.moveToElement(industriesDD).perform();}
    public void questionsSearchBox(String query){questionsSB.sendKeys(query);}
    public void askButton(){askNowButton.click();}
    public void popularQA(){popularQuestionsMenu.click();}
    public void openingBankAccQuestion(){openingBankAcc.click();}
    public void setRightArrowSlide(){rightArrowSlide.click();}
    public void setLeftArrowSlide(){leftArrowSlide.click();}
    public void userName(String name){userName.sendKeys(name);}
    public void password(String pass){password.sendKeys(pass);}
    public void rememberChkBox(){rememberMECHkBox.click();}
    public void loginButton(){loginButton.click();}



    public void regionSelectOptions(){
        region();
        regionCanada();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    public void loginDropDown() throws InterruptedException {
        loginDD();
        onlineBankingLink();
    }
    public void onlineBankingSelectToNewWindow() throws InterruptedException {
        loginDD();
        onlineBankingLink();
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
        sleepFor(5);
    }
    public void onlineBankingSelectAndSwitchingWindow() throws InterruptedException {
        loginDD();
        onlineBankingLink();
        String winHandleBefore = driver.getWindowHandle();
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
        sleepFor(5);
        driver.switchTo().window(winHandleBefore);
    }
    public void productsDropDown(){
        proDD();
        CDs();
    }
    public void commercialLinkAndIndustriesDD(){
        commercialLInk();
        industriesDD();
    }
    public void askNowOption(){
        questionsSearchBox("How to open an account?");
        askButton();
    }
    public void popularQuestionsLink() throws InterruptedException {
        popularQA();
        openingBankAccQuestion();
        sleepFor(10);
        openingBankAccQuestion();
    }
    public void rightAndLeftArrowSlide(){
        setRightArrowSlide();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        setLeftArrowSlide();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }
    public void loginFunctions() throws InterruptedException {
        loginDD();
        onlineBankingLink();
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
        sleepFor(5);
        userName("Noname");
        password("NoPass");
        rememberChkBox();
        loginButton();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }



}
