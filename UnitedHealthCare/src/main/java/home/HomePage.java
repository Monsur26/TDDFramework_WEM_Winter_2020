package home;
import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.concurrent.TimeUnit;

import static webelements.UHCHomePageWebElements.*;

public class HomePage extends WebAPI {

    @FindBy(how = How.XPATH, using = insuranceWebElement) public WebElement insurance;
    @FindBy(how = How.XPATH, using = employersWebElement) public WebElement employers;
    @FindBy(how = How.XPATH, using = searchbarWebElement) public WebElement searchbar;
    @FindBy(how = How.XPATH, using = planWebElement) public WebElement plan;
    @FindBy(how = How.XPATH, using = medicareWebElement) public WebElement medicare;
    @FindBy(how = How.XPATH, using = providersWebElement) public WebElement providers;
    @FindBy(how = How.XPATH, using = signinWebElement) public WebElement signin;
    @FindBy(how = How.XPATH, using = myuhcWebElement) public WebElement myuhc;
    @FindBy(how = How.XPATH, using = loginWebElement) public WebElement login;
    @FindBy(how = How.XPATH, using = buttonWebElement) public WebElement button;






    public void insurance() throws InterruptedException {
        mouseHoverByXpath(insuranceWebElement);
        sleepFor(3);
        cleanUp(); }


    public void dragdrop() throws InterruptedException{
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("link text is ".concat(employers.getText()));
        Actions a = new Actions(driver);
//        a
//                .moveToElement(employers)
//                .click()
//                .build()
//                .perform();
//        System.out.println("Employers page text: " +driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/nav/ol/li[2]/span")).getText());
//        driver.get("https://www.uhc.com/");
        a
//                .moveToElement(searchbar)
//                .click()
//                .sendKeys("random text")
//                .build()
//                .perform();
//        a
                .moveToElement(searchbar)
                .click()
                .build()
                .perform();
        WebElement uHealthImage = driver.findElement(By.xpath("//a[@class='org-logo position-relative']//img"));
        a
                .moveToElement(uHealthImage)
                .dragAndDrop(uHealthImage,searchbar)
                .build()
                .perform();
        Thread.sleep(10000);
    }
    public void plan() throws InterruptedException{
        Actions a = new Actions(driver);
        a.moveToElement(plan).click().build().perform();
        sleepFor(3);
    }
    public void medicare() throws InterruptedException {
        Actions a = new Actions(driver);
        a.moveToElement(plan).click().build().perform();
        medicare.click();
            sleepFor(3);
        }
    public void providers() throws InterruptedException {
        Actions a = new Actions(driver);
        a.moveToElement(plan).click().build().perform();
        providers.click();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        sleepFor(3);
    }}
    public void signing() throws InterruptedException{
            mouseHoverByXpath(signinWebElement);
            signin.click();
            sleepFor(3);
            cleanUp(); }
    public void login() throws InterruptedException{
        mouseHoverByXpath(signinWebElement);
        signin.click();
        myuhc.click();
        cleanUp(); }
    public void login1() throws InterruptedException{
        mouseHoverByXpath(signinWebElement);
        signin.click();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        myuhc.click();
        cleanUp(); }
    }
    public void search() throws InterruptedException{
       Actions a = new Actions(driver);
        a
                .moveToElement(searchbar)
                .click()
                .sendKeys("I need a doctor")
                .build()
                .perform();
    }
    public void search1() throws InterruptedException{
        Actions a = new Actions(driver);
        a
                .moveToElement(searchbar)
                .click()
                .sendKeys("I need a doctor")
                .build()
                .perform();
                 button.click();
    }




}





























