package home;
import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static webelements.HomePageWebElements.*;

public class HomePage extends WebAPI {
    @FindBy(how = How.CSS, using = loginButtonWebElement) public WebElement loginButton;
    @FindBy(how = How.CSS,using=loginClickWebElement) public WebElement loginClick;
    @FindBy(how = How.CSS,using=smallBusinessWebElement) public WebElement smallBusiness;
    @FindBy(how = How.CSS,using=investingWebElement) public WebElement investing;
    @FindBy(how = How.CSS,using=productWebElement) public WebElement product;
    @FindBy(how = How.XPATH,using=findUsWebElement) public WebElement findUs;
    @FindBy(how = How.XPATH,using=searchWebElement) public WebElement search;
    @FindBy(how = How.XPATH,using=servicesMHWebElement) public WebElement servicesMH;
    @FindBy(how = How.XPATH,using=productMHWebElement) public WebElement productMH;
    @FindBy(how = How.XPATH,using=logInMHWebElement) public WebElement logInMH;
    @FindBy(how = How.XPATH,using=searchMHWebElement) public WebElement searchMH;
    @FindBy(how = How.XPATH,using=learnMoreMHWebElement) public WebElement learnMoreMH;
    @FindBy(how = How.XPATH,using=searchBoxWebElement) public WebElement searchBox;
    @FindBy(how = How.XPATH,using=flagWebElement) public WebElement flag;
    @FindBy(how = How.XPATH,using=helpWebElement) public WebElement help;
    @FindBy(how = How.XPATH,using=dropdownProductWebElement) public WebElement dropdownProduct;



    public void clickLoginButton() throws InterruptedException {
        loginButton.click();
        sleepFor(3);
    }
    public void clickSmallBusiness() throws InterruptedException {
        smallBusiness.click();
        sleepFor(4);
    }
    public void clickInvesting(){
        investing.click();
    }
    public void clickProduct() throws InterruptedException {
        product.click();
        sleepFor(2);
    }
    public void clickFindUs() throws InterruptedException {
        sleepFor(1);
        findUs.click();
        sleepFor(2);
    }
    public void clickSearch(){
        search.click();
    }
    public void mouseHoverServices() throws InterruptedException {
        Actions ac=new Actions(driver);
        ac.moveToElement(servicesMH).perform();
        sleepFor(2);
    }
    public void mouseHoverProduct() throws InterruptedException {
        Actions ac1=new Actions(driver);
        ac1.moveToElement(productMH).perform();
        sleepFor(2);
    }
    public void mouseHoverLogIn() throws InterruptedException {
        Actions ac2=new Actions(driver);
        ac2.moveToElement(logInMH).perform();
        sleepFor(2);
    }
    public void mouseHoverSearch() throws InterruptedException {
        Actions ac3=new Actions(driver);
        ac3.moveToElement(servicesMH).perform();
        sleepFor(2);
    }
    public void mouseHoverLearnMore() throws InterruptedException {
        Actions ac4=new Actions(driver);
        ac4.moveToElement(learnMoreMH).perform();
        sleepFor(2);

    }
    public void eneterKeyWords(String keyword){
        searchBox.sendKeys(keyword);
    }
    public void serachBoxcClick() {
        searchBox.click();
        searchBox.sendKeys("how");
    }
    public void clickOnFlag(){
        flag.click();
    }
    public void clickHelp() throws InterruptedException {
        help.click();
        sleepFor(2);
    }


    public void clickOnLogin() throws InterruptedException {
        clickLoginButton();
    }

    public void investing(){
        clickInvesting();
    }

    public void searchBoxElement() throws InterruptedException {
        eneterKeyWords("How to open an account");
        serachBoxcClick();
        sleepFor(3);
    }

}
