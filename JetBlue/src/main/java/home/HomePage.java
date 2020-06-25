package home;
import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


import static webelements.JB_HomePageWebElements.*;

public class HomePage extends WebAPI {
    @FindBy(xpath = exploreWebElement) public WebElement explore;
    @FindBy(xpath = vacayWebElement) public WebElement vacay;
    @FindBy(xpath = travelinfoWebElement) public WebElement travelinfo;
    @FindBy(xpath = petsWebElement) public WebElement pets;
    @FindBy(xpath = carrierWebElement) public WebElement carrier;
    @FindBy(xpath = tripsWebElement) public WebElement trips;
    @FindBy(xpath = checkWebElement) public WebElement check;
    @FindBy(xpath = fnameWebElement) public WebElement fname;
    @FindBy(xpath = radio1WebElement) public WebElement radio1;
    @FindBy(xpath = radio2WebElement) public WebElement radio2;
    @FindBy(xpath = pointsWebElement) public WebElement points;
    @FindBy(css = toWebElement) public WebElement to;
    @FindBy(css = searchWebElement) public WebElement search;
    @FindBy(xpath = cityWebElement) public WebElement city;
    @FindBy(xpath = joinWebElement) public WebElement join;
    @FindBy(xpath = emailWebElement) public WebElement email;

    public void explore() throws InterruptedException {
      Actions a = new Actions(driver);
      a.moveToElement(explore).perform();
      explore.click();
      vacay.click();
    }
    public void pet()  {
        Actions a = new Actions(driver);
        a.moveToElement(travelinfo).click().build().perform();
        pets.click();
        carrier.click();

    }
    public void window() throws InterruptedException {
        Actions a = new Actions(driver);
        a.moveToElement(travelinfo).click().build().perform();
        pets.click();
        carrier.click();
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"\t"); }

    public void trips()  {
        Actions a = new Actions(driver);
        a.moveToElement(travelinfo).click().build().perform();
        trips.click();
        check.click();
        fname.click();
        fname.sendKeys("Anika");
    }
    public void dropdown()  {
        Actions a = new Actions(driver);
        a.moveToElement(travelinfo).click().build().perform();
        trips.click();
        check.click();
        Select drp = new Select(driver.findElement(By.id("choose")));
        drp.selectByVisibleText("Flight Number");
    }

    public void radiobutton()  {
        radio1.click();
        radio2.click();
       }

    public void checkbox() {
     points.click();
    }
    public void lax() {
        Actions ap = new Actions(driver);
        ap.moveToElement(to).click().build().perform();
        to.sendKeys("Los Angeles, CA (LAX)");
        search.click();
    }
    public void dates(){
    city.click();
    }
    public void join(){
    join.click();
    email.click();
    email.sendKeys("anika11@gmail.com");

    }



































}



























































































