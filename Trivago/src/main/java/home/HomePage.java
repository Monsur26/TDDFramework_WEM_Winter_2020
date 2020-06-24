package home;
import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import javax.swing.*;
import java.util.List;
import static webelements.HomePageWebElements.*;
//import static webelements.HomePageWebElements.*;

public class HomePage extends WebAPI{

    @FindBy(how = How.XPATH,using = languageWebElement) public WebElement language;
    @FindBy(how = How.XPATH,using = currencyWebElement) public WebElement currency;
    @FindBy(how = How.XPATH,using = menueWebElement) public WebElement menue;
    @FindBy(how = How.XPATH,using = logInWebElement) public WebElement logIn;
    @FindBy(how = How.XPATH,using = searchWebElement) public WebElement search;
    @FindBy(how = How.XPATH,using = searchClickWebElement) public WebElement searchClick;
    @FindBy(how = How.XPATH,using = checkInWebElement) public WebElement checkIn;
    @FindBy(how = How.XPATH,using = checkOutWebElement) public WebElement checkOut;
    @FindBy(how = How.XPATH,using = roomWebElement) public WebElement room;
    @FindBy(how = How.XPATH,using= searchPlWebElement) public WebElement searchPl;

    public void clickLanguage() throws InterruptedException {
        language.click();
        driver.manage().window().maximize();
        sleepFor(2);
    }
    public void clickCurrency() throws InterruptedException {
        currency.click();
        sleepFor(2);
    }
    public void mouseHoverMenu() throws InterruptedException {
        driver.manage().window().maximize();
       Actions ac=new Actions(driver);
       ac.moveToElement(menue).perform();
       sleepFor(2);
    }
    public void clickLogIn() throws InterruptedException {
        driver.manage().window().maximize();
        logIn.click();
        sleepFor(2);
    }
    public void searchButton() throws InterruptedException {
        driver.manage().window().maximize();
        search.sendKeys("Miami");
        search.click();
        sleepFor(2);
    }
    public void searchClickButton() throws InterruptedException {
        driver.manage().window().maximize();
        search.sendKeys("Miami");
        sleepFor(2);
        searchClick.click();
        sleepFor(3);
    }
    public void searchPlace() throws InterruptedException {
        driver.manage().window().maximize();
        search.sendKeys("Colorado");
        sleepFor(1);
        searchClick.click();
        sleepFor(3);
    }
    public void CheckInSelection() throws InterruptedException {
        driver.manage().window().maximize();
        sleepFor(2);
        checkIn.click();
        sleepFor(3);
    }
    public void CheckOutSelection() throws InterruptedException {
        driver.manage().window().maximize();
        sleepFor(2);
        checkOut.click();
        sleepFor(3);
    }
    public void roomSelection() throws InterruptedException {
        driver.manage().window().maximize();
        room.click();
        sleepFor(2);
    }
    public void searchPlBoston() throws InterruptedException {
        driver.manage().window().maximize();
        search.sendKeys("Boston Hotels");
        searchClick.click();
        sleepFor(3);
    }






}
