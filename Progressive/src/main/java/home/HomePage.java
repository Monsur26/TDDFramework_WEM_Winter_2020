
package home;

import common.WebAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import java.util.List;
import static webelements.HomePageWebElements.*;

public class HomePage extends WebAPI {

    @FindBy(xpath = quoteWebElement) public WebElement quote;
    @FindBy(xpath = zipcodeWebElement) public WebElement zip;
    @FindBy(xpath = autoWebElement) public WebElement auto;
    @FindBy(xpath = exploreWebElement) public WebElement exp;
    @FindBy(xpath = saveWebElement) public WebElement save;
    @FindBy(xpath = popWebElement) public WebElement pop;
    @FindBy(xpath = loginWebElement) public WebElement log;
    @FindBy(xpath = userWebElement) public WebElement user;
    @FindBy(xpath = passWebElement) public WebElement pass;
    @FindBy(xpath = checkboxWebElement) public WebElement check;
    @FindBy(xpath = submitWebElement) public WebElement submit;
    @FindBy(xpath = callWebElement) public WebElement call;
    @FindBy(css = boatWebElement) public WebElement boat;
    @FindBy(xpath = boatzipWebElement) public WebElement zb;

    public void autozip(){
        auto.click();
        zip.click();
        zip.sendKeys("10472");
        quote.click();

    }
    public void explo(){
        exp.click();
        save.click();
    }
    public void popuphandling(){
        pop.click();
    }
    public void login(){
        log.click();
        user.click();
        user.sendKeys("anika11");
    }
    public void pass(){
        log.click();
        user.click();
        user.sendKeys("anika11");
        pass.click();
        pass.sendKeys("pnt1234");
    }
    public void checkbox(){
        log.click();
        user.click();
        user.sendKeys("anika11");
        pass.click();
        pass.sendKeys("pnt1234");
        check.click();
    }
    public void submitbutton(){
        log.click();
        user.click();
        user.sendKeys("anika11");
        pass.click();
        pass.sendKeys("pnt1234");
        check.click();
        submit.click();
    }
    public void callnow(){
        call.click();
    }
    public void boat(){
        boat.click();
        zb.sendKeys("10472");
    }



    public void loginInWithExcel(int zipcode){
        auto.click();
        zip.click();
        quote.click();

    }
    public void validateLoggingIn(){
        String actual=zip.getText();
        Assert.assertEquals(actual,"","got my quote");
    }
}
