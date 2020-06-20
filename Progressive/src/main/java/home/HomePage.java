package home;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.Iterator;
import java.util.Set;

import static webelements.HomePageWebElements.*;

public class HomePage extends WebAPI {
    @FindBy(how = How.XPATH,using = progressiveAutoWebElement) public WebElement progressiveAuto;
    @FindBy(how = How.CSS,using = progressiveExploreWebElement) public WebElement progressiveExplore;
    public void ProgressiveAuto(){ progressiveAuto.click();}
    public void ProgressiveExploreProducts(){ progressiveExplore.click();}
    public void multiWindowsHandling(){
        Set<String> windowIds =driver.getWindowHandles();
        Iterator<String> iter=windowIds.iterator();
        String mainWindow=iter.next();
        String childWindow=iter.next();
        driver.switchTo().window(childWindow);
    }
    public void ProgressiveAutoInfopage(){
        System.out.println("Home Page Titile: "+driver.getTitle());
       progressiveAuto.click();
        multiWindowsHandling();
        System.out.println("Child Window : "+driver.getTitle());
    }
}
