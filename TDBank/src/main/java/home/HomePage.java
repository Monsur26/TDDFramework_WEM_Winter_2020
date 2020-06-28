package home;

import common.WebAPI;
import okio.Timeout;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static webelements.HomePageWebElements.*;

public class HomePage extends WebAPI {
    @FindBy(xpath = regionSelectWebElement)
    public WebElement regionSelect;
    @FindBy(xpath = selectCanadaRegionWebElement)
    public WebElement canadaSelect;
    @FindBy(xpath = loginDropDownWebElement)
    public WebElement loginDropDown;
    @FindBy(xpath = onlineBankingWebElement)
    public WebElement onlineBankingLInk;
    @FindBy(xpath = productsDropDownWebElement)
    public WebElement productsDropDown;
    @FindBy(xpath = CDsWebElement)
    public WebElement CDs;
    @FindBy(xpath = commercialLinkWebElement)
    public WebElement commercialLInk;
    @FindBy(css = industriesDropDownWebElement)
    public WebElement industriesDD;
    @FindBy(id = questionSearchBoxWebElement)
    public WebElement questionsSB;
    @FindBy(xpath = askNowButtonWebElement)
    public WebElement askNowButton;
    @FindBy(xpath = popularQuestionWebElement)
    public WebElement popularQuestionsMenu;
    @FindBy(xpath = openBankAccWebElement)
    public WebElement openingBankAcc;
    @FindBy(xpath = rightArrowSlideWebElements)
    public WebElement rightArrowSlide;
    @FindBy(xpath = leftArrowSlideWebElements)
    public WebElement leftArrowSlide;
    @FindBy(xpath = userNameWebElement)
    public WebElement userName;
    @FindBy(xpath = passwordWebElement)
    public WebElement password;
    @FindBy(xpath = rememberCheckBoxWebElement)
    public WebElement rememberMECHkBox;
    @FindBy(xpath = loginButtonWebElement)
    public WebElement loginButton;
    @FindBy(xpath = tdLogoWebElement)
    public WebElement tdLogo;

    public void region() {
        regionSelect.click();
    }

    public void regionCanada() {
        canadaSelect.click();
    }

    public void loginDD() {
        mouseHover(loginDropDown);
    }

    public void onlineBankingLink() {
        onlineBankingLInk.click();
    }

    public void proDD() {
        mouseHover(productsDropDown);
    }

    public void CDs() {
        CDs.click();
    }

    public void commercialLInk() {
        commercialLInk.click();
    }

    public void industriesDD() {
        mouseHover(industriesDD);
    }

    public void questionsSearchBox(String query) {
        questionsSB.sendKeys(query);
    }

    public void askButton() {
        askNowButton.click();
    }

    public void popularQA() {
        popularQuestionsMenu.click();
    }

    public void openingBankAccQuestion() {
        openingBankAcc.click();
    }

    public void setRightArrowSlide() {
        rightArrowSlide.click();
    }

    public void setLeftArrowSlide() {
        leftArrowSlide.click();
    }

    public void userName(String name) {
        userName.sendKeys(name);
    }

    public void password(String pass) {
        password.sendKeys(pass);
    }

    public void rememberChkBox() {
        rememberMECHkBox.click();
    }

    public void loginButton() {
        loginButton.click();
    }

    public void regionSelectOptions() {
        region();
        regionCanada();
        implicitWait(5);
    }

    public void loginDropDown() throws InterruptedException {
        loginDD();
        onlineBankingLink();
    }

    public void onlineBankingSelectToNewWindow() throws InterruptedException {
        loginDD();
        onlineBankingLink();
        windowSwitch();
        implicitWait(5);
    }

    public void onlineBankingSelectAndSwitchingWindow() throws InterruptedException {
        loginDD();
        onlineBankingLink();
        String winHandleBefore = driver.getWindowHandle();
        windowSwitch();
        implicitWait(5);
        switchToPreviousWindow(winHandleBefore);
    }

    public void productsDropDown() {
        proDD();
        CDs();
    }

    public void commercialLinkAndIndustriesDD() {
        commercialLInk();
        industriesDD();
    }

    public void askNowOption() {
        questionsSearchBox("How to open an account?");
        askButton();
    }

    public void popularQuestionsLink() throws InterruptedException {
        popularQA();
        openingBankAccQuestion();
        sleepFor(5);
        openingBankAccQuestion();
    }

    public void rightAndLeftArrowSlide() {
        setRightArrowSlide();
        implicitWait(5);
        setLeftArrowSlide();
        implicitWait(5);
    }

    public void loginFunctions() throws InterruptedException {
        loginDD();
        onlineBankingLink();
        windowSwitch();
        userName("Noname");
        password("NoPass");
        rememberChkBox();
        loginButton();
        implicitWait(5);
    }

    public void validateRegion() {
        String actual = regionSelect.getText();
        Assert.assertEquals(actual, "Select country", "not successful");
    }

    public void validateLoginDD() {
        String actual = loginDropDown.getText();
        Assert.assertEquals(actual, "", "not successful");
    }

    public void validateTDLogo() {
        String actual = tdLogo.getText();
        Assert.assertEquals(actual, "", "not successful");
    }

    public void validateIndustriesDD() {
        String actual = industriesDD.getText();
        Assert.assertEquals(actual, "", "not successful");
    }

    public void validateAskNOw() {
        String actual = askNowButton.getText();
        Assert.assertEquals(actual, "Ask now", "not successful");
    }


}
