package home;
import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
//import org.w3c.dom.html.HTMLInputElement;
import java.util.List;

import static homepagewebelements.CNNHomePageWebElements.*;
public class HomePage extends WebAPI {

    @FindBy(how = How.XPATH, using = healthWebElement) public WebElement health;
    @FindBy(how = How.XPATH, using = wellnessWebElement) public WebElement wellness;
    @FindBy(how = How.XPATH, using = editionWebElement) public WebElement edition;
    @FindBy(how = How.XPATH, using = internationalWebElement) public WebElement international;
    @FindBy(how = How.XPATH, using = hamburgerWebElement) public WebElement hamburger;
    @FindBy(how = How.XPATH, using = politicsWebElement) public WebElement politics;
    @FindBy(how = How.CSS, using = magnifyWebElement) public WebElement magnify;
    @FindBy(how = How.XPATH, using = searchBarWebElement) public WebElement search;
    @FindBy(how = How.CSS, using = buttonSearchWebElement) public WebElement button;
    @FindBy(how = How.XPATH, using = storiesWebElement) public WebElement stories;
    @FindBy(how = How.CSS, using = userWebElement) public WebElement user;
    @FindBy(how = How.XPATH, using = emailWebElement) public WebElement email;
    @FindBy(how = How.XPATH, using = passwordWebElement) public WebElement password;
    @FindBy(how = How.CSS, using = loginWebElement) public WebElement login;
    @FindBy(how = How.CSS, using = entertainmentWebElement) public WebElement entertainment;

    public void hoverHealth() throws InterruptedException {
         mouseHoverByXpath(healthWebElement);
         health.click();
         sleepFor(3);
         cleanUp(); }
    public void hoverClick() throws InterruptedException {
        mouseHoverByXpath(healthWebElement);
        health.click();
        sleepFor(5);
        wellness.click();
        sleepFor(3);
        cleanUp(); }
    public void dropDown1() throws InterruptedException{
        mouseHoverByXpath(editionWebElement);
        edition.click();
        sleepFor(1);
        international.click();
        sleepFor(4);
        cleanUp();
    }
    public void hamburgerIcon() throws InterruptedException{
        mouseHoverByXpath(hamburgerWebElement);
        hamburger.click();
        sleepFor(1);
        politics.click();
        sleepFor(3);
        cleanUp();
    }
    public void searchCovid() throws InterruptedException {
        magnify.click();
        search.sendKeys("COVID");
        button.click();
        sleepFor(3);
        cleanUp();
    }
    public void searchBangladesh() throws InterruptedException {
        magnify.click();
        search.sendKeys("Bangladesh");
        button.click();
        sleepFor(1);
        stories.click();
        sleepFor(3);
        cleanUp();
    }
    public void signin() throws InterruptedException {
        user.click();
        email.sendKeys("anikaislam11@gmail.com");
        sleepFor(2);
        cleanUp();

    }
    public void password() throws InterruptedException {
        user.click();
        email.sendKeys("anikaislam11@gmail.com");
        password.sendKeys("pnt123");
        sleepFor(2);
        cleanUp();
    }
    public void login() throws InterruptedException {
        user.click();
        email.sendKeys("anikaislam11@gmail.com");
        password.sendKeys("pnt123");
        login.click();
        sleepFor(2);
        cleanUp();
    }
    public void entertainment() throws InterruptedException {
        mouseHoverByCSS(entertainmentWebElement);
        entertainment.click();
        sleepFor(2);
        cleanUp();
    }
 }

























